package gestorbdcurso.dao;

import gestorbdcurso.modelos.Estudiante;
import conexion.ConexionConBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.SQLException;

public class EstudianteDataAccessObject {

        private Connection conexion;

        public EstudianteDataAccessObject() {
            // Obtener la conexión desde la clase ConexionConBD
            try {
                conexion = ConexionConBD.conectar();
            } catch (SQLException e) {
                System.err.println("Error al conectar con la base de datos: " + e.getMessage());
            }
        }

        // Método para insertar un estudiante en la base de datos
        public boolean insertarEstudiante(Estudiante estudiante) {
            String sql = "INSERT INTO estudiante (dni, nombre_completo, email, especialidad, fecha_inscripcion) "
                    + "VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
                stmt.setInt(1, estudiante.getDni());
                stmt.setString(2, estudiante.getNombreCompleto());
                stmt.setString(3, estudiante.getEmail());
                stmt.setString(4, estudiante.getEspecialidad());
                stmt.setString(5, estudiante.getFechaInscripcion());

                int filasInsertadas = stmt.executeUpdate();
                return filasInsertadas > 0;
            } catch (SQLException e) {
                System.err.println("Error al insertar el estudiante: " + e.getMessage());
                return false;
            }
        }

        // Método para cerrar la conexión a la base de datos
        public void cerrarConexion() {
            if (conexion != null) {
                try {
                    conexion.close();
                    System.out.println("Conexión cerrada correctamente.");
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
}
