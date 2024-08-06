package Interfaz.Administrador;

import Logic.*;
import Interfaz.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class RegistroUsuario extends javax.swing.JFrame {

    Connection conn;
    Conexion conexion;
    String usuario, nomUsuario;
    int idUsuario = 0;

    public RegistroUsuario(Conexion conexion, Connection connection, String usuario, String nomUsuario, int idUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.conexion = conexion;
        this.conn = connection;
        this.usuario = usuario;
        this.nomUsuario = nomUsuario;
        this.idUsuario = idUsuario;

        NombreAdmin.setText(usuario);

        cargarRoles();

        txtNombreUsuario.setEditable(false);
        if (idUsuario > 0) {
            obtenerDatosEdicion(idUsuario);
            txtNombreUsuario.setEditable(false);
        } else {
            btnActualizar.setEnabled(false);
            btnActualizar.setVisible(false);
        }

    }

    private void cerrarConexion() {
        if (conexion != null) {
            conexion.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenerar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtCorreoE = new javax.swing.JTextField();
        NombreAdmin = new javax.swing.JLabel();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtContrasena = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodigoP = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        JCB_Roles = new javax.swing.JComboBox<>();
        Fondo_RegistroUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenerar.setBorder(null);
        btnGenerar.setContentAreaFilled(false);
        btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarMouseClicked(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 195, 40, 30));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnEditar.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 565, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnLimpiar.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 560, -1, 70));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnRegistrar.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, -1, 60));

        txtCorreoE.setBackground(new java.awt.Color(189, 189, 189));
        txtCorreoE.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtCorreoE.setBorder(null);
        txtCorreoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoEActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 268, 270, 36));

        NombreAdmin.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        NombreAdmin.setForeground(new java.awt.Color(51, 51, 51));
        NombreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, 220, 20));

        btnTablero.setBorder(null);
        btnTablero.setContentAreaFilled(false);
        btnTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableroMouseClicked(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, 30));

        btnVentas.setBorder(null);
        btnVentas.setContentAreaFilled(false);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, 30));

        btnInventario.setBorder(null);
        btnInventario.setContentAreaFilled(false);
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 140, 30));

        btnUsuarios.setBorder(null);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 140, 30));

        btnProveedores.setBorder(null);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 140, 30));

        btnReportes.setBorder(null);
        btnReportes.setContentAreaFilled(false);
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 140, 30));

        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 170, 20));

        txtContrasena.setBackground(new java.awt.Color(189, 189, 189));
        txtContrasena.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtContrasena.setBorder(null);
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 220, 30));

        txtNombre.setBackground(new java.awt.Color(189, 189, 189));
        txtNombre.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 320, 36));

        txtCodigoP.setBackground(new java.awt.Color(189, 189, 189));
        txtCodigoP.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtCodigoP.setBorder(null);
        txtCodigoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoPActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 180, 30));

        txtColonia.setBackground(new java.awt.Color(189, 189, 189));
        txtColonia.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtColonia.setBorder(null);
        txtColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColoniaActionPerformed(evt);
            }
        });
        getContentPane().add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, 240, 30));

        txtNumero.setBackground(new java.awt.Color(189, 189, 189));
        txtNumero.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtNumero.setBorder(null);
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 90, 30));

        txtCalle.setBackground(new java.awt.Color(189, 189, 189));
        txtCalle.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtCalle.setBorder(null);
        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });
        getContentPane().add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 80, 30));

        txtTelefono.setBackground(new java.awt.Color(189, 189, 189));
        txtTelefono.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtTelefono.setBorder(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 350, 178, 34));

        txtNombreUsuario.setBackground(new java.awt.Color(189, 189, 189));
        txtNombreUsuario.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtNombreUsuario.setBorder(null);
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 290, 36));

        txtApellidoP.setBackground(new java.awt.Color(189, 189, 189));
        txtApellidoP.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtApellidoP.setBorder(null);
        txtApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 268, 170, 36));

        txtApellidoM.setBackground(new java.awt.Color(189, 189, 189));
        txtApellidoM.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtApellidoM.setBorder(null);
        txtApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 268, 170, 36));

        JCB_Roles.setBackground(new java.awt.Color(189, 189, 189));
        JCB_Roles.setBorder(null);
        getContentPane().add(JCB_Roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 440, 210, 30));

        Fondo_RegistroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/Pantalla_UsuariosReg_Administrador.png"))); // NOI18N
        getContentPane().add(Fondo_RegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();

        this.setVisible(false);
        this.dispose();
        cerrarConexion();

        iniSesion.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void txtApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoPActionPerformed

    private void txtApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMActionPerformed

    private void txtCorreoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoEActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColoniaActionPerformed

    private void txtCodigoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoPActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

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

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        String nombreUsuario, AP, AM, calle, numeroCalle, colonia, correo, telefono, usuarioNuevo, contrasenia, rolDef;
        int CP = 0, idRol = 0;

        nombreUsuario = txtNombre.getText();
        AP = txtApellidoP.getText();
        AM = txtApellidoM.getText();
        calle = txtCalle.getText();
        numeroCalle = txtNumero.getText();
        colonia = txtColonia.getText();
        correo = txtCorreoE.getText();
        telefono = txtTelefono.getText();
        usuarioNuevo = txtNombreUsuario.getText();
        contrasenia = txtContrasena.getText();

        try {
            CP = Integer.parseInt(txtCodigoP.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Código Postal inválido. Ingresa solo números");
            return;
        }

        for (int i = 0; i < JCB_Roles.getItemCount(); i++) {
            String rol = JCB_Roles.getItemAt(i);
            if (comprobarRol(idRol, rol)) {
                JCB_Roles.setSelectedIndex(i);
                break;
            }
        }

        rolDef = (String) JCB_Roles.getSelectedItem();
        idRol = obtenerIdRol(rolDef);

        if (nombreUsuario.isEmpty() || AP.isEmpty() || AM.isEmpty() || calle.isEmpty()
                || numeroCalle.isEmpty() || colonia.isEmpty() || correo.isEmpty()
                || telefono.isEmpty() || usuarioNuevo.isEmpty() || contrasenia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.");
            return;
        } else {
            if (conn != null) {
                try {
                    String query = "CALL RegistrarTrabajador(?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, nombreUsuario);
                    ps.setString(2, AP);
                    ps.setString(3, AM);
                    ps.setString(4, calle);
                    ps.setString(5, numeroCalle);
                    ps.setString(6, colonia);
                    ps.setInt(7, CP);
                    ps.setString(8, correo);
                    ps.setString(9, telefono);
                    ps.setString(10, usuarioNuevo);
                    ps.setString(11, contrasenia);
                    ps.setInt(12, idRol);

                    JOptionPane.showMessageDialog(null, "Se ha insertado el registro correctamente");
                    int columEliminadas = ps.executeUpdate();
                    System.out.println("Filas afectadas: " + columEliminadas);

                    ps.close();

                    txtApellidoM.setText("");
                    txtApellidoP.setText("");
                    txtCalle.setText("");
                    txtCodigoP.setText("");
                    txtColonia.setText("");
                    txtContrasena.setText("");
                    txtCorreoE.setText("");
                    txtNombre.setText("");
                    txtNombreUsuario.setText("");
                    txtNumero.setText("");
                    txtTelefono.setText("");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("No se pudo conectar a la base de datos.");
            }
        }
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseClicked

        String nomUserNuevo = "";
        String nombreUsuario = txtNombre.getText();
        String AP = txtApellidoP.getText();
        String AM = txtApellidoM.getText();

        if (nombreUsuario.isEmpty() || AP.isEmpty() || AM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa el nombre y apellidos para generar el usuario.");
        } else {
            nomUserNuevo = generarNombreUsuario(nombreUsuario, AP, AM);
            if (comprobarUsuario(nomUserNuevo)) {
                nomUserNuevo = generarNombreUsuario(nombreUsuario, AP, AM);
            }
        }

        txtNombreUsuario.setText(nomUserNuevo);
    }//GEN-LAST:event_btnGenerarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked

        String nombreUsuario, AP, AM, calle, numeroCalle, colonia, correo, telefono, usuarioNuevo, contrasenia, rolDef;
        int CP = 0, idRol = 0;

        nombreUsuario = txtNombre.getText();
        AP = txtApellidoP.getText();
        AM = txtApellidoM.getText();
        calle = txtCalle.getText();
        numeroCalle = txtNumero.getText();
        colonia = txtColonia.getText();
        correo = txtCorreoE.getText();
        telefono = txtTelefono.getText();
        usuarioNuevo = txtNombreUsuario.getText();
        contrasenia = txtContrasena.getText();

        try {
            CP = Integer.parseInt(txtCodigoP.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Código Postal inválido. Ingresa solo números");
            return;
        }

        for (int i = 0; i < JCB_Roles.getItemCount(); i++) {
            String rol = JCB_Roles.getItemAt(i);
            if (comprobarRol(idRol, rol)) {
                JCB_Roles.setSelectedIndex(i);
                break;
            }
        }

        rolDef = (String) JCB_Roles.getSelectedItem();
        idRol = obtenerIdRol(rolDef);

        if (nombreUsuario.isEmpty() || AP.isEmpty() || AM.isEmpty() || calle.isEmpty()
                || numeroCalle.isEmpty() || colonia.isEmpty() || correo.isEmpty()
                || telefono.isEmpty() || usuarioNuevo.isEmpty() || contrasenia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.");
            return;
        } else {
            if (conn != null) {
                try {
                    String query = "UPDATE Trabajador SET Nombre = ?, AP = ?, AM = ?, Calle = ?, Numero = ?, Colonia = ?, CP = ?, Correo = ?, Telefono = ?, Usuario = ?, Contrasenia = ?, IdRol = ? WHERE IDVendedor = ?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, nombreUsuario);
                    ps.setString(2, AP);
                    ps.setString(3, AM);
                    ps.setString(4, calle);
                    ps.setString(5, numeroCalle);
                    ps.setString(6, colonia);
                    ps.setInt(7, CP);
                    ps.setString(8, correo);
                    ps.setString(9, telefono);
                    ps.setString(10, usuarioNuevo);
                    ps.setString(11, contrasenia);
                    ps.setInt(12, idRol);
                    ps.setInt(13, idUsuario);

                    int filasAfectadas = ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el registro correctamente. Filas afectadas: " + filasAfectadas);

                    ps.close();

                    txtApellidoM.setText("");
                    txtApellidoP.setText("");
                    txtCalle.setText("");
                    txtCodigoP.setText("");
                    txtColonia.setText("");
                    txtContrasena.setText("");
                    txtCorreoE.setText("");
                    txtNombre.setText("");
                    txtNombreUsuario.setText("");
                    txtNumero.setText("");
                    txtTelefono.setText("");
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                UsuariosAdmin_Pantalla uap = new UsuariosAdmin_Pantalla(conexion, conn, usuario, nomUsuario);
                this.setVisible(false);
                this.dispose();

                uap.setVisible(true);
                uap.setLocationRelativeTo(null);
            } else {
                System.out.println("No se pudo conectar a la base de datos.");
            }
        }
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        txtApellidoM.setText("");
        txtApellidoP.setText("");
        txtCalle.setText("");
        txtCodigoP.setText("");
        txtColonia.setText("");
        txtContrasena.setText("");
        txtCorreoE.setText("");
        txtNombre.setText("");
        txtNombreUsuario.setText("");
        txtNumero.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_btnLimpiarMouseClicked

    public void cargarRoles() {
        if (conn != null) {
            try {
                String query = "SELECT IDRol, Rol FROM Rol";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
                while (rs.next()) {
                    String rol = rs.getString("Rol");
                    modelo.addElement(rol);
                }

                JCB_Roles.setModel(modelo);

                rs.close();
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }
    }

    public int obtenerIdRol(String nomRol) {
        int idRol = 0;

        if (conn != null) {
            try {
                String query = "SELECT IDRol FROM Rol WHERE Rol = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, nomRol);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    idRol = rs.getInt("IDRol");
                }

                rs.close();
                ps.close();
            } catch (SQLException e) {
                System.out.println("Error en la ejecución de la consula. " + e);
            }
        } else {
            System.out.println("Error en la conexión a la base de datos");
        }

        return idRol;
    }

    public boolean comprobarRol(int id, String nombre) {
        boolean encontrado = false;

        if (conn != null) {
            try {
                String query = "SELECT Rol FROM Rol WHERE IDRol = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String Rol = rs.getString("Rol");
                    if (Rol.equals(nombre)) {
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

    public void obtenerDatosEdicion(int id) {
        btnActualizar.setEnabled(true);
        btnActualizar.setVisible(true);
        btnRegistrar.setVisible(false);
        btnGenerar.setVisible(false);

        if (conn != null) {
            try {
                String query = "SELECT * FROM Trabajador WHERE IDVendedor = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    txtNombre.setText(rs.getString("Nombre"));
                    txtApellidoP.setText(rs.getString("AP"));
                    txtApellidoM.setText(rs.getString("AM"));
                    txtCalle.setText(rs.getString("Calle"));
                    txtNumero.setText(rs.getString("Numero"));
                    txtColonia.setText(rs.getString("Colonia"));
                    txtCodigoP.setText(rs.getString("CP"));
                    txtCorreoE.setText(rs.getString("Correo"));
                    txtTelefono.setText(rs.getString("Telefono"));
                    txtNombreUsuario.setText(rs.getString("Usuario"));
                    txtContrasena.setText(rs.getString("Contrasenia"));
                    int rolId = rs.getInt("IDRol");
                    JCB_Roles.setSelectedItem(obtenerNombreRol(rolId));
                }

                rs.close();
                ps.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private String obtenerNombreRol(int idRol) {
        String query = "SELECT Rol FROM Rol WHERE IDRol = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idRol);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getString("Rol");
            }

            rs.close();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static String generarNombreUsuario(String nombre, String apellidoP, String apellidoM) {
        int maxLetras = 15;
        Random random = new Random();

        String[] partes = {nombre, apellidoP, apellidoM};
        StringBuilder nombreUsuario = new StringBuilder();

        for (int i = 0; i < 2; i++) {
            String parte = partes[random.nextInt(partes.length)];
            nombreUsuario.append(parte);
            if (i == 0) {
                nombreUsuario.append(random.nextInt(100));
            }
        }

        if (nombreUsuario.length() > maxLetras) {
            nombreUsuario.setLength(maxLetras);
        }

        return nombreUsuario.toString().toLowerCase();
    }

    private boolean comprobarUsuario(String usuario) {
        boolean encontrado = false;

        if (conn != null) {
            try {
                String query = "SELECT Usuario FROM Trabajador WHERE Usuario LIKE ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, "%" + usuario + "%");
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String Usuario = rs.getString("Usuario");
                    if (Usuario.equals(usuario)) {
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo_RegistroUsuario;
    private javax.swing.JComboBox<String> JCB_Roles;
    private javax.swing.JLabel NombreAdmin;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCodigoP;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreoE;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
