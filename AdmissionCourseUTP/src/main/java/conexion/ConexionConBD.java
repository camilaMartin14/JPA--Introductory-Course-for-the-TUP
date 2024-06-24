package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionConBD {

    // URL de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost/utp";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Singleton: instancia única de conexión
    private static Connection conexion;

    // Método para obtener la conexión a la base de datos
    public static Connection conectar() throws SQLException {
        if (conexion == null || conexion.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (ClassNotFoundException ex) {
                System.err.println("Error al cargar el driver JDBC: " + ex.getMessage());
                throw new SQLException("Driver JDBC no encontrado", ex);
            } catch (SQLException ex) {
                System.err.println("Error al conectar a la base de datos: " + ex.getMessage());
                throw ex;
            }
        }
        return conexion;
    }

    // Método para cerrar la conexión a la base de datos
    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión: " + ex.getMessage());
            } finally {
                conexion = null;
            }
        }
    }

    // Método de prueba para verificar la conexión
    public static void probarConexion() {
        try {
            Connection pruebaConexion = conectar();
            if (pruebaConexion != null) {
                System.out.println("La conexión a la base de datos está activa.");
                pruebaConexion.close(); // Cerrar la conexión de prueba
            }
        } catch (SQLException ex) {
            System.err.println("Error al probar la conexión: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        probarConexion();
    }
}
