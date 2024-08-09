package Interfaz.ventas;

import Interfaz.InicioSesion_Pantalla;
import Logic.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;

public class Inventario_Venta extends javax.swing.JFrame {

    Conexion con;
    Connection conn;
    String nomUsuario;
    String usuario;

    public Inventario_Venta(Conexion conexion, Connection connection, String usuario, String nomUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.con = conexion;
        this.conn = connection;
        this.usuario = usuario;
        this.nomUsuario = nomUsuario;

        JL_NomUser.setText(usuario);

        Mostra();
        rellenarC("Proveedor", "Proveedor", cbProveedor);
        cargarTipo();

        ((JSpinner.DefaultEditor) spcantidad.getEditor()).getTextField().setForeground(Color.BLACK);
        ((JSpinner.DefaultEditor) spcantidad.getEditor()).getTextField().setBackground(new Color(189, 189, 189));
    }

    private void cerrarConexion() {
        if (con != null) {
            con.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_NomUser = new javax.swing.JLabel();
        txtproducto = new javax.swing.JTextField();
        spcantidad = new javax.swing.JSpinner();
        txtprecioUnitario = new javax.swing.JTextField();
        btnregistra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbusqueda = new javax.swing.JTable();
        btnlimpiar = new javax.swing.JButton();
        txtconsulta = new javax.swing.JTextField();
        btneditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        btnCerrasesion = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();
        cbProveedor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JF_Inventario");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_NomUser.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        JL_NomUser.setForeground(new java.awt.Color(51, 51, 51));
        JL_NomUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(JL_NomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, 220, 20));

        txtproducto.setBackground(new java.awt.Color(189, 189, 189));
        txtproducto.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtproducto.setForeground(new java.awt.Color(51, 51, 51));
        txtproducto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtproducto.setBorder(null);
        txtproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 330, 30));
        getContentPane().add(spcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 323, 110, 30));

        txtprecioUnitario.setBackground(new java.awt.Color(189, 189, 189));
        txtprecioUnitario.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtprecioUnitario.setForeground(new java.awt.Color(51, 51, 51));
        txtprecioUnitario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtprecioUnitario.setBorder(null);
        txtprecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtprecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 323, 120, 30));

        btnregistra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnRegistrar.png"))); // NOI18N
        btnregistra.setBorder(null);
        btnregistra.setBorderPainted(false);
        btnregistra.setContentAreaFilled(false);
        btnregistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistraActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 200, 60));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        tbbusqueda.setBackground(new java.awt.Color(255, 255, 255));
        tbbusqueda.setForeground(new java.awt.Color(51, 51, 51));
        tbbusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Tipo", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbbusqueda.setRowHeight(40);
        tbbusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbbusquedaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbbusqueda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 390, 250));

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnLimpiar.png"))); // NOI18N
        btnlimpiar.setBorder(null);
        btnlimpiar.setBorderPainted(false);
        btnlimpiar.setContentAreaFilled(false);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 190, 60));

        txtconsulta.setBackground(new java.awt.Color(214, 214, 214));
        txtconsulta.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtconsulta.setForeground(new java.awt.Color(51, 51, 51));
        txtconsulta.setBorder(null);
        getContentPane().add(txtconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 340, 30));

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnEditar.png"))); // NOI18N
        btneditar.setBorder(null);
        btneditar.setBorderPainted(false);
        btneditar.setContentAreaFilled(false);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        getContentPane().add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 514, 190, 60));

        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 40, 30));

        btnTablero.setBorder(null);
        btnTablero.setBorderPainted(false);
        btnTablero.setContentAreaFilled(false);
        btnTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableroMouseClicked(evt);
            }
        });
        btnTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableroActionPerformed(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 130, 30));

        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, 30));

        btnInventario.setBorder(null);
        btnInventario.setBorderPainted(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, 30));

        btnCuenta.setBorder(null);
        btnCuenta.setBorderPainted(false);
        btnCuenta.setContentAreaFilled(false);
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 130, 30));

        btnCerrasesion.setBorder(null);
        btnCerrasesion.setBorderPainted(false);
        btnCerrasesion.setContentAreaFilled(false);
        btnCerrasesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrasesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrasesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 170, 30));

        cbTipo.setBackground(new java.awt.Color(189, 189, 189));
        cbTipo.setBorder(null);
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 426, 120, 30));

        cbProveedor.setBackground(new java.awt.Color(189, 189, 189));
        cbProveedor.setBorder(null);
        cbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(cbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 430, 120, 30));

        jLabel6.setBackground(new java.awt.Color(189, 189, 189));
        jLabel6.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVendedor/Pantalla_Inventario_Vendedor.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));
        jLabel6.getAccessibleContext().setAccessibleName("JL_fondoInventario");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductoActionPerformed

    }//GEN-LAST:event_txtproductoActionPerformed

    private void txtprecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioUnitarioActionPerformed

    }//GEN-LAST:event_txtprecioUnitarioActionPerformed

    private void btnregistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistraActionPerformed
        Registra();
        Mostra();
    }//GEN-LAST:event_btnregistraActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String NombreT = txtconsulta.getText();
        btnregistra.setEnabled(true);
        Buscar(NombreT);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
        btnregistra.setEnabled(true);
        Mostra();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        Actualizar();
        Mostra();
        Limpiar();
        btnregistra.setEnabled(true);
    }//GEN-LAST:event_btneditarActionPerformed

    private void tbbusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbbusquedaMouseClicked
        int fila = this.tbbusqueda.getSelectedRow();

        // Obtener valores de la tabla
        String producto = this.tbbusqueda.getValueAt(fila, 1).toString();
        String precioUnitario = this.tbbusqueda.getValueAt(fila, 4).toString();
        String tipo = this.tbbusqueda.getValueAt(fila, 2).toString();
        String idString = this.tbbusqueda.getValueAt(fila, 0).toString();
        String cantidadString = this.tbbusqueda.getValueAt(fila, 3).toString();

        this.txtproducto.setText(producto);
        this.txtprecioUnitario.setText(precioUnitario);
        this.cbTipo.setSelectedItem(tipo);

        int id = 0;
        try {
            id = Integer.parseInt(idString);
            double cantidadDecimal = Double.parseDouble(cantidadString);
            int cantidad = (int) cantidadDecimal;
            this.spcantidad.setValue(cantidad);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "El valor de cantidad o id no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //Desativar boton 
        btnregistra.setEnabled(false);
    }//GEN-LAST:event_tbbusquedaMouseClicked

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

        Ventas_Ven VV = new Ventas_Ven(con, conn, usuario, nomUsuario);
        VV.setVisible(true);
        VV.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        this.setVisible(false);
        this.dispose();

        Inventario_Venta IV = new Inventario_Venta(con, conn, usuario, nomUsuario);
        IV.setVisible(true);
        IV.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        this.setVisible(false);
        this.dispose();

        Cuenta_Venta CV = new Cuenta_Venta(con, conn, usuario, nomUsuario);
        CV.setVisible(true);
        CV.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCuentaActionPerformed

    private void btnTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTableroMouseClicked

    }//GEN-LAST:event_btnTableroMouseClicked

    private void btnCerrasesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrasesionActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();

            this.setVisible(false);
            this.dispose();
            cerrarConexion();

            iniSesion.setVisible(true);
        }
    }//GEN-LAST:event_btnCerrasesionActionPerformed

    private void cbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProveedorActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed

    //Metodo para limpiar
    public void Limpiar() {
        txtconsulta.setText("");
        txtprecioUnitario.setText("");
        txtproducto.setText("");
        cbTipo.setSelectedIndex(1);
        spcantidad.setValue(0);
    }

    //Metodo para mostra datos
    public void Mostra() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Producto");
        model.addColumn("Tipo");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        tbbusqueda.setModel(model);

        String[] datos = new String[5];
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            if (conn != null) {
                String Consulta = "SELECT * FROM Producto";
                preparedStatement = conn.prepareStatement(Consulta);
                resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    datos[0] = resultSet.getString("IDProducto");
                    datos[1] = resultSet.getString("Nombre");
                    datos[2] = resultSet.getString("Tipo");
                    datos[3] = resultSet.getString("cantidad_disponible");
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
            System.out.println("Ejecucion completa");
        }
    }

