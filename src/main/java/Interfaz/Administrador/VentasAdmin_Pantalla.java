package Interfaz.Administrador;

import Interfaz.*;
import Logic.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentasAdmin_Pantalla extends javax.swing.JFrame {

    Connection conn;
    Conexion conexion;
    String usuario, nomUsuario;

    public VentasAdmin_Pantalla(Conexion conexion, Connection connection, String usuario, String nomUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.conexion = conexion;
        this.conn = connection;
        this.usuario = usuario;
        this.nomUsuario = nomUsuario;
        NombreAdmin.setText(usuario);

        cargarVendedoresMas();
        productosMas();
        productosMenos();

        //Propiedades de la tabla vendedores con más ventas
        tbVendedoresVentas.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbVendedoresVentas.getColumnModel().getColumn(1).setPreferredWidth(120);
        tbVendedoresVentas.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbVendedoresVentas.setDefaultEditor(Object.class, null);
        tbVendedoresVentas.getTableHeader().setResizingAllowed(false);

        //Propiedades de la tabla productos más vendidos
        tbProductosMas.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbProductosMas.getColumnModel().getColumn(1).setPreferredWidth(120);
        tbProductosMas.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbProductosMas.setDefaultEditor(Object.class, null);
        tbProductosMas.getTableHeader().setResizingAllowed(false);

        //Propiedades de la tabla productos menos vendidos
        tbProductosMenos.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbProductosMenos.getColumnModel().getColumn(1).setPreferredWidth(120);
        tbProductosMenos.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbProductosMenos.setDefaultEditor(Object.class, null);
        tbProductosMenos.getTableHeader().setResizingAllowed(false);
    }

    private void cerrarConexion() {
        if (conexion != null) {
            conexion.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbVendedoresVentas = new javax.swing.JTable();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        JCB_Mes = new javax.swing.JComboBox<>();
        JCB_Anio = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProductosMenos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductosMas = new javax.swing.JTable();
        NombreAdmin = new javax.swing.JLabel();
        JL_FondoVentasAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbVendedoresVentas.setBackground(new java.awt.Color(255, 255, 255));
        tbVendedoresVentas.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        tbVendedoresVentas.setForeground(new java.awt.Color(51, 51, 51));
        tbVendedoresVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Total vendido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVendedoresVentas.setRowHeight(40);
        jScrollPane2.setViewportView(tbVendedoresVentas);
        if (tbVendedoresVentas.getColumnModel().getColumnCount() > 0) {
            tbVendedoresVentas.getColumnModel().getColumn(0).setResizable(false);
            tbVendedoresVentas.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbVendedoresVentas.getColumnModel().getColumn(1).setResizable(false);
            tbVendedoresVentas.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbVendedoresVentas.getColumnModel().getColumn(2).setResizable(false);
            tbVendedoresVentas.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 350, 190));

        btnTablero.setBorder(null);
        btnTablero.setContentAreaFilled(false);
        btnTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableroMouseClicked(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, 30));

        btnVentas.setBorder(null);
        btnVentas.setContentAreaFilled(false);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, 30));

        btnInventario.setBorder(null);
        btnInventario.setContentAreaFilled(false);
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 140, 30));

        btnUsuarios.setBorder(null);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 140, 30));

        btnProveedores.setBorder(null);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 140, 30));

        btnReportes.setBorder(null);
        btnReportes.setContentAreaFilled(false);
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 140, 30));

        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 170, 30));

        JCB_Mes.setBackground(new java.awt.Color(189, 189, 189));
        JCB_Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        JCB_Mes.setBorder(null);
        getContentPane().add(JCB_Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 525, 120, 30));

        JCB_Anio.setBackground(new java.awt.Color(189, 189, 189));
        JCB_Anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024" }));
        JCB_Anio.setBorder(null);
        getContentPane().add(JCB_Anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 525, 110, 30));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(189, 189, 189));
        txtTotal.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(51, 51, 51));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(null);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 130, 40));

        jLabel1.setBackground(new java.awt.Color(189, 189, 189));
        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Total vendido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 140, 40));

        btnConsultar.setBorder(null);
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMouseClicked(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 50, 40));

        tbProductosMenos.setBackground(new java.awt.Color(255, 255, 255));
        tbProductosMenos.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        tbProductosMenos.setForeground(new java.awt.Color(51, 51, 51));
        tbProductosMenos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Producto", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProductosMenos.setRowHeight(40);
        jScrollPane3.setViewportView(tbProductosMenos);
        if (tbProductosMenos.getColumnModel().getColumnCount() > 0) {
            tbProductosMenos.getColumnModel().getColumn(0).setResizable(false);
            tbProductosMenos.getColumnModel().getColumn(1).setResizable(false);
            tbProductosMenos.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 400, 190));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        tbProductosMas.setBackground(new java.awt.Color(255, 255, 255));
        tbProductosMas.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        tbProductosMas.setForeground(new java.awt.Color(51, 51, 51));
        tbProductosMas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Producto", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProductosMas.setRowHeight(40);
        jScrollPane1.setViewportView(tbProductosMas);
        if (tbProductosMas.getColumnModel().getColumnCount() > 0) {
            tbProductosMas.getColumnModel().getColumn(0).setResizable(false);
            tbProductosMas.getColumnModel().getColumn(1).setResizable(false);
            tbProductosMas.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 380, 190));

        NombreAdmin.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        NombreAdmin.setForeground(new java.awt.Color(51, 51, 51));
        NombreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 250, 20));

        JL_FondoVentasAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/Pantalla_Ventas_Administrador.png"))); // NOI18N
        getContentPane().add(JL_FondoVentasAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

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

    private void btnTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTableroMouseClicked
        this.setVisible(false);
        this.dispose();

        InicioAdmin_Pantalla iniAdmin = new InicioAdmin_Pantalla(conexion, conn, nomUsuario);
        iniAdmin.setVisible(true);
        iniAdmin.setLocationRelativeTo(null);
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

    private void btnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseClicked
        String anio = (String) JCB_Anio.getSelectedItem();
        String mes = (String) JCB_Mes.getSelectedItem();

        int anioN = 0;
        try {
            anioN = Integer.parseInt(anio);
        } catch (NumberFormatException e) {
            System.out.println("El año seleccionado no es un número válido: " + anio);
            return;
        }

        int numeroMes;
        try {
            numeroMes = obtenerMes(mes);
            if (conn != null) {
                try {
                    String query = "CALL ObtenerVentasPorMes(?, ?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setInt(1, anioN);
                    ps.setInt(2, numeroMes);
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        txtTotal.setText(rs.getString("TotalVentas"));
                    } else {
                        txtTotal.setText("");
                    }

                    rs.close();
                    ps.close();

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
    }//GEN-LAST:event_btnConsultarMouseClicked

    private void cargarVendedoresMas() {

        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Total vendido");

        this.tbVendedoresVentas.setModel(tabla);

        if (conn != null) {
            try {
                String query = "SELECT IDVendedor, CONCAT(Nombre,' ', AP,' ', AM) AS Nombre, TotalVendido FROM masvendido";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String[] rowData = {
                        rs.getString("IDVendedor"),
                        rs.getString("Nombre"),
                        rs.getString("TotalVendido")
                    };
                    tabla.addRow(rowData);
                }

                rs.close();
                ps.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }

    }

    public void productosMas() {

        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Producto");
        tabla.addColumn("Cantidad");

        this.tbProductosMas.setModel(tabla);

        if (conn != null) {
            try {
                String query = "SELECT * FROM MasVendidos";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String[] rowData = {
                        rs.getString("IDProducto"),
                        rs.getString("Nombre"),
                        rs.getString("CantidadVendida")
                    };
                    tabla.addRow(rowData);
                }

                rs.close();
                ps.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }

    }

    public void productosMenos() {

        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Producto");
        tabla.addColumn("Cantidad");

        this.tbProductosMenos.setModel(tabla);

        if (conn != null) {
            try {
                String query = "SELECT * FROM MenosVendidos";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String[] rowData = {
                        rs.getString("IDProducto"),
                        rs.getString("Nombre"),
                        rs.getString("CantidadVendida")
                    };
                    tabla.addRow(rowData);
                }

                rs.close();
                ps.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }

    }

    private int obtenerMes(String nombreMes) {
        Map<String, Integer> mesMap = new HashMap<>();
        mesMap.put("ENERO", 1);
        mesMap.put("FEBRERO", 2);
        mesMap.put("MARZO", 3);
        mesMap.put("ABRIL", 4);
        mesMap.put("MAYO", 5);
        mesMap.put("JUNIO", 6);
        mesMap.put("JULIO", 7);
        mesMap.put("AGOSTO", 8);
        mesMap.put("SEPTIEMBRE", 9);
        mesMap.put("OCTUBRE", 10);
        mesMap.put("NOVIEMBRE", 11);
        mesMap.put("DICIEMBRE", 12);

        Integer numeroMes = mesMap.get(nombreMes);

        if (numeroMes != null) {
            return numeroMes;
        } else {
            throw new IllegalArgumentException("Mes inválido: " + nombreMes);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCB_Anio;
    private javax.swing.JComboBox<String> JCB_Mes;
    private javax.swing.JLabel JL_FondoVentasAdmin;
    private javax.swing.JLabel NombreAdmin;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbProductosMas;
    private javax.swing.JTable tbProductosMenos;
    private javax.swing.JTable tbVendedoresVentas;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
