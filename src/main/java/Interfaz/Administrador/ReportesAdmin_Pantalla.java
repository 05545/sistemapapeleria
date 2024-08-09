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
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.draw.LineSeparator;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReportesAdmin_Pantalla extends javax.swing.JFrame {

    Connection conn;
    Conexion conexion;
    String usuario = "";
    String nomUsuario;

    int[] cantidadTipo = new int[5];
    int indice = 0;
    String[] nombresCategorias = {"Escolar", "Libros", "Tecnología", "Papel", "Oficina"};

    public ReportesAdmin_Pantalla(Conexion conexion, Connection connection, String usuario, String nomUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.conexion = conexion;
        this.conn = connection;
        this.usuario = usuario;
        this.nomUsuario = nomUsuario;
        NombreAdmin.setText(usuario);

        //Propiedades de la tabla busqueda
        JTB_ReportesRecientes.getColumnModel().getColumn(0).setPreferredWidth(70);  // Ancho para la columna "Nombre"
        JTB_ReportesRecientes.getColumnModel().getColumn(1).setPreferredWidth(50); // Ancho para la columna "Tipo"
        JTB_ReportesRecientes.getColumnModel().getColumn(2).setPreferredWidth(20); // Ancho para la columna "Fecha"
        JTB_ReportesRecientes.setDefaultEditor(Object.class, null); // Inhabilitar la edición
        JTB_ReportesRecientes.getTableHeader().setResizingAllowed(false); // Inhabilitar el redimensionamiento

        cargarReportesRecientes();
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
        btnGenerar = new javax.swing.JButton();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        JTB_ReportesRecientes = new javax.swing.JTable();
        JL_FondoReportesAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreAdmin.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        NombreAdmin.setForeground(new java.awt.Color(51, 51, 51));
        NombreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 40, 190, 20));

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnGenerar.png"))); // NOI18N
        btnGenerar.setBorder(null);
        btnGenerar.setBorderPainted(false);
        btnGenerar.setContentAreaFilled(false);
        btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarMouseClicked(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        btnTablero.setBorder(null);
        btnTablero.setContentAreaFilled(false);
        btnTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableroMouseClicked(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 30));

        btnVentas.setBorder(null);
        btnVentas.setContentAreaFilled(false);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, 30));

        btnInventario.setBorder(null);
        btnInventario.setContentAreaFilled(false);
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 140, 30));

        btnUsuarios.setBorder(null);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 140, 30));

        btnProveedores.setBorder(null);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 150, 30));

        btnReportes.setBorder(null);
        btnReportes.setContentAreaFilled(false);
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 140, 30));

        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 180, 30));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        txtDetallesReporteVentas.setEditable(false);
        txtDetallesReporteVentas.setBackground(new java.awt.Color(255, 255, 255));
        txtDetallesReporteVentas.setColumns(20);
        txtDetallesReporteVentas.setForeground(new java.awt.Color(0, 0, 0));
        txtDetallesReporteVentas.setRows(5);
        txtDetallesReporteVentas.setText("Este reporte contiene todo el historial\nde ventas a lo largo del tiempo. Es \ngenerado en base a los registtros.");
        jScrollPane1.setViewportView(txtDetallesReporteVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 200, 300, 60));

        JL_ReporteInventario.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        JL_ReporteInventario.setForeground(new java.awt.Color(51, 51, 51));
        JL_ReporteInventario.setText("Reporte de inventario");
        getContentPane().add(JL_ReporteInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 220, 40));

        txtDetallesReporteInventario.setEditable(false);
        txtDetallesReporteInventario.setBackground(new java.awt.Color(255, 255, 255));
        txtDetallesReporteInventario.setColumns(20);
        txtDetallesReporteInventario.setForeground(new java.awt.Color(51, 51, 51));
        txtDetallesReporteInventario.setRows(5);
        txtDetallesReporteInventario.setText("Este reporte contiene todo el\ninventario disponible actualmente\nbasandose en los registros disponibles\nconforme a las ventas.");
        jScrollPane2.setViewportView(txtDetallesReporteInventario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 300, 300, 60));

        JL_ReporteUsuarios.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        JL_ReporteUsuarios.setForeground(new java.awt.Color(51, 51, 51));
        JL_ReporteUsuarios.setText("Reporte de usuarios");
        getContentPane().add(JL_ReporteUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 220, 40));

        JCB_ReporteUsuarios.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        JCB_ReporteUsuarios.setBorder(null);
        JCB_ReporteUsuarios.setContentAreaFilled(false);
        JCB_ReporteUsuarios.setMargin(new java.awt.Insets(4, 4, 4, 4));
        getContentPane().add(JCB_ReporteUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 290, 20));

        txtDetallesReporteUsuarios.setEditable(false);
        txtDetallesReporteUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        txtDetallesReporteUsuarios.setColumns(20);
        txtDetallesReporteUsuarios.setForeground(new java.awt.Color(51, 51, 51));
        txtDetallesReporteUsuarios.setRows(5);
        txtDetallesReporteUsuarios.setText("Este reporte contiene los datos de\ntodos los usuarios registrados en el\nsistema. Se excentan ciertos datos\npor privacidad del mismo. En caso \nde requerir conocer datos especificos\nde cada usuario dirijase al menú de\nusuarios.");
        jScrollPane3.setViewportView(txtDetallesReporteUsuarios);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 400, 300, 70));

        JCB_ReporteInventario.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        JCB_ReporteInventario.setBorder(null);
        JCB_ReporteInventario.setContentAreaFilled(false);
        JCB_ReporteInventario.setMargin(new java.awt.Insets(4, 4, 4, 4));
        getContentPane().add(JCB_ReporteInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 290, 20));

        JCB_ReporteVentas.setFont(new java.awt.Font("Bitstream Charter", 0, 24)); // NOI18N
        JCB_ReporteVentas.setForeground(new java.awt.Color(51, 51, 51));
        JCB_ReporteVentas.setBorder(null);
        JCB_ReporteVentas.setContentAreaFilled(false);
        JCB_ReporteVentas.setMargin(new java.awt.Insets(4, 4, 4, 4));
        getContentPane().add(JCB_ReporteVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 290, 20));

        JL_ReporteVentas.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        JL_ReporteVentas.setForeground(new java.awt.Color(51, 51, 51));
        JL_ReporteVentas.setText("Reporte de ventas");
        getContentPane().add(JL_ReporteVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 220, 40));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setOpaque(false);

        JTB_ReportesRecientes.setBackground(new java.awt.Color(255, 255, 255));
        JTB_ReportesRecientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(JTB_ReportesRecientes);
        if (JTB_ReportesRecientes.getColumnModel().getColumnCount() > 0) {
            JTB_ReportesRecientes.getColumnModel().getColumn(0).setResizable(false);
            JTB_ReportesRecientes.getColumnModel().getColumn(0).setPreferredWidth(70);
            JTB_ReportesRecientes.getColumnModel().getColumn(1).setResizable(false);
            JTB_ReportesRecientes.getColumnModel().getColumn(1).setPreferredWidth(50);
            JTB_ReportesRecientes.getColumnModel().getColumn(2).setResizable(false);
            JTB_ReportesRecientes.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 390, 420));

        JL_FondoReportesAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/Pantalla_Reportes_Administrador.png"))); // NOI18N
        getContentPane().add(JL_FondoReportesAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();

            this.setVisible(false);
            this.dispose();
            cerrarConexion();

            iniSesion.setVisible(true);
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseClicked
        if (!JCB_ReporteInventario.isSelected() && !JCB_ReporteUsuarios.isSelected() && !JCB_ReporteVentas.isSelected()) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún tipo de reporte");
        } else {
            if (JCB_ReporteInventario.isSelected()) {
                reporteInventario();
            }

            if (JCB_ReporteVentas.isSelected()) {
                reporteVentas();
            }

            if (JCB_ReporteUsuarios.isSelected()) {
                reporteUsuarios();
            }
        }
    }//GEN-LAST:event_btnGenerarMouseClicked

    private void btnTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTableroMouseClicked
        InicioAdmin_Pantalla TV = new InicioAdmin_Pantalla(conexion, conn, nomUsuario);

        this.setVisible(false);
        this.dispose();

        TV.setLocationRelativeTo(null);
        TV.setVisible(true);

    }//GEN-LAST:event_btnTableroMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        this.setVisible(false);
        this.dispose();

        VentasAdmin_Pantalla ventasAdmin = new VentasAdmin_Pantalla(conexion, conn, usuario, nomUsuario);
        ventasAdmin.setVisible(true);
        ventasAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        this.setVisible(false);
        this.dispose();

        InventarioAdmin_Pantalla invA = new InventarioAdmin_Pantalla(conexion, conn, usuario, nomUsuario);
        invA.setVisible(true);
        invA.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        this.setVisible(false);
        this.dispose();

        UsuariosAdmin_Pantalla usersAdmin = new UsuariosAdmin_Pantalla(conexion, conn, usuario, nomUsuario);
        usersAdmin.setVisible(true);
        usersAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnUsuariosMouseClicked

    private void btnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseClicked
        this.setVisible(false);
        this.dispose();

        ProveedoresAdmin_Pantalla proviAdmin = new ProveedoresAdmin_Pantalla(conexion, conn, usuario, nomUsuario);
        proviAdmin.setVisible(true);
        proviAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnProveedoresMouseClicked

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        ReportesAdmin_Pantalla rpa = new ReportesAdmin_Pantalla(conexion, conn, usuario, nomUsuario);
        this.setVisible(false);
        this.dispose();

        rpa.setVisible(true);
        rpa.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnReportesMouseClicked

    private void registrarReporteGenerado(String nombreReporte, String tipoReporte, String fechaGeneracion) {
        String carpetaUsuario = System.getProperty("user.home");
        String rutaArchivo = carpetaUsuario + "/Documents/registro_reportes.txt";

        try (FileWriter fw = new FileWriter(rutaArchivo, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
            out.println(nombreReporte + "," + tipoReporte + "," + fechaGeneracion);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarReportesRecientes() {
        String carpetaUsuario = System.getProperty("user.home");
        String rutaArchivo = carpetaUsuario + "/Documents/registro_reportes.txt";

        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(null, "No existe el archivo");
            System.out.println("El archivo no existe: " + rutaArchivo);
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) JTB_ReportesRecientes.getModel();
        modelo.setRowCount(0);

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                if (datos.length == 3) {
                    modelo.addRow(datos);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void reporteInventario() {
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
            img.setAlignment(Image.LEFT);

            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.setWidths(new int[]{1, 3});

            PdfPCell cell = new PdfPCell(img);
            cell.setBorder(PdfPCell.NO_BORDER);
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(cell);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Arial", 12, Font.BOLDITALIC, BaseColor.BLACK));
            parrafo.add("\n\nFormato creado por PAPELERIA SUMI\n");
            parrafo.add("Registro de inventario actual\n\n");

            Paragraph titulo = new Paragraph();
            titulo.setAlignment(Paragraph.ALIGN_CENTER);
            titulo.setFont(FontFactory.getFont("Arial", 16, Font.BOLD, BaseColor.BLACK));
            titulo.add("Reporte de inventario\n");
            titulo.add("Fecha: " + ahora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n\n");

            Paragraph descripcion = new Paragraph();
            descripcion.setAlignment(Paragraph.ALIGN_LEFT);
            descripcion.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            descripcion.add("Este reporte proporciona información de los productos disponibles en el sistema actualmente. Incluye datos sobre la disponibilidad de cada uno.\n\n");

            PdfPCell textCell = new PdfPCell(parrafo);
            textCell.setBorder(PdfPCell.NO_BORDER);
            textCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(textCell);

            RInventario.open();
            RInventario.add(table);

            LineSeparator ls = new LineSeparator();
            ls.setOffset(-10);
            RInventario.add(new Chunk(ls));

            RInventario.add(new Paragraph("\n"));
            RInventario.add(titulo);
            RInventario.add(descripcion);
            RInventario.add(new Paragraph("\n"));
            RInventario.add(new Chunk(ls));
            RInventario.add(new Paragraph("\n"));

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
                registrarReporteGenerado("ReporteInventario_" + fechaHora + ".pdf", "Inventario", fechaHora);
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

    private void reporteVentas() {
        generarGrafico();

        Document RVentas = new Document();

        try {
            String ruta = System.getProperty("user.home");
            String rutaImgGrafico = ruta + "/Documents/Reportes/imgGrafico.png";

            LocalDateTime ahora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
            String fechaHora = ahora.format(formato);

            String nombreArchivo = ruta + "/Documents/Reportes/ReporteVentas_" + fechaHora + ".pdf";

            PdfWriter.getInstance(RVentas, new FileOutputStream(nombreArchivo));

            Image img = Image.getInstance("src/main/java/imagenes/Logo_Papeleria.png");
            img.scaleToFit(80, 80);
            img.setAlignment(Image.LEFT);

            Image imgGrafico = Image.getInstance(rutaImgGrafico);
            imgGrafico.scaleToFit(300, 200);
            imgGrafico.setAlignment(Image.ALIGN_CENTER);

            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.setWidths(new int[]{1, 3});

            PdfPCell cell = new PdfPCell(img);
            cell.setBorder(PdfPCell.NO_BORDER);
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(cell);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Arial", 12, Font.BOLDITALIC, BaseColor.BLACK));
            parrafo.add("\n\nFormato creado por PAPELERIA SUMI\n");
            parrafo.add("Registro de ventas actual\n\n");

            Paragraph titulo = new Paragraph();
            titulo.setAlignment(Paragraph.ALIGN_CENTER);
            titulo.setFont(FontFactory.getFont("Arial", 16, Font.BOLD, BaseColor.BLACK));
            titulo.add("Reporte de ventas\n");
            titulo.add("Fecha: " + ahora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n\n");

            Paragraph descripcion = new Paragraph();
            descripcion.setAlignment(Paragraph.ALIGN_LEFT);
            descripcion.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            descripcion.add("Este reporte le proporciona la información completa de las productos vendidos. Se incluye una gráfica de las ventas seleccionando las categorías de productos más vendidas y un desglose de las transacciones.\n\n");

            Paragraph parrafoGrafica = new Paragraph();
            parrafoGrafica.setAlignment(Paragraph.ALIGN_CENTER);
            parrafoGrafica.setFont(FontFactory.getFont("Arial", 12, Font.BOLDITALIC, BaseColor.BLACK));
            parrafoGrafica.add("\nGráfica representativa del porcentaje de ventas de cada categoría.\n");

            Paragraph totalesParagraph = new Paragraph();
            totalesParagraph.setAlignment(Paragraph.ALIGN_LEFT);
            totalesParagraph.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            totalesParagraph.add("\nTotales por categoría:\n");

            for (int i = 0; i < cantidadTipo.length; i++) {
                if (i < nombresCategorias.length) {
                    totalesParagraph.add(nombresCategorias[i] + ": " + cantidadTipo[i] + "\n");
                }
            }

            PdfPCell textCell = new PdfPCell(parrafo);
            textCell.setBorder(PdfPCell.NO_BORDER);
            textCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(textCell);

            RVentas.open();
            RVentas.add(table);

            LineSeparator ls = new LineSeparator();
            ls.setOffset(-10);
            RVentas.add(new Chunk(ls));

            RVentas.add(new Paragraph("\n"));
            RVentas.add(titulo);
            RVentas.add(descripcion);
            RVentas.add(parrafoGrafica);
            RVentas.add(imgGrafico);
            RVentas.add(new Paragraph("\n"));

            RVentas.add(totalesParagraph);

            LineSeparator ls1 = new LineSeparator();
            ls1.setOffset(-10);
            RVentas.add(new Chunk(ls1));
            RVentas.add(new Paragraph("\n\n"));

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
                registrarReporteGenerado("ReporteVentas_" + fechaHora + ".pdf", "Ventas", fechaHora);
            } catch (DocumentException e) {
                System.out.println("Hay un error en el documento." + e);
            }
            RVentas.close();
            JOptionPane.showMessageDialog(null, "El documento se ha exportado correctamente");
            
            File fileGrafico = new File(rutaImgGrafico);
            if (fileGrafico.exists()) {
                if (fileGrafico.delete()) {
                    System.out.println("Imagen de gráfico eliminada con éxito.");
                } else {
                    System.out.println("No se pudo eliminar la imagen del gráfico.");
                }
            } else {
                System.out.println("La imagen del gráfico no existe.");
            }
        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("Hay un error en el documento." + e);
        } catch (IOException e) {
            System.out.println("Error en la imagen" + e);
        }
    }

    private void reporteUsuarios() {
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
            img.setAlignment(Image.LEFT);

            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.setWidths(new int[]{1, 3});

            PdfPCell cell = new PdfPCell(img);
            cell.setBorder(PdfPCell.NO_BORDER);
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(cell);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Arial", 12, Font.BOLDITALIC, BaseColor.BLACK));
            parrafo.add("\n\nFormato creado por PAPELERIA SUMI\n");
            parrafo.add("Registro de usuarios actual\n\n");

            Paragraph titulo = new Paragraph();
            titulo.setAlignment(Paragraph.ALIGN_CENTER);
            titulo.setFont(FontFactory.getFont("Arial", 16, Font.BOLD, BaseColor.BLACK));
            titulo.add("Reporte de usuarios registrados\n");
            titulo.add("Fecha: " + ahora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n\n");

            Paragraph descripcion = new Paragraph();
            descripcion.setAlignment(Paragraph.ALIGN_LEFT);
            descripcion.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            descripcion.add("Este reporte le proporciona información parcial de los usuarios registrados. Se excluye la totalidad de la información por privacidad.\n\n");

            PdfPCell textCell = new PdfPCell(parrafo);
            textCell.setBorder(PdfPCell.NO_BORDER);
            textCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(textCell);

            RUsuarios.open();
            RUsuarios.add(table);

            LineSeparator ls = new LineSeparator();
            ls.setOffset(-10);
            RUsuarios.add(new Chunk(ls));

            RUsuarios.add(new Paragraph("\n"));
            RUsuarios.add(titulo);
            RUsuarios.add(descripcion);
            RUsuarios.add(new Chunk(ls));
            RUsuarios.add(new Paragraph("\n"));

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
                registrarReporteGenerado("ReporteUsuarios_" + fechaHora + ".pdf", "Usuarios", fechaHora);
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

    private void generarGrafico() {
        String rutaIni = System.getProperty("user.home");
        String nombreArchivo = rutaIni + "/Documents/Reportes/imgGrafico.png";

        indice = 0;

        //DefaultCategoryDataset datosGrafic = new DefaultCategoryDataset();
        DefaultPieDataset datosGrafic = new DefaultPieDataset();

        if (conn != null) {
            try {
                Statement st = conn.createStatement();
                String sql = "SELECT p.Tipo AS Tipo_Producto, SUM(v.CantidadP) AS Total_Vendidos FROM Producto p JOIN Venta_Producto vp ON p.IDProducto = vp.IDProducto JOIN Venta v ON vp.IDVenta = v.IDVenta GROUP BY p.Tipo";
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    String tipo = rs.getString("Tipo_Producto");
                    int totalVendidos = rs.getInt("Total_Vendidos");
                    datosGrafic.setValue(tipo, totalVendidos);
                    cantidadTipo[indice++] = totalVendidos;
                }
                rs.close();
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            JFreeChart grafo = ChartFactory.createPieChart(
                    "Distribución de tipos de productos vendidos",
                    datosGrafic,
                    true,
                    true,
                    false
            );

            /*JFreeChart chart = ChartFactory.createBarChart(
                    "Tipos de Productos Vendidos",
                    "Tipo de Producto",
                    "Cantidad Vendida",
                    datosGrafic,
                    PlotOrientation.VERTICAL,
                    true,
                    true,
                    false
            );*/
            try {
                int ancho = 600;
                int alto = 400;
                File imagen = new File(nombreArchivo);
                ChartUtilities.saveChartAsPNG(imagen, grafo, ancho, alto);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JCB_ReporteInventario;
    private javax.swing.JCheckBox JCB_ReporteUsuarios;
    private javax.swing.JCheckBox JCB_ReporteVentas;
    private javax.swing.JLabel JL_FondoReportesAdmin;
    private javax.swing.JLabel JL_ReporteInventario;
    private javax.swing.JLabel JL_ReporteUsuarios;
    private javax.swing.JLabel JL_ReporteVentas;
    private javax.swing.JTable JTB_ReportesRecientes;
    private javax.swing.JLabel NombreAdmin;
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
    private javax.swing.JTextArea txtDetallesReporteInventario;
    private javax.swing.JTextArea txtDetallesReporteUsuarios;
    private javax.swing.JTextArea txtDetallesReporteVentas;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
