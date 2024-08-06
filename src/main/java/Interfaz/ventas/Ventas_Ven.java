package Interfaz.ventas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Logic.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class Ventas_Ven extends javax.swing.JFrame {

    Conexion con;
    Connection conn;
    String nomUsuario;
    String usuario;

//Variables para ventas en acumulo
    private int maxProductos = 100;
    private String[] productos = new String[maxProductos];
    private int[] cantidades = new int[maxProductos];
    private double[] precios = new double[maxProductos];
    private int indice = 0;
    private double total = 0.0;
    double totalVentaActual;

    public Ventas_Ven(Conexion conexion, Connection connection, String usuario, String nomUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.con = conexion;
        this.conn = connection;
        this.usuario = usuario;
        this.nomUsuario = nomUsuario;
        rellenarC("Producto", "Nombre", txtproducto);
        MostraProducto();
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
        JL_Logo = new javax.swing.JLabel();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        JL_sesion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JL_producto = new javax.swing.JLabel();
        JL_cantidad = new javax.swing.JLabel();
        spcantidad = new javax.swing.JSpinner();
        JL_precioUnitario = new javax.swing.JLabel();
        txtprecioUnitario = new javax.swing.JTextField();
        JL_subTotal = new javax.swing.JLabel();
        txtsubTotal = new javax.swing.JTextField();
        JL_Total = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnprocesar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbventas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        JL_fondoVentas = new javax.swing.JLabel();
        btnCobra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtConsulat = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbbusqueda = new javax.swing.JTable();
        txtproducto = new javax.swing.JComboBox<>();
        btnCerrasesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JFventas");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(JL_NomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 20, 220, 40));

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

        JL_sesion.setForeground(new java.awt.Color(51, 51, 51));
        JL_sesion.setText("Cerra sesion");
        getContentPane().add(JL_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 990, 150, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ventas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 69, -1));

        JL_producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_producto.setText("Producto");
        getContentPane().add(JL_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 160, -1));

        JL_cantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_cantidad.setText("Cantidad");
        getContentPane().add(JL_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));
        getContentPane().add(spcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 100, 40));

        JL_precioUnitario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_precioUnitario.setText("Precio Unitario");
        getContentPane().add(JL_precioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, 30));

        txtprecioUnitario.setEditable(false);
        txtprecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtprecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 130, 40));

        JL_subTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_subTotal.setText("Subtotal");
        getContentPane().add(JL_subTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        txtsubTotal.setEditable(false);
        getContentPane().add(txtsubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 130, 40));

        JL_Total.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Total.setText("Total");
        getContentPane().add(JL_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, -1, -1));

        txttotal.setEditable(false);
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 130, 40));

        btnprocesar.setText("Procesar");
        btnprocesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnprocesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 150, 40));

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 130, 40));

        tbventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Fecha", "Total"
            }
        ));
        jScrollPane1.setViewportView(tbventas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 400, 260));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Ventas Reciente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 180, -1));
        getContentPane().add(JL_fondoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        btnCobra.setText("Cobrar");
        btnCobra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCobra, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 710, 150, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Consulta de producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 270, -1));

        txtConsulat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsulatActionPerformed(evt);
            }
        });
        getContentPane().add(txtConsulat, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 260, 30));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 410, 90, 30));

        tbbusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Cantidad", "Tipo", "Precio"
            }
        ));
        tbbusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbbusquedaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbbusqueda);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 410, 170));

        txtproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 370, 50));

        btnCerrasesion.setText("Cerra Sesion");
        btnCerrasesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrasesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrasesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprocesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocesarActionPerformed
        // Obtener el producto seleccionado
        String producto = (String) txtproducto.getSelectedItem();
        productos[indice] = producto;

        // Obtener la cantidad ingresada
        try {
            cantidades[indice] = Integer.parseInt(spcantidad.getValue().toString());
        } catch (NumberFormatException e) {
            System.out.println("No se aceptan números decimales");
        }

        // Crear instancia de Consultas y calcular el total de venta para el producto actual
        Consultas consul = new Consultas();
        totalVentaActual = consul.calcularTotalVenta(
                new String[]{productos[indice]},
                new int[]{cantidades[indice]}
        );

        //Actualizar el total acumulado
        total += totalVentaActual;
        precios[indice] = (totalVentaActual / cantidades[indice]);

        // Mostrar el total acumulado en el campo de texto
        txttotal.setText(String.format("%.2f", total));
        txtsubTotal.setText(String.format("%.2f", totalVentaActual));
        txtprecioUnitario.setText(String.format("%.2f", precios[indice]));

        // Imprimir los productos y cantidades actuales
        System.out.println("id: " + indice + ", Producto: " + productos[indice] + ", Cantidad: " + cantidades[indice] + ", Total Venta Actual: " + totalVentaActual);
        System.out.println("El total acumulado es: " + total);

        // Incrementar el índice para el próximo producto
        indice++;
        MostraRegistro();
    }//GEN-LAST:event_btnprocesarActionPerformed

    private void txtprecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioUnitarioActionPerformed

    private void btnCobraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobraActionPerformed
 int confirmacion = JOptionPane.showConfirmDialog(this,
        "Confirmar compra con un total de " + String.format("%.2f", total) + "?",
        "Confirmación de Compra",
        JOptionPane.YES_NO_OPTION);

