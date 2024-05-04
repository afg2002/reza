/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sikar.view;

import com.sikar.model.Orang;
import com.sikar.dao.OrangDAO;
import com.sikar.dao.OrangDAOMySQL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import java.sql.SQLException;
/**
 *
 * @author admin01
 */
public class RegisterFrame extends javax.swing.JFrame{
    private OrangDAO OrangDAO;
    /**
     * Creates new form RegisterFrame
     */
    public RegisterFrame() {
        initComponents();
        OrangDAO = new OrangDAOMySQL();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgBlue = new javax.swing.JPanel();
        bgWhite = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        labelLevel = new javax.swing.JLabel();
        comboLevel = new javax.swing.JComboBox<>();
        labelUsername1 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        btnMasuk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgBlue.setBackground(new java.awt.Color(5, 101, 201));

        bgWhite.setBackground(new java.awt.Color(254, 254, 254));

        login.setFont(new java.awt.Font("Nunito", 1, 24)); // NOI18N
        login.setText("Register");

        text1.setText("Silahkan isi data dengan benar untuk");

        text2.setText("mendaftar");

        btnRegister.setBackground(new java.awt.Color(5, 101, 201));
        btnRegister.setFont(new java.awt.Font("Nunito", 0, 13)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(254, 254, 254));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        labelUsername.setFont(new java.awt.Font("Nunito", 1, 13)); // NOI18N
        labelUsername.setText("Username");

        labelPassword.setFont(new java.awt.Font("Nunito", 1, 13)); // NOI18N
        labelPassword.setText("Password");

        labelLevel.setFont(new java.awt.Font("Nunito", 1, 13)); // NOI18N
        labelLevel.setText("Level");

        comboLevel.setBackground(new java.awt.Color(254, 254, 254));
        comboLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User"}));

        labelUsername1.setFont(new java.awt.Font("Nunito", 1, 13)); // NOI18N
        labelUsername1.setText("Nama");

        btnMasuk.setText("Sudah punya akun? Masuk");
        btnMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasukMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgWhiteLayout = new javax.swing.GroupLayout(bgWhite);
        bgWhite.setLayout(bgWhiteLayout);
        bgWhiteLayout.setHorizontalGroup(
            bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgWhiteLayout.createSequentialGroup()
                .addGroup(bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgWhiteLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMasuk))
                    .addGroup(bgWhiteLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsername)
                            .addGroup(bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(login)
                            .addComponent(labelPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsername1)
                            .addComponent(btnRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLevel)
                            .addComponent(comboLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        bgWhiteLayout.setVerticalGroup(
            bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgWhiteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgWhiteLayout.createSequentialGroup()
                        .addComponent(text1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text2)
                        .addGap(33, 33, 33)
                        .addComponent(labelUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgWhiteLayout.createSequentialGroup()
                        .addComponent(labelUsername1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgWhiteLayout.createSequentialGroup()
                        .addGroup(bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPassword)
                            .addComponent(labelLevel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgWhiteLayout.createSequentialGroup()
                        .addGap(24, 130, Short.MAX_VALUE)
                        .addComponent(btnRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMasuk)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout bgBlueLayout = new javax.swing.GroupLayout(bgBlue);
        bgBlue.setLayout(bgBlueLayout);
        bgBlueLayout.setHorizontalGroup(
            bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgBlueLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(bgWhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        bgBlueLayout.setVerticalGroup(
            bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgBlueLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(bgWhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        try {
            Orang o = new Orang();
            o.setNama(txtNama.getText());
            o.setUsername(txtUsername.getText());
            o.setPassword(txtPassword.getText());
            o.setLevel((String) comboLevel.getSelectedItem());
            OrangDAO.insert(o);
            JOptionPane.showMessageDialog(null, "Berhasil, Data ditambahkan!");
            txtNama.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
            this.dispose();
            LoginFrame f = new LoginFrame();
            f.setVisible(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(RegisterFrame.class.getName()).log(Level.SEVERE, null, e);
        }   
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseClicked
        this.dispose();
        LoginFrame f = new LoginFrame();
        f.setVisible(true);
    }//GEN-LAST:event_btnMasukMouseClicked

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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgBlue;
    private javax.swing.JPanel bgWhite;
    private javax.swing.JLabel btnMasuk;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> comboLevel;
    private javax.swing.JLabel labelLevel;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel labelUsername1;
    private javax.swing.JLabel login;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
