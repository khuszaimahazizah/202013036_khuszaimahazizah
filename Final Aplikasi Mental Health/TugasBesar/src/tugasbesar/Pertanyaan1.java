/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Pertanyaan1 extends javax.swing.JFrame {

    /**
     * Creates new form Pertanyaan1
     */
    public Pertanyaan1() {
        this.setUndecorated(true);
        initComponents();
        initLevel0();
    }
    private void initLevel0(){
        setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        mboh = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pilihan3 = new javax.swing.JComboBox<>();
        pilihan1 = new javax.swing.JComboBox<>();
        pilihan2 = new javax.swing.JComboBox<>();
        pilihan4 = new javax.swing.JComboBox<>();
        pilihan5 = new javax.swing.JComboBox<>();
        pilihan6 = new javax.swing.JComboBox<>();
        pilihan7 = new javax.swing.JComboBox<>();
        pilihan8 = new javax.swing.JComboBox<>();
        pilihan9 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Periksa = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        jLabel16.setText("masalah");

        mboh.setText("jLabel21");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasbesar/Pertanyaan.PNG"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(431, 640));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pilihan3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Ya", "Tidak", "Biasa Aja" }));
        getContentPane().add(pilihan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 130, -1));

        pilihan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Ya", "Tidak", "Biasa Aja" }));
        pilihan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihan1ActionPerformed(evt);
            }
        });
        getContentPane().add(pilihan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 130, -1));

        pilihan2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Ya", "Tidak", "Biasa Aja" }));
        getContentPane().add(pilihan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 130, -1));

        pilihan4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Ya", "Tidak", "Biasa Aja" }));
        getContentPane().add(pilihan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 130, -1));

        pilihan5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Ya", "Tidak", "Biasa Aja" }));
        getContentPane().add(pilihan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 130, -1));

        pilihan6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Ya", "Tidak", "Biasa Aja" }));
        getContentPane().add(pilihan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 130, -1));

        pilihan7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Membanting benda", "Mengiklaskan", "Biasa Aja" }));
        getContentPane().add(pilihan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 120, -1));

        pilihan8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Gugup", "Senang", "Biasa Aja" }));
        getContentPane().add(pilihan8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 120, -1));

        pilihan9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Gelisah", "Cemas", "Biasa Aja" }));
        getContentPane().add(pilihan9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 120, -1));

        jLabel7.setText("Populeritas itu penting");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 190, -1));

        jLabel8.setText("Lebih baik memperbaiki atau");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 210, -1));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel14.setText("APAKAH ?");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 80, -1));

        jLabel20.setText("didepan mata");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 110, -1));

        jLabel19.setText("Saat ini !");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 210, -1));

        jLabel18.setText("Ketika kesuksean sudah ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 180, -1));

        jLabel13.setText("Periksa");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, -1));

        jLabel17.setText("mengkhianati");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, -1));

        jLabel15.setText("tanggung jawab kita");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 160, -1));

        Periksa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasbesar/Periksa1.png"))); // NOI18N
        Periksa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PeriksaMousePressed(evt);
            }
        });
        getContentPane().add(Periksa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 80, 50));

        jLabel12.setText("Bila orang yang kamu percaya");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 220, -1));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel11.setText("APA YANG KAMU RASAKAN");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 260, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 201, 20));

        jLabel9.setText("mencari lagi");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel6.setText("Kebahagian orang lain");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 248, 180, -1));

        jLabel3.setText("Menjadi dewasa menyenagkan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, -1));

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 16)); // NOI18N
        jLabel2.setText("Kalkulator Kesehatan Mental");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 270, 30));

        jLabel4.setText("Berbeda itu lumrah");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 184, -1));

        jLabel5.setText("Menjadi orang lain itu beban");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 210, -1));

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 432, 0));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasbesar/Pertanyaan.PNG"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PeriksaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PeriksaMousePressed
//        Penutup P2 = new Penutup();
//        P2.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_PeriksaMousePressed

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed

        int hasildepresi = 0;
        int hasilstres = 0;
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 0;
        try {
            if (pilihan1.getSelectedItem() == "Ya") {
                hasildepresi += a;
            }
            if (pilihan1.getSelectedItem() == "Tidak") {
                hasildepresi += b;
            }
            if (pilihan1.getSelectedItem() == "Biasa Aja") {
                hasildepresi += c;
            }
            if (pilihan2.getSelectedItem() == "Ya") {
                hasildepresi += a;
            }
            if (pilihan2.getSelectedItem() == "Tidak") {
                hasildepresi += b;
            }
            if (pilihan2.getSelectedItem() == "Biasa Aja") {
                hasildepresi += c;
            }
            if (pilihan3.getSelectedItem() == "Ya") {
                hasildepresi += a;
            }
            if (pilihan3.getSelectedItem() == "Tidak") {
                hasildepresi += b;
            }
            if (pilihan3.getSelectedItem() == "Biasa Aja") {
                hasildepresi += c;
            }
            if (pilihan4.getSelectedItem() == "Ya") {
                hasildepresi += a;
            }
            if (pilihan4.getSelectedItem() == "Tidak") {
                hasildepresi += b;
            }
            if (pilihan4.getSelectedItem() == "Biasa Aja") {
                hasildepresi += c;
            }
            if (pilihan5.getSelectedItem() == "Ya") {
                hasildepresi += a;
            }
            if (pilihan5.getSelectedItem() == "Tidak") {
                hasildepresi += b;
            }
            if (pilihan5.getSelectedItem() == "Biasa Aja") {
                hasildepresi += c;
            }
            if (pilihan6.getSelectedItem() == "Ya") {
                hasildepresi += a;
            }
            if (pilihan6.getSelectedItem() == "Tidak") {
                hasildepresi += b;
            }
            if (pilihan6.getSelectedItem() == "Biasa Aja") {
                hasildepresi += c;
            }
            if (pilihan7.getSelectedItem() == "Membanting benda") {
                hasilstres += a;
            }
            if (pilihan7.getSelectedItem() == "Mengiklaskan") {
                hasilstres += b;
            }
            if (pilihan7.getSelectedItem() == "Biasa Aja") {
                hasilstres += c;
            }
            if (pilihan8.getSelectedItem() == "Gugup") {
                hasilstres += a;
            }
            if (pilihan8.getSelectedItem() == "Senang") {
                hasilstres += b;
            }
            if (pilihan8.getSelectedItem() == "Biasa Aja") {
                hasilstres += c;
            }
            if (pilihan9.getSelectedItem() == "Gelisah") {
                hasilstres += a;
            }
            if (pilihan9.getSelectedItem() == "Cemas") {
                hasilstres += b;
            }
            if (pilihan9.getSelectedItem() == "Biasa Aja") {
                hasilstres += c;
            }
            int hasil = hasildepresi + hasilstres;
            System.out.println(hasil);

            if (pilihan1.getSelectedItem() == "-Pilih-" || pilihan2.getSelectedItem() == "-Pilih-" || pilihan3.getSelectedItem() == "-Pilih-" || pilihan4.getSelectedItem() == "-Pilih-" || pilihan5.getSelectedItem() == "-Pilih-" || pilihan6.getSelectedItem() == "-Pilih-" || pilihan7.getSelectedItem() == "-Pilih-" || pilihan8.getSelectedItem() == "-Pilih-" || pilihan9.getSelectedItem() == "-Pilih-") {
                JOptionPane.showMessageDialog(null, "Maaf, pertanyaan harus diisi semua");
            } else {
                Penutup close = new Penutup();
                close.update(mboh.getText());
                if (hasil >80){
                    String x = "Ini adalah kondisi normal anda tidak perlu panik";
                    close.update2(x);
                }
                 if (hasil >150){
                    String x = "Istirahat lah save healing sesekali penting";
                    close.update2(x);
                }
                  if (hasil >200){
                    String x = "Masalah berat hanya untuk orang yang hebat,";
                    close.update2(x);
                }
                   if (hasil >250){
                    String x = "Tidak Perlu panik,Kamu pasti bisa";
                    close.update2(x);
                }
                close.update1(String.valueOf(hasil), String.valueOf(hasildepresi), String.valueOf(hasilstres));
                close.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            Logger.getLogger(Pertanyaan1.class.getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_jLabel13MousePressed

    private void pilihan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihan1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pertanyaan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pertanyaan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pertanyaan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pertanyaan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pertanyaan1().setVisible(true);
            }
        });
    }

    void update(String str) {
        mboh.setText(str);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Periksa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mboh;
    private javax.swing.JComboBox<String> pilihan1;
    private javax.swing.JComboBox<String> pilihan2;
    private javax.swing.JComboBox<String> pilihan3;
    private javax.swing.JComboBox<String> pilihan4;
    private javax.swing.JComboBox<String> pilihan5;
    private javax.swing.JComboBox<String> pilihan6;
    private javax.swing.JComboBox<String> pilihan7;
    private javax.swing.JComboBox<String> pilihan8;
    private javax.swing.JComboBox<String> pilihan9;
    // End of variables declaration//GEN-END:variables
}
