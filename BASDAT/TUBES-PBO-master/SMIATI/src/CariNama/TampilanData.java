/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CariNama;

import java.sql.Statement;
import java.util.*;
import javax.swing.JOptionPane;
import SMIATI.*;



/**
 *
 * @author Windows 10
 */
public class TampilanData extends javax.swing.JFrame {
    String n;
    namacari alm =new namacari();
    
   //String s1=String.join(" ", alm.carinama.keySet().);
        
            /**
     * Creates new form TampilanData
     */
    public TampilanData() {
        initComponents();
        
        this.setLocation(0,0);
    }
    
    public void getNama(){
        n = tulis.getText();
        
        
    }
    public void tampilkan(){
        
        getNama();
       
        try{
        
        String s= String.valueOf(alm.carinama.get(n).ipk);
      
        nama.setText(alm.carinama.get(n).nama);
        nim.setText(alm.carinama.get(n).nim);
        thn.setText(alm.carinama.get(n).thn);
        kp.setText(alm.carinama.get(n).kp);
        ipk.setText(s);
        rker.setText(alm.carinama.get(n).rkerja);
        ta.setText(alm.carinama.get(n).ta);
        email.setText(alm.carinama.get(n).email);
             
           
        } catch (java.lang.NullPointerException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan!!!");
            System.out.println(e);
            System.out.println();
        } 
       
    }
    public void reset (){
        tulis.setText("");
    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlable = new javax.swing.JLabel();
        jLaBle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        nim = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tulis = new javax.swing.JTextField();
        thn = new javax.swing.JLabel();
        kp = new javax.swing.JLabel();
        ipk = new javax.swing.JLabel();
        rker = new javax.swing.JLabel();
        ta = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nama                           ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 78, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nim                              ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 98, 180, -1));

        jlable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlable.setText("Tahun Lulus                ");
        getContentPane().add(jlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 118, 210, -1));

        jLaBle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLaBle.setText("Tempat KP                  ");
        getContentPane().add(jLaBle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 138, 210, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("IPK                              ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 158, 250, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Riwayat Kerja             ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 178, 220, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Judul TA                       ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 198, 220, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("email                            ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 218, 220, -1));

        nama.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 78, 1653, 14));

        nim.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 98, 1653, 14));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Masukkan Nama Alumni");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, 210, -1));

        tulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tulisActionPerformed(evt);
            }
        });
        getContentPane().add(tulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 256, -1));

        thn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(thn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 118, 1653, 14));

        kp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(kp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 138, 1653, 14));

        ipk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(ipk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 158, 1653, 14));

        rker.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rker.setText(" ");
        getContentPane().add(rker, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 178, 1653, -1));

        ta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ta.setText(" ");
        getContentPane().add(ta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 198, 1653, -1));

        email.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        email.setText(" ");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 218, 1653, -1));

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton1.setText("Kembali");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 272, -1, -1));

        search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        search.setText("cari");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/(2).jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void tulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tulisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tulisActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        tampilkan();
                
        reset();
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(TampilanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private javax.swing.JLabel ipk;
    private javax.swing.JLabel jLaBle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel jlable;
    private javax.swing.JLabel kp;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nim;
    private javax.swing.JLabel rker;
    private javax.swing.JButton search;
    private javax.swing.JLabel ta;
    private javax.swing.JLabel thn;
    private javax.swing.JTextField tulis;
    // End of variables declaration//GEN-END:variables
}
