package Interfaz.Administrador;

import Interfaz.*;
import Logic.*;

public class VentasAdmin_Pantalla extends javax.swing.JFrame {

    Conexion conexion;
    
    public VentasAdmin_Pantalla(Conexion conexion) {
        initComponents();
        
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

        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        JL_Producto = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        JL_VentasRecientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVentas = new javax.swing.JTable();
        JL_Cantidad = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        JL_PrecioUnitario = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        JL_Subtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        JL_Total = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        NombreAdmin = new javax.swing.JLabel();
        JL_FondoVentasAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        JL_Producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Producto.setText("Producto");
        getContentPane().add(JL_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 160, -1));

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 350, 50));

        JL_VentasRecientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_VentasRecientes.setText("Ventas recientes");
        getContentPane().add(JL_VentasRecientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 180, -1));

        tbVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 350, 330));

        JL_Cantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Cantidad.setText("Cantidad");
        getContentPane().add(JL_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));
        getContentPane().add(spCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 100, 40));

        JL_PrecioUnitario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_PrecioUnitario.setText("Precio Unitario");
        getContentPane().add(JL_PrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, 30));

        txtPrecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 130, 40));

        JL_Subtotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Subtotal.setText("Subtotal");
        getContentPane().add(JL_Subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 130, 40));

        JL_Total.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Total.setText("Total");
        getContentPane().add(JL_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 120, 40));

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 100, 40));

        btnLimpiar.setText("Limpiar");
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 100, 40));

        NombreAdmin.setText("Nombre usuario");
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 190, 63));
        getContentPane().add(JL_FondoVentasAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();

        this.setVisible(false);
        this.dispose();
        cerrarConexion();

        iniSesion.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed

    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtPrecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioUnitarioActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed

    }//GEN-LAST:event_btnProcesarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Cantidad;
    private javax.swing.JLabel JL_FondoVentasAdmin;
    private javax.swing.JLabel JL_PrecioUnitario;
    private javax.swing.JLabel JL_Producto;
    private javax.swing.JLabel JL_Subtotal;
    private javax.swing.JLabel JL_Total;
    private javax.swing.JLabel JL_VentasRecientes;
    private javax.swing.JLabel NombreAdmin;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTable tbVentas;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
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