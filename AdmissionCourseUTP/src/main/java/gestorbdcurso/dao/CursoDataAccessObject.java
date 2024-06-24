package gestorbdcurso.dao;

import gestorbdcurso.modelos.Curso;
import conexion.ConexionConBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CursoDataAccessObject {

    private Connection conexion;

    public CursoDataAccessObject() {
        // Obtener la conexión desde la clase ConexionConBD
        try {
            conexion = ConexionConBD.conectar();
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }

    // Método para insertar un curso en la base de datos
    public boolean insertarCurso(Curso curso) {
        String sql = "INSERT INTO curso (nombre, descripcion, instructor, puntaje_minimo, nivel, fecha_creacion) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, curso.getNombre());
            stmt.setString(2, curso.getDescripcion());
            stmt.setString(3, curso.getInstructor());
            stmt.setInt(4, curso.getPuntajeMinimo());
            stmt.setString(5, curso.getNivel());
            stmt.setString(6, curso.getFechaCreacion());

            int filasInsertadas = stmt.executeUpdate();
            return filasInsertadas > 0;
        } catch (SQLException e) {
            System.err.println("Error al insertar el curso: " + e.getMessage());
            return false;
        }
    }
}
