//No modificar clase

package Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection conex = null;
    private final String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
    private final String usuario = "newuser";
    private final String contrasena = "password";

    public Conexion() {
        
    }

    public Connection abrirConexion() {
        if (conex == null) {
            try {
                conex = DriverManager.getConnection(url, usuario, contrasena);
                System.out.println("Conexión exitosa a la base de datos!");
            } catch (SQLException e) {
                System.out.println("Error al conectar a la base de datos.");
                e.printStackTrace();
            }
        }
        return conex;
    }

    public void cerrarConexion() {
        if (conex != null) {
            try {
                conex.close();
                conex = null;
                System.out.println("Conexión a la base de datos cerrada.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión a la base de datos.");
                e.printStackTrace();
            }
        }
    }
}

