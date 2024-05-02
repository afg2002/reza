/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sikar.view;

import com.sikar.dao.CiriMinatBakatDAO;
import com.sikar.dao.CiriMinatBakatDAOMySQL;
import com.sikar.model.Gejala;
import com.sikar.dao.GejalaDAO;
import com.sikar.model.CiriMinatBakat;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import java.sql.SQLException;
/**
 *
 * @author admin01
 */
public class TambahCiriMinatBakat extends javax.swing.JFrame {
    private CiriMinatBakatDAO ciriMinatBakatDAO;
    private List<CiriMinatBakat> recCiriMinatBakat = new ArrayList<CiriMinatBakat>();
    private static final long serialVersionUID = 1L;
    /**
     * Creates new form TambahGejalaFrame
     */
    public TambahCiriMinatBakat() {
        initComponents();
        ciriMinatBakatDAO = new CiriMinatBakatDAOMySQL();
        initStatus();

        tabelCiriMinatBakat.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tabelCiriMinatBakat.getSelectedRow();
                if (row != -1) {
                    textFill();
                }
            }
        });
    }

    public void loadAllCiriMinatBakat() {
        recCiriMinatBakat = ciriMinatBakatDAO.getAll();
    }

    void tableFill() {
        Object data[][] = new Object[recCiriMinatBakat.size()][3];
        int x = 0, no = 1;
        for (CiriMinatBakat c : recCiriMinatBakat) {
            data[x][0] = no++;
            data[x][1] = c.getKodeCiri();
            data[x][2] = c.getPertanyaan();
            x++;
        }
        String judul[] = {"No","Kode Ciri", "Pertanyaan"};
        tabelCiriMinatBakat.setModel(new DefaultTableModel(data, judul));
    }

    public void textFill() {
        CiriMinatBakat c = recCiriMinatBakat.get(tabelCiriMinatBakat.getSelectedRow());
        txtKodeCiri.setText(c.getKodeCiri());
        txtKodePertanyaan.setText(c.getPertanyaan());
    }

    public void clear() {
        txtKodeCiri.setText("");
        txtKodePertanyaan.setText("");
    }

    void initStatus() {
        clear();
        loadAllCiriMinatBakat();
        tableFill();
    }

    void refresh_page() {
        this.dispose();
        TambahCiriMinatBakat f = new TambahCiriMinatBakat();
        f.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        bgBlue = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        TambahGejala = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        DataCiriMinatBakatBox = new javax.swing.JPanel();
        DataGejala = new javax.swing.JLabel();
        txtKodeCiri = new javax.swing.JTextField();
        labelKodeGejala = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelCiriMinatBakat = new javax.swing.JTable();
        labelPertanyaan = new javax.swing.JLabel();
        txtKodePertanyaan = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgBlue.setBackground(new java.awt.Color(5, 101, 201));

        navbar.setBackground(new java.awt.Color(254, 254, 254));

        TambahGejala.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        TambahGejala.setText("Tambah Ciri Minat Bakat");

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(TambahGejala)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(btnKembali)
                .addGap(36, 36, 36))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TambahGejala)
                    .addComponent(btnKembali))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        DataCiriMinatBakatBox.setBackground(new java.awt.Color(254, 254, 254));

        DataGejala.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        DataGejala.setText("Data Ciri Minat Bakat");

        labelKodeGejala.setFont(new java.awt.Font("Nunito", 0, 13)); // NOI18N
        labelKodeGejala.setText("Kode Ciri :");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tabelCiriMinatBakat.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabelCiriMinatBakat);

        labelPertanyaan.setFont(new java.awt.Font("Nunito", 0, 13)); // NOI18N
        labelPertanyaan.setText("Pertanyaan : ");

        txtKodePertanyaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodePertanyaanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DataCiriMinatBakatBoxLayout = new javax.swing.GroupLayout(DataCiriMinatBakatBox);
        DataCiriMinatBakatBox.setLayout(DataCiriMinatBakatBoxLayout);
        DataCiriMinatBakatBoxLayout.setHorizontalGroup(
            DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataCiriMinatBakatBoxLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DataCiriMinatBakatBoxLayout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addGroup(DataCiriMinatBakatBoxLayout.createSequentialGroup()
                        .addGroup(DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(DataCiriMinatBakatBoxLayout.createSequentialGroup()
                                .addComponent(labelPertanyaan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtKodePertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DataCiriMinatBakatBoxLayout.createSequentialGroup()
                                .addComponent(labelKodeGejala)
                                .addGap(30, 30, 30)
                                .addComponent(txtKodeCiri, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DataGejala, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        DataCiriMinatBakatBoxLayout.setVerticalGroup(
            DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataCiriMinatBakatBoxLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(DataGejala)
                .addGap(18, 18, 18)
                .addGroup(DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeGejala)
                    .addComponent(txtKodeCiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPertanyaan)
                    .addComponent(txtKodePertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgBlueLayout = new javax.swing.GroupLayout(bgBlue);
        bgBlue.setLayout(bgBlueLayout);
        bgBlueLayout.setHorizontalGroup(
            bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgBlueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DataCiriMinatBakatBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgBlueLayout.setVerticalGroup(
            bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgBlueLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(DataCiriMinatBakatBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
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

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AdminFrame f = new AdminFrame();
        f.setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        CiriMinatBakat g = new CiriMinatBakat();
        g.setKodeCiri(txtKodeCiri.getText());
        g.setPertanyaan(txtKodePertanyaan.getText());
        ciriMinatBakatDAO.insert(g);
        JOptionPane.showMessageDialog(null, "Berhasil, Data ditambahkan!");
        clear();
        refresh_page(); 
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        CiriMinatBakat g = new CiriMinatBakat();
        g.setKodeCiri(txtKodeCiri.getText());
        g.setPertanyaan(txtKodePertanyaan.getText());
        ciriMinatBakatDAO.update(g);
        JOptionPane.showMessageDialog(null, "Berhasil, Data diperbaharui!");
        clear();
        refresh_page(); 
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data?");
        CiriMinatBakat g = recCiriMinatBakat.get(tabelCiriMinatBakat.getSelectedRow());
        ciriMinatBakatDAO.deleteByKodeCiri(g.getKodeCiri());
        JOptionPane.showMessageDialog(null, "Berhasil, Data dihapus!");
        refresh_page();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtKodePertanyaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodePertanyaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodePertanyaanActionPerformed

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
            java.util.logging.Logger.getLogger(TambahCiriMinatBakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahCiriMinatBakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahCiriMinatBakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahCiriMinatBakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahCiriMinatBakat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DataCiriMinatBakatBox;
    private javax.swing.JLabel DataGejala;
    private javax.swing.JLabel TambahGejala;
    private javax.swing.JPanel bgBlue;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelKodeGejala;
    private javax.swing.JLabel labelPertanyaan;
    private javax.swing.JPanel navbar;
    private javax.swing.JTable tabelCiriMinatBakat;
    private javax.swing.JTextField txtKodeCiri;
    private javax.swing.JTextField txtKodePertanyaan;
    // End of variables declaration//GEN-END:variables
}