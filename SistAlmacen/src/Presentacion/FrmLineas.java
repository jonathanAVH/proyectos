/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Lineas;

import Logica.Lconexion;
import java.sql.Connection;
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
public class FrmLineas extends javax.swing.JInternalFrame {
java.sql.Connection con = Lconexion.GetConnection();
PreparedStatement ps;
ResultSet rs;
    /**
     * Creates new form FrmLineas
     */
     
    public FrmLineas() {
        initComponents();
        habilitar (true);
        txtId.setEnabled(false);
    }
    public void limpiar(){
        txtId.setText("");
        txtLineas.setText("");
    }
    public void habilitar(boolean b){
        btnNuevo.setEnabled(!b);
        btnActualizar.setEnabled(!b);
        btnGuardar.setEnabled(b);
        btnCancelar.setEnabled(b);
       
        txtLineas.setEnabled(b);
    }
    public DefaultTableModel mostrarlineas(Lineas mislineas){
        DefaultTableModel miModelo=null;
        
        try{
            
            String SQL = "select * from tbllineas";
            String titulos [] = {"Id","lineas"};
            String dta [] = new String [2];
            miModelo = new DefaultTableModel(null,titulos);
//            CallableStatement cat = cn.prepareCall("select * from tblusuario");
//            cat.setString(1, misUsuarios.getUsuario());
            Statement st =con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()){
                dta[0] = rs.getString("idlineas");
                dta[1] = rs.getString("lineas");
         
                miModelo.addRow(dta);
                
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        return miModelo;
    }
    public void mostrarBuscar(String lineas){
        DefaultTableModel miModelo;
//        lUsuarios fn = new lUsuarios();
        
        Lineas fts = new Lineas();
        fts.setLinea(lineas);
        miModelo = mostrarlineas(fts);
        tblLineas.setModel(miModelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLineas = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtLineas = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tblLineas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblLineas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLineasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLineas);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 204, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda");
        jLabel3.setToolTipText("");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 102, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lineas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLineas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
               java.sql.Connection con = Lconexion.GetConnection();

       if (txtLineas.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Campo lineas obligatorio", "validacion",JOptionPane.WARNING_MESSAGE);

            txtLineas.requestFocusInWindow();
            return;
        }
        try{
            
//            con = GetConnection();
            String SQL="INSERT INTO tbllineas(lineas) VALUES (?)";
           
//            int filasec=tblUsuarios.getSelectedRow();
//            String dao=(String)tblUsuarios.getValueAt(filasec, 0);
            
            PreparedStatement ps =con.prepareStatement(SQL);
//            ps.setInt(1,Integer.parseInt( txtId.getText()));
            
            ps.setString(1, txtLineas.getText());
           
            int res = ps.executeUpdate();
            mostrarBuscar("");
            if(res > 0){
                JOptionPane.showMessageDialog(null, "linea guardado");
                
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al linea Usuario");
                limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        habilitar (false);
        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
       java.sql.Connection con = Lconexion.GetConnection();
        
        try{
            
//            String dao = (String)tblUsuarios.getValueAt(filasec, 0);

//        String perfil = String.valueOf(cmbPerfil.getSelectedItem());
            String SQL="UPDATE tbllineas SET lineas=? WHERE idlineas=?";
            PreparedStatement aa = con.prepareStatement(SQL);
//            aa.setString(0, txtId.getText());
            aa.setString(1, txtLineas.getText());
            aa.setString(2, txtId.getText());


            int res = aa.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "linea Modificada");
                limpiar();

            } else {
                 JOptionPane.showMessageDialog(null, "Error al Modificar la linea");
                limpiar();

            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        habilitar(false);
        mostrarBuscar("");

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        java.sql.Connection con = Lconexion.GetConnection();

        try{
            
           
            ps = con.prepareStatement("DELETE FROM tbllineas WHERE idlineas=?");
            ps.setInt(1, Integer.parseInt(txtId.getText()));
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "linea Eliminada");
        limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al linea persona");
        limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        mostrarBuscar("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here
        
        habilitar(false);
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        habilitar (true);
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tblLineasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLineasMouseClicked
        // TODO add your handling code here:
        java.sql.Connection con = Lconexion.GetConnection();

        int fila = tblLineas.getSelectedRow();
        txtId.setText(tblLineas.getValueAt(fila, 0).toString());
        txtLineas.setText(tblLineas.getValueAt(fila, 1).toString());
       
        txtLineas.setEnabled(true);
        btnActualizar.setEnabled(true);
        mostrarBuscar("");
        
        
    }//GEN-LAST:event_tblLineasMouseClicked

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        // TODO add your handling code here:
//    filtro(txtFiltro.getText().toUpperCase(), tblLineas);
       DefaultTableModel miModelo=null;
//     DefaultTableModel dm = (DefaultTableModel) tblLineas.getModel();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
//        tblLineas.setRowSorter(tr);
//        tr.setRowFilter(RowFilter.regexFilter(consulta));

     String[] titulos = {"Id","lineas"};
        String[] registros = new String[50];
        String sql = "SELECT *FROM tbllineas WHERE idlineas LIKE '%" + txtFiltro.getText() + "%' "
                + "OR lineas LIKE '%" + txtFiltro.getText() + "%'";
               
        miModelo = new DefaultTableModel(null, titulos);
        java.sql.Connection cc = Lconexion.GetConnection();
//        Connection conect = cc.conexion();
        try {
            Statement st =con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idlineas");
                registros[1] = rs.getString("lineas");
             
                miModelo.addRow(registros);
            }
            tblLineas.setModel(miModelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_txtFiltroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLineas;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLineas;
    // End of variables declaration//GEN-END:variables

}