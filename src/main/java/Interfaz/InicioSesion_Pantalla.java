package Interfaz;

import Interfaz.Administrador.*;
import Interfaz.ventas.*;
import Logic.*;
import Sockets.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

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

        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        Pantalla_InicioSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(78, 78, 78));
        txtUsuario.setFont(new java.awt.Font("C059", 1, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 400, 40));

        txtPass.setBackground(new java.awt.Color(78, 78, 78));
        txtPass.setFont(new java.awt.Font("C059", 1, 24)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(null);
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 400, 40));

        btnIngresar.setIcon(new javax.swing.ImageIcon("/home/rodrigo/NetBeansProjects/sistemapapeleria/src/main/java/img/btnIngresar.png")); // NOI18N
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
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
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 510, 70));

        Pantalla_InicioSesion.setIcon(new javax.swing.ImageIcon("/home/rodrigo/NetBeansProjects/sistemapapeleria/src/main/java/img/Pantalla_Loggin.png")); // NOI18N
        getContentPane().add(Pantalla_InicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

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
            InicioAdmin_Pantalla iniAdmin = new InicioAdmin_Pantalla(conexion, conn, usuario); //Recibe a conexion como instancia para evitar abrir nuevas y que las consultas se ejecuten

            this.dispose();
            this.setVisible(false);

            iniAdmin.setVisible(true);

        } else if ("Vendedor".equals(rolUsuario)) {
            Tablero_Ventas TV = new Tablero_Ventas(conexion, conn, usuario);
            
            this.dispose();
            this.setVisible(false);
            
            TV.setVisible(true);
            TV.setLocationRelativeTo(null);
           
        } else {
            
            JOptionPane.showMessageDialog(null, "Usuario o contraseña no coincidentes");
            
            btnIngresar.setVisible(false);
            txtUsuario.setEditable(false);
            txtPass.setEditable(false);
        }
    }//GEN-LAST:event_btnIngresarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pantalla_InicioSesion;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
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
