/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sikar.view;

import com.sikar.dao.CiriMinatBakatDAO;
import com.sikar.dao.CiriMinatBakatDAOMySQL;
import com.sikar.dao.JawabanUserDAO;
import com.sikar.dao.JawabanUserDAOMySQL;
import com.sikar.model.CiriMinatBakat;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin01
 */
public class UserFrame extends javax.swing.JFrame {

    private final CiriMinatBakatDAO ciriMinatBakatDAO;
    private JawabanUserDAO jawabanUserDAO = new JawabanUserDAOMySQL();
    public List<CiriMinatBakat> recCiriMinatBakat = new ArrayList<>();
    public static int index = 0;
    public static boolean status = false;

    /**
     * Creates new form UserFrame
     */
    public UserFrame() {
        initComponents();
        ciriMinatBakatDAO = new CiriMinatBakatDAOMySQL();
        loadAllPertanyaan();
    }

    public void loadAllPertanyaan() {
        recCiriMinatBakat = ciriMinatBakatDAO.getAll();
    }

    public void tampilkanPertanyaan(String status) {
        // Memastikan index berada dalam rentang yang benar
        if (index >= 0 && index < recCiriMinatBakat.size()) {
            CiriMinatBakat pertanyaan = recCiriMinatBakat.get(index);
            int totalPertanyaan= recCiriMinatBakat.size();
            PertanyaanDialog pd = new PertanyaanDialog(this, true, txtId.getText());
            pd.setLocationRelativeTo(null);
            pd.txtPertanyaan.setText("<html><p style=\"word-wrap: break-word;\">" + pertanyaan.getPertanyaan() + "</p></html>");
            pd.txtTotalPertanyaan.setText(String.valueOf(totalPertanyaan));
            pd.txtPosPerNow.setText(String.valueOf(index+1));
            pd.txtKodeCiri.setText(pertanyaan.getKodeCiri());
            pd.btnNext.setText(status);
            pd.setVisible(true);
        }
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
        btnDiagnosa = new javax.swing.JButton();
        btnDiagnosa1 = new javax.swing.JButton();
        navbar = new javax.swing.JPanel();
        DashboardUser = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtNamaUser = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        SelamatDatang = new javax.swing.JLabel();
        SelamatDatang1 = new javax.swing.JLabel();
        bgWhite1 = new javax.swing.JPanel();
        btnDiagnosa2 = new javax.swing.JButton();
        btnDiagnosa3 = new javax.swing.JButton();
        btnDiagnosa4 = new javax.swing.JButton();
        btnDiagnosa5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgBlue.setBackground(new java.awt.Color(102, 204, 255));

        bgWhite.setBackground(new java.awt.Color(254, 254, 254));

        btnDiagnosa.setBackground(new java.awt.Color(0, 153, 255));
        btnDiagnosa.setForeground(new java.awt.Color(254, 254, 254));
        btnDiagnosa.setText("Cek Sekarang");
        btnDiagnosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosaActionPerformed(evt);
            }
        });

        btnDiagnosa1.setBackground(new java.awt.Color(0, 153, 255));
        btnDiagnosa1.setForeground(new java.awt.Color(254, 254, 254));
        btnDiagnosa1.setText("Cek Sekarang");
        btnDiagnosa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgWhiteLayout = new javax.swing.GroupLayout(bgWhite);
        bgWhite.setLayout(bgWhiteLayout);
        bgWhiteLayout.setHorizontalGroup(
            bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgWhiteLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDiagnosa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiagnosa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        bgWhiteLayout.setVerticalGroup(
            bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgWhiteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDiagnosa1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );

        navbar.setBackground(new java.awt.Color(254, 254, 254));

        DashboardUser.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        DashboardUser.setText("Dashboard User");

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        txtNamaUser.setText("jLabel1");

        txtId.setText("jLabel1");

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(DashboardUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addComponent(txtId)
                        .addGap(108, 108, 108)
                        .addComponent(txtNamaUser)
                        .addGap(55, 55, 55)))
                .addComponent(btnKeluar)
                .addGap(36, 36, 36))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DashboardUser)
                            .addComponent(btnKeluar)
                            .addComponent(txtNamaUser)
                            .addComponent(txtId))
                        .addGap(28, 28, 28))))
        );

        SelamatDatang.setFont(new java.awt.Font("Nunito", 1, 24)); // NOI18N
        SelamatDatang.setForeground(new java.awt.Color(254, 254, 254));
        SelamatDatang.setText("Selamat Datang!");

        SelamatDatang1.setFont(new java.awt.Font("Nunito", 1, 24)); // NOI18N
        SelamatDatang1.setForeground(new java.awt.Color(254, 254, 254));
        SelamatDatang1.setText("Mari cek jurusan yang cocok sesuai minat kamu!");

        bgWhite1.setBackground(new java.awt.Color(254, 254, 254));

        btnDiagnosa2.setBackground(new java.awt.Color(0, 153, 255));
        btnDiagnosa2.setForeground(new java.awt.Color(254, 254, 254));
        btnDiagnosa2.setText("Pertanyaan");
        btnDiagnosa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosa2ActionPerformed(evt);
            }
        });

        btnDiagnosa3.setBackground(new java.awt.Color(0, 153, 255));
        btnDiagnosa3.setForeground(new java.awt.Color(254, 254, 254));
        btnDiagnosa3.setText("Aturan");
        btnDiagnosa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosa3ActionPerformed(evt);
            }
        });

        btnDiagnosa4.setBackground(new java.awt.Color(0, 153, 255));
        btnDiagnosa4.setForeground(new java.awt.Color(254, 254, 254));
        btnDiagnosa4.setText("Minat Bakat");
        btnDiagnosa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosa4ActionPerformed(evt);
            }
        });

        btnDiagnosa5.setBackground(new java.awt.Color(0, 153, 255));
        btnDiagnosa5.setForeground(new java.awt.Color(254, 254, 254));
        btnDiagnosa5.setText("Jurusan");
        btnDiagnosa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosa5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgWhite1Layout = new javax.swing.GroupLayout(bgWhite1);
        bgWhite1.setLayout(bgWhite1Layout);
        bgWhite1Layout.setHorizontalGroup(
            bgWhite1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgWhite1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(bgWhite1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDiagnosa2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiagnosa3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiagnosa4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiagnosa5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        bgWhite1Layout.setVerticalGroup(
            bgWhite1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgWhite1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnDiagnosa2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnDiagnosa3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnDiagnosa4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnDiagnosa5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgBlueLayout = new javax.swing.GroupLayout(bgBlue);
        bgBlue.setLayout(bgBlueLayout);
        bgBlueLayout.setHorizontalGroup(
            bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgBlueLayout.createSequentialGroup()
                .addGroup(bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgBlueLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SelamatDatang)
                            .addComponent(SelamatDatang1)))
                    .addGroup(bgBlueLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(bgWhite1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bgWhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        bgBlueLayout.setVerticalGroup(
            bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgBlueLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SelamatDatang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SelamatDatang1)
                .addGroup(bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgBlueLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bgWhite1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgBlueLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(bgWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginFrame f = new LoginFrame();
        f.setVisible(true);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnDiagnosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosaActionPerformed
        if(status){
            System.out.println("lagi");
            try {
                 PertanyaanDialog pd = new PertanyaanDialog(this, true, txtId.getText());
                 System.out.println(pd.cekKesamaanJawabanDenganAturan());
            } catch (SQLException ex) {
                Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tampilkanPertanyaan("Next");
        
    }//GEN-LAST:event_btnDiagnosaActionPerformed

    private void btnDiagnosa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDiagnosa1ActionPerformed

    private void btnDiagnosa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosa2ActionPerformed
        this.dispose();
        CiriMinatBakatFrame c = new CiriMinatBakatFrame();
        c.setVisible(true);
    }//GEN-LAST:event_btnDiagnosa2ActionPerformed

    private void btnDiagnosa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosa3ActionPerformed
        this.dispose();
        AturanFrame c = new AturanFrame();
        c.setVisible(true);
    }//GEN-LAST:event_btnDiagnosa3ActionPerformed

    private void btnDiagnosa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosa4ActionPerformed
        this.dispose();
        CiriMinatBakatFrame c = new CiriMinatBakatFrame();
        c.setVisible(true);
    }//GEN-LAST:event_btnDiagnosa4ActionPerformed

    private void btnDiagnosa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosa5ActionPerformed
        this.dispose();
        JurusanFrame c = null;
        try {
            c = new JurusanFrame();
        } catch (SQLException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setVisible(true);
    }//GEN-LAST:event_btnDiagnosa5ActionPerformed

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
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DashboardUser;
    private javax.swing.JLabel SelamatDatang;
    private javax.swing.JLabel SelamatDatang1;
    public javax.swing.JPanel bgBlue;
    private javax.swing.JPanel bgWhite;
    private javax.swing.JPanel bgWhite1;
    public javax.swing.JButton btnDiagnosa;
    private javax.swing.JButton btnDiagnosa1;
    private javax.swing.JButton btnDiagnosa2;
    private javax.swing.JButton btnDiagnosa3;
    private javax.swing.JButton btnDiagnosa4;
    private javax.swing.JButton btnDiagnosa5;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel navbar;
    public javax.swing.JLabel txtId;
    public javax.swing.JLabel txtNamaUser;
    // End of variables declaration//GEN-END:variables
}
