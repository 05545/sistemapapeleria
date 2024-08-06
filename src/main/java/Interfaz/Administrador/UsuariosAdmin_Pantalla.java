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
        tbResultados.getColumnModel().getColumn(2).setPreferredWidth(40); // Ancho para la columna "Rol"
        tbResultados.setDefaultEditor(Object.class, null); // Inhabilitar la edición
        tbResultados.getTableHeader().setResizingAllowed(false); // Inhabilitar el redimensionamiento

        //Tabla de los registros recientes
        tbResultados1.getColumnModel().getColumn(0).setPreferredWidth(10);  // Ancho para la columna "ID"
        tbResultados1.getColumnModel().getColumn(1).setPreferredWidth(80); // Ancho para la columna "Nombre"
        tbResultados1.getColumnModel().getColumn(2).setPreferredWidth(40); // Ancho para la columna "Rol"
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
        btnSalir = new javax.swing.JButton();
        NombreAdmin = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnRegistrarUsuario = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResultados = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        JL_FondoUsuariosAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setOpaque(false);

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
        tbResultados1.setRowHeight(40);
        jScrollPane2.setViewportView(tbResultados1);
        if (tbResultados1.getColumnModel().getColumnCount() > 0) {
            tbResultados1.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 390, 150));

        btnTablero.setBorder(null);
        btnTablero.setContentAreaFilled(false);
        btnTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableroMouseClicked(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, 30));

        btnVentas.setBorder(null);
        btnVentas.setContentAreaFilled(false);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 30));

        btnInventario.setBorder(null);
        btnInventario.setContentAreaFilled(false);
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 30));

        btnUsuarios.setBorder(null);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, 30));

        btnProveedores.setBorder(null);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 150, 30));

        btnReportes.setBorder(null);
        btnReportes.setContentAreaFilled(false);
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 150, 30));

        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 150, 30));
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 190, 63));

        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 40, 30));

        btnRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnRegistroUsuario.png"))); // NOI18N
        btnRegistrarUsuario.setContentAreaFilled(false);
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
        getContentPane().add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 252, 190, 60));

        txtBuscar.setBackground(new java.awt.Color(214, 214, 214));
        txtBuscar.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscar.setBorder(null);
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 320, 30));

        tbResultados.setBackground(new java.awt.Color(255, 255, 255));
        tbResultados.setForeground(new java.awt.Color(51, 51, 51));
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
        tbResultados.setOpaque(false);
        tbResultados.setRowHeight(40);
        tbResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbResultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbResultados);
        if (tbResultados.getColumnModel().getColumnCount() > 0) {
            tbResultados.getColumnModel().getColumn(0).setResizable(false);
            tbResultados.getColumnModel().getColumn(1).setResizable(false);
            tbResultados.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 220, 380, 160));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnEliminar.png"))); // NOI18N
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 382, 200, 60));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnEditar.png"))); // NOI18N
        btnEditar.setContentAreaFilled(false);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 200, 60));

        JL_FondoUsuariosAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/Pantalla_Usuarios_Administrador.png"))); // NOI18N
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

        RegistroUsuario rup = new RegistroUsuario(conexion, conn, usuario, nomUsuario, -1);
        rup.setVisible(true);
        rup.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegistrarUsuarioMouseClicked

    private void tbResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbResultadosMouseClicked
        int fila = this.tbResultados.getSelectedRow();

        if (fila >= 0) {
            try {
                IDUsuario = Integer.parseInt(this.tbResultados.getValueAt(fila, 0).toString());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tbResultadosMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        String idtr = String.valueOf(IDUsuario);

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar el usuario con ID " + idtr + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            if (conn != null) {
                try {
                    String query = "DELETE FROM Trabajador WHERE IDVendedor = ?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, idtr);

                    JOptionPane.showMessageDialog(null, "Se ha eliminado el registro correctamente");
                    int columEliminadas = ps.executeUpdate();
                    System.out.println("Filas afectadas: " + columEliminadas);

                    ps.close();

                    DefaultTableModel tabla = (DefaultTableModel) tbResultados.getModel();
                    tabla.setRowCount(0);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("No se pudo conectar a la base de datos.");
            }
        } else {
            System.out.println("Eliminación cancelada.");
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked

        if (IDUsuario < 1) {
            JOptionPane.showMessageDialog(null, "Primero selecciona una columna de la tabla.");
        } else {
            RegistroUsuario ru = new RegistroUsuario(conexion, conn, usuario, nomUsuario, IDUsuario);

            this.setVisible(false);
            this.dispose();
            
            ru.setVisible(true);
            ru.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnEditarMouseClicked

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
    private javax.swing.JLabel NombreAdmin;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
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
