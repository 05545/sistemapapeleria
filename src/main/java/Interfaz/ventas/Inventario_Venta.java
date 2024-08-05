package Interfaz.ventas;

import Logic.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
        Mostra();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_NomUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JL_producto = new javax.swing.JLabel();
        txtproducto = new javax.swing.JTextField();
        JL_cantidad = new javax.swing.JLabel();
        spcantidad = new javax.swing.JSpinner();
        JL_precioUnitario = new javax.swing.JLabel();
        txtprecioUnitario = new javax.swing.JTextField();
        btnregistra = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbusqueda = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txttipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtconsulta = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        JL_producto1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        JL_Logo = new javax.swing.JLabel();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JF_Inventario");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(JL_NomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 20, 220, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Inventario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 170, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Registro de producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        JL_producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_producto.setText("ID");
        getContentPane().add(JL_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 30, -1));

        txtproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 340, 40));

        JL_cantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_cantidad.setText("Cantidad");
        getContentPane().add(JL_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));
        getContentPane().add(spcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 100, 40));

        JL_precioUnitario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_precioUnitario.setText("Precio Unitario");
        getContentPane().add(JL_precioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, 30));

        txtprecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtprecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 130, 30));

        btnregistra.setText("Registrar");
        btnregistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistraActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 150, 50));

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 150, 50));

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
        tbbusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbbusquedaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbbusqueda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 350, 170));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Tipo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 70, -1));
        getContentPane().add(txttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 180, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Consulta de producto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, -1));
        getContentPane().add(txtconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 300, 30));

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 120, 40));

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        getContentPane().add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 490, 120, 40));

        txtid.setEditable(false);
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 72, 70, 40));

        JL_producto1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_producto1.setText("Producto");
        getContentPane().add(JL_producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 160, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 120, 80, 30));

        JL_Logo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Logo.setText("Papeleria SUMI");
        getContentPane().add(JL_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 120, -1));

        btnTablero.setText("Tablero");
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
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));
        jLabel6.getAccessibleContext().setAccessibleName("JL_fondoInventario");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductoActionPerformed

    }//GEN-LAST:event_txtproductoActionPerformed

    private void txtprecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioUnitarioActionPerformed

    }//GEN-LAST:event_txtprecioUnitarioActionPerformed

    private void btnregistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistraActionPerformed
        Registra();
    }//GEN-LAST:event_btnregistraActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String NombreT = txtconsulta.getText();
        btnregistra.setEnabled(true);
        Buscar(NombreT);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
        btnregistra.setEnabled(true);
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        String eliminar = txtproducto.getText();
        btnregistra.setEnabled(true);
        Eliminar("producto", "nombre", eliminar);

        Limpiar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        Actualizar();
        Mostra();
        Limpiar();
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
        this.txttipo.setText(tipo);

        int id = 0;
        try {
            id = Integer.parseInt(idString);
            double cantidadDecimal = Double.parseDouble(cantidadString);
            int cantidad = (int) cantidadDecimal;
            this.spcantidad.setValue(cantidad);
            this.txtid.setText(String.valueOf(id));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "El valor de cantidad o id no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
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

    //Metodo para limpiar
    public void Limpiar() {
        txtconsulta.setText("");
        txtprecioUnitario.setText("");
        txtproducto.setText("");
        txttipo.setText("");
        spcantidad.setValue(0);
        txtid.setText("");
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
        String Tipo = txttipo.getText();
        double precio = 0.0;
        int cantidad = 0;

        try {
            precio = Double.parseDouble(txtprecioUnitario.getText());
            cantidad = Integer.parseInt(spcantidad.getValue().toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Solo se aceptan números enteros y decimales");
            return; // Salir del método si hay un error en la conversión
        }

        try {
            if (conn != null) {
                String existsQuery = "SELECT COUNT(*) FROM Producto WHERE Nombre = ?";
                try (PreparedStatement existsStatement = conn.prepareStatement(existsQuery)) {
                    existsStatement.setString(1, Nombre);
                    ResultSet existsResult = existsStatement.executeQuery();
                    if (existsResult.next() && existsResult.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(null, "El Producto ya existe.");
                        return; // Salir del método si el producto ya existe
                    }
                }

                String insertQuery = "CALL registrarProducto(?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(insertQuery)) {
                    preparedStatement.setString(1, Nombre);
                    preparedStatement.setString(2, Tipo);
                    preparedStatement.setInt(3, cantidad);
                    preparedStatement.setDouble(4, precio);
                    preparedStatement.setInt(5, 2);
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro guardado exitosamente.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar el registro.");
        } finally {
            System.out.println("Tarea terminada");
        }
    }

//Metodo para eliminar
    public void Eliminar(String tabla, String nomCampo, String nomEliminar) {
        try {
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
            System.out.println("Termino ejecucion");
        }
    }

//Actualizar datos
    public void Actualizar() {
        String Nombre = txtproducto.getText();
        String Tipo = txttipo.getText();
        double precio = 0.0;
        int cantidad = 0;

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
                String Actualizar = "UPDATE Producto SET nombre = ?, Tipo = ?, cantidad_disponible = ?, Precio = ? WHERE Idproducto = ?";
                ps = conn.prepareStatement(Actualizar);
                ps.setString(1, Nombre);
                ps.setString(2, Tipo);
                ps.setInt(3, cantidad);
                ps.setDouble(4, precio);
                ps.setInt(5, Integer.parseInt(txtid.getText()));

                int indice = ps.executeUpdate();
                if (indice > 0) {
                    JOptionPane.showMessageDialog(this, "Datos actualizados");
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
            System.out.println("Fin de la ejecucion");
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Logo;
    private javax.swing.JLabel JL_NomUser;
    private javax.swing.JLabel JL_cantidad;
    private javax.swing.JLabel JL_precioUnitario;
    private javax.swing.JLabel JL_producto;
    private javax.swing.JLabel JL_producto1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnregistra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spcantidad;
    private javax.swing.JTable tbbusqueda;
    private javax.swing.JTextField txtconsulta;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtprecioUnitario;
    private javax.swing.JTextField txtproducto;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
