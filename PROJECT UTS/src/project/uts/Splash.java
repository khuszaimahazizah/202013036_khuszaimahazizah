/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.uts;

/**
 *
 * @author ASUS
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
        this.setExtendedState(Splash.MAXIMIZED_BOTH); //prtintah setExtendedState digunakan untuk menampilkan layar secara ful screen
        //dan splash adalah nama class yang akan dijalankan
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
        loadbar = new javax.swing.JLabel();
        Load = new javax.swing.JProgressBar();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 5, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadbar.setForeground(new java.awt.Color(255, 255, 255));
        loadbar.setText("0");
        jPanel1.add(loadbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 570, -1, -1));
        jPanel1.add(Load, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 1230, 20));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\PBO\\tes.jpg")); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, -10, 930, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       Splash sp=new Splash();//dsini kita membuat objek baru supaya splash ini bisa tampil
       sp.setVisible(true);
       //syntax untuk loading bar
        try {
            for(int i=0; i<=100; i++){
                Thread.sleep(60);//kecepatan unutk loading barnya
                sp.loadbar.setText(i+"%");
            sp.Load.setValue(i);
            if(i==100){ 
                // apabila loading bar sampai 100% maka program otomatis akan lanjut ke jframe berikutnya
                Login home=new Login();// kita inisialisaikan terlebih dahulu login menjadi home
                home.setVisible(true);
                sp.setVisible(false);// disni kita gunakan setVisible agar tampilan otomatis tertutup            
            }
            
            }
            
            
        } catch (Exception e) {
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Load;
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loadbar;
    // End of variables declaration//GEN-END:variables
}
