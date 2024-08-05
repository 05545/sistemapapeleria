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
        JL_TRegistroProducto = new javax.swing.JLabel();
        JL_Producto = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        JL_Cale = new javax.swing.JLabel();
        JL_CodigoP = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        JL_Correo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResultados = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JL_Numero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        JL_Colonia1 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        JL_Telefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        JL_FondoProovedoresAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 40, 30));

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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, -1));

        NombreAdmin.setText("Nombre usuario");
        getContentPane().add(NombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 190, 63));

        JL_TRegistroProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_TRegistroProducto.setText("Proveedores");
        getContentPane().add(JL_TRegistroProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        JL_Producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Producto.setText("Nombre del proveedor");
        getContentPane().add(JL_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 210, -1));

        txtNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 340, 40));

        JL_Cale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Cale.setText("Calle");
        getContentPane().add(JL_Cale, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        JL_CodigoP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_CodigoP.setText("Código Postal");
        getContentPane().add(JL_CodigoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, 30));

        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });
        getContentPane().add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 200, 40));

        JL_Correo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Correo.setText("Correo");
        getContentPane().add(JL_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 70, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 350, 40));

        btnRegistrar.setText("Registrar");
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
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 630, 150, 50));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 630, 150, 50));

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 640, 120, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, 120, 40));

        tbResultados.setBackground(new java.awt.Color(255, 255, 255));
        tbResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 350, 170));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, 310, 30));

        txtCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoPostalActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 130, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Consulta de proovedores");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, -1));

        JL_Numero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Numero.setText("Número");
        getContentPane().add(JL_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, -1, 30));

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 130, 40));

        JL_Colonia1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Colonia1.setText("Colonia");
        getContentPane().add(JL_Colonia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 70, -1));
        getContentPane().add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 180, 40));

        JL_Telefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL_Telefono.setText("Teléfono");
        getContentPane().add(JL_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 110, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 180, 40));
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
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        String nombreProveedor = txtNombreProveedor.getText();
        String calle = txtCalle.getText();
        String numero = txtNumero.getText();
        String colonia = txtColonia.getText();
        String codigoPostal = txtCodigoPostal.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();

        int CP = 0;

        if (nombreProveedor.isEmpty() || calle.isEmpty() || numero.isEmpty() || colonia.isEmpty() || codigoPostal.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser llenados.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            CP = Integer.parseInt(txtCodigoPostal.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Código Postal inválido. Ingresa solo números");
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
    private javax.swing.JLabel JL_Cale;
    private javax.swing.JLabel JL_CodigoP;
    private javax.swing.JLabel JL_Colonia1;
    private javax.swing.JLabel JL_Correo;
    private javax.swing.JLabel JL_FondoProovedoresAdmin;
    private javax.swing.JLabel JL_Numero;
    private javax.swing.JLabel JL_Producto;
    private javax.swing.JLabel JL_TRegistroProducto;
    private javax.swing.JLabel JL_Telefono;
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
    private javax.swing.JLabel jLabel5;
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
