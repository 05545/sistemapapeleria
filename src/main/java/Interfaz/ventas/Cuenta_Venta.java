package Interfaz.ventas;

import Interfaz.InicioSesion_Pantalla;
import Logic.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Cuenta_Venta extends javax.swing.JFrame {

    Conexion con;
    Connection conn;
    String nomUsuario;
    String usuario;

    public Cuenta_Venta(Conexion conexion, Connection connection, String usuario, String nomUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.con = conexion;
        this.conn = connection;
        this.usuario = usuario;
        this.nomUsuario = nomUsuario;

        JL_NomUser.setText(usuario);

        llenatxt();

        txtnombre.setEditable(false);
        txtapellidoM.setEditable(false);
        txtapellidoP.setEditable(false);
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

        JL_NomUser = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellidoP = new javax.swing.JTextField();
        txtapellidoM = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcalle = new javax.swing.JTextField();
        txtcolonia = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        txtcodigoP = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        btnCerrasesion = new javax.swing.JButton();
        JL_fondoCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JF_Cuenta");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_NomUser.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        JL_NomUser.setForeground(new java.awt.Color(51, 51, 51));
        JL_NomUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(JL_NomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, 220, 20));

        txtnombre.setBackground(new java.awt.Color(189, 189, 189));
        txtnombre.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtnombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnombre.setBorder(null);
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 250, 30));

        txtapellidoP.setBackground(new java.awt.Color(189, 189, 189));
        txtapellidoP.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtapellidoP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtapellidoP.setBorder(null);
        getContentPane().add(txtapellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 230, 183, 30));

        txtapellidoM.setBackground(new java.awt.Color(189, 189, 189));
        txtapellidoM.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtapellidoM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtapellidoM.setBorder(null);
        getContentPane().add(txtapellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 180, 30));

        txtcorreo.setBackground(new java.awt.Color(189, 189, 189));
        txtcorreo.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtcorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcorreo.setBorder(null);
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 250, 30));

        txttelefono.setBackground(new java.awt.Color(189, 189, 189));
        txttelefono.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txttelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txttelefono.setBorder(null);
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 190, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Correo electronico");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 210, -1));

        txtcalle.setBackground(new java.awt.Color(189, 189, 189));
        txtcalle.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtcalle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcalle.setBorder(null);
        getContentPane().add(txtcalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 180, 30));

        txtcolonia.setBackground(new java.awt.Color(189, 189, 189));
        txtcolonia.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtcolonia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcolonia.setBorder(null);
        getContentPane().add(txtcolonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 190, 30));

        txtnumero.setBackground(new java.awt.Color(189, 189, 189));
        txtnumero.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtnumero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnumero.setBorder(null);
        getContentPane().add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 250, 30));

        txtcodigoP.setBackground(new java.awt.Color(189, 189, 189));
        txtcodigoP.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtcodigoP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcodigoP.setBorder(null);
        getContentPane().add(txtcodigoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, 180, 30));

        txtcontraseña.setBackground(new java.awt.Color(189, 189, 189));
        txtcontraseña.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtcontraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcontraseña.setBorder(null);
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 476, 310, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnEditar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 620, 190, 60));

        btnTablero.setToolTipText("");
        btnTablero.setBorder(null);
        btnTablero.setBorderPainted(false);
        btnTablero.setContentAreaFilled(false);
        btnTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableroActionPerformed(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 160, 30));

        btnVentas.setToolTipText("");
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 205, 160, 20));

        btnInventario.setToolTipText("");
        btnInventario.setBorder(null);
        btnInventario.setBorderPainted(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 160, 20));

        btnCuenta.setToolTipText("");
        btnCuenta.setBorder(null);
        btnCuenta.setBorderPainted(false);
        btnCuenta.setContentAreaFilled(false);
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 160, 20));

        btnCerrasesion.setBorder(null);
        btnCerrasesion.setBorderPainted(false);
        btnCerrasesion.setContentAreaFilled(false);
        btnCerrasesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrasesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrasesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 160, 30));

        JL_fondoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVendedor/Pantalla_Cuenta_Vendedor.png"))); // NOI18N
        getContentPane().add(JL_fondoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        actualizarDatos();
    }//GEN-LAST:event_btnBuscarActionPerformed

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
    //Cierre de coneccion

    private void cerrarConexion() {
        if (con != null) {
            con.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }

    public void llenatxt() {
        int id = obtenerID(nomUsuario);
        String consulta = "SELECT * FROM Trabajador WHERE IDVendedor = " + id;

        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(consulta)) {
            if (conn != null) {
                System.out.println("Conexión establecida.");
            } else {
                System.out.println("No se puede conectar a la base de datos.");
                return;
            }

            if (rs.next()) {
                System.out.println("Datos encontrados.");
                txtnombre.setText(rs.getString("Nombre"));
                txtapellidoP.setText(rs.getString("AP"));
                txtapellidoM.setText(rs.getString("AM"));
                txtcalle.setText(rs.getString("Calle"));
                txtnumero.setText(rs.getString("Numero"));
                txtcolonia.setText(rs.getString("Colonia"));
                txtcodigoP.setText(String.valueOf(rs.getInt("CP")));
                txtcorreo.setText(rs.getString("Correo"));
                txttelefono.setText(rs.getString("Telefono"));
                txtcontraseña.setText(rs.getString("Contrasenia"));
            } else {
                System.out.println("Datos de usuario no disponibles.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Manejo de excepciones
        }
    }

    public void actualizarDatos() {
        int id = obtenerID(nomUsuario);

        String consulta = "UPDATE Trabajador SET Nombre = ?, AP = ?, AM = ?, Calle = ?, Numero = ?, Colonia = ?, CP = ?, Correo = ?, Telefono = ?, Contrasenia = ? WHERE IDVendedor = ?";

        try (PreparedStatement pst = conn.prepareStatement(consulta)) {
            // Asignar valores de los campos de texto al PreparedStatement
            pst.setString(1, txtnombre.getText());
            pst.setString(2, txtapellidoP.getText());
            pst.setString(3, txtapellidoM.getText());
            pst.setString(4, txtcalle.getText());
            pst.setInt(5, Integer.parseInt(txtnumero.getText()));
            pst.setString(6, txtcolonia.getText());
            pst.setInt(7, Integer.parseInt(txtcodigoP.getText()));
            pst.setString(8, txtcorreo.getText());
            pst.setString(9, txttelefono.getText());
            pst.setString(10, txtcontraseña.getText());
            pst.setInt(11, id);

            // Ejecutar la actualización
            int filasActualizadas = pst.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Actualización exitosa.");
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente.");
            } else {
                System.out.println("No se encontró el registro a actualizar.");
                JOptionPane.showMessageDialog(null, "No se encontró el registro a actualizar.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + ex.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Error de formato de número: " + nfe.getMessage());
            JOptionPane.showMessageDialog(null, "Error de formato de número: " + nfe.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_NomUser;
    private javax.swing.JLabel JL_fondoCuenta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrasesion;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtapellidoM;
    private javax.swing.JTextField txtapellidoP;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtcodigoP;
    private javax.swing.JTextField txtcolonia;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
