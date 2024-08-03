package Interfaz.Administrador;

import Interfaz.*;
import Logic.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InventarioAdmin_Pantalla extends javax.swing.JFrame {

    Connection conn;
    Conexion conexion;
    String usuario;
    String nomUsuario;
    int IdProducto;

    public InventarioAdmin_Pantalla(Conexion conexion, Connection connection, String usuario, String nomUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.conexion = conexion;
        this.conn = connection;
        this.usuario = usuario;
        this.nomUsuario = nomUsuario;
        NombreAdmin.setText(usuario);
    }

    private void cerrarConexion() {
        if (conexion != null) {
            conexion.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        JL_Producto = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        JL_Cantidad = new javax.swing.JLabel();
        JL_precioUnitario = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        txtPrecioUnitario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResultados = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        JL_TRegistroProducto = new javax.swing.JLabel();
        NombreAdmin = new javax.swing.JLabel();
        JL_FondoInventarioAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Proveedor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 100, -1));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, -1, 30));

        btnTablero.setText("Tablero");
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        btnVentas.setText("Ventas");
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btnInventario.setText("Inventario");
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        btnUsuarios.setText("Usuarios");
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        btnProveedores.setText("Proveedores");
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        btnReportes.setText("Reportes");
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        btnAjustes.setText("Ajustes");
        getContentPane().add(btnAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, -1, -1));

        btnSalir.setText("Cerrar sesión");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 740, -1, -1));

        JL_Producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Producto.setText("Producto");
        getContentPane().add(JL_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 160, -1));

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 340, 40));

        JL_Cantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Cantidad.setText("Cantidad");
        getContentPane().add(JL_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        JL_precioUnitario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_precioUnitario.setText("Precio unitario");
        getContentPane().add(JL_precioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, -1, 30));
        getContentPane().add(spCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 100, 40));

        txtPrecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 130, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Tipo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 70, -1));
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 180, 40));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 150, 50));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 150, 50));

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 490, 120, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 120, 40));

        tbResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Tipo", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbResultados.setRowHeight(40);
        tbResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbResultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbResultados);
        if (tbResultados.getColumnModel().getColumnCount() > 0) {
            tbResultados.getColumnModel().getColumn(0).setResizable(false);
            tbResultados.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbResultados.getColumnModel().getColumn(1).setResizable(false);
            tbResultados.getColumnModel().getColumn(1).setPreferredWidth(70);
            tbResultados.getColumnModel().getColumn(2).setResizable(false);
            tbResultados.getColumnModel().getColumn(2).setPreferredWidth(30);
            tbResultados.getColumnModel().getColumn(3).setResizable(false);
            tbResultados.getColumnModel().getColumn(3).setPreferredWidth(20);
            tbResultados.getColumnModel().getColumn(4).setResizable(false);
            tbResultados.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 350, 170));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, 270, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 120, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Consulta de productos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, -1));

        JL_TRegistroProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_TRegistroProducto.setText("Registro de productos");
        getContentPane().add(JL_TRegistroProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        NombreAdmin.setText("Nombre usuario");
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 190, 63));
        getContentPane().add(JL_FondoInventarioAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();

        this.setVisible(false);
        this.dispose();
        cerrarConexion();

        iniSesion.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed

    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtPrecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioUnitarioActionPerformed

    }//GEN-LAST:event_txtPrecioUnitarioActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tbResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbResultadosMouseClicked
        btnRegistrar.setEnabled(false);
        int fila = this.tbResultados.getSelectedRow();

        if (fila >= 0) {
            try {
                this.txtProducto.setText(this.tbResultados.getValueAt(fila, 1).toString());
                this.txtTipo.setText(this.tbResultados.getValueAt(fila, 2).toString());
                this.txtPrecioUnitario.setText(this.tbResultados.getValueAt(fila, 4).toString());

                IdProducto = Integer.parseInt(this.tbResultados.getValueAt(fila, 0).toString());
                float cantidad = Float.parseFloat(this.tbResultados.getValueAt(fila, 3).toString());

                this.spCantidad.setValue(cantidad);

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tbResultadosMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String parametroBusqueda = txtBuscar.getText();

        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Tipo");
        tabla.addColumn("Cantidad");
        tabla.addColumn("Precio");

        tbResultados.setModel(tabla);

        if (conn != null) {
            try {
                String query = "SELECT IDProducto, Nombre, Tipo, Cantidad_Disponible, Precio FROM Producto WHERE Nombre LIKE ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, "%" + parametroBusqueda + "%");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String[] rowData = {
                        rs.getString("IDProducto"),
                        rs.getString("Nombre"),
                        rs.getString("Tipo"),
                        rs.getString("Cantidad_Disponible"),
                        rs.getString("Precio")
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

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        String idpr = String.valueOf(IdProducto);

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar el producto con ID " + idpr + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            if (conn != null) {
                try {
                    String query = "DELETE FROM Producto WHERE IDProducto = ?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, idpr);

                    JOptionPane.showMessageDialog(null, "Se ha eliminado el registro correctamente");
                    int columEliminadas = ps.executeUpdate();
                    System.out.println("Filas afectadas: " + columEliminadas);

                    ps.close();

                    DefaultTableModel tabla = (DefaultTableModel) tbResultados.getModel();
                    tabla.setRowCount(0);
                    txtBuscar.setText("");
                    txtProducto.setText("");
                    txtPrecioUnitario.setText("");
                    txtTipo.setText("");
                    spCantidad.setValue(0);
                    btnRegistrar.setEnabled(true);
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

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        spCantidad.setValue(0);
        txtPrecioUnitario.setText("");
        txtProducto.setText("");
        txtTipo.setText("");
        
        btnRegistrar.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        String idpr = String.valueOf(IdProducto);
        String Producto = txtProducto.getText();
        String PrecioUnitario = txtPrecioUnitario.getText();
        String Tipo = txtTipo.getText();

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas actualizar el producto con ID " + idpr + "?", "Confirmar Actualización", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            if (conn != null) {
                try {
                    String query = "DELETE FROM Producto WHERE IDProducto = ?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, idpr);

                    JOptionPane.showMessageDialog(null, "Se ha eliminado el registro correctamente");
                    int columEliminadas = ps.executeUpdate();
                    System.out.println("Filas afectadas: " + columEliminadas);

                    ps.close();

                    DefaultTableModel tabla = (DefaultTableModel) tbResultados.getModel();
                    tabla.setRowCount(0);
                    txtBuscar.setText("");
                    txtProducto.setText("");
                    txtPrecioUnitario.setText("");
                    txtTipo.setText("");
                    spCantidad.setValue(0);
                    btnRegistrar.setEnabled(true);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("No se pudo conectar a la base de datos.");
            }
        } else {
            System.out.println("Eliminación cancelada.");
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Cantidad;
    private javax.swing.JLabel JL_FondoInventarioAdmin;
    private javax.swing.JLabel JL_Producto;
    private javax.swing.JLabel JL_TRegistroProducto;
    private javax.swing.JLabel JL_precioUnitario;
    private javax.swing.JLabel NombreAdmin;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTable tbResultados;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
