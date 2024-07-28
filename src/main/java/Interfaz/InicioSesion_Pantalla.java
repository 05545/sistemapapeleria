package Interfaz;

import Logic.*;
import Sockets.*;
import java.sql.Connection;

public class InicioSesion_Pantalla extends javax.swing.JFrame {

    private Connection conn;
    private InicioSesion inicioSesion;
    private Conexion conexion;
    private Cliente cliente;

    public InicioSesion_Pantalla() {
        initComponents();
        iniciarConexion();
        iniciarCliente();
    }

    public void iniciarConexion() {
        // Crear una instancia de Conexion y abrir la conexión
        conexion = new Conexion();
        conn = conexion.abrirConexion();

        // Crear una instancia de InicioSesion con la conexión
        inicioSesion = new InicioSesion(conn);
    }

    public void iniciarCliente() {
        // Iniciar conexión con el servidor
        cliente = new Cliente();
        cliente.iniConexion("192.168.1.105", 12345); // Conectar al servidor en localhost:6666
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_Usuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        JL_Contrasena = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        Pantalla_InicioSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_Usuario.setText("Usuario");
        getContentPane().add(JL_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 46, 59, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 43, 228, -1));

        JL_Contrasena.setText("Contraseña");
        getContentPane().add(JL_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 89, 85, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 86, 229, -1));

        btnIngresar.setText("INGRESAR");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 154, 160, -1));
        getContentPane().add(Pantalla_InicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        //Se obtiene el nombre del usuario
        String usuario = txtUsuario.getText();

        // Se obtiene el arreglo de caracteres de la contraseña y se convierte a String
        char[] contra = txtPass.getPassword();
        String contrasena = new String(contra);

        String rolUsuario = inicioSesion.obtenerRol(usuario, contrasena);

        if ("Administrador".equals(rolUsuario)) {
            InicioAdmin_Pantalla iniAdmin = new InicioAdmin_Pantalla(conexion); //Recibe a conexion como instancia para evitar abrir nuevas y que las consultas se ejecuten

            this.dispose();
            this.setVisible(false);
            this.dispose();

            iniAdmin.setVisible(true);

        } else if ("Vendedor".equals(rolUsuario)) {
            System.out.println("Vendedor ha iniciado sesión");
        }
    }//GEN-LAST:event_btnIngresarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Contrasena;
    private javax.swing.JLabel JL_Usuario;
    private javax.swing.JLabel Pantalla_InicioSesion;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}


/**
 *
 * Hecho por: Rodrigo Sosa Romero, Ernesto García Nolazco, Rosaisela Perez Morales y Elisabeth Maravillas
 */
