/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Usuarios;
import Logica.Lconexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author levd
 */

public final class FrmUsuarios extends javax.swing.JInternalFrame {
 java.sql.Connection con = Lconexion.GetConnection();
 
    PreparedStatement ps;
    ResultSet rs;

    public FrmUsuarios() {
        initComponents();
        txtId.setEnabled(false);
        limpiar();
        habilitar(true);
//        mostrarBuscar("");
    }
    public void limpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtUsuario.setText("");
        txtClave.setText("");
        txtConfirmarclave.setText("");
        cmbPerfil.setSelectedIndex(0);
    }
    public void habilitar(boolean b){
        txtNombre.setEnabled(!b);
        txtUsuario.setEnabled(!b);
        txtClave.setEnabled(!b);
        txtConfirmarclave.setEnabled(!b);
//        txtId.setEnabled(!b);
        cmbPerfil.setEnabled(!b);
        
        btnNuevo.setEnabled(b);
        btnEditar.setEnabled(!b);
        btnGuardar.setEnabled(!b);
        btnCancelar.setEnabled(!b);
        
    }
   public DefaultTableModel mostrarUsuario(Usuarios misUsuarios){
        DefaultTableModel miModelo=null;
        
        try{
            
            String SQL = "select * from tblusuarios";
            String titulos [] = {"Id","Nombre","Usuario","Clave","Perfil"};
            String dta [] = new String [5];
            miModelo = new DefaultTableModel(null,titulos);
//            CallableStatement cat = cn.prepareCall("select * from tblusuario");
//            cat.setString(1, misUsuarios.getUsuario());
            Statement st =con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()){
                dta[0] = rs.getString("idusuario");
                dta[1] = rs.getString("nombre");
                dta[2] = rs.getString("usuario");
                dta[3] = rs.getString("clave");
                dta[4] = rs.getString("perfil");
                miModelo.addRow(dta);
                
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        return miModelo;
    }
     private void filtro(String consulta, JTable tblUsuarios){
     DefaultTableModel dm = (DefaultTableModel) tblUsuarios.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        tblUsuarios.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
}
  
    public void mostrarBuscar(String usuario){
        DefaultTableModel miModelo;
//        lUsuarios fn = new lUsuarios();
        
        Usuarios fts = new Usuarios();
        fts.setUsuario(usuario);
        miModelo = mostrarUsuario(fts);
        tblUsuarios.setModel(miModelo);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        txtConfirmarclave = new javax.swing.JPasswordField();
        cmbPerfil = new javax.swing.JComboBox();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuarios");

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        jLabel1.setText("Id:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Usuario:");

        jLabel4.setText("Clave:");

        jLabel5.setText("Confirmar Clave:");

        jLabel6.setText("Perfil:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona un perfil", "Administrador", "Empleado", " " }));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario)
                            .addComponent(txtNombre)
                            .addComponent(txtClave)
                            .addComponent(txtConfirmarclave)
                            .addComponent(cmbPerfil, 0, 127, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtConfirmarclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultas"));
        jPanel2.setForeground(new java.awt.Color(51, 102, 255));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        habilitar(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        java.sql.Connection con = Lconexion.GetConnection();
        
        try{
            int filasec=tblUsuarios.getSelectedRow();
//            String dao = (String)tblUsuarios.getValueAt(filasec, 0);

          String clave = new String (txtClave.getPassword());
//        String perfil = String.valueOf(cmbPerfil.getSelectedItem());
            String SQL="UPDATE tblusuarios SET nombre=?, usuario=?, clave=?, perfil=? WHERE idusuario=?";
            PreparedStatement aa = con.prepareStatement(SQL);
//            aa.setString(0, txtId.getText());
            aa.setString(1, txtNombre.getText());
            aa.setString(2, txtUsuario.getText());
            aa.setString(3, clave);
            aa.setString(4, cmbPerfil.getSelectedItem().toString());
            aa.setString(5, txtId.getText());


            int res = aa.executeUpdate();
             mostrarBuscar("");
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Persona Modificada");
                limpiar();

            } else {
                 JOptionPane.showMessageDialog(null, "Error al Modificar persona");
                limpiar();

            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
        habilitar(false);
       
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (txtNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Campo nombre obligatorio", "validacion",JOptionPane.WARNING_MESSAGE);

            txtNombre.requestFocusInWindow();
            return;
        }
        if (txtUsuario.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Campo Usuario obligatorio", "validacion",JOptionPane.WARNING_MESSAGE);

            txtUsuario.requestFocusInWindow();
            return;
        }
         String clave = new String (txtClave.getPassword());
         String confirmar = new String (txtConfirmarclave.getPassword());
        if (clave.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Campo clave obligatorio", "validacion",JOptionPane.WARNING_MESSAGE);

            txtClave.requestFocusInWindow();
            return;
        }
        if (confirmar.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Campo confirma clave obligatorio", "validacion",JOptionPane.WARNING_MESSAGE);

            txtConfirmarclave.requestFocusInWindow();
            return;
        }
        if (!clave.equals(confirmar)) {
                JOptionPane.showMessageDialog(rootPane, "las contraseñas no coinciden", "validacion",JOptionPane.WARNING_MESSAGE);

            txtClave.requestFocusInWindow();
            txtClave.setText("");
            txtConfirmarclave.setText("");
            return;
        }
        if (cmbPerfil.getSelectedIndex()==0) {
                JOptionPane.showMessageDialog(rootPane, "Campo perfil obligatorio", "validacion",JOptionPane.WARNING_MESSAGE);

            cmbPerfil.requestFocusInWindow();
            System.out.println(cmbPerfil.requestFocusInWindow());
            return;
        }
//         Connection con = null;
        
        try{
            
//            con = GetConnection();
            String SQL="INSERT INTO tblusuarios(nombre, usuario, clave, perfil) VALUES (?,?,?,?)";
           
//            int filasec=tblUsuarios.getSelectedRow();
//            String dao=(String)tblUsuarios.getValueAt(filasec, 0);
            
            PreparedStatement ps =con.prepareStatement(SQL);
//            ps.setInt(1,Integer.parseInt( txtId.getText()));
            
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtUsuario.getText());
            ps.setString(3, txtClave.getText());
            ps.setString(4, (String) cmbPerfil.getSelectedItem());
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Usuario guardado");
                mostrarBuscar("");
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al guardado Usuario");
                limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
        limpiar();
        habilitar(true);
        

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        
        limpiar();
        habilitar(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        // TODO add your handling code here:
          java.sql.Connection con = Lconexion.GetConnection();

        int fila = tblUsuarios.getSelectedRow();
        txtId.setText(tblUsuarios.getValueAt(fila, 0).toString());
        txtNombre.setText(tblUsuarios.getValueAt(fila, 1).toString());
        txtUsuario.setText(tblUsuarios.getValueAt(fila, 2).toString());
        txtClave.setText(tblUsuarios.getValueAt(fila, 3).toString());
        txtConfirmarclave.setText(tblUsuarios.getValueAt(fila, 3).toString());
        cmbPerfil.setSelectedItem(tblUsuarios.getValueAt(fila, 4).toString());
        habilitar(false);
        mostrarBuscar("");

    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        java.sql.Connection con = Lconexion.GetConnection();

        try{
            
           
            ps = con.prepareStatement("DELETE FROM tblusuarios WHERE idusuario=?");
            ps.setInt(1, Integer.parseInt(txtId.getText()));
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Persona Eliminada");
        limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar persona");
        limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        mostrarBuscar("");

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
                  DefaultTableModel miModelo=null;
//     DefaultTableModel dm = (DefaultTableModel) tblLineas.getModel();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
//        tblLineas.setRowSorter(tr);
//        tr.setRowFilter(RowFilter.regexFilter(consulta));

     String[] titulos = {"Id","Nombre","Usuario","Clave","Perfil"};
        String[] registros = new String[50];
        String sql = "SELECT *FROM tblusuarios WHERE idusuario LIKE '%" + txtBuscar.getText() + "%' "
                + "OR nombre LIKE '%" + txtBuscar.getText() + "%'"
                + "OR usuario LIKE '%" + txtBuscar.getText() + "%'"
                + "OR clave LIKE '%" + txtBuscar.getText() + "%'"
               + "OR perfil LIKE '%" + txtBuscar.getText() + "%'";
        miModelo = new DefaultTableModel(null, titulos);
        java.sql.Connection cc = Lconexion.GetConnection();
//        Connection conect = cc.conexion();
        try {
            Statement st =con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idusuario");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("usuario");
                registros[3] = rs.getString("clave");
                registros[4] = rs.getString("perfil");
                miModelo.addRow(registros);
            }
            tblUsuarios.setModel(miModelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
         
    }//GEN-LAST:event_txtBuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JPasswordField txtConfirmarclave;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
