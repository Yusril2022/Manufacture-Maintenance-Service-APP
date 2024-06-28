/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package maintenance.service;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yusri
 */
public class menuMesin extends javax.swing.JPanel {

    /**
     * Creates new form menuMesin
     */
    public menuMesin() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        tblMesin.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tblMesin.getTableHeader().setOpaque(false);
        tblMesin.getTableHeader().setBackground(new Color(19, 71, 186));
        tblMesin.getTableHeader().setForeground(new Color(255, 255, 255));
        
        // Pengaturan tinggi baris
        tblMesin.setRowHeight(30);
        
        // Pengaturan font tabel
        tblMesin.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        // Pengaturan warna latar belakang dan latar depan sel tabel
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setBackground(new Color(240, 240, 240)); // Warna latar belakang
        cellRenderer.setForeground(new Color(0, 0, 0)); // Warna teks
        tblMesin.setDefaultRenderer(Object.class, cellRenderer);
        
        // Menambahkan margin pada sel tabel
        cellRenderer.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        loadData();
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
        jPanel2 = new javax.swing.JPanel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kode_mesin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama_mesin = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMesin = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(74, 124, 237));
        jPanel1.setPreferredSize(new java.awt.Dimension(1046, 847));

        jPanel2.setBackground(new java.awt.Color(19, 71, 186));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 61));

        txtCari.setForeground(new java.awt.Color(153, 153, 153));
        txtCari.setText("Cari..");

        btnCari.setBackground(new java.awt.Color(19, 71, 186));
        btnCari.setForeground(new java.awt.Color(19, 71, 186));
        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maintenance/service/cari.png"))); // NOI18N
        btnCari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mesin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSimpan.setBackground(new java.awt.Color(19, 71, 186));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Kode Mesin");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText(":");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nama Mesin");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText(":");

        btnEdit.setBackground(new java.awt.Color(19, 71, 186));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(19, 71, 186));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kode_mesin, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama_mesin, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kode_mesin, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nama_mesin, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        tblMesin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Kode Mesin", "Nama Mesin"
            }
        ));
        jScrollPane1.setViewportView(tblMesin);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String ID;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/mms_db";
        SUser = "root";
        SPass = "";
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            ID = txtCari.getText();
            if ("".equals(ID)) {
                JOptionPane.showMessageDialog(new JFrame(), "ID is require",
                    "Dialog",
                    JOptionPane.ERROR_MESSAGE);

            } else {
                String sql = "SELECT * FROM mesin WHERE id=" + ID;
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    kode_mesin.setText(rs.getString("id"));
                    nama_mesin.setText(rs.getString("nama_mesin"));
                    notFound = 1;
                    con.close();
                }
                if (notFound == 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "invalid ID",
                        "Dialog",
                        JOptionPane.ERROR_MESSAGE);

                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String kodeMesin, namaMesin, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/mms_db";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if ("".equals(kode_mesin.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Kode Mesin harus di isi", "Error", JOptionPane.WARNING_MESSAGE);

            } else if ("".equals(nama_mesin.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Nama mesin harus di isi", "Error", JOptionPane.WARNING_MESSAGE);

            } else {
                kodeMesin = kode_mesin.getText();
                namaMesin = nama_mesin.getText();
                query = "INSERT INTO mesin(kode_mesin,nama_mesin)"
                + "VALUES('" + kodeMesin + "', '" + namaMesin + "')";

                st.execute(query);
                kode_mesin.setText("");
                nama_mesin.setText("");
                showMessageDialog(null, "Data Mesin berhasil disimpan!");
                loadData();
                con.close();
            }
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String ID;
        int notFound = 0;
        String kodeMesin, namaMesin;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/mms_db";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            ID = txtCari.getText();
            if ("".equals(ID)) {
                JOptionPane.showMessageDialog(new JFrame(), "ID is require", "Dialog",
                    JOptionPane.ERROR_MESSAGE);

            } else {
                String sql = "SELECT * FROM mesin WHERE id=" + ID;
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    notFound = 1;
                    kodeMesin = kode_mesin.getText();
                    namaMesin = nama_mesin.getText();

                    String sql2 = "UPDATE mesin SET kode_mesin='" + kodeMesin + "',nama_mesin='" + namaMesin +  "' WHERE id=" + ID;

                    st.executeUpdate(sql2);
                    showMessageDialog(null, "Data Mesin berhasil diubah!");
                    loadData();
                    con.close();
                }
                if (notFound == 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog",
                        JOptionPane.ERROR_MESSAGE);

                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String ID;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/mms_db";
        SUser = "root";
        SPass = "";
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            ID = txtCari.getText();
            if ("".equals(ID)) {
                JOptionPane.showMessageDialog(new JFrame(), "ID is require",
                    "Dialog",
                    JOptionPane.ERROR_MESSAGE);

            } else {
                String sql = "SELECT * FROM mesin WHERE id=" + ID;
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    notFound = 1;
                    String sql2 = "DELETE FROM mesin WHERE id=" + ID;
                    st.executeUpdate(sql2);
                    loadData();
                    con.close();
                    showMessageDialog(null, "Data Mesin sudah dihapus!");
                }
                if (notFound == 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "ID salah",
                        "Dialog",
                        JOptionPane.ERROR_MESSAGE);

                }
            }
        } catch (HeadlessException | ClassNotFoundException e) {
            System.out.println("Error " + e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(menuMekanik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kode_mesin;
    private javax.swing.JTextField nama_mesin;
    private javax.swing.JTable tblMesin;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables

public final void loadData() {
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/mms_db";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Kode Mesin",
                "Nama Mesin"}, 0);
            tblMesin.setModel(model);
            String sql = "SELECT * FROM mesin";
            ResultSet rs = st.executeQuery(sql);
            String idMesin, kodeMesin, namaMesin;
            while (rs.next()) {
                idMesin = rs.getString("id");
                kodeMesin = rs.getString("kode_mesin");
                namaMesin = rs.getString("nama_mesin");
           
                model.addRow(new Object[]{idMesin, kodeMesin, namaMesin});
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
