/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author levd
 */
public class MDIprincipal extends javax.swing.JFrame {

    /**
     * Creates new form MDIprincipal
     */
    public MDIprincipal() {
        initComponents();
        
        ImageIcon icFacturas = new ImageIcon(getClass().getResource("/Imagenes/facturas.png"));
        Icon iconofac = new ImageIcon(icFacturas.getImage().getScaledInstance(100, 79, Image.SCALE_DEFAULT));
        btnFacturas.setIcon(iconofac);
        
        ImageIcon icRecibos = new ImageIcon(getClass().getResource("/Imagenes/recibos.png"));
        Icon iconorec = new ImageIcon(icRecibos.getImage().getScaledInstance(100, 75, Image.SCALE_DEFAULT));
        btnRecibos.setIcon(iconorec);
        
        
        ImageIcon icAlmacen = new ImageIcon(getClass().getResource("/Imagenes/Almacen.png"));
        Icon iconoalm = new ImageIcon(icAlmacen.getImage().getScaledInstance(100, 75, Image.SCALE_DEFAULT));
        btnAlmacen.setIcon(iconoalm);
        
        
        ImageIcon icFconsultas = new ImageIcon(getClass().getResource("/Imagenes/buscar.png"));
        Icon iconocon = new ImageIcon(icFconsultas.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        Mconsultas.setIcon(iconocon);
        
        
        ImageIcon icHerramientas = new ImageIcon(getClass().getResource("/Imagenes/opcion.png"));
        Icon iconoHerra = new ImageIcon(icHerramientas.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        Mherramientas.setIcon(iconoHerra);
        
        
        ImageIcon icDB = new ImageIcon(getClass().getResource("/Imagenes/basesdedatos.png"));
        Icon iconoDB = new ImageIcon(icDB.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        menuBD.setIcon(iconoDB);
        
        
        ImageIcon icreportes = new ImageIcon(getClass().getResource("/Imagenes/reportes.png"));
        Icon iconoreportes = new ImageIcon(icreportes.getImage().getScaledInstance(26, 26, Image.SCALE_DEFAULT));
        Mreportes.setIcon(iconoreportes);
        
        
        ImageIcon icdetallefactura = new ImageIcon(getClass().getResource("/Imagenes/detallefactura.png"));
        Icon iconodetallefactura = new ImageIcon(icdetallefactura.getImage().getScaledInstance(26, 26, Image.SCALE_DEFAULT));
        Mdetallefactura.setIcon(iconodetallefactura);
        
        
        ImageIcon icdetallerecibos = new ImageIcon(getClass().getResource("/Imagenes/detallerecibo.png"));
        Icon iconodetallerecibo = new ImageIcon(icdetallerecibos.getImage().getScaledInstance(26, 26, Image.SCALE_DEFAULT));
        Mdetallerecibo.setIcon(iconodetallerecibo);
        
        
        ImageIcon icMusuario = new ImageIcon(getClass().getResource("/Imagenes/usuario.jpg"));
        Icon iconoMusuario = new ImageIcon(icMusuario.getImage().getScaledInstance(26, 26, Image.SCALE_DEFAULT));
        Musuario.setIcon(iconoMusuario);
        
        
        ImageIcon icinformacion = new ImageIcon(getClass().getResource("/Imagenes/informacion.png"));
        Icon iconoinformacion = new ImageIcon(icinformacion.getImage().getScaledInstance(26, 26, Image.SCALE_DEFAULT));
        Minformacion.setIcon(iconoinformacion);
        
        ImageIcon icMseguridad = new ImageIcon(getClass().getResource("/Imagenes/copiaseguridad.png"));
        Icon iconoseguridad = new ImageIcon(icMseguridad.getImage().getScaledInstance(26, 26, Image.SCALE_DEFAULT));
        Mseguridad.setIcon(iconoseguridad);
        timer.start();
        
        ImageIcon icLinea = new ImageIcon(getClass().getResource("/Imagenes/lineas.png"));
        Icon iconolinea = new ImageIcon(icLinea.getImage().getScaledInstance(26, 26, Image.SCALE_DEFAULT));
        Mlineas.setIcon(iconolinea);
        timer.start();
        
        ImageIcon icProveedor = new ImageIcon(getClass().getResource("/Imagenes/proveedor.jpg"));
        Icon iconoProveedor = new ImageIcon(icProveedor.getImage().getScaledInstance(26, 26, Image.SCALE_DEFAULT));
        Mproveedor.setIcon(iconoProveedor);
        timer.start();
        
    }
        Timer timer = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Calendar cal = new GregorianCalendar();
                int hh, mm, ss, dia, mes, aa;
                hh=cal.get(Calendar.HOUR);
                mm=cal.get(Calendar.MINUTE);
                ss=cal.get(Calendar.SECOND);
                
                dia=cal.get(Calendar.DAY_OF_MONTH);
                mes=cal.get(Calendar.MONTH);
                aa=cal.get(Calendar.YEAR);
                
                lhora.setText(hh+":"+mm+":"+ss);
                lfecha.setText(dia+":"+(mes+1)+":"+aa);
                lhora.setEditable(false);
                lfecha.setEditable(false);
            }
        });    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnFacturas = new javax.swing.JButton();
        btnRecibos = new javax.swing.JButton();
        btnAlmacen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LBlusuario = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lfecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lhora = new javax.swing.JTextField();
        DpnEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Mconsultas = new javax.swing.JMenu();
        Mreportes = new javax.swing.JMenuItem();
        Mdetallefactura = new javax.swing.JMenuItem();
        Mdetallerecibo = new javax.swing.JMenuItem();
        Mherramientas = new javax.swing.JMenu();
        Minformacion = new javax.swing.JMenuItem();
        Musuario = new javax.swing.JMenuItem();
        Mlineas = new javax.swing.JMenuItem();
        Mproveedor = new javax.swing.JMenuItem();
        menuBD = new javax.swing.JMenu();
        Mseguridad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)), "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(51, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        btnFacturas.setBackground(new java.awt.Color(255, 255, 255));
        btnFacturas.setForeground(new java.awt.Color(0, 153, 204));
        btnFacturas.setText("Facturas");
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });

        btnRecibos.setBackground(new java.awt.Color(255, 255, 255));
        btnRecibos.setForeground(new java.awt.Color(0, 153, 204));
        btnRecibos.setText("Recibos");
        btnRecibos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibosActionPerformed(evt);
            }
        });

        btnAlmacen.setBackground(new java.awt.Color(255, 255, 255));
        btnAlmacen.setForeground(new java.awt.Color(0, 153, 204));
        btnAlmacen.setText("Almacen");
        btnAlmacen.setAutoscrolls(true);
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Usuario:");

        LBlusuario.setForeground(new java.awt.Color(0, 255, 255));

        lblhora.setForeground(new java.awt.Color(0, 255, 255));

        lblfecha.setBackground(new java.awt.Color(0, 255, 255));
        lblfecha.setForeground(new java.awt.Color(0, 255, 255));

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Fecha:");

        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Hora:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblfecha)
                .addGap(0, 135, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRecibos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(btnAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblhora)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LBlusuario)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lhora, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lfecha))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBlusuario)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblhora)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblfecha)
                .addContainerGap())
        );

        javax.swing.GroupLayout DpnEscritorioLayout = new javax.swing.GroupLayout(DpnEscritorio);
        DpnEscritorio.setLayout(DpnEscritorioLayout);
        DpnEscritorioLayout.setHorizontalGroup(
            DpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1023, Short.MAX_VALUE)
        );
        DpnEscritorioLayout.setVerticalGroup(
            DpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 255, 255));

        Mconsultas.setBackground(new java.awt.Color(255, 255, 255));
        Mconsultas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mconsultas.setText("Consultas");

        Mreportes.setBackground(new java.awt.Color(255, 255, 255));
        Mreportes.setText("Reportes");
        Mreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MreportesActionPerformed(evt);
            }
        });
        Mconsultas.add(Mreportes);

        Mdetallefactura.setText("Detalle de Factura");
        Mdetallefactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MdetallefacturaActionPerformed(evt);
            }
        });
        Mconsultas.add(Mdetallefactura);

        Mdetallerecibo.setText("Detalle de recibos");
        Mconsultas.add(Mdetallerecibo);

        jMenuBar1.add(Mconsultas);

        Mherramientas.setBackground(new java.awt.Color(255, 255, 255));
        Mherramientas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mherramientas.setText("Herramientas");

        Minformacion.setText("Informacion");
        Mherramientas.add(Minformacion);

        Musuario.setText("Usuario");
        Musuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusuarioActionPerformed(evt);
            }
        });
        Mherramientas.add(Musuario);

        Mlineas.setText("Lineas");
        Mlineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MlineasActionPerformed(evt);
            }
        });
        Mherramientas.add(Mlineas);

        Mproveedor.setText("Proveedores");
        Mproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MproveedorActionPerformed(evt);
            }
        });
        Mherramientas.add(Mproveedor);

        jMenuBar1.add(Mherramientas);

        menuBD.setBackground(new java.awt.Color(255, 255, 255));
        menuBD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuBD.setText("Base de datos");

        Mseguridad.setText("Copia de seguridad");
        Mseguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MseguridadActionPerformed(evt);
            }
        });
        menuBD.add(Mseguridad);

        jMenuBar1.add(menuBD);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DpnEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DpnEscritorio)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusuarioActionPerformed
        // TODO add your handling code here:
        FrmUsuarios usuarios = new FrmUsuarios();
        DpnEscritorio.add(usuarios);
        usuarios.show();
        usuarios.mostrarBuscar("");
        
    }//GEN-LAST:event_MusuarioActionPerformed

    private void MseguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MseguridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MseguridadActionPerformed

    private void btnRecibosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecibosActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        // TODO add your handling code here:
        FrmFacturas misfacturas = new FrmFacturas();
        DpnEscritorio.add(misfacturas);
        misfacturas.show();
