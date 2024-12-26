package com.cafeapp.views;

import javax.swing.JOptionPane;

/**
 *
 * @author Pranav Sharma LMU ID:23048577
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form CafeApp
     */
    public Signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSignup = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblmblnumber = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtfldName = new javax.swing.JTextField();
        txtfldEmail = new javax.swing.JTextField();
        txtfldMblNumber = new javax.swing.JTextField();
        txtfldAddress = new javax.swing.JTextField();
        txtfldPassword = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JButton();
        btnForgotPassword = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSignup.setFont(new java.awt.Font("Helvetica Neue", 1, 57)); // NOI18N
        lblSignup.setForeground(new java.awt.Color(204, 153, 0));
        lblSignup.setText("User Signup");
        getContentPane().add(lblSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        lblEmail.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        lblmblnumber.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblmblnumber.setForeground(new java.awt.Color(255, 255, 255));
        lblmblnumber.setText("Mobile Number");
        getContentPane().add(lblmblnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        lbladdress.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbladdress.setForeground(new java.awt.Color(255, 255, 255));
        lbladdress.setText("Address");
        getContentPane().add(lbladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        txtfldName.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        txtfldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtfldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 351, -1));

        txtfldEmail.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        getContentPane().add(txtfldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 351, -1));

        txtfldMblNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        getContentPane().add(txtfldMblNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 351, -1));

        txtfldAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        getContentPane().add(txtfldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 351, -1));

        txtfldPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        getContentPane().add(txtfldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 351, -1));

        btnExit.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        btnExit.setText("Exit");
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 120, -1));

        btnForgotPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnForgotPassword.setText("Forgot Password?");
        getContentPane().add(btnForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        btnLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 630, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logintheme.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldNameActionPerformed
    //This method is used to go to go to Login form when the button is pressed
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnForgotPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignup;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblmblnumber;
    private javax.swing.JTextField txtfldAddress;
    private javax.swing.JTextField txtfldEmail;
    private javax.swing.JTextField txtfldMblNumber;
    private javax.swing.JTextField txtfldName;
    private javax.swing.JPasswordField txtfldPassword;
    // End of variables declaration//GEN-END:variables
}
