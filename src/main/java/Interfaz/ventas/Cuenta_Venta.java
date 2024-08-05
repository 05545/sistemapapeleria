package Interfaz.ventas;

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
        llenatxt();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JL_NomUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtapellidoP = new javax.swing.JTextField();
        txtapellidoM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcalle = new javax.swing.JTextField();
        txtcolonia = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        txtcodigoP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnsolicitarC = new javax.swing.JButton();
        JL_fondoCuenta = new javax.swing.JLabel();
        JL_Logo = new javax.swing.JLabel();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JF_Cuenta");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Configuracion de tu cuenta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 280, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tus datos personales");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));
        getContentPane().add(JL_NomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 20, 220, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Apellido materno");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, 150, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 210, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 210, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Apellido paterno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 150, -1));
        getContentPane().add(txtapellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 200, 30));
        getContentPane().add(txtapellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 200, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 110, -1));
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 320, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Contraseña");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 140, -1));
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 230, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Correo electronico");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 210, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Calle");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 90, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Numero");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 90, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Colonia");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 90, -1));
        getContentPane().add(txtcalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 190, 30));
        getContentPane().add(txtcolonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 200, 30));
        getContentPane().add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, 190, 30));
        getContentPane().add(txtcodigoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 450, 110, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Codigo postal");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, 140, -1));
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 190, 30));

        btnBuscar.setText("Cambiar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 100, 30));

        btnsolicitarC.setText("Solicitar Correcion");
        btnsolicitarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsolicitarCActionPerformed(evt);
            }
        });
        getContentPane().add(btnsolicitarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 660, 130, 40));
        getContentPane().add(JL_fondoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

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

        jLabel3.setText("Cerra sesion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsolicitarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsolicitarCActionPerformed

    }//GEN-LAST:event_btnsolicitarCActionPerformed

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
        String consulta = "UPDATE Trabajador SET Nombre = ?, AP = ?, AM = ?, Calle = ?, Numero = ?, Colonia = ?, cp = ?, correo = ?, telefono = ?, contrasenia = ? WHERE idvendedor = 3";

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
    private javax.swing.JLabel JL_Logo;
    private javax.swing.JLabel JL_NomUser;
    private javax.swing.JLabel JL_fondoCuenta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnsolicitarC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
