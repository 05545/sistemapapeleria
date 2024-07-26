//No modificar

package Logic;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class InicioSesion {

    private Connection connection;

    public InicioSesion(Connection connection) {
        this.connection = connection;
    }

    public String obtenerRol(String nombreUsuario, String contrasena) {
        String rol = "";

        if (connection != null) {
            try {
                Statement stmt = connection.createStatement();
                String sql = "SELECT * FROM usuarios WHERE usuario = '" + nombreUsuario + "' AND contraseña = '" + contrasena + "'";
                ResultSet rs = stmt.executeQuery(sql);

                if (rs.next()) {
                    rol = rs.getString("rol");
                    System.out.println("Inicio de sesión exitoso!");
                    System.out.println("El rol del usuario es: " + rol);
                } else {
                    System.out.println("Nombre de usuario o contraseña incorrectos.");
                }
                rs.close();
                stmt.close();
            } catch (SQLException e) {
                System.out.println("Error al ejecutar la consulta.");
                e.printStackTrace();
            }
        }
        return rol;
    }
}
