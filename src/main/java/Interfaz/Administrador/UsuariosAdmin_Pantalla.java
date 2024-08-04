package Interfaz.Administrador;

import Logic.*;
import Interfaz.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuariosAdmin_Pantalla extends javax.swing.JFrame {

    Connection conn;
    Conexion conexion;
    String usuario, nomUsuario;
    int IDUsuario;

    public UsuariosAdmin_Pantalla(Conexion conexion, Connection connection, String usuario, String nomUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.conexion = conexion;
        this.conn = connection;
        this.usuario = usuario;
        this.nomUsuario = nomUsuario;
        NombreAdmin.setText(usuario);

        obtenerUsuarios();
        
        //Tabla de la busqueda
        tbResultados.getColumnModel().getColumn(0).setPreferredWidth(10);  // Ancho para la columna "ID"
        tbResultados.getColumnModel().getColumn(1).setPreferredWidth(80); // Ancho para la columna "Nombre"
        tbResultados.getColumnModel().getColumn(3).setPreferredWidth(40); // Ancho para la columna "Rol"
        tbResultados.setDefaultEditor(Object.class, null); // Inhabilitar la edición
        tbResultados.getTableHeader().setResizingAllowed(false); // Inhabilitar el redimensionamiento
   
        //Tabla de los registros recientes
        tbResultados1.getColumnModel().getColumn(0).setPreferredWidth(10);  // Ancho para la columna "ID"
        tbResultados1.getColumnModel().getColumn(1).setPreferredWidth(80); // Ancho para la columna "Nombre"
        tbResultados1.getColumnModel().getColumn(3).setPreferredWidth(40); // Ancho para la columna "Rol"
        tbResultados1.setDefaultEditor(Object.class, null); // Inhabilitar la edición
        tbResultados1.getTableHeader().setResizingAllowed(false); // Inhabilitar el redimensionamiento
   
        
    }

    private void cerrarConexion() {
        if (conexion != null) {
            conexion.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbResultados1 = new javax.swing.JTable();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        NombreAdmin = new javax.swing.JLabel();
        JL_TRegistroUsuariosyRoles = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        JL_Producto = new javax.swing.JLabel();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnRegistrarRol = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResultados = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        JL_FondoUsuariosAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbResultados1.setBackground(new java.awt.Color(255, 255, 255));
        tbResultados1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbResultados1);
        if (tbResultados1.getColumnModel().getColumnCount() > 0) {
            tbResultados1.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 350, 170));

        btnTablero.setText("Tablero");
        btnTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableroMouseClicked(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        btnVentas.setText("Ventas");
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btnInventario.setText("Inventario");
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        btnUsuarios.setText("Usuarios");
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        btnProveedores.setText("Proveedores");
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        btnReportes.setText("Reportes");
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        btnAjustes.setText("Ajustes");
        btnAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjustesMouseClicked(evt);
            }
        });
        getContentPane().add(btnAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        btnSalir.setText("Cerrar sesión");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 190, 63));

        JL_TRegistroUsuariosyRoles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_TRegistroUsuariosyRoles.setText("Registro de usuarios");
        getContentPane().add(JL_TRegistroUsuariosyRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 40, 30));

        JL_Producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Producto.setText("Usuarios agregados");
        getContentPane().add(JL_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 190, -1));

        btnRegistrarUsuario.setText("Registrar usuario");
        btnRegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarUsuarioMouseClicked(evt);
            }
        });
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 150, 50));

        btnRegistrarRol.setText("Registrar rol");
        btnRegistrarRol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarRolMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegistrarRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 150, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Consulta de usuarios");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, -1));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 310, 30));

        tbResultados.setBackground(new java.awt.Color(255, 255, 255));
        tbResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbResultados.setRowHeight(40);
        jScrollPane1.setViewportView(tbResultados);
        if (tbResultados.getColumnModel().getColumnCount() > 0) {
            tbResultados.getColumnModel().getColumn(0).setResizable(false);
            tbResultados.getColumnModel().getColumn(1).setResizable(false);
            tbResultados.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 350, 170));

        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 120, 40));

        btnEditar.setText("Editar");
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 490, 120, 40));
        getContentPane().add(JL_FondoUsuariosAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();

        this.setVisible(false);
        this.dispose();
        cerrarConexion();

        iniSesion.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed

    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

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

        VentasAdmin_Pantalla ventasAdmin = new VentasAdmin_Pantalla(conexion, conn, usuario, nomUsuario);
        ventasAdmin.setVisible(true);
        ventasAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        this.setVisible(false);
        this.dispose();

        InventarioAdmin_Pantalla invA = new InventarioAdmin_Pantalla(conexion, conn, usuario, nomUsuario);
        invA.setVisible(true);
        invA.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        this.setVisible(false);
        this.dispose();

        UsuariosAdmin_Pantalla usersAdmin = new UsuariosAdmin_Pantalla(conexion, conn, usuario, nomUsuario);
        usersAdmin.setVisible(true);
        usersAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnUsuariosMouseClicked

    private void btnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseClicked
        this.setVisible(false);
        this.dispose();

        ProveedoresAdmin_Pantalla proviAdmin = new ProveedoresAdmin_Pantalla(conexion, conn, usuario, nomUsuario);
        proviAdmin.setVisible(true);
        proviAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnProveedoresMouseClicked

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        ReportesAdmin_Pantalla rpa = new ReportesAdmin_Pantalla(conexion, conn, usuario, nomUsuario);
        this.setVisible(false);
        this.dispose();

        rpa.setVisible(true);
        rpa.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnReportesMouseClicked

    private void btnAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjustesMouseClicked
        this.setVisible(false);
        this.dispose();

        AjustesAdmin_Pantalla confiAdmin = new AjustesAdmin_Pantalla(conexion, conn, usuario, nomUsuario);
        confiAdmin.setVisible(true);
        confiAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAjustesMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String usuarioBuscado = txtBuscar.getText();

        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Rol");

        this.tbResultados.setModel(tabla);

        if (conn != null) {
            try {
                String query = "SELECT T.IDVendedor, CONCAT(T.Nombre, ' ', T.AP, ' ', T.AM) AS Nombre, R.Rol FROM Trabajador T JOIN Rol R ON T.IDRol = R.IDRol WHERE T.Nombre LIKE ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, "%" + usuarioBuscado + "%");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String[] rowData = {
                        rs.getString("IDVendedor"),
                        rs.getString("Nombre"),
                        rs.getString("Rol")
                    };
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

    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseClicked
        this.setVisible(false);
        this.dispose();
        
        RegistroUsuario rup = new RegistroUsuario(conexion, conn, usuario, nomUsuario);
        rup.setVisible(true);
        rup.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegistrarUsuarioMouseClicked

    private void btnRegistrarRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarRolMouseClicked
        this.setVisible(false);
        this.dispose();
        
        RegistroRol rrp = new RegistroRol(conexion, conn, usuario, nomUsuario);
        rrp.setVisible(true);
        rrp.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegistrarRolMouseClicked

    public void obtenerUsuarios() {
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Rol");

        tbResultados1.setModel(tabla);

        if (conn != null) {
            try {
                String query = "SELECT T.IDVendedor, CONCAT(T.Nombre, ' ', T.AP, ' ', T.AM) AS Nombre, R.Rol FROM Trabajador T JOIN Rol R ON T.IDRol = R.IDRol ORDER BY IDVendedor DESC LIMIT 4";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String[] rowData = {
                        rs.getString("IDVendedor"),
                        rs.getString("Nombre"),
                        rs.getString("Rol"),};
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
    private javax.swing.JLabel JL_FondoUsuariosAdmin;
    private javax.swing.JLabel JL_Producto;
    private javax.swing.JLabel JL_TRegistroUsuariosyRoles;
    private javax.swing.JLabel NombreAdmin;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRegistrarRol;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbResultados;
    private javax.swing.JTable tbResultados1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
