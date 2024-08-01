package Interfaz.ventas;

import javax.swing.JFrame;

public class Inventario_Venta extends javax.swing.JFrame {

    public Inventario_Venta() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_Logo = new javax.swing.JLabel();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JL_producto = new javax.swing.JLabel();
        txtproducto = new javax.swing.JTextField();
        JL_cantidad = new javax.swing.JLabel();
        spcantidad = new javax.swing.JSpinner();
        JL_precioUnitario = new javax.swing.JLabel();
        txtprecioUnitario = new javax.swing.JTextField();
        btnregistra = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbusqueda = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtconsulta = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JF_Inventario");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Inventario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 170, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Registro de producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        JL_producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_producto.setText("Producto");
        getContentPane().add(JL_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 160, -1));

        txtproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 340, 40));

        JL_cantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_cantidad.setText("Cantidad");
        getContentPane().add(JL_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));
        getContentPane().add(spcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 100, 40));

        JL_precioUnitario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_precioUnitario.setText("Precio Unitario");
        getContentPane().add(JL_precioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, 30));

        txtprecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtprecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 130, 30));

        btnregistra.setText("Registrar");
        btnregistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistraActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 150, 50));

        btnlimpiar.setText("Limpiar");
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 150, 50));

        tbbusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tbbusqueda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 350, 170));

        jLabel3.setText("Cerra sesion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Tipo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 70, -1));
        getContentPane().add(txttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 180, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Consulta de producto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, -1));
        getContentPane().add(txtconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 300, 30));

        btneliminar.setText("Eliminar");
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 120, 40));

        btneditar.setText("Editar");
        getContentPane().add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 490, 120, 40));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));
        jLabel6.getAccessibleContext().setAccessibleName("JL_fondoInventario");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductoActionPerformed

    }//GEN-LAST:event_txtproductoActionPerformed

    private void txtprecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioUnitarioActionPerformed

    }//GEN-LAST:event_txtprecioUnitarioActionPerformed

    private void btnregistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistraActionPerformed

    }//GEN-LAST:event_btnregistraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Logo;
    private javax.swing.JLabel JL_cantidad;
    private javax.swing.JLabel JL_precioUnitario;
    private javax.swing.JLabel JL_producto;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnregistra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spcantidad;
    private javax.swing.JTable tbbusqueda;
    private javax.swing.JTextField txtconsulta;
    private javax.swing.JTextField txtprecioUnitario;
    private javax.swing.JTextField txtproducto;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
