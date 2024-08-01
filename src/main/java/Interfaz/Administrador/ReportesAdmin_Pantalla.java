package Interfaz.Administrador;

import Logic.*;
import Interfaz.*;

public class ReportesAdmin_Pantalla extends javax.swing.JFrame {

    Conexion conexion;

    public ReportesAdmin_Pantalla(Conexion conexion) {
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

        JL_GenReports1 = new javax.swing.JLabel();
        JL_GenReports = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        NombreAdmin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetallesReporteVentas = new javax.swing.JTextArea();
        JL_ReporteInventario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetallesReporteInventario = new javax.swing.JTextArea();
        JL_ReporteUsuarios = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDetallesReporteUsuarios = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        JL_ReporteVentas = new javax.swing.JLabel();
        JL_Reportes = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JL_FondoReportesAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_GenReports1.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        JL_GenReports1.setText("Reportes recientes");
        getContentPane().add(JL_GenReports1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 220, 70));

        JL_GenReports.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        JL_GenReports.setText("Generación de reportes");
        getContentPane().add(JL_GenReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 220, 70));

        btnGenerar.setText("Generar");
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 710, -1, -1));

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

        NombreAdmin.setText("Nombre usuario");
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 190, 63));

        txtDetallesReporteVentas.setEditable(false);
        txtDetallesReporteVentas.setColumns(20);
        txtDetallesReporteVentas.setRows(5);
        txtDetallesReporteVentas.setText("Este reporte contiene todo el historial\nde ventas a lo largo del tiempo. Es \ngenerado en base a los registtros.");
        jScrollPane1.setViewportView(txtDetallesReporteVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, 70));

        JL_ReporteInventario.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        JL_ReporteInventario.setText("Reporte de inventario");
        getContentPane().add(JL_ReporteInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 220, 40));

        txtDetallesReporteInventario.setEditable(false);
        txtDetallesReporteInventario.setColumns(20);
        txtDetallesReporteInventario.setRows(5);
        txtDetallesReporteInventario.setText("Este reporte contiene todo el\ninventario disponible actualmente\nbasandose en los registros disponibles\nconforme a las ventas.");
        jScrollPane2.setViewportView(txtDetallesReporteInventario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, 70));

        JL_ReporteUsuarios.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        JL_ReporteUsuarios.setText("Reporte de usuarios");
        getContentPane().add(JL_ReporteUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 220, 40));

        jCheckBox3.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jCheckBox3.setMargin(new java.awt.Insets(4, 4, 4, 4));
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 290, 20));

        txtDetallesReporteUsuarios.setEditable(false);
        txtDetallesReporteUsuarios.setColumns(20);
        txtDetallesReporteUsuarios.setRows(5);
        txtDetallesReporteUsuarios.setText("Este reporte contiene los datos de\ntodos los usuarios registrados en el\nsistema. Se excentan ciertos datos\npor privacidad del mismo. En caso \nde requerir conocer datos especificos\nde cada usuario dirijase al menú de\nusuarios.");
        jScrollPane3.setViewportView(txtDetallesReporteUsuarios);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, -1, 70));

        jCheckBox1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jCheckBox1.setMargin(new java.awt.Insets(4, 4, 4, 4));
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 396, 290, 20));

        jCheckBox2.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jCheckBox2.setMargin(new java.awt.Insets(4, 4, 4, 4));
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 256, 290, 20));

        JL_ReporteVentas.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        JL_ReporteVentas.setText("Reporte de ventas");
        getContentPane().add(JL_ReporteVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 220, 40));

        JL_Reportes.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        JL_Reportes.setText("Reportes");
        getContentPane().add(JL_Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 220, 70));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Fecha"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, -1, 110));
        getContentPane().add(JL_FondoReportesAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

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
    private javax.swing.JLabel JL_FondoReportesAdmin;
    private javax.swing.JLabel JL_GenReports;
    private javax.swing.JLabel JL_GenReports1;
    private javax.swing.JLabel JL_ReporteInventario;
    private javax.swing.JLabel JL_ReporteUsuarios;
    private javax.swing.JLabel JL_ReporteVentas;
    private javax.swing.JLabel JL_Reportes;
    private javax.swing.JLabel NombreAdmin;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtDetallesReporteInventario;
    private javax.swing.JTextArea txtDetallesReporteUsuarios;
    private javax.swing.JTextArea txtDetallesReporteVentas;
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
