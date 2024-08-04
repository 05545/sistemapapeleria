//Se han ajustado los nombres de los elementos
package Interfaz.Administrador;

import Interfaz.*;
import Logic.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InicioAdmin_Pantalla extends javax.swing.JFrame {

    Connection conn;
    private Conexion conexion;
    String nomUsuario = "";
    String iniNombreUsuario = "";

    public InicioAdmin_Pantalla(Conexion conexion, Connection conn, String nomUsuario) {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.conn = conn;
        this.conexion = conexion;
        this.nomUsuario = nomUsuario;

        consultarNombre();
        obtenerInventario();
        obtenerVentas();

        //Tabla del inventario disponible
        tbProductoStock.getColumnModel().getColumn(0).setPreferredWidth(40);  // Ancho para la columna "ID"
        tbProductoStock.getColumnModel().getColumn(1).setPreferredWidth(200); // Ancho para la columna "Nombre"
        tbProductoStock.getColumnModel().getColumn(2).setPreferredWidth(40); // Ancho para la columna "Cantidad"
        tbProductoStock.setDefaultEditor(Object.class, null); // Inhabilitar la edición
        tbProductoStock.getTableHeader().setResizingAllowed(false); // Inhabilitar el redimensionamiento
        
        //Tabla de las ventas recientes
        tbVentasRecientes.getColumnModel().getColumn(0).setPreferredWidth(40);  // Ancho para la columna "ID"
        tbVentasRecientes.getColumnModel().getColumn(1).setPreferredWidth(200); // Ancho para la columna "Nombre"
        tbVentasRecientes.getColumnModel().getColumn(2).setPreferredWidth(40); // Ancho para la columna "Subtotal"
        tbVentasRecientes.setDefaultEditor(Object.class, null); // Inhabilitar la edición
        tbVentasRecientes.getTableHeader().setResizingAllowed(false); // Inhabilitar el redimensionamiento
        
        
    }

    private void cerrarConexion() {
        if (conexion != null) {
            conexion.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }

    private void consultarNombre() {
        String nombre = "";
        System.out.println("Se ha llamado a consultar nombre");

        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String sql = "SELECT Nombre FROM Trabajador WHERE Usuario = '" + nomUsuario + "'";
                ResultSet rs = stmt.executeQuery(sql);

                if (rs.next()) {
                    nombre = rs.getString("Nombre");
                    iniNombreUsuario = nombre;
                    NombreAdmin.setText(iniNombreUsuario);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_VentasRecientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVentasRecientes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProductoStock = new javax.swing.JTable();
        btnReportes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnTablero = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        NombreAdmin = new javax.swing.JLabel();
        JL_FondoTableroAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_VentasRecientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_VentasRecientes.setText("Ventas recientes");
        getContentPane().add(JL_VentasRecientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 190, -1));

        tbVentasRecientes.setBackground(new java.awt.Color(255, 255, 255));
        tbVentasRecientes.setFont(new java.awt.Font("C059", 0, 12)); // NOI18N
        tbVentasRecientes.setForeground(new java.awt.Color(0, 0, 0));
        tbVentasRecientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVentasRecientes.setRowHeight(40);
        tbVentasRecientes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbVentasRecientesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbVentasRecientes);
        if (tbVentasRecientes.getColumnModel().getColumnCount() > 0) {
            tbVentasRecientes.getColumnModel().getColumn(0).setResizable(false);
            tbVentasRecientes.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbVentasRecientes.getColumnModel().getColumn(1).setResizable(false);
            tbVentasRecientes.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbVentasRecientes.getColumnModel().getColumn(2).setResizable(false);
            tbVentasRecientes.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 400, 350));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Productos con poco Stock");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, -1, -1));

        tbProductoStock.setFont(new java.awt.Font("C059", 0, 12)); // NOI18N
        tbProductoStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProductoStock.setOpaque(false);
        tbProductoStock.setRowHeight(30);
        tbProductoStock.setRowSelectionAllowed(false);
        tbProductoStock.setSelectionBackground(new java.awt.Color(0, 255, 0));
        jScrollPane3.setViewportView(tbProductoStock);
        if (tbProductoStock.getColumnModel().getColumnCount() > 0) {
            tbProductoStock.getColumnModel().getColumn(0).setResizable(false);
            tbProductoStock.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbProductoStock.getColumnModel().getColumn(1).setResizable(false);
            tbProductoStock.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbProductoStock.getColumnModel().getColumn(2).setResizable(false);
            tbProductoStock.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 410, 350));

        btnReportes.setText("Reportes");
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        btnProveedores.setText("Proveedores");
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        btnSalir.setText("Cerrar sesión");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, -1, 30));

        btnUsuarios.setText("Usuarios");
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        btnVentas.setText("Ventas");
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        btnAjustes.setText("Ajustes");
        btnAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjustesMouseClicked(evt);
            }
        });
        getContentPane().add(btnAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        btnTablero.setText("Tablero");
        btnTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableroMouseClicked(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        btnInventario.setText("Inventario");
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        NombreAdmin.setFont(new java.awt.Font("C059", 0, 12)); // NOI18N
        NombreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 190, 63));
        getContentPane().add(JL_FondoTableroAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();

        this.setVisible(false);
        this.dispose();
        cerrarConexion();

        iniSesion.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void tbVentasRecientesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbVentasRecientesAncestorAdded

    }//GEN-LAST:event_tbVentasRecientesAncestorAdded

    private void btnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseClicked
        this.setVisible(false);
        this.dispose();

        ProveedoresAdmin_Pantalla proviAdmin = new ProveedoresAdmin_Pantalla(conexion, conn, iniNombreUsuario, nomUsuario);
        proviAdmin.setVisible(true);
        proviAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnProveedoresMouseClicked

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        ReportesAdmin_Pantalla rpa = new ReportesAdmin_Pantalla(conexion, conn, iniNombreUsuario, nomUsuario);
        this.setVisible(false);
        this.dispose();

        rpa.setVisible(true);
        rpa.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnReportesMouseClicked

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        this.setVisible(false);
        this.dispose();

        InventarioAdmin_Pantalla invA = new InventarioAdmin_Pantalla(conexion, conn, iniNombreUsuario, nomUsuario);
        invA.setVisible(true);
        invA.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTableroMouseClicked

        this.setVisible(false);
        this.dispose();

        InicioAdmin_Pantalla iniAdmin = new InicioAdmin_Pantalla(conexion, conn, nomUsuario);
        iniAdmin.setVisible(true);
        iniAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTableroMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        this.setVisible(false);
        this.dispose();

        VentasAdmin_Pantalla ventasAdmin = new VentasAdmin_Pantalla(conexion, conn, iniNombreUsuario, nomUsuario);
        ventasAdmin.setVisible(true);
        ventasAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        this.setVisible(false);
        this.dispose();

        UsuariosAdmin_Pantalla usersAdmin = new UsuariosAdmin_Pantalla(conexion, conn, iniNombreUsuario, nomUsuario);
        usersAdmin.setVisible(true);
        usersAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnUsuariosMouseClicked

    private void btnAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjustesMouseClicked
        this.setVisible(false);
        this.dispose();

        AjustesAdmin_Pantalla confiAdmin = new AjustesAdmin_Pantalla(conexion, conn, iniNombreUsuario, nomUsuario);
        confiAdmin.setVisible(true);
        confiAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAjustesMouseClicked

    private void obtenerInventario() {
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Cantidad");

        tbProductoStock.setModel(tabla);

        if (conn != null) {
            try {
                String query = "SELECT IDProducto, Nombre, Cantidad_Disponible FROM Producto WHERE Cantidad_Disponible < 10";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String[] rowData = {
                        rs.getString("IDProducto"),
                        rs.getString("Nombre"),
                        rs.getString("Cantidad_Disponible"),};
                    tabla.addRow(rowData);
                }

                rs.close();
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }

    }

    public void obtenerVentas() {
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Subtotal");

        tbVentasRecientes.setModel(tabla);

        if (conn != null) {
            try {
                String query = "SELECT IDVenta, Nombre, Subtotal FROM Venta ORDER BY IDVenta DESC LIMIT 10";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String[] rowData = {
                        rs.getString("IDVenta"),
                        rs.getString("Nombre"),
                        rs.getString("Subtotal"),};
                    tabla.addRow(rowData);
                }

                rs.close();
                ps.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_FondoTableroAdmin;
    private javax.swing.JLabel JL_VentasRecientes;
    private javax.swing.JLabel NombreAdmin;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbProductoStock;
    private javax.swing.JTable tbVentasRecientes;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
