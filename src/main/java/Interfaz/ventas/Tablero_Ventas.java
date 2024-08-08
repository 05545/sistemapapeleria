package Interfaz.ventas;

import Interfaz.InicioSesion_Pantalla;
import Logic.Conexion;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVentasReciente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbproductoStock = new javax.swing.JTable();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        btnCerrasesion1 = new javax.swing.JButton();
        JL_TableroVendedor = new javax.swing.JLabel();

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

        JL_NomUser.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        JL_NomUser.setForeground(new java.awt.Color(51, 51, 51));
        JL_NomUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(JL_NomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 250, 20));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        tbVentasReciente.setBackground(new java.awt.Color(255, 255, 255));
        tbVentasReciente.setForeground(new java.awt.Color(51, 51, 51));
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 370, 390));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(51, 51, 51));

        tbproductoStock.setBackground(new java.awt.Color(255, 255, 255));
        tbproductoStock.setForeground(new java.awt.Color(51, 51, 51));
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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 410, 390));

        btnTablero.setBorder(null);
        btnTablero.setBorderPainted(false);
        btnTablero.setContentAreaFilled(false);
        btnTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableroActionPerformed(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 130, 30));

        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 130, 30));

        btnInventario.setBorder(null);
        btnInventario.setBorderPainted(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 130, 30));

        btnCuenta.setBorder(null);
        btnCuenta.setBorderPainted(false);
        btnCuenta.setContentAreaFilled(false);
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 130, 30));

        btnCerrasesion1.setBorder(null);
        btnCerrasesion1.setBorderPainted(false);
        btnCerrasesion1.setContentAreaFilled(false);
        btnCerrasesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrasesion1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrasesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 160, 30));

        JL_TableroVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVendedor/Pantalla_Tablero_Vendedor.png"))); // NOI18N
        JL_TableroVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_TableroVendedorMouseClicked(evt);
            }
        });
        getContentPane().add(JL_TableroVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));
        JL_TableroVendedor.getAccessibleContext().setAccessibleName("JL_fondoTablero");

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

    private void btnCerrasesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrasesion1ActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();

            this.setVisible(false);
            this.dispose();
            cerrarConexion();

            iniSesion.setVisible(true);
        }
    }//GEN-LAST:event_btnCerrasesion1ActionPerformed

    private void JL_TableroVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_TableroVendedorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JL_TableroVendedorMouseClicked
//Muestra los datos de las ventas 

    private void cerrarConexion() {
        if (con != null) {
            con.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }

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
    private javax.swing.JLabel JL_NomUser;
    private javax.swing.JLabel JL_TableroVendedor;
    private javax.swing.JButton btnCerrasesion1;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnVentas;
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
