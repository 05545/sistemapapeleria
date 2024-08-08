package Interfaz.Administrador;

import Interfaz.*;
import Logic.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
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

        cargarProveedores();

        //Propiedades de la tabla busqueda
        tbResultados.getColumnModel().getColumn(0).setPreferredWidth(10);  // Ancho para la columna "ID"
        tbResultados.getColumnModel().getColumn(1).setPreferredWidth(100); // Ancho para la columna "Nombre"
        tbResultados.getColumnModel().getColumn(2).setPreferredWidth(20); // Ancho para la columna "Tipo"
        tbResultados.getColumnModel().getColumn(3).setPreferredWidth(20); // Ancho para la columna "Cantidad"
        tbResultados.getColumnModel().getColumn(4).setPreferredWidth(20); // Ancho para la columna "Precio"
        tbResultados.getColumnModel().getColumn(5).setPreferredWidth(20); // Ancho para la columna "Proveedor"
        tbResultados.setDefaultEditor(Object.class, null); // Inhabilitar la edición
        tbResultados.getTableHeader().setResizingAllowed(false); // Inhabilitar el redimensionamiento

        ((JSpinner.DefaultEditor) spCantidad.getEditor()).getTextField().setForeground(Color.BLACK);
        ((JSpinner.DefaultEditor) spCantidad.getEditor()).getTextField().setBackground(new Color(189, 189, 189));
    }

    private void cerrarConexion() {
        if (conexion != null) {
            conexion.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtProducto = new javax.swing.JTextField();
        spCantidad = new javax.swing.JSpinner();
        txtPrecioUnitario = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResultados = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        JCB_Proovedores = new javax.swing.JComboBox<>();
        NombreAdmin = new javax.swing.JLabel();
        JL_FondoInventarioAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 40, 40));

        btnTablero.setBorder(null);
        btnTablero.setContentAreaFilled(false);
        btnTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableroMouseClicked(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 160, 140, 30));

        btnVentas.setBorder(null);
        btnVentas.setContentAreaFilled(false);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 200, 130, 30));

        btnInventario.setBorder(null);
        btnInventario.setContentAreaFilled(false);
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 240, 130, 30));

        btnUsuarios.setBorder(null);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 290, 120, 30));

        btnProveedores.setBorder(null);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 330, 130, 30));

        btnReportes.setBorder(null);
        btnReportes.setContentAreaFilled(false);
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 370, 130, 30));

        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 635, 140, 30));

        txtProducto.setBackground(new java.awt.Color(189, 189, 189));
        txtProducto.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(0, 0, 0));
        txtProducto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtProducto.setBorder(null);
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 242, 340, 30));

        spCantidad.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        spCantidad.setToolTipText("");
        spCantidad.setBorder(null);
        getContentPane().add(spCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 110, 30));

        txtPrecioUnitario.setBackground(new java.awt.Color(189, 189, 189));
        txtPrecioUnitario.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtPrecioUnitario.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioUnitario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPrecioUnitario.setBorder(null);
        txtPrecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 332, 140, 30));

        txtTipo.setBackground(new java.awt.Color(189, 189, 189));
        txtTipo.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(0, 0, 0));
        txtTipo.setBorder(null);
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 425, 110, 33));
        txtTipo.getAccessibleContext().setAccessibleName("");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnRegistrar.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 190, 60));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnLimpiar.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 200, 60));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnEditar.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, 190, 60));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnEliminar.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, 190, 60));

        tbResultados.setBackground(new java.awt.Color(255, 255, 255));
        tbResultados.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbResultados.setFont(new java.awt.Font("C059", 0, 12)); // NOI18N
        tbResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tipo", "Cantidad", "Precio", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            tbResultados.getColumnModel().getColumn(5).setResizable(false);
            tbResultados.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 420, 170));

        txtBuscar.setBackground(new java.awt.Color(214, 214, 214));
        txtBuscar.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setBorder(null);
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 300, 40));

        JCB_Proovedores.setBackground(new java.awt.Color(189, 189, 189));
        JCB_Proovedores.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        JCB_Proovedores.setForeground(new java.awt.Color(0, 0, 0));
        JCB_Proovedores.setBorder(null);
        getContentPane().add(JCB_Proovedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 427, 140, 30));

        NombreAdmin.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        NombreAdmin.setForeground(new java.awt.Color(51, 51, 51));
        NombreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 260, 20));

        JL_FondoInventarioAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/Pantalla_Inventario_Administrador.png"))); // NOI18N
        getContentPane().add(JL_FondoInventarioAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        int confirm = JOptionPane.showConfirmDialog( this, "¿Estás seguro de que deseas salir?", "Confirmar salida",JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();

            this.setVisible(false);
            this.dispose();
            cerrarConexion();

            iniSesion.setVisible(true);
        }
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

                int idProveedor = Integer.parseInt(this.tbResultados.getValueAt(fila, 5).toString());

                for (int i = 0; i < JCB_Proovedores.getItemCount(); i++) {
                    String proveedor = JCB_Proovedores.getItemAt(i);
                    if (comprobarProveedor(idProveedor, proveedor)) {
                        JCB_Proovedores.setSelectedIndex(i);
                        break;
                    }
                }

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tbResultadosMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String parametroBusqueda = txtBuscar.getText();

        if (parametroBusqueda.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ningún parámetro en el campo de busqueda.");
            return;
        }

        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Tipo");
        tabla.addColumn("Cantidad");
        tabla.addColumn("Precio");
        tabla.addColumn("IDGerente");

        tbResultados.setModel(tabla);

        if (conn != null) {
            try {
                String query = "SELECT IDProducto, Nombre, Tipo, Cantidad_Disponible, Precio, IDGerente FROM Producto WHERE Nombre LIKE ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, "%" + parametroBusqueda + "%");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String[] rowData = {
                        rs.getString("IDProducto"),
                        rs.getString("Nombre"),
                        rs.getString("Tipo"),
                        rs.getString("Cantidad_Disponible"),
                        rs.getString("Precio"),
                        rs.getString("IDGerente")
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

        if (IdProducto > 0) {
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
                        limpiar();

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("No se pudo conectar a la base de datos.");
                }
            } else {
                System.out.println("Eliminación cancelada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Primero selecciona un elemento de la tabla de buscar.");
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        String idpr = String.valueOf(IdProducto);
        String producto = txtProducto.getText();
        String precioUnitario = txtPrecioUnitario.getText();
        String tipo = txtTipo.getText();
        String proveedor = (String) JCB_Proovedores.getSelectedItem();

        if (IdProducto > 0) {
            if (producto.isEmpty() || precioUnitario.isEmpty() || tipo.isEmpty() || proveedor.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.");
                return;
            }

            float precio, cantidad;

            try {
                precio = Float.parseFloat(precioUnitario);
                cantidad = ((Number) spCantidad.getValue()).floatValue();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Precio unitario inválido. Ingresa un número válido.");
                return;
            }

            if (cantidad < 1) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa una cantidad valida.");
                return;
            }

            int idProveedor = obtenerIdProveedor(proveedor);
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas actualizar el producto con ID " + idpr + "?", "Confirmar Actualización", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                if (conn != null) {
                    try {
                        String query = "UPDATE Producto SET Nombre = ?, Tipo = ?, Cantidad_Disponible = ?, Precio = ?, IDGerente = ? WHERE IDProducto = ?";
                        PreparedStatement ps = conn.prepareStatement(query);
                        ps.setString(1, producto);
                        ps.setString(2, tipo);
                        ps.setFloat(3, cantidad);
                        ps.setFloat(4, precio);
                        ps.setInt(5, idProveedor);
                        ps.setInt(6, IdProducto);

                        JOptionPane.showMessageDialog(null, "Se ha actualiado el registro correctamente");
                        int columEliminadas = ps.executeUpdate();
                        System.out.println("Filas afectadas: " + columEliminadas);

                        ps.close();
                        limpiar();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("No se pudo conectar a la base de datos.");
                }
            } else {
                System.out.println("Actualización cancelada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Primero selecciona un elemento de la tabla de buscar.");
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        String idpr = String.valueOf(IdProducto);
        String producto = txtProducto.getText();
        String precioUnitario = txtPrecioUnitario.getText();
        String tipo = txtTipo.getText();
        String proveedor = (String) JCB_Proovedores.getSelectedItem();

        if (producto.isEmpty() || precioUnitario.isEmpty() || tipo.isEmpty() || proveedor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.");
            return;
        }

        float precio, cantidad;

        try {
            precio = Float.parseFloat(precioUnitario);
            cantidad = ((Number) spCantidad.getValue()).floatValue();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Precio unitario inválido. Ingresa un número válido.");
            return;
        }

        if (cantidad < 1) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa una cantidad valida.");
            return;
        }

        int idProveedor = obtenerIdProveedor(proveedor);
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas insertar el producto nuevo?", "Confirmar inserción", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            if (conn != null) {
                try {
                    String query = "CALL RegistrarProducto(?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, producto);
                    ps.setString(2, tipo);
                    ps.setFloat(3, cantidad);
                    ps.setFloat(4, precio);
                    ps.setInt(5, idProveedor);

                    JOptionPane.showMessageDialog(null, "Se ha insertado el registro correctamente");
                    int columEliminadas = ps.executeUpdate();
                    System.out.println("Filas afectadas: " + columEliminadas);

                    ps.close();

                    limpiar();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("No se pudo conectar a la base de datos.");
            }
        } else {
            System.out.println("Actualización cancelada.");
        }
    }//GEN-LAST:event_btnRegistrarMouseClicked

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

    private int obtenerIdProveedor(String nomProveedor) {
        int idProveedor = 0;

        if (conn != null) {
            try {
                String query = "SELECT IDGerente FROM Proveedor WHERE Proveedor = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, nomProveedor);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    idProveedor = rs.getInt("IDGerente");
                }

                rs.close();
                ps.close();
            } catch (SQLException e) {
                System.out.println("Error en la ejecución de la consula. " + e);
            }
        } else {
            System.out.println("Error en la conexión a la base de datos");
        }

        return idProveedor;
    }

    private void cargarProveedores() {
        if (conn != null) {
            try {
                String query = "SELECT IDGerente, Proveedor FROM Proveedor";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
                while (rs.next()) {
                    String proveedor = rs.getString("Proveedor");
                    modelo.addElement(proveedor);
                }

                JCB_Proovedores.setModel(modelo);

                rs.close();
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }
    }

    private boolean comprobarProveedor(int id, String nombre) {
        boolean encontrado = false;

        if (conn != null) {
            try {
                String query = "SELECT Proveedor FROM Proveedor WHERE IDGerente = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String proveedor = rs.getString("Proveedor");
                    if (proveedor.equals(nombre)) {
                        encontrado = true;
                    }
                }

                rs.close();
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }

        return encontrado;
    }

    private void limpiar() {
        DefaultTableModel tabla = (DefaultTableModel) tbResultados.getModel();
        tabla.setRowCount(0);
        txtBuscar.setText("");
        txtProducto.setText("");
        txtPrecioUnitario.setText("");
        txtTipo.setText("");
        spCantidad.setValue(0);
        btnRegistrar.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCB_Proovedores;
    private javax.swing.JLabel JL_FondoInventarioAdmin;
    private javax.swing.JLabel NombreAdmin;
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