//Metodo Para Buscar productos
    public void Buscar(String Nombre) {
        DefaultTableModel model = new DefaultTableModel();
        String[] datos = new String[5];
        model.addColumn("ID");
        model.addColumn("Producto");
        model.addColumn("Tipo");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        tbbusqueda.setModel(model);

        if (!Nombre.isEmpty()) {
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            try {
                if (conn != null) {
                    String Buscar = "SELECT * FROM Producto WHERE Nombre LIKE ?";
                    preparedStatement = conn.prepareStatement(Buscar);
                    preparedStatement.setString(1, "%" + Nombre + "%");
                    resultSet = preparedStatement.executeQuery();

                    if (!resultSet.isBeforeFirst()) { // Verifica si no hay resultados
                        JOptionPane.showMessageDialog(null, "No se encontraron registros en la base de datos.");
                    } else {
                        while (resultSet.next()) {
                            datos[0] = resultSet.getString("IDProducto");
                            datos[1] = resultSet.getString("Nombre");
                            datos[2] = resultSet.getString("Tipo");
                            datos[3] = resultSet.getString("cantidad_disponible");
                            datos[4] = resultSet.getString("Precio");
                            model.addRow(datos);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + ex.getMessage());
            } finally {
                System.out.println("Ejecucion terminada");
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
        } else {
            JOptionPane.showMessageDialog(null, "El campo de búsqueda está vacío.");
        }
    }

//Metodo para registra
    public void Registra() {
        String Nombre = txtproducto.getText();
        String Tipo = cbTipo.getSelectedItem().toString();

        double precio = 0.0;
        int cantidad = 0;

        //Seleccionar el proveedor 
        String Provedor = "";
        String claseString = (String) cbProveedor.getSelectedItem();

        if (claseString != null && !claseString.isEmpty()) {
            Provedor = claseString;
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un valor de clase de envio.");
            return;
        }

        int IdProveedor = obtenerID("IDGerente", "Proveedor", "Proveedor", Provedor);

        try {
            precio = Double.parseDouble(txtprecioUnitario.getText());
            cantidad = Integer.parseInt(spcantidad.getValue().toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Solo se aceptan números enteros y decimales");
            return; // Salir del método si hay un error en la conversión
        }

        PreparedStatement existsStatement = null;
        PreparedStatement preparedStatement = null;
        ResultSet existsResult = null;

        try {
            if (conn != null) {
                // Verificar si el producto ya existe
                String existsQuery = "SELECT COUNT(*) FROM Producto WHERE Nombre = ?";
                existsStatement = conn.prepareStatement(existsQuery);
                existsStatement.setString(1, Nombre);
                existsResult = existsStatement.executeQuery();

                if (existsResult.next() && existsResult.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "El Producto ya existe.");
                    return; // Salir del método si el producto ya existe
                }

                // Insertar nuevo producto
                String insertQuery = "CALL registrarProducto(?, ?, ?, ?, ?)";
                preparedStatement = conn.prepareStatement(insertQuery);
                preparedStatement.setString(1, Nombre);
                preparedStatement.setString(2, Tipo);
                preparedStatement.setInt(3, cantidad);
                preparedStatement.setDouble(4, precio);
                preparedStatement.setInt(5, IdProveedor);
                preparedStatement.executeUpdate();

                JOptionPane.showMessageDialog(null, "Registro guardado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar el registro.");
        } finally {
            try {
                if (existsResult != null) {
                    existsResult.close();
                }
                if (existsStatement != null) {
                    existsStatement.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Tarea terminada");
        }
    }

//Metodo para eliminar
    /**
     * public void Eliminar(String tabla, String nomCampo, String nomEliminar) {
     * try { String Delete = "DELETE FROM " + tabla + " WHERE " + nomCampo + " =
     * ?"; PreparedStatement preparedStatement = conn.prepareStatement(Delete);
     * preparedStatement.setString(1, nomEliminar); int rowCount =
     * preparedStatement.executeUpdate();
     *
     * if (rowCount > 0) { JOptionPane.showMessageDialog(null, "Registro
     * eliminado exitosamente"); } else { JOptionPane.showMessageDialog(null,
     * "No se encontró ningún registro a eliminar"); }
     * preparedStatement.close();
     *
     * } catch (SQLException ex) { ex.printStackTrace(); } finally {
     * System.out.println("Termino ejecucion"); } }
     *
     *
     */
    //Actualizar datos
    public void Actualizar() {
        String Nombre = txtproducto.getText();
        String Tipo = cbTipo.getSelectedItem().toString();

        double precio = 0.0;
        int cantidad = 0;
        int ID_Producto = obtenerID("IDProducto", "Producto", "Nombre", Nombre);

        // Validar ID_Producto
        if (ID_Producto == 0) {
            JOptionPane.showMessageDialog(this, "No se encontró el producto.");
            return; // Salir del método si no se encontró el producto
        }

        try {
            precio = Double.parseDouble(txtprecioUnitario.getText());
            cantidad = Integer.parseInt(spcantidad.getValue().toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Solo se aceptan números enteros y decimales");
            return; // Salir del método si hay un error en la conversión
        }

        PreparedStatement ps = null;

        try {
            if (conn != null) {
                String Actualizar = "UPDATE producto SET nombre = ?, tipo = ?, cantidad_disponible = ?, precio = ? WHERE idproducto = ?";
                ps = conn.prepareStatement(Actualizar);
                ps.setString(1, Nombre);
                ps.setString(2, Tipo);
                ps.setInt(3, cantidad);
                ps.setDouble(4, precio);
                ps.setInt(5, ID_Producto);

                int filasActualizadas = ps.executeUpdate();
                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(this, "Datos actualizados correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontraron datos para actualizar");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Fin de la ejecución");
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private int obtenerID(String ProductoID, String Tabla, String CampoT, String Producto_Buscar) {
        String id = "";
        int idPro = 0;

        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String sql = "SELECT " + ProductoID + " FROM " + Tabla + " WHERE " + CampoT + " = '" + Producto_Buscar + "'";
                ResultSet rs = stmt.executeQuery(sql);

                if (rs.next()) {
                    id = rs.getString(ProductoID);
                    try {
                        idPro = Integer.parseInt(id);
                    } catch (NumberFormatException e) {
                        System.out.println("No se encuetra producto: " + id);
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

        return idPro;
    }

    public void rellenarC(String tabla, String valor, JComboBox<String> combo) {
        Statement st = null;
        ResultSet rs = null;

        try {
            if (conn != null) {
                String consulta = "SELECT " + valor + " FROM " + tabla;
                st = conn.createStatement();
                rs = st.executeQuery(consulta);
                while (rs.next()) {
                    combo.addItem(rs.getString(valor));
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + ex.getMessage());
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }

    private void cargarTipo() {
        if (conn != null) {
            try {
                String query = "SHOW COLUMNS FROM Producto LIKE 'Tipo'";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String enumValues = rs.getString("Type");
                    String[] valores = enumValues.substring(enumValues.indexOf("(") + 1, enumValues.indexOf(")")).split(",");

                    DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
                    for (String valor : valores) {
                        modelo.addElement(valor.replace("'", ""));
                    }

                    cbTipo.setModel(modelo);
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
    private javax.swing.JLabel JL_NomUser;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrasesion;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnregistra;
    private javax.swing.JComboBox<String> cbProveedor;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spcantidad;
    private javax.swing.JTable tbbusqueda;
    private javax.swing.JTextField txtconsulta;
    private javax.swing.JTextField txtprecioUnitario;
    private javax.swing.JTextField txtproducto;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
