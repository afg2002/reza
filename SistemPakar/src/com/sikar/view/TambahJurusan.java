/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sikar.view;

import com.sikar.dao.JurusanDAO;
import com.sikar.dao.JurusanDAOMySQL;
import com.sikar.dao.KecerdasanMinatDAO;
import com.sikar.dao.KecerdasanMinatDAOMySQL;
import com.sikar.model.Jurusan;
import com.sikar.model.KecerdasanMinat;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
/**
 *
 * @author admin01
 */
public class TambahJurusan extends javax.swing.JFrame {
    private final JurusanDAO jurusanDAO;
    private final KecerdasanMinatDAO kecerdasanMinatDAO;
    private List<Jurusan> recJurusan = new ArrayList<>();
    private HashMap kecerdasanMinatMap =  new HashMap<>(); // To store the mapping between string values and their IDs
    /**
     * Creates new form TambahGejalaFrame
     * @throws java.sql.SQLException
     */
    public TambahJurusan() throws SQLException {
        initComponents();
        jurusanDAO = new JurusanDAOMySQL();
        kecerdasanMinatDAO = new KecerdasanMinatDAOMySQL();
        initStatus();
        
        
        List<KecerdasanMinat>  kecerdasanMinatList = kecerdasanMinatDAO.getAll();
        for (KecerdasanMinat kecerdasanMinat : kecerdasanMinatList) {
            txtMinat.addItem(kecerdasanMinat.getNama_kecerdasan());
            kecerdasanMinatMap.put(kecerdasanMinat.getNama_kecerdasan(), kecerdasanMinat.getId());
        }
        
        tblJurusan.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblJurusan.getSelectedRow();
                if (row != -1) {
                    textFill();
                }
            }
        });
    }

    public void loadAllJurusan() throws SQLException {
        recJurusan = jurusanDAO.getAllJurusan();
    }

    void tableFill() {
        Object data[][] = new Object[recJurusan.size()][5];
        int x = 0, no = 1;
        for (Jurusan j : recJurusan) {
            data[x][0] = no++;
            data[x][1] = j.getId();
            data[x][2] = j.getIdKecerdasan();
            data[x][3] = j.getNamaKecerdasan();
            data[x][4] = j.getNamaJurusan();
            x++;
        }
        String judul[] = {"No","ID", "ID Minat Bakat","Nama Minat",  "Nama Jurusan"};
        tblJurusan.setModel(new DefaultTableModel(data, judul));
    }

    public void textFill() {
        Jurusan j = recJurusan.get(tblJurusan.getSelectedRow());
        txtIdJurusan.setText(String.valueOf(j.getId()));
        txtIdMinat.setText(String.valueOf(j.getIdKecerdasan()));
        txtMinat.setSelectedItem(j.getNamaKecerdasan());
        txtJurusanKuliah.setText(j.getNamaJurusan());
    }

    public void clear() {
        txtMinat.setSelectedIndex(0);
        txtJurusanKuliah.setText("");
    }

    void initStatus() throws SQLException {
        clear();
        loadAllJurusan();
        tableFill();
    }

    void refresh_page() throws SQLException {
        this.dispose();
        TambahJurusan f = new TambahJurusan();
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
        labelKodeGejala = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblJurusan = new javax.swing.JTable();
        labelPertanyaan = new javax.swing.JLabel();
        txtJurusanKuliah = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        txtMinat = new javax.swing.JComboBox<>();
        labelKodeGejala1 = new javax.swing.JLabel();
        txtIdJurusan = new javax.swing.JTextField();
        labelKodeGejala2 = new javax.swing.JLabel();
        txtIdMinat = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgBlue.setBackground(new java.awt.Color(5, 101, 201));

        navbar.setBackground(new java.awt.Color(254, 254, 254));

        TambahGejala.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        TambahGejala.setText("Tambah Jurusan");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
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
        DataGejala.setText("Data Jurusan");

        labelKodeGejala.setFont(new java.awt.Font("Nunito", 0, 13)); // NOI18N
        labelKodeGejala.setText("Minat  ");

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

        tblJurusan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblJurusan);

        labelPertanyaan.setFont(new java.awt.Font("Nunito", 0, 13)); // NOI18N
        labelPertanyaan.setText("Jurusan Kuliah");

        txtJurusanKuliah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJurusanKuliahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        txtMinat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "== Pilih ==" }));

        labelKodeGejala1.setFont(new java.awt.Font("Nunito", 0, 13)); // NOI18N
        labelKodeGejala1.setText("ID");

        txtIdJurusan.setEditable(false);
        txtIdJurusan.setEnabled(false);
        txtIdJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdJurusanActionPerformed(evt);
            }
        });

        labelKodeGejala2.setFont(new java.awt.Font("Nunito", 0, 13)); // NOI18N
        labelKodeGejala2.setText("ID Minat");

        txtIdMinat.setEditable(false);
        txtIdMinat.setEnabled(false);
        txtIdMinat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMinatActionPerformed(evt);
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
                            .addComponent(DataGejala, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DataCiriMinatBakatBoxLayout.createSequentialGroup()
                                .addGroup(DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataCiriMinatBakatBoxLayout.createSequentialGroup()
                                        .addComponent(labelPertanyaan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(DataCiriMinatBakatBoxLayout.createSequentialGroup()
                                        .addComponent(labelKodeGejala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(31, 31, 31))
                                    .addGroup(DataCiriMinatBakatBoxLayout.createSequentialGroup()
                                        .addComponent(labelKodeGejala1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(DataCiriMinatBakatBoxLayout.createSequentialGroup()
                                        .addComponent(labelKodeGejala2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJurusanKuliah, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addGroup(DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtIdJurusan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                        .addComponent(txtIdMinat, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txtMinat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(66, 66, 66)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        DataCiriMinatBakatBoxLayout.setVerticalGroup(
            DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataCiriMinatBakatBoxLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(DataGejala)
                .addGap(25, 25, 25)
                .addGroup(DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeGejala1)
                    .addComponent(txtIdJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeGejala2)
                    .addComponent(txtIdMinat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeGejala)
                    .addComponent(txtMinat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DataCiriMinatBakatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPertanyaan)
                    .addComponent(txtJurusanKuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(DataCiriMinatBakatBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
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
        try{
            // TODO add your handling code here:
            Jurusan j = new Jurusan();
            String selectedKecerdasan = (String) txtMinat.getSelectedItem();
            j.setIdKecerdasan((int) kecerdasanMinatMap.get(selectedKecerdasan));
            j.setNamaJurusan(txtJurusanKuliah.getText());
            j.setNamaKecerdasan(selectedKecerdasan);
            jurusanDAO.insertJurusan(j);
            JOptionPane.showMessageDialog(null, "Berhasil, Data ditambahkan!");
            clear();
            refresh_page();
            
            int selectedKecerdasanId = (int) kecerdasanMinatMap.get(selectedKecerdasan); // Retrieve the corresponding ID
            if(txtMinat.getSelectedIndex() != 0){
                System.out.println("Selected Kecerdasan ID: " + selectedKecerdasanId);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try {
        Jurusan j = new Jurusan();
        String selectedKecerdasan = (String) txtMinat.getSelectedItem();
        j.setIdKecerdasan((int) kecerdasanMinatMap.get(selectedKecerdasan));
        j.setNamaJurusan(txtJurusanKuliah.getText());
        
            jurusanDAO.updateJurusanById(Integer.parseInt(txtIdJurusan.getText()), Integer.parseInt(txtIdMinat.getText()),txtJurusanKuliah.getText());
        
        JOptionPane.showMessageDialog(null, "Berhasil, Data diperbaharui!");
        clear();
        refresh_page(); 
        } catch (SQLException ex) {
            Logger.getLogger(TambahJurusan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
       
        try {
        int confirmed = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            Jurusan j = recJurusan.get(tblJurusan.getSelectedRow());
            jurusanDAO.deleteJurusanById(j.getId());
            JOptionPane.showMessageDialog(null, "Berhasil, Data dihapus!");
            refresh_page();
        }
    } catch (SQLException ex) {
        Logger.getLogger(TambahJurusan.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtJurusanKuliahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJurusanKuliahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJurusanKuliahActionPerformed

    private void txtIdJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdJurusanActionPerformed

    private void txtIdMinatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMinatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMinatActionPerformed

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
            java.util.logging.Logger.getLogger(TambahJurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahJurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahJurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahJurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TambahJurusan().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TambahJurusan.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JLabel labelKodeGejala1;
    private javax.swing.JLabel labelKodeGejala2;
    private javax.swing.JLabel labelPertanyaan;
    private javax.swing.JPanel navbar;
    private javax.swing.JTable tblJurusan;
    private javax.swing.JTextField txtIdJurusan;
    private javax.swing.JTextField txtIdMinat;
    private javax.swing.JTextField txtJurusanKuliah;
    private javax.swing.JComboBox<String> txtMinat;
    // End of variables declaration//GEN-END:variables
}