//        misfacturas.mostarBuscar();
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void MreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MreportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MreportesActionPerformed

    private void MdetallefacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MdetallefacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MdetallefacturaActionPerformed

    private void MlineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MlineasActionPerformed
        // TODO add your handling code here:
        FrmLineas lineas = new FrmLineas();
        DpnEscritorio.add(lineas);
        lineas.show();
        lineas.mostrarBuscar("");
    }//GEN-LAST:event_MlineasActionPerformed

    private void MproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MproveedorActionPerformed
        // TODO add your handling code here:
        FrmProveedores proveedores = new FrmProveedores();
        DpnEscritorio.add(proveedores);
        proveedores.show();
        proveedores.mostrarBuscar("");
    }//GEN-LAST:event_MproveedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDIprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DpnEscritorio;
    private javax.swing.JLabel LBlusuario;
    private javax.swing.JMenu Mconsultas;
    private javax.swing.JMenuItem Mdetallefactura;
    private javax.swing.JMenuItem Mdetallerecibo;
    private javax.swing.JMenu Mherramientas;
    private javax.swing.JMenuItem Minformacion;
    private javax.swing.JMenuItem Mlineas;
    private javax.swing.JMenuItem Mproveedor;
    private javax.swing.JMenuItem Mreportes;
    private javax.swing.JMenuItem Mseguridad;
    private javax.swing.JMenuItem Musuario;
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnRecibos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JTextField lfecha;
    private javax.swing.JTextField lhora;
    private javax.swing.JMenu menuBD;
    // End of variables declaration//GEN-END:variables
}
