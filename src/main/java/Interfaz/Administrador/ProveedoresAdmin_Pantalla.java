package Interfaz.Administrador;

import Logic.*;
import Interfaz.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProveedoresAdmin_Pantalla extends javax.swing.JFrame {

    Connection conn;
    Conexion conexion;
    String nomUsuario;
    String usuario;

    int idProveedor = 0;

    public ProveedoresAdmin_Pantalla(Conexion conexion, Connection connection, String usuario, String nomUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.conexion = conexion;
        this.conn = connection;
        this.usuario = usuario;
        this.nomUsuario = nomUsuario;
        NombreAdmin.setText(usuario);

        tbResultados.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbResultados.getColumnModel().getColumn(1).setPreferredWidth(95);
        tbResultados.getColumnModel().getColumn(2).setPreferredWidth(95);
        tbResultados.setDefaultEditor(Object.class, null);
        tbResultados.getTableHeader().setResizingAllowed(false);
    }

    private void cerrarConexion() {
        if (conexion != null) {
            conexion.cerrarConexion(); // Llamar a cerrarConexion de la instancia de Conexion
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnTablero = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        NombreAdmin = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResultados = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        JL_FondoProovedoresAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 30, 30));

        btnTablero.setBorder(null);
        btnTablero.setContentAreaFilled(false);
        btnTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableroMouseClicked(evt);
            }
        });
        getContentPane().add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, 30));

        btnVentas.setBorder(null);
        btnVentas.setContentAreaFilled(false);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, 30));

        btnInventario.setBorder(null);
        btnInventario.setContentAreaFilled(false);
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 120, 30));

        btnUsuarios.setBorder(null);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 110, 30));

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
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 110, 30));

        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 170, 20));

        NombreAdmin.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        NombreAdmin.setForeground(new java.awt.Color(51, 51, 51));
        NombreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 230, 20));

        txtNombreProveedor.setBackground(new java.awt.Color(189, 189, 189));
        txtNombreProveedor.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtNombreProveedor.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreProveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreProveedor.setBorder(null);
        txtNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 142, 380, 30));

        txtCalle.setBackground(new java.awt.Color(189, 189, 189));
        txtCalle.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtCalle.setForeground(new java.awt.Color(0, 0, 0));
        txtCalle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCalle.setBorder(null);
        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });
        getContentPane().add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 180, 30));

        txtCorreo.setBackground(new java.awt.Color(189, 189, 189));
        txtCorreo.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreo.setBorder(null);
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 370, 36));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnLimpiar.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, 190, 60));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnRegistrar.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 200, 60));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnEditar.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 540, 200, 60));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/btnEliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 200, 50));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setOpaque(false);

        tbResultados.setBackground(new java.awt.Color(255, 255, 255));
        tbResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbResultados.setRowHeight(40);
        tbResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbResultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbResultados);
        if (tbResultados.getColumnModel().getColumnCount() > 0) {
            tbResultados.getColumnModel().getColumn(0).setResizable(false);
            tbResultados.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbResultados.getColumnModel().getColumn(1).setResizable(false);
            tbResultados.getColumnModel().getColumn(1).setPreferredWidth(95);
            tbResultados.getColumnModel().getColumn(2).setResizable(false);
            tbResultados.getColumnModel().getColumn(2).setPreferredWidth(95);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 340, 350, 110));

        txtBuscar.setBackground(new java.awt.Color(214, 214, 214));
        txtBuscar.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setBorder(null);
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 300, 30));

        txtCodigoPostal.setBackground(new java.awt.Color(189, 189, 189));
        txtCodigoPostal.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtCodigoPostal.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigoPostal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigoPostal.setBorder(null);
        txtCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoPostalActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 140, 30));

        txtNumero.setBackground(new java.awt.Color(189, 189, 189));
        txtNumero.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNumero.setBorder(null);
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 140, 30));

        txtColonia.setBackground(new java.awt.Color(189, 189, 189));
        txtColonia.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtColonia.setForeground(new java.awt.Color(0, 0, 0));
        txtColonia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtColonia.setBorder(null);
        getContentPane().add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 180, 36));

        txtTelefono.setBackground(new java.awt.Color(189, 189, 189));
        txtTelefono.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono.setBorder(null);
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 110, 40));

        JL_FondoProovedoresAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/Pantalla_Proveedores_Administrador.png"))); // NOI18N
        getContentPane().add(JL_FondoProovedoresAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();

        this.setVisible(false);
        this.dispose();
        cerrarConexion();

        iniSesion.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void txtNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProveedorActionPerformed

    }//GEN-LAST:event_txtNombreProveedorActionPerformed

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed

    }//GEN-LAST:event_txtCalleActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoPostalActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

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

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String parametroBusqueda = txtBuscar.getText();

        if (parametroBusqueda.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ningún parámetro en el campo de busqueda.");
            return;
        }

        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Dirección");

        tbResultados.setModel(tabla);

        if (conn != null) {
            try {
                String query = "SELECT IDGerente, Proveedor, CONCAT(Calle, Numero, Colonia) AS Direccion FROM Proveedor WHERE Proveedor LIKE ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, "%" + parametroBusqueda + "%");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String[] rowData = {
                        rs.getString("IDGerente"),
                        rs.getString("Proveedor"),
                        rs.getString("Direccion")
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
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void tbResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbResultadosMouseClicked
        int fila = this.tbResultados.getSelectedRow();

        if (fila >= 0) {
            try {
                idProveedor = Integer.parseInt(this.tbResultados.getValueAt(fila, 0).toString());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            cargarDatosElementos(idProveedor);
        }

    }//GEN-LAST:event_tbResultadosMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked

        System.out.println("ID del proveedor: " + idProveedor);
        if (idProveedor < 1) {
            JOptionPane.showMessageDialog(null, "Primero selecciona algún campo de la tabla de búsqueda.");
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar el proveedor con ID " + idProveedor + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                if (conn != null) {
                    try {
                        String query = "DELETE FROM Proveedor WHERE IDGerente = ?";
                        PreparedStatement ps = conn.prepareStatement(query);
                        ps.setInt(1, idProveedor);

                        JOptionPane.showMessageDialog(null, "Se ha eliminado el registro correctamente");
                        int columEliminadas = ps.executeUpdate();
                        System.out.println("Filas afectadas: " + columEliminadas);

                        ps.close();
                        limpiar();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("No se pudo conectar a la base de datos.");
                }
            } else {
                System.out.println("Eliminación cancelada.");
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        btnRegistrar.setEnabled(true);

        limpiar();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        String nombreProveedor = txtNombreProveedor.getText();
        String calle = txtCalle.getText();
        String numero = txtNumero.getText();
        String colonia = txtColonia.getText();
        String codigoPostal = txtCodigoPostal.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();

        if (idProveedor < 1) {
            JOptionPane.showMessageDialog(null, "Primero selecciona algún campo de la tabla de búsqueda.");
        } else {
            int CP = 0;

            try {
                CP = Integer.parseInt(txtCodigoPostal.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Código Postal inválido. Ingresa solo números");
                return;
            }

            if (nombreProveedor.isEmpty() || calle.isEmpty() || numero.isEmpty() || colonia.isEmpty() || codigoPostal.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos deben ser llenados.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas actualizar el proveedor con ID " + idProveedor + "?", "Confirmar Actualización", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                if (conn != null) {
                    try {
                        String query = "UPDATE Proveedor SET Proveedor = ?, Calle = ?, Numero = ?, Colonia = ?, CP = ?, Correo = ?, Telefono = ? WHERE IDGerente = ?";
                        PreparedStatement ps = conn.prepareStatement(query);
                        ps.setString(1, nombreProveedor);
                        ps.setString(2, calle);
                        ps.setString(3, numero);
                        ps.setString(4, colonia);
                        ps.setInt(5, CP);
                        ps.setString(6, correo);
                        ps.setString(7, telefono);
                        ps.setInt(8, idProveedor);

                        JOptionPane.showMessageDialog(null, "Se ha actualiado el registro correctamente");
                        int columEliminadas = ps.executeUpdate();
                        System.out.println("Filas afectadas: " + columEliminadas);

                        ps.close();
                        limpiar();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("No se pudo conectar a la base de datos.");
                }
            } else {
                System.out.println("Actualización cancelada.");
            }
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        String nombreProveedor = txtNombreProveedor.getText();
        String calle = txtCalle.getText();
        String numero = txtNumero.getText();
        String colonia = txtColonia.getText();
        String codigoPostal = txtCodigoPostal.getText().trim();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();

        int CP = 0;

        if (nombreProveedor.isEmpty() || calle.isEmpty() || numero.isEmpty() || colonia.isEmpty() || codigoPostal.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser llenados.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Verifica que el código postal contiene solo dígitos
            if (codigoPostal.matches("\\d+")) {
                CP = Integer.parseInt(codigoPostal);
                System.out.println("" + CP);
            } else {
                throw new NumberFormatException(); // Lanza una excepción si contiene caracteres no numéricos
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Código Postal inválido. Ingresa solo números", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas ingresar el proveedor con ID " + idProveedor + "?", "Confirmar Actualización", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            if (conn != null) {
                try {
                    String query = "CALL RegistrarProveedor(?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, nombreProveedor);
                    ps.setString(2, calle);
                    ps.setString(3, numero);
                    ps.setString(4, colonia);
                    ps.setInt(5, CP);
                    ps.setString(6, correo);
                    ps.setString(7, telefono);

                    JOptionPane.showMessageDialog(null, "Se ha actualiado el registro correctamente");
                    int columEliminadas = ps.executeUpdate();
                    System.out.println("Filas afectadas: " + columEliminadas);

                    ps.close();
                    limpiar();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("No se pudo conectar a la base de datos.");
            }
        } else {
            System.out.println("Actualización cancelada.");
        }
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void cargarDatosElementos(int id) {
        btnRegistrar.setEnabled(false);

        if (conn != null) {
            try {
                String query = "SELECT * FROM Proveedor WHERE IDGerente = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    txtNombreProveedor.setText(rs.getString("Proveedor"));
                    txtCalle.setText(rs.getString("Calle"));
                    txtNumero.setText(rs.getString("Numero"));
                    txtColonia.setText(rs.getString("Colonia"));
                    txtCodigoPostal.setText(rs.getString("CP"));
                    txtCorreo.setText(rs.getString("Correo"));
                    txtTelefono.setText(rs.getString("Telefono"));
                }

                rs.close();
                ps.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void limpiar() {
        DefaultTableModel tabla = (DefaultTableModel) tbResultados.getModel();
        tabla.setRowCount(0);
        txtNombreProveedor.setText("");
        txtCalle.setText("");
        txtNumero.setText("");
        txtColonia.setText("");
        txtCodigoPostal.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtBuscar.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_FondoProovedoresAdmin;
    private javax.swing.JLabel NombreAdmin;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbResultados;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * Hecho por: Rodrigo Sosa Romero Ernesto García Nolazco Rosaisela Perez Morales
 * Elizabeth Maravillas Tzompantzi
 */
