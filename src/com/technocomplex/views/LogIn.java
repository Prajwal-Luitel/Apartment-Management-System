
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.technocomplex.views;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author prajwal Luitel LMU Id 23048626
 */
public class LogIn extends javax.swing.JFrame {

    private boolean isSelected;

    /**
     * Creates new form TechnoComplex
     */
    public LogIn() {
        initComponents();
        pwdFldPassword.setEchoChar((char) 0);
        isSelected = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLoginScreen = new javax.swing.JPanel();
        lblUsernameIcon = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        lblErrorUsername = new javax.swing.JLabel();
        txtFldUsername = new javax.swing.JTextField();
        lblPasswordIcon = new javax.swing.JLabel();
        pwdFldPassword = new javax.swing.JPasswordField();
        lblShowPasswordIcon = new javax.swing.JLabel();
        lblPasswordBoder = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        lblLoginClose = new javax.swing.JLabel();
        lblBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1706, 912));
        setName("LogIn"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLoginScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnlLoginScreen.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        pnlLoginScreen.setMaximumSize(new java.awt.Dimension(1706, 912));
        pnlLoginScreen.setMinimumSize(new java.awt.Dimension(1706, 912));
        pnlLoginScreen.setPreferredSize(new java.awt.Dimension(1706, 912));
        pnlLoginScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/technocomplex/resources/images/icons/Username.jpg"))); // NOI18N
        pnlLoginScreen.add(lblUsernameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 69, 59));

        lblErrorPassword.setForeground(new java.awt.Color(255, 0, 0));
        pnlLoginScreen.add(lblErrorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        lblErrorUsername.setForeground(new java.awt.Color(255, 0, 0));
        pnlLoginScreen.add(lblErrorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        txtFldUsername.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtFldUsername.setForeground(new java.awt.Color(169, 169, 172));
        txtFldUsername.setText("Username");
        txtFldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 119, 182)));
        txtFldUsername.setPreferredSize(new java.awt.Dimension(240, 42));
        txtFldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFldUsernameFocusLost(evt);
            }
        });
        pnlLoginScreen.add(txtFldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        lblPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/technocomplex/resources/images/icons/Password.png"))); // NOI18N
        pnlLoginScreen.add(lblPasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 56, 53));

        pwdFldPassword.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        pwdFldPassword.setForeground(new java.awt.Color(169, 169, 172));
        pwdFldPassword.setText("Password");
        pwdFldPassword.setToolTipText("");
        pwdFldPassword.setBorder(null);
        pwdFldPassword.setMaximumSize(new java.awt.Dimension(200, 42));
        pwdFldPassword.setMinimumSize(new java.awt.Dimension(200, 42));
        pwdFldPassword.setPreferredSize(new java.awt.Dimension(200, 40));
        pwdFldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdFldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdFldPasswordFocusLost(evt);
            }
        });
        pnlLoginScreen.add(pwdFldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        lblShowPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/technocomplex/resources/images/icons/Hide Password.png"))); // NOI18N
        lblShowPasswordIcon.setToolTipText("");
        lblShowPasswordIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShowPasswordIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowPasswordIconMouseClicked(evt);
            }
        });
        pnlLoginScreen.add(lblShowPasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        lblPasswordBoder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 119, 182)));
        lblPasswordBoder.setPreferredSize(new java.awt.Dimension(240, 42));
        pnlLoginScreen.add(lblPasswordBoder, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        btnLogIn.setBackground(new java.awt.Color(0, 119, 182));
        btnLogIn.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        pnlLoginScreen.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 170, 44));

        lblLoginClose.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLoginClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/technocomplex/resources/images/icons/Close.png"))); // NOI18N
        lblLoginClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLoginClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginCloseMouseClicked(evt);
            }
        });
        pnlLoginScreen.add(lblLoginClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 0, 50, 50));

        lblBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/technocomplex/resources/images/background/Login.png"))); // NOI18N
        lblBackgroundImage.setMaximumSize(new java.awt.Dimension(1706, 912));
        lblBackgroundImage.setMinimumSize(new java.awt.Dimension(1706, 912));
        lblBackgroundImage.setPreferredSize(new java.awt.Dimension(1706, 912));
        pnlLoginScreen.add(lblBackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1710, 920));

        getContentPane().add(pnlLoginScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Handles the action of the login button being clicked. Closes the current
     * window and opens the home screen of the application upon success.
     *
     * @param evt the event triggered by the login button click
     */
    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        boolean isValid = true;
        // Checking empty field
        if (txtFldUsername.getText().isEmpty() || txtFldUsername.getText().equals("Username")) {
            txtFldUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
            lblErrorUsername.setText("Enter Username");
            isValid = false;
        }
        if (pwdFldPassword.getText().isEmpty() || pwdFldPassword.getText().equals("Password")) {
            lblPasswordBoder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
            lblErrorPassword.setText("Enter Password");
            isValid = false;
        }
        if (isValid) {
            //Valid Username
            if (txtFldUsername.getText().equals("admin")) {
                txtFldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 119, 182)));
                lblErrorUsername.setText("");
                // Invalid Password
                if (!pwdFldPassword.getText().equals("admin")) { 
                    lblPasswordBoder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
                    lblErrorPassword.setText("Invalid Password");
                    return;
                } 
            } else {
                txtFldUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
                lblErrorUsername.setText("Invalid Username");
                lblPasswordBoder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
                lblErrorPassword.setText("Invalid Password");
                return;
            }
            // Vaid Username and Password
            JOptionPane.showConfirmDialog(this, "Login sucessful\nDirecting to Home Screen", "LogIn Successful", JOptionPane.PLAIN_MESSAGE);
            this.dispose();
            new Home().setVisible(true); // Direct to Home screen
        }
    }//GEN-LAST:event_btnLogInActionPerformed
    /**
     * Handles the mouse click event on the close label in the login window.
     * Prompts the user with a confirmation dialog to close the system. If the
     * user confirms, the application is terminated.
     *
     * @param evt the event triggered by clicking on the close label
     */
    private void lblLoginCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginCloseMouseClicked
        int closeSystem = JOptionPane.showConfirmDialog(pnlLoginScreen, "Do you want to close the \nTecnho Management System", "Close System", JOptionPane.YES_NO_OPTION);
        if (closeSystem == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblLoginCloseMouseClicked

    /**
     * Event handler for the Username TextField focus gained. when user click on
     * Username the empty space is set for writing and foreground color changes to
     * black
     *
     * @param evt the FocusEvent triggered by the Username TextField
     */
    private void txtFldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldUsernameFocusGained
        if (txtFldUsername.getText().equals("Username")) { // User has not entered text yet
            txtFldUsername.setForeground(Color.black);
            txtFldUsername.setText("");
        }
    }//GEN-LAST:event_txtFldUsernameFocusGained

    /**
     * Event handler for the Username TextField focus lost. when user leave the
     * field empty field text is set to USername in gray color
     *
     * @param evt the FocusEvent triggered by the USername TextField
     */
    private void txtFldUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldUsernameFocusLost
        if (txtFldUsername.getText().equals("")) {// User did not enter text
            txtFldUsername.setForeground(new java.awt.Color(169, 169, 172)); // placeholder color
            txtFldUsername.setText("Username");
        }
    }//GEN-LAST:event_txtFldUsernameFocusLost

    /**
     * Event handler for the PasswordField focus gained. when user click on
     * Password the empty space is set for writing by not showing the
     * character
     *
     * @param evt the FocusEvent triggered by the Password PasswordField
     */
    private void pwdFldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdFldPasswordFocusGained
        if (pwdFldPassword.getText().equals("Password")) { // User has not entered text yet
            pwdFldPassword.setForeground(Color.black);
            pwdFldPassword.setText("");
            pwdFldPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_pwdFldPasswordFocusGained

    /**
     * Event handler for the Password PasswordField focus lost. when user leave
     * the field empty field text is set to Password in grey color by showing
     * the character
     *
     * @param evt the FocusEvent triggered by the Password PasswordField
     */
    private void pwdFldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdFldPasswordFocusLost
        if (pwdFldPassword.getText().equals("")) {// User did not enter text
            pwdFldPassword.setForeground(new java.awt.Color(169, 169, 172)); // placeholder color
            pwdFldPassword.setText("Password");
            pwdFldPassword.setEchoChar((char) 0); //Show Password text to user
        }
    }//GEN-LAST:event_pwdFldPasswordFocusLost

    /**
     * Event handler for the ShowPasswordIcon label action. show the password
     * field to user and the icon changed to hide password when pressed hide the
     * password field
     *
     * @param evt the MouseEvent triggered by the ShowPasswordIcon label
     */
    private void lblShowPasswordIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPasswordIconMouseClicked
        if (isSelected) {
            isSelected = false;
            pwdFldPassword.setEchoChar((char) 0); // show password
            lblShowPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/technocomplex/resources/images/icons/Show Password.png"))); 
        } else {
            isSelected = true;
            pwdFldPassword.setEchoChar('*'); // hide password
            lblShowPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/technocomplex/resources/images/icons/Hide Password.png"))); 
        }
    }//GEN-LAST:event_lblShowPasswordIconMouseClicked

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel lblBackgroundImage;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorUsername;
    private javax.swing.JLabel lblLoginClose;
    private javax.swing.JLabel lblPasswordBoder;
    private javax.swing.JLabel lblPasswordIcon;
    private javax.swing.JLabel lblShowPasswordIcon;
    private javax.swing.JLabel lblUsernameIcon;
    private javax.swing.JPanel pnlLoginScreen;
    private javax.swing.JPasswordField pwdFldPassword;
    private javax.swing.JTextField txtFldUsername;
    // End of variables declaration//GEN-END:variables
}
