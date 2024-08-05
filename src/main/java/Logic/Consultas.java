package Logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//Esta Clase esta enfocada para optimizar algunas consultas de SQL
public class Consultas {

    Conexion con = new Conexion();
    Connection conn = null;

    public Consultas() {
        this.conn = con.abrirConexion();
    }

    //Este metodod es de ventas_ven calcula el subtotal de un producto y lo retorna 
    public double calcularTotalVenta(String[] productos, int[] cantidades) {
        double total = 0.0;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            if (conn != null) {
                String consulta = "SELECT Precio FROM Producto WHERE Nombre = ?";
                preparedStatement = conn.prepareStatement(consulta);

                for (int i = 0; i < productos.length; i++) {
                    preparedStatement.setString(1, productos[i]);
                    resultSet = preparedStatement.executeQuery();

                    if (resultSet.next()) {
                        double precioUnidad = resultSet.getDouble("Precio");
                        total += precioUnidad * cantidades[i];
                    } else {
                        System.out.println("Producto no encontrado: " + productos[i]);
                    }
                }
            } else {
                System.out.println("No se puede conectar a la base de datos.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + ex.getMessage());
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return total;
    }

    //Nota si no usa este metodo eliminalo
    //Metdod para eliminar datos
    public void Eliminar(String tabla, String nomCampo, String nomEliminar) throws SQLException {
        Conexion con = null;
        Connection conn = null;

        try {
            con = new Conexion();
            conn = con.abrirConexion();

            String Delete = "DELETE FROM " + tabla + " WHERE " + nomCampo + " = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(Delete);
            preparedStatement.setString(1, nomEliminar);
            int rowCount = preparedStatement.executeUpdate();

            if (rowCount > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún registro a eliminar");
            }
            preparedStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (con != null) {
                con.cerrarConexion();
            }
        }
    }

}
