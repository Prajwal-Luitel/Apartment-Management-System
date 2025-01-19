/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.technocomplex.views;

/**
 *
 * Loading Screen to simulate the loading bar progress using SwingWorker thread.
 *
 * @author Prajwal Luitel LMU ID 23048626
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form loading
     */
    public Loading() {
        initComponents();
        startProgress();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLoadingScreen = new javax.swing.JPanel();
        lblSloganFirstLine = new javax.swing.JLabel();
        lblSloganSecondLine = new javax.swing.JLabel();
        lblSloganThirdLine = new javax.swing.JLabel();
        lblLoading = new javax.swing.JLabel();
        pgBarSplashScreen = new javax.swing.JProgressBar();
        lblBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1706, 912));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLoadingScreen.setPreferredSize(new java.awt.Dimension(1706, 912));
        pnlLoadingScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSloganFirstLine.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblSloganFirstLine.setForeground(new java.awt.Color(0, 51, 204));
        lblSloganFirstLine.setText("Effortless Management for Modern");
        pnlLoadingScreen.add(lblSloganFirstLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        lblSloganSecondLine.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblSloganSecondLine.setForeground(new java.awt.Color(0, 51, 204));
        lblSloganSecondLine.setText("Apartments - Where Comfort ");
        pnlLoadingScreen.add(lblSloganSecondLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        lblSloganThirdLine.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblSloganThirdLine.setForeground(new java.awt.Color(0, 51, 204));
        lblSloganThirdLine.setText("Meets Efficiency!");
        pnlLoadingScreen.add(lblSloganThirdLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 20));

        lblLoading.setFont(new java.awt.Font("Poppins", 0, 32)); // NOI18N
        lblLoading.setForeground(new java.awt.Color(51, 153, 255));
        lblLoading.setText("Loading...");
        pnlLoadingScreen.add(lblLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 780, 180, -1));

        pgBarSplashScreen.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        pgBarSplashScreen.setStringPainted(true);
        pnlLoadingScreen.add(pgBarSplashScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 830, 1710, 50));

        lblBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/technocomplex/resources/images/background/Loading.png"))); // NOI18N
        pnlLoadingScreen.add(lblBackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pnlLoadingScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Simulates the loading progress using a SwingWorker thread. Updates a
     * progress bar incrementally and switches to the login screen upon
     * completion.
     */
    private void startProgress() {
        javax.swing.SwingWorker<Void, Integer> worker = new javax.swing.SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(30); // Simulated delay for progress bar
                    publish(i); // Publish progress
                }
                return null;
            }
            @Override
            protected void process(java.util.List<Integer> chunks) {
                int progress = chunks.get(chunks.size() - 1);
                pgBarSplashScreen.setValue(progress);
            }
            @Override
            protected void done() {
                //After completion direct to log in screen 
                new LogIn().setVisible(true);
                Loading.this.dispose();
            }
        };
        worker.execute(); // Start the worker thread
    }

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackgroundImage;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblSloganFirstLine;
    private javax.swing.JLabel lblSloganSecondLine;
    private javax.swing.JLabel lblSloganThirdLine;
    private javax.swing.JProgressBar pgBarSplashScreen;
    private javax.swing.JPanel pnlLoadingScreen;
    // End of variables declaration//GEN-END:variables
}
