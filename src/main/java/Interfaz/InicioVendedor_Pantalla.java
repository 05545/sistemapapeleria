package Interfaz;

public class InicioVendedor_Pantalla extends javax.swing.JFrame {

    public String hola;

    public InicioVendedor_Pantalla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        NombreVendedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setText("SALIR");
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 95, -1, -1));

        NombreVendedor.setText("Este es vendedor");
        getContentPane().add(NombreVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 26, 126, 63));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NombreVendedor;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}


/**
 *
 * Hecho por: Rodrigo Sosa Romero, Ernesto García Nolazco, Rosaisela Perez Morales y Elisabeth Maravillas
 */
