
package Logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


//Esta Clase esta enfocada para optimizar algunas consultas de SQL
public class Consultas {
    
    /*
   tabla es el nombre de la tabla donde se eliminara los registro 
   nomCampo es el nombre del campo de la tabla de SQL
   nomEliminar es el nombre del dato a eliminar
    */
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
