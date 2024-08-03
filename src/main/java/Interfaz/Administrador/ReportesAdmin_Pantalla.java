package Interfaz.Administrador;

import Logic.*;
import Interfaz.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class ReportesAdmin_Pantalla extends javax.swing.JFrame {

    Connection conn;
    Conexion conexion;
    String usuario = "";
    String nomUsuario;

    public ReportesAdmin_Pantalla(Conexion conexion, Connection connection, String usuario, String nomUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.conexion = conexion;
        this.conn = connection;
        this.usuario = usuario;
        this.nomUsuario = nomUsuario;
        NombreAdmin.setText(usuario);
    }

    private void cerrarConexion() {
        if (conexion != null) {
            conexion.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreAdmin = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetallesReporteVentas = new javax.swing.JTextArea();
        JL_ReporteInventario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetallesReporteInventario = new javax.swing.JTextArea();
        JL_ReporteUsuarios = new javax.swing.JLabel();
        JCB_ReporteUsuarios = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDetallesReporteUsuarios = new javax.swing.JTextArea();
        JCB_ReporteInventario = new javax.swing.JCheckBox();
        JCB_ReporteVentas = new javax.swing.JCheckBox();
        JL_ReporteVentas = new javax.swing.JLabel();
        JL_Reportes = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JL_FondoReportesAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreAdmin.setFont(new java.awt.Font("C059", 0, 12)); // NOI18N
        NombreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 190, 63));

        JL_GenReports1.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        JL_GenReports1.setText("Reportes recientes");
        getContentPane().add(JL_GenReports1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 220, 70));

        JL_GenReports.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        JL_GenReports.setText("Generación de reportes");
        getContentPane().add(JL_GenReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 220, 70));

        btnGenerar.setText("Generar");
        btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarMouseClicked(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 710, -1, -1));

        btnTablero.setText("Tablero");
        btnTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableroMouseClicked(evt);
            }
        });
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

        JCB_ReporteUsuarios.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        JCB_ReporteUsuarios.setBorder(null);
        JCB_ReporteUsuarios.setContentAreaFilled(false);
        JCB_ReporteUsuarios.setMargin(new java.awt.Insets(4, 4, 4, 4));
        getContentPane().add(JCB_ReporteUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 546, 290, 20));

        txtDetallesReporteUsuarios.setEditable(false);
        txtDetallesReporteUsuarios.setColumns(20);
        txtDetallesReporteUsuarios.setRows(5);
        txtDetallesReporteUsuarios.setText("Este reporte contiene los datos de\ntodos los usuarios registrados en el\nsistema. Se excentan ciertos datos\npor privacidad del mismo. En caso \nde requerir conocer datos especificos\nde cada usuario dirijase al menú de\nusuarios.");
        jScrollPane3.setViewportView(txtDetallesReporteUsuarios);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, -1, 70));

        JCB_ReporteInventario.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        JCB_ReporteInventario.setBorder(null);
        JCB_ReporteInventario.setContentAreaFilled(false);
        JCB_ReporteInventario.setMargin(new java.awt.Insets(4, 4, 4, 4));
        getContentPane().add(JCB_ReporteInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 396, 290, 20));

        JCB_ReporteVentas.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        JCB_ReporteVentas.setBorder(null);
        JCB_ReporteVentas.setContentAreaFilled(false);
        JCB_ReporteVentas.setMargin(new java.awt.Insets(4, 4, 4, 4));
        getContentPane().add(JCB_ReporteVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 256, 290, 20));

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

    private void btnGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseClicked
        if (JCB_ReporteInventario.isSelected()) {
            Document RInventario = new Document();

            try {
                String ruta = System.getProperty("user.home");

                LocalDateTime ahora = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
                String fechaHora = ahora.format(formato);

                String nombreArchivo = ruta + "/Documents/Reportes/ReporteInventario_" + fechaHora + ".pdf";

                PdfWriter.getInstance(RInventario, new FileOutputStream(nombreArchivo));

                Image img = Image.getInstance("src/main/java/imagenes/Logo_Papeleria.png");
                img.scaleToFit(80, 80);
                img.setAlignment(Chunk.ALIGN_LEFT);

                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo.add("Formato creado por PAPELERIA SUMI\n");
                parrafo.setFont(FontFactory.getFont("Arial", 12, Font.BOLDITALIC, BaseColor.BLACK));
                parrafo.add("Registro de inventario actual\n\n");

                RInventario.open();
                RInventario.add(img);
                RInventario.add(parrafo);

                PdfPTable Tabla = new PdfPTable(6);
                Tabla.addCell("ID");
                Tabla.addCell("Nombre");
                Tabla.addCell("Categoría");
                Tabla.addCell("Cantidad disponible");
                Tabla.addCell("Precio");
                Tabla.addCell("Proveedor");

                try {
                    if (conn != null) {
                        try {
                            Statement stmt = conn.createStatement();
                            String sql = "SELECT Pr.IDProducto, Pr.Nombre, Pr.Tipo, Pr.Cantidad_Disponible, Pr.Precio, P.Proveedor FROM Producto Pr JOIN Proveedor P ON Pr.IDGerente = P.IDGerente";
                            ResultSet rs = stmt.executeQuery(sql);

                            if (rs.next()) {
                                do {
                                    Tabla.addCell(rs.getString(1));
                                    Tabla.addCell(rs.getString(2));
                                    Tabla.addCell(rs.getString(3));
                                    Tabla.addCell(rs.getString(4));
                                    Tabla.addCell(rs.getString(5));
                                    Tabla.addCell(rs.getString(6));
                                } while (rs.next());
                                RInventario.add(Tabla);
                            }
                            rs.close();
                            stmt.close();
                        } catch (SQLException e) {
                            System.out.println("Error al ejecutar la consulta.");
                            e.printStackTrace();
                        }
                    }
                } catch (DocumentException e) {
                    System.out.println("Hay un error en el documento." + e);
                }
                RInventario.close();
                JOptionPane.showMessageDialog(null, "El documento se ha exportado correctamente");
            } catch (DocumentException | FileNotFoundException e) {
                System.out.println("Hay un error en el documento." + e);
            } catch (IOException e) {
                System.out.println("Error en la imagen" + e);
            }
        }

        if (JCB_ReporteVentas.isSelected()) {
            Document RVentas = new Document();

            try {
                String ruta = System.getProperty("user.home");

                LocalDateTime ahora = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
                String fechaHora = ahora.format(formato);

                String nombreArchivo = ruta + "/Documents/Reportes/ReporteVentas_" + fechaHora + ".pdf";

                PdfWriter.getInstance(RVentas, new FileOutputStream(nombreArchivo));

                Image img = Image.getInstance("src/main/java/imagenes/Logo_Papeleria.png");
                img.scaleToFit(80, 80);
                img.setAlignment(Chunk.ALIGN_LEFT);

                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo.add("Formato creado por PAPELERIA SUMI\n");
                parrafo.setFont(FontFactory.getFont("Arial", 12, Font.BOLDITALIC, BaseColor.BLACK));
                parrafo.add("Registro de inventario actual\n\n");

                RVentas.open();
                RVentas.add(img);
                RVentas.add(parrafo);

                PdfPTable Tabla = new PdfPTable(4);
                Tabla.addCell("ID");
                Tabla.addCell("Nombre");
                Tabla.addCell("Precio Unitario");
                Tabla.addCell("Subtotal");

                try {
                    if (conn != null) {
                        try {
                            Statement stmt = conn.createStatement();
                            String sql = "SELECT * FROM Venta";
                            ResultSet rs = stmt.executeQuery(sql);

                            if (rs.next()) {
                                do {
                                    Tabla.addCell(rs.getString(1));
                                    Tabla.addCell(rs.getString(2));
                                    Tabla.addCell(rs.getString(3));
                                    Tabla.addCell(rs.getString(4));
                                    Tabla.addCell(rs.getString(5));
                                    Tabla.addCell(rs.getString(6));
                                } while (rs.next());
                                RVentas.add(Tabla);
                            }
                            rs.close();
                            stmt.close();
                        } catch (SQLException e) {
                            System.out.println("Error al ejecutar la consulta.");
                            e.printStackTrace();
                        }
                    }
                } catch (DocumentException e) {
                    System.out.println("Hay un error en el documento." + e);
                }
                RVentas.close();
                JOptionPane.showMessageDialog(null, "El documento se ha exportado correctamente");
            } catch (DocumentException | FileNotFoundException e) {
                System.out.println("Hay un error en el documento." + e);
            } catch (IOException e) {
                System.out.println("Error en la imagen" + e);
            }
        }

        if (JCB_ReporteUsuarios.isSelected()) {
            Document RUsuarios = new Document();

            try {
                String ruta = System.getProperty("user.home");

                LocalDateTime ahora = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
                String fechaHora = ahora.format(formato);

                String nombreArchivo = ruta + "/Documents/Reportes/ReporteUsuarios_" + fechaHora + ".pdf";

                PdfWriter.getInstance(RUsuarios, new FileOutputStream(nombreArchivo));

                Image img = Image.getInstance("src/main/java/imagenes/Logo_Papeleria.png");
                img.scaleToFit(80, 80);
                img.setAlignment(Chunk.ALIGN_LEFT);

                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo.add("Formato creado por PAPELERIA SUMI\n");
                parrafo.setFont(FontFactory.getFont("Arial", 12, Font.BOLDITALIC, BaseColor.BLACK));
                parrafo.add("Registro de inventario actual\n\n");

                RUsuarios.open();
                RUsuarios.add(img);
                RUsuarios.add(parrafo);

                PdfPTable Tabla = new PdfPTable(7);
                Tabla.addCell("ID");
                Tabla.addCell("Nombre");
                Tabla.addCell("Apellido paterno");
                Tabla.addCell("Apellido materno");
                Tabla.addCell("Correo");
                Tabla.addCell("Telefono");
                Tabla.addCell("Rol");

                try {
                    if (conn != null) {
                        try {
                            Statement stmt = conn.createStatement();
                            String sql = "SELECT T.IDVendedor, T.Nombre, T.AP, T.AM, T.Correo, T.Telefono, R.Rol FROM Trabajador T JOIN Rol R WHERE R.IdRol = T.IdRol";
                            ResultSet rs = stmt.executeQuery(sql);

                            if (rs.next()) {
                                do {
                                    Tabla.addCell(rs.getString(1));
                                    Tabla.addCell(rs.getString(2));
                                    Tabla.addCell(rs.getString(3));
                                    Tabla.addCell(rs.getString(4));
                                    Tabla.addCell(rs.getString(5));
                                    Tabla.addCell(rs.getString(6));
                                    Tabla.addCell(rs.getString(7));
                                } while (rs.next());
                                RUsuarios.add(Tabla);
                            }
                            rs.close();
                            stmt.close();
                        } catch (SQLException e) {
                            System.out.println("Error al ejecutar la consulta.");
                            e.printStackTrace();
                        }
                    }
                } catch (DocumentException e) {
                    System.out.println("Hay un error en el documento." + e);
                }
                RUsuarios.close();
                JOptionPane.showMessageDialog(null, "El documento se ha exportado correctamente");
            } catch (DocumentException | FileNotFoundException e) {
                System.out.println("Hay un error en el documento." + e);
            } catch (IOException e) {
                System.out.println("Error en la imagen" + e);
            }
        }
    }//GEN-LAST:event_btnGenerarMouseClicked

    private void btnTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTableroMouseClicked
        InicioAdmin_Pantalla TV = new InicioAdmin_Pantalla(conexion, conn, nomUsuario);

        this.setVisible(false);
        this.dispose();

        TV.setLocationRelativeTo(null);
        TV.setVisible(false);

    }//GEN-LAST:event_btnTableroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JCB_ReporteInventario;
    private javax.swing.JCheckBox JCB_ReporteUsuarios;
    private javax.swing.JCheckBox JCB_ReporteVentas;
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
 * Hecho por: Rodrigo Sosa Romero 
 * Ernesto García Nolazco 
 * Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
