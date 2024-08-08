package Interfaz.ventas;

import Interfaz.InicioSesion_Pantalla;
import javax.swing.JOptionPane;
import Logic.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
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

        this.con = conexion;
        this.conn = connection;
        this.usuario = usuario;
        this.nomUsuario = nomUsuario;

        JL_NomUser.setText(usuario);

        rellenarC("Producto", "Nombre", txtproducto);
        MostraProducto();

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
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        JL_sesion = new javax.swing.JLabel();
        spcantidad = new javax.swing.JSpinner();
        txtprecioUnitario = new javax.swing.JTextField();
        txtsubTotal = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        btnprocesar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbventas = new javax.swing.JTable();
        btnCobra = new javax.swing.JButton();
        txtConsulat = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbbusqueda = new javax.swing.JTable();
        txtproducto = new javax.swing.JComboBox<>();
        btnCerrasesion = new javax.swing.JButton();
        JL_fondoVentas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JFventas");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_NomUser.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        JL_NomUser.setForeground(new java.awt.Color(0, 0, 0));
        JL_NomUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(JL_NomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 250, 20));

        btnTablero.setBorder(null);
        btnTablero.setBorderPainted(false);
        btnTablero.setContentAreaFilled(false);
        btnTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableroActionPerformed(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 130, 30));

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
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, 30));

        btnCuenta.setBorder(null);
        btnCuenta.setBorderPainted(false);
        btnCuenta.setContentAreaFilled(false);
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 130, 30));

        JL_sesion.setForeground(new java.awt.Color(51, 51, 51));
        JL_sesion.setText("Cerra sesion");
        getContentPane().add(JL_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 990, 150, 60));
        getContentPane().add(spcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 325, 120, 30));

        txtprecioUnitario.setEditable(false);
        txtprecioUnitario.setBackground(new java.awt.Color(189, 189, 189));
        txtprecioUnitario.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtprecioUnitario.setForeground(new java.awt.Color(51, 51, 51));
        txtprecioUnitario.setBorder(null);
        txtprecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtprecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 325, 110, 30));

        txtsubTotal.setEditable(false);
        txtsubTotal.setBackground(new java.awt.Color(189, 189, 189));
        txtsubTotal.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtsubTotal.setForeground(new java.awt.Color(51, 51, 51));
        txtsubTotal.setBorder(null);
        getContentPane().add(txtsubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 120, 30));

        txttotal.setEditable(false);
        txttotal.setBackground(new java.awt.Color(189, 189, 189));
        txttotal.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txttotal.setForeground(new java.awt.Color(51, 51, 51));
        txttotal.setBorder(null);
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 118, 30));

        btnprocesar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnProcesar.png"))); // NOI18N
        btnprocesar.setBorder(null);
        btnprocesar.setBorderPainted(false);
        btnprocesar.setContentAreaFilled(false);
        btnprocesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnprocesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 515, 180, 50));

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnLimpiar.png"))); // NOI18N
        btnlimpiar.setBorder(null);
        btnlimpiar.setBorderPainted(false);
        btnlimpiar.setContentAreaFilled(false);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 190, 60));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        tbventas.setBackground(new java.awt.Color(255, 255, 255));
        tbventas.setForeground(new java.awt.Color(51, 51, 51));
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 390, 110));

        btnCobra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnRegistrar.png"))); // NOI18N
        btnCobra.setBorder(null);
        btnCobra.setBorderPainted(false);
        btnCobra.setContentAreaFilled(false);
        btnCobra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCobra, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 630, 190, 50));

        txtConsulat.setBackground(new java.awt.Color(214, 214, 214));
        txtConsulat.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtConsulat.setForeground(new java.awt.Color(51, 51, 51));
        txtConsulat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtConsulat.setBorder(null);
        txtConsulat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsulatActionPerformed(evt);
            }
        });
        getContentPane().add(txtConsulat, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, 310, 30));

        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 30, 30));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(51, 51, 51));

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
                "ID", "Producto", "Cantidad", "Tipo", "Precio"
            }
        ));
        tbbusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbbusquedaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbbusqueda);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 370, 170));

        txtproducto.setBackground(new java.awt.Color(189, 189, 189));
        txtproducto.setBorder(null);
        txtproducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 320, 30));

        btnCerrasesion.setBorder(null);
        btnCerrasesion.setBorderPainted(false);
        btnCerrasesion.setContentAreaFilled(false);
        btnCerrasesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrasesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrasesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 150, 30));

        JL_fondoVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVendedor/Pantalla_Ventas_Vendedor.png"))); // NOI18N
        getContentPane().add(JL_fondoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprocesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocesarActionPerformed
        // Obtener el producto seleccionado
        String producto = (String) txtproducto.getSelectedItem();
        int valor = (int) spcantidad.getValue();
        int validar = obtenerCantidadProducto(producto);

        if (validar == -1) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el producto");
            return;
        } else if (validar > valor) {
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
        } else if (validar < valor && validar > 0) {
            JOptionPane.showMessageDialog(null, "No hay cantidad suficiente del producto. Ingresa una cantidad menor.");
            return;
        }
    }//GEN-LAST:event_btnprocesarActionPerformed

    private void txtprecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioUnitarioActionPerformed

    private void btnCobraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobraActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "Confirmar compra con un total de " + String.format("%.2f", total) + "?",
                "Confirmación de Compra",
                JOptionPane.YES_NO_OPTION);
        Consultas consul = new Consultas();

        if (confirmacion == JOptionPane.YES_OPTION) {
            for (int i = 0; i < indice; i++) {
                // Obtener ID del producto
                int IDProducto = obtenerID("IDProducto", "Producto", "Nombre", productos[i]);

                // Obtener ID del usuario
                int ID_Usuario = obtenerID("IDVendedor", "Trabajador", "Usuario", nomUsuario);
                System.out.println("Id del trabajador" + ID_Usuario);

                // Registrar venta del producto
                Vender(productos[i], cantidades[i]);

                // Obtener el ID de la última venta
                int IDventa = ID_UltimaVenta();

                // Registrar la venta del producto
                RegistraV_P(IDProducto, IDventa);

                //Obtenemos total de cada producto
                double totalVenta = consul.calcularTotalVenta(new String[]{productos[i]}, new int[]{cantidades[i]});
                //Registramos en venta_trabajador
                RegistraV_T(totalVenta, ID_Usuario, IDventa);
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
            txtprecioUnitario.setText(this.tbbusqueda.getValueAt(fila, 4).toString());
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
        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();

            this.setVisible(false);
            this.dispose();
            cerrarConexion();

            iniSesion.setVisible(true);
        }
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
                String sql = "SELECT IDVenta FROM Venta ORDER BY idventa DESC LIMIT 1";
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

    public void RegistraV_P(int ID_producto, int ID_Venta) {
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

    public void RegistraV_T(double p_total, int ID_Trabajador, int ID_Venta) {
        PreparedStatement ps = null;

        try {
            if (conn != null) {
                String consulta = "CALL RegistrarVentaTrabajador(?, ?, ?)";
                ps = conn.prepareStatement(consulta);
                ps.setDouble(1, p_total);
                ps.setInt(2, ID_Trabajador);
                ps.setInt(3, ID_Venta);

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
            System.out.println("Fallo al registrar la venta: " + ex.getMessage());
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

    private int obtenerCantidadProducto(String nombreP) {
        int cantidad = -1;

        if (conn != null) {
            try {
                String query = "SELECT Cantidad_Disponible AS Cantidad FROM Producto WHERE Nombre = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, nombreP);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    cantidad = rs.getInt("Cantidad");
                }

                rs.close();
                ps.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }

        return cantidad;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_NomUser;
    private javax.swing.JLabel JL_fondoVentas;
    private javax.swing.JLabel JL_sesion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrasesion;
    private javax.swing.JButton btnCobra;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnprocesar;
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