if (confirmacion == JOptionPane.YES_OPTION) {
    for (int i = 0; i < indice; i++) {
        // Registra en la base de datos
        int IDProducto = obtenerID("IDProducto", "producto", "Nombre", productos[i]);
        Vender(productos[i], cantidades[i]);
        int IDventa = ID_UltimaVenta();
        //Registra la tabla venta_producto
        RegistraV_T(IDProducto, IDventa);
    }
    // Reiniciar las variables
    ReiniciarVariables();
    Limpiar();
} else {
    System.out.println("Sigue comprando.");
}
    }//GEN-LAST:event_btnCobraActionPerformed

    private void txtConsulatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsulatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsulatActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String Buscar = txtConsulat.getText();
        Buscar(Buscar);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbbusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbbusquedaMouseClicked
        int fila = this.tbbusqueda.getSelectedRow();
        
        if (fila >= 0) {
            this.txtproducto.setSelectedItem(this.tbbusqueda.getValueAt(fila, 1).toString());
            txtprecioUnitario.setText(this.tbbusqueda.getValueAt(fila,4).toString());
        } else {
            System.out.println("No se ha seleccionado ninguna fila.");
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila.");
        }
    }//GEN-LAST:event_tbbusquedaMouseClicked

    private void txtproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductoActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
        MostraProducto();
    }//GEN-LAST:event_btnlimpiarActionPerformed
//Boton tablero
    private void btnTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableroActionPerformed
        this.setVisible(false);
        this.dispose();

        Tablero_Ventas TV = new Tablero_Ventas(con, conn, nomUsuario);
        TV.setVisible(true);
        TV.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnTableroActionPerformed
//Boton ventas
    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        this.setVisible(false);
        this.dispose();

        Ventas_Ven VV = new Ventas_Ven(con, conn, usuario, nomUsuario);
        VV.setVisible(true);
        VV.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVentasActionPerformed
//Boton Inventario
    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        this.setVisible(false);
        this.dispose();

        Inventario_Venta IV = new Inventario_Venta(con, conn, usuario, nomUsuario);
        IV.setVisible(true);
        IV.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnInventarioActionPerformed
