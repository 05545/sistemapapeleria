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
    }

    private void cerrarConexion() {
        if (conexion != null) {
            conexion.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_Producto1 = new javax.swing.JLabel();
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
        btnConsultar = new javax.swing.JButton();
        JL_Producto2 = new javax.swing.JLabel();
        JL_VentasRecientes1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProductosMenos = new javax.swing.JTable();
        JL_Producto = new javax.swing.JLabel();
        JL_VentasRecientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductosMas = new javax.swing.JTable();
        NombreAdmin = new javax.swing.JLabel();
        JL_FondoVentasAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_Producto1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Producto1.setText("Vendedores con más ventas");
        getContentPane().add(JL_Producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 260, -1));

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
            tbVendedoresVentas.getColumnModel().getColumn(1).setResizable(false);
            tbVendedoresVentas.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 350, 190));

        btnTablero.setText("Tablero");
        btnTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableroMouseClicked(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        btnVentas.setText("Ventas");
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btnInventario.setText("Inventario");
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        btnUsuarios.setText("Usuarios");
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        btnProveedores.setText("Proveedores");
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        btnReportes.setText("Reportes");
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        btnSalir.setText("Cerrar sesión");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        JCB_Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        getContentPane().add(JCB_Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 150, -1));

        JCB_Anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024" }));
        getContentPane().add(JCB_Anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        txtTotal.setEditable(false);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 80, 30));

        btnConsultar.setText("Consultar");
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMouseClicked(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, -1, -1));

        JL_Producto2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Producto2.setText("Total vendidio:");
        getContentPane().add(JL_Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 260, -1));

        JL_VentasRecientes1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_VentasRecientes1.setText("Productos menos vendidos");
        getContentPane().add(JL_VentasRecientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, 260, -1));

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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 400, 350, 190));

        JL_Producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Producto.setText("Total de ventas por més");
        getContentPane().add(JL_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 260, -1));

        JL_VentasRecientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_VentasRecientes.setText("Productos más vendidos");
        getContentPane().add(JL_VentasRecientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 220, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 350, 190));
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 190, 63));
        getContentPane().add(JL_FondoVentasAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();

        this.setVisible(false);
        this.dispose();
        cerrarConexion();

        iniSesion.setVisible(true);
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

    public void cargarVendedoresMas() {

        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Total vendido");

        this.tbVendedoresVentas.setModel(tabla);

        if (conn != null) {
            try {
                String query = "SELECT IDVendedor, CONCAT(Nombre, AP, AM) AS Nombre, TotalVendido FROM TrabajadorMasDineroVendido";
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
    private javax.swing.JLabel JL_Producto;
    private javax.swing.JLabel JL_Producto1;
    private javax.swing.JLabel JL_Producto2;
    private javax.swing.JLabel JL_VentasRecientes;
    private javax.swing.JLabel JL_VentasRecientes1;
    private javax.swing.JLabel NombreAdmin;
    private javax.swing.JButton btnConsultar;
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
