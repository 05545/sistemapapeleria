package Interfaz.Administrador;

import Logic.*;
import Interfaz.*;

public class RegistroUsuario extends javax.swing.JFrame {

    Conexion conexion;
    public RegistroUsuario(Conexion conexion) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.conexion = conexion;
    }

    private void cerrarConexion() {
        if (conexion != null) {
            conexion.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_CorreoE = new javax.swing.JLabel();
        txtCorreoE = new javax.swing.JTextField();
        NombreAdmin = new javax.swing.JLabel();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        JL_Contrasena1 = new javax.swing.JLabel();
        JL_Contrasena = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        JL_Nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        JL_CCodigoPostal = new javax.swing.JLabel();
        txtCodigoP = new javax.swing.JTextField();
        JL_Colonia = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        JL_Numero = new javax.swing.JLabel();
        JL_Calle = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        JL_Telefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        JL_TRegistroUsuarios = new javax.swing.JLabel();
        JL_NombreUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        JL_ApellidoP = new javax.swing.JLabel();
        JL_ApellidoM = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        Fondo_RegistroUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_CorreoE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_CorreoE.setText("Correo electrónico");
        getContentPane().add(JL_CorreoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 220, -1));

        txtCorreoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoEActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, 290, 40));

        NombreAdmin.setText("Nombre usuario");
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 190, 63));

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

        JL_Contrasena1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Contrasena1.setText("Rol");
        getContentPane().add(JL_Contrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 480, 220, 30));

        JL_Contrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Contrasena.setText("Contraseña");
        getContentPane().add(JL_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 220, 30));

        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 230, 40));

        JL_Nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Nombre.setText("Nombre(s)");
        getContentPane().add(JL_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 220, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 340, 40));

        JL_CCodigoPostal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_CCodigoPostal.setText("Código Postal");
        getContentPane().add(JL_CCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 220, -1));

        txtCodigoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoPActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 230, 40));

        JL_Colonia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Colonia.setText("Colonia");
        getContentPane().add(JL_Colonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 220, -1));

        txtColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColoniaActionPerformed(evt);
            }
        });
        getContentPane().add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 230, 40));

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 80, 40));

        JL_Numero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Numero.setText("Número");
        getContentPane().add(JL_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 220, -1));

        JL_Calle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Calle.setText("Calle");
        getContentPane().add(JL_Calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 220, -1));

        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });
        getContentPane().add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 130, 40));

        JL_Telefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Telefono.setText("Telefono");
        getContentPane().add(JL_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 220, -1));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 200, 40));

        JL_TRegistroUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_TRegistroUsuarios.setText("Registro de nuevos usuarios");
        getContentPane().add(JL_TRegistroUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        JL_NombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_NombreUsuario.setText("Nombre de usuario");
        getContentPane().add(JL_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 220, -1));

        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 370, 40));

        txtApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 200, 40));

        JL_ApellidoP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_ApellidoP.setText("Apellido paterno");
        getContentPane().add(JL_ApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 220, -1));

        JL_ApellidoM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_ApellidoM.setText("Apellido materno");
        getContentPane().add(JL_ApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 220, -1));

        txtApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 200, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, 210, 40));

        Fondo_RegistroUsuario.setText("}");
        getContentPane().add(Fondo_RegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo_RegistroUsuario;
    private javax.swing.JLabel JL_ApellidoM;
    private javax.swing.JLabel JL_ApellidoP;
    private javax.swing.JLabel JL_CCodigoPostal;
    private javax.swing.JLabel JL_Calle;
    private javax.swing.JLabel JL_Colonia;
    private javax.swing.JLabel JL_Contrasena;
    private javax.swing.JLabel JL_Contrasena1;
    private javax.swing.JLabel JL_CorreoE;
    private javax.swing.JLabel JL_Nombre;
    private javax.swing.JLabel JL_NombreUsuario;
    private javax.swing.JLabel JL_Numero;
    private javax.swing.JLabel JL_TRegistroUsuarios;
    private javax.swing.JLabel JL_Telefono;
    private javax.swing.JLabel NombreAdmin;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JComboBox<String> jComboBox1;
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
 * Hecho por: 
 * Rodrigo Sosa Romero
 * Ernesto García Nolazco
 * Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */