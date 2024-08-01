package Interfaz.ventas;

import Logic.*;
import javax.swing.JFrame;

public class Tablero_Ventas extends javax.swing.JFrame {

    Conexion conexion;
    
    public Tablero_Ventas(Conexion conexion) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.conexion = conexion;
        
        // this.setExtendedState(JFrame.MAXIMIZED_BOTH); (No usar porque los tamaños de imagen y de pantalla en cada disp. son diferentes)
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        JL_VentasRe = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVentasReciente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbproductoStock = new javax.swing.JTable();
        JL_Logo = new javax.swing.JLabel();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JL_TableroVendedor = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JFTablero");
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tablero");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 92, -1));

        JL_VentasRe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_VentasRe.setText("Ventas Reciente");
        getContentPane().add(JL_VentasRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 190, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Producto con poco Stock");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, -1, -1));

        tbVentasReciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Total"
            }
        ));
        tbVentasReciente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbVentasRecienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbVentasReciente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 320, 350));

        tbproductoStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(tbproductoStock);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 290, 350));

        JL_Logo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Logo.setText("Papeleria SUMI");
        getContentPane().add(JL_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 120, -1));

        btnTablero.setText("Tablero");
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 90, -1));

        btnVentas.setText("Ventas");
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 90, -1));

        btnInventario.setText("Inventario");
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 90, -1));

        btnCuenta.setText("Cuenta");
        getContentPane().add(btnCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 90, -1));

        jLabel7.setText("Cerra sesion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));
        getContentPane().add(JL_TableroVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));
        JL_TableroVendedor.getAccessibleContext().setAccessibleName("JL_fondoTablero");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbVentasRecienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbVentasRecienteAncestorAdded
        
    }//GEN-LAST:event_tbVentasRecienteAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Logo;
    private javax.swing.JLabel JL_TableroVendedor;
    private javax.swing.JLabel JL_VentasRe;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tbVentasReciente;
    private javax.swing.JTable tbproductoStock;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