//Boton Cuenta
    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        this.setVisible(false);
        this.dispose();

        Cuenta_Venta CV = new Cuenta_Venta(con, conn, usuario, nomUsuario);
        CV.setVisible(true);
        CV.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCuentaActionPerformed

    private void btnCerrasesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrasesionActionPerformed
        cerrarConexion();
    }//GEN-LAST:event_btnCerrasesionActionPerformed
    //Metodo Buscar
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

    //Muestra los datos de la tabla buscar producto
    public void MostraProducto() {
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

    //Mostra ventas en la tabla 
    public void MostraRegistro() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Cantidad");
        model.addColumn("Precio Unitario");
        model.addColumn("SubTotal");
        for (int i = 0; i < indice; i++) {
            double subTotal = cantidades[i] * precios[i];
            model.addRow(new Object[]{i + 1, productos[i], cantidades[i], precios[i], subTotal});
        }

        tbventas.setModel(model);

    }

    //Metodo para ingresar datos
    public void Vender(String Nombre, int cantidad) {
        PreparedStatement ps = null;

        try {
            if (conn != null) {
                String insertar = "CALL RegistrarVenta(?, ?)";
                ps = conn.prepareStatement(insertar);
                ps.setString(1, Nombre);
                ps.setInt(2, cantidad);

                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Venta registrada exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar la venta.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al registrar la venta: " + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }

    //Metodos para rellenar comboBox con la base de datos
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

    //Metodo para limpiar los txt
    public void Limpiar() {
        txtprecioUnitario.setText("");
        txtsubTotal.setText("");
        spcantidad.setValue(0);
    }

//Reinicia Variables para la siguiente compra
    public void ReiniciarVariables() {
        indice = 0;
        total = 0.0;
        for (int i = 0; i < maxProductos; i++) {
            productos[i] = null;
            cantidades[i] = 0;
            precios[i] = 0.0;
        }
        //Limpiar tabla 
        DefaultTableModel model = (DefaultTableModel) tbventas.getModel();
        model.setRowCount(0);
    }
    
    //Obtener ID de las ventas recientes
  public int ID_UltimaVenta() {
    int IdVenta = 0;

    if (conn != null) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT idventa FROM venta ORDER BY idventa DESC LIMIT 1";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                IdVenta = rs.getInt("idventa");
            } else {
                System.out.println("No se encontró ninguna venta.");
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la consulta.");
            ex.printStackTrace();
        }
    } else {
        System.out.println("Conexión fallida.");
    }

    return IdVenta;
}

    
      //Metodo para obtener el ID mediante Cualqueri Tabla
   private int obtenerID(String ProductoID, String Tabla, String CampoT, String Producto_Buscar) {
    int idPro = 0;

    if (conn != null) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT " + ProductoID + " FROM " + Tabla + " WHERE " + CampoT + " = '" + Producto_Buscar + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                idPro = rs.getInt(ProductoID);
            } else {
                System.out.println("No se encontró el producto: " + Producto_Buscar);
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

    
   public void RegistraV_T(int ID_producto, int ID_Venta) {
    PreparedStatement ps = null;

    try {
        if (conn != null) {
            String consulta = "CALL RegistrarVentaProducto(?, ?)";
            ps = conn.prepareStatement(consulta);
            ps.setInt(1, ID_producto);
            ps.setInt(2, ID_Venta);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Venta registrada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la venta.");
            }
        } else {
            System.out.println("No se pudo conectar a la base de datos.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("Fallo al registrar la venta.");
    } finally {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Logo;
    private javax.swing.JLabel JL_NomUser;
    private javax.swing.JLabel JL_Total;
    private javax.swing.JLabel JL_cantidad;
    private javax.swing.JLabel JL_fondoVentas;
    private javax.swing.JLabel JL_precioUnitario;
    private javax.swing.JLabel JL_producto;
    private javax.swing.JLabel JL_sesion;
    private javax.swing.JLabel JL_subTotal;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrasesion;
    private javax.swing.JButton btnCobra;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnprocesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spcantidad;
    private javax.swing.JTable tbbusqueda;
    private javax.swing.JTable tbventas;
    private javax.swing.JTextField txtConsulat;
    private javax.swing.JTextField txtprecioUnitario;
    private javax.swing.JComboBox<String> txtproducto;
    private javax.swing.JTextField txtsubTotal;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
