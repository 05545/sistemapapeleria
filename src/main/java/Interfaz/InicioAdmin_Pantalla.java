//Se han ajustado los nombres de los elementos

package Interfaz;

import Logic.*;


public class InicioAdmin_Pantalla extends javax.swing.JFrame {

    private Conexion conexion;
    
    public InicioAdmin_Pantalla(Conexion conexion) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.conexion = conexion;
    }

    public void cerrarConexion() {
        if (conexion != null) {
            conexion.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreAdmin = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreAdmin.setText("Este es admin");
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 26, 94, 63));

        btnSalir.setText("SALIR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 95, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();
        
        this.setVisible(false);
        this.dispose();
        cerrarConexion();
        
        iniSesion.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NombreAdmin;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero, Ernesto García Nolazco, Rosaisela Perez Morales y Elisabeth Maravillas
 */