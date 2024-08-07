package Interfaz.ventas;

import Logic.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tablero_Ventas extends javax.swing.JFrame {

    Conexion con;
    Connection conn;
    String nomUsuario, iniNombreUsuario;

    public Tablero_Ventas(Conexion conexion, Connection conn, String nomUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.conn = conn;
        this.con = conexion;
        this.nomUsuario = nomUsuario;
        consultarNombre();

                MostraDVentas();
                MostraBS();
        // this.setExtendedState(JFrame.MAXIMIZED_BOTH); (No usar porque los tamaños de imagen y de pantalla en cada disp. son diferentes)
    }

    private void consultarNombre() {
        String nombre = "";
        System.out.println("Se ha llamado a consultar nombre");

        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String sql = "SELECT CONCAT(Nombre, ' ', AP, ' ', AM) AS Nombre FROM Trabajador WHERE Usuario = '" + nomUsuario + "'";
                ResultSet rs = stmt.executeQuery(sql);

                if (rs.next()) {
                    nombre = rs.getString("Nombre");
                    iniNombreUsuario = nombre;
                    JL_NomUser.setText(iniNombreUsuario);
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
    }

    //Metodo para obtener el ID mediante el usuario
    private int obtenerID(String nomUsuario) {
        String id = "";
        int idUser = 0;

        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String sql = "SELECT IDVendedor FROM Trabajador WHERE Usuario = '" + nomUsuario + "'";
                ResultSet rs = stmt.executeQuery(sql);

                if (rs.next()) {
                    id = rs.getString("IDVendedor");
                    try {
                        idUser = Integer.parseInt(id);
                    } catch (NumberFormatException e) {
                        System.out.println("El IDVendedor no es un número válido: " + id);
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Nombre de usuario o contraseña incorrectos.");
                }
                rs.close();
                stmt.close();
            } catch (SQLException e) {
                System.out.println("Error al ejecutar la consulta.");
                e.printStackTrace();
            }
        } else {
            System.out.println("No se pudo conectar a la base de datos.");
        }

        return idUser;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        JL_NomUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JL_VentasRe = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVentasReciente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbproductoStock = new javax.swing.JTable();
        JL_TableroVendedor = new javax.swing.JLabel();
        JL_Logo = new javax.swing.JLabel();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JFTablero");
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(JL_NomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 20, 220, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tablero");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 92, -1));

        JL_VentasRe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_VentasRe.setText("Ventas Reciente");
        getContentPane().add(JL_VentasRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 190, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Producto con poco Stock");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, -1, -1));

        tbVentasReciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Total"
            }
        ));
        tbVentasReciente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbVentasRecienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbVentasReciente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 340, 400));

        tbproductoStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(tbproductoStock);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 340, 390));
        getContentPane().add(JL_TableroVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));
        JL_TableroVendedor.getAccessibleContext().setAccessibleName("JL_fondoTablero");

        JL_Logo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Logo.setText("Papeleria SUMI");
        getContentPane().add(JL_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 120, -1));

        btnTablero.setText("Tablero");
        btnTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableroActionPerformed(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 100, 40));

        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 100, 30));

        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 100, 40));

        btnCuenta.setText("Cuenta");
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 100, 40));

        jLabel3.setText("Cerra sesion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbVentasRecienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbVentasRecienteAncestorAdded

    }//GEN-LAST:event_tbVentasRecienteAncestorAdded

    private void btnTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableroActionPerformed
        this.setVisible(false);
        this.dispose();

        Tablero_Ventas TV = new Tablero_Ventas(con, conn, nomUsuario);
        TV.setVisible(true);
        TV.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnTableroActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        this.setVisible(false);
        this.dispose();

        Ventas_Ven VV = new Ventas_Ven(con, conn, iniNombreUsuario, nomUsuario);
        VV.setVisible(true);
        VV.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        this.setVisible(false);
        this.dispose();

        Inventario_Venta IV = new Inventario_Venta(con, conn, iniNombreUsuario, nomUsuario);
        IV.setVisible(true);
        IV.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        this.setVisible(false);
        this.dispose();

        Cuenta_Venta CV = new Cuenta_Venta(con, conn, iniNombreUsuario, nomUsuario);
        CV.setVisible(true);
        CV.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCuentaActionPerformed
//Muestra los datos de las ventas 

    public void MostraDVentas() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Precio Unitario");
        model.addColumn("SubTotal");
        model.addColumn("Cantidad");
        tbVentasReciente.setModel(model);

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            if (conn != null) {
                String Consulta = "SELECT * FROM Venta";
                preparedStatement = conn.prepareStatement(Consulta);
                resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    Object[] datos = new Object[5];
                    datos[0] = resultSet.getInt("IDVenta");
                    datos[1] = resultSet.getString("Nombre");
                    datos[2] = resultSet.getDouble("Precio_Unitario");
                    datos[3] = resultSet.getDouble("Subtotal");
                    datos[4] = resultSet.getInt("CantidadP"); // Cambié "Cantidad" a "CantidadP"
                    model.addRow(datos);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se conectó a la base de datos");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
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
            System.out.println("Termino ejecucion");
        }
    }

    //llena tabla de bajo stocks
    public void MostraBS() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Producto");
        model.addColumn("Tipo");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        tbproductoStock.setModel(model);

        String[] datos = new String[5];
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            if (conn != null) {
                String Consulta = "SELECT * FROM Producto WHERE Cantidad_Disponible<=10";
                preparedStatement = conn.prepareStatement(Consulta);
                resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    datos[0] = resultSet.getString("IDProducto");
                    datos[1] = resultSet.getString("Nombre");
                    datos[2] = resultSet.getString("Tipo");
                    datos[3] = resultSet.getString("Cantidad_Disponible");
                    datos[4] = resultSet.getString("Precio");
                    model.addRow(datos);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
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
            System.out.println("Ejecucion terminada");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Logo;
    private javax.swing.JLabel JL_NomUser;
    private javax.swing.JLabel JL_TableroVendedor;
    private javax.swing.JLabel JL_VentasRe;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tbVentasReciente;
    private javax.swing.JTable tbproductoStock;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
