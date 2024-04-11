package view;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mode.Sach;
import service.SachService;

public class QLSach extends javax.swing.JFrame {

    private SachService service = new SachService();
    private DefaultTableModel mol = new DefaultTableModel();
    private int index = -1;

    public QLSach() {
        initComponents();
        setLocationRelativeTo(null);
        filltable(service.getAll());
        inits();
    }

    void inits() {
        String[] cbo = new String[]{
            "HAI", "ATION", "NONG NGHIEP", "GIA DINH"};
        CBBTHELOAI.setModel(new DefaultComboBoxModel<>(cbo));
    }

    void filltable(List<Sach> list) {
        mol = (DefaultTableModel) TBLSACH.getModel();
        mol.setRowCount(0);
        for (Sach sach : list) {
            mol.addRow(sach.toDataRow());
        }
    }

    boolean testData() {

        return true;
    }

    Sach readForm() {
        String ma = TXTMASACH.getText().trim();
        String ten = TXTTENSACH.getText().trim();
        String theloai = CBBTHELOAI.getSelectedItem().toString();
        double dongia = Double.parseDouble(TXTDONGIA.getText().trim());
        return new Sach(ma, ten, theloai, dongia);
    }

    void showData(int index) {
        Sach s = service.getAll().get(index);

        TXTMASACH.setText(s.getMasach());
        TXTTENSACH.setText(s.getTensach());
        CBBTHELOAI.setSelectedItem(s.getTheloai());
        TXTDONGIA.setText(s.getDongia() + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXTTHELOAI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BTNADD = new javax.swing.JButton();
        BTNUPDATE = new javax.swing.JButton();
        BTNFIND = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLSACH = new javax.swing.JTable();
        TXTTENSACH = new javax.swing.JTextField();
        TXTDONGIA = new javax.swing.JTextField();
        TXTMASACH = new javax.swing.JTextField();
        CBBTHELOAI = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUAN LY SACH - NGUYEN DUC MANH PH31746");

        jLabel2.setText("MA SACH");

        jLabel3.setText("TEN SACH");

        jLabel4.setText("THE LOAI");

        jLabel5.setText("DON GIA");

        BTNADD.setText("ADD");
        BTNADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNADDActionPerformed(evt);
            }
        });

        BTNUPDATE.setText("UPDATE");
        BTNUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNUPDATEActionPerformed(evt);
            }
        });

        BTNFIND.setText("FIND-THELOAI");
        BTNFIND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNFINDActionPerformed(evt);
            }
        });

        TBLSACH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "MA SACH", "TEN SACH", "THE LOAI", "DON GIA"
            }
        ));
        TBLSACH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLSACHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLSACH);

        CBBTHELOAI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTNADD)
                                        .addGap(18, 18, 18)
                                        .addComponent(BTNUPDATE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BTNFIND))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TXTTENSACH)
                                            .addComponent(TXTDONGIA, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                            .addComponent(TXTMASACH, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                            .addComponent(CBBTHELOAI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTMASACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXTTENSACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBBTHELOAI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXTDONGIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNADD)
                    .addComponent(BTNUPDATE)
                    .addComponent(BTNFIND))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNADDActionPerformed
        if (testData()) {
            Sach s = readForm();
            if (service.getSach(s.getMasach()) != null) {
                JOptionPane.showMessageDialog(this, "Trung ma");
            } else {
                if (service.addSach(s) > 0) {
                    JOptionPane.showMessageDialog(this, "Them thanh cong");
                    filltable(service.getAll());
                } else {
                    JOptionPane.showMessageDialog(this, "Them that bai");
                }
            }
        }
    }//GEN-LAST:event_BTNADDActionPerformed

    private void BTNUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNUPDATEActionPerformed
        index = TBLSACH.getSelectedRow();

        String masach = TBLSACH.getValueAt(index, 0).toString();
        Sach s = readForm();
        if (service.updateSach(s, masach) > 0) {
            JOptionPane.showMessageDialog(this, "updata thanh cong");
            filltable(service.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "updata that bai");
        }
    }//GEN-LAST:event_BTNUPDATEActionPerformed

    private void BTNFINDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNFINDActionPerformed
        String theloai = JOptionPane.showInputDialog(this, "Nhap the loai can tim");
        theloai = "%" + theloai + "%";
        if (service.findtheloai(theloai) != null) {
            JOptionPane.showMessageDialog(this, "Tim duoc");
            filltable(service.findtheloai(theloai));
            TXTMASACH.setText("");
            TXTTENSACH.setText("");
            TXTDONGIA.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "khong tim duoc");
            mol = (DefaultTableModel) TBLSACH.getModel();
            mol.setRowCount(0);
            TXTMASACH.setText("");
            TXTTENSACH.setText("");
            TXTDONGIA.setText("");
        }

    }//GEN-LAST:event_BTNFINDActionPerformed

    private void TBLSACHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLSACHMouseClicked
        index = TBLSACH.getSelectedRow();
        showData(index);
    }//GEN-LAST:event_TBLSACHMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNADD;
    private javax.swing.JButton BTNFIND;
    private javax.swing.JButton BTNUPDATE;
    private javax.swing.JComboBox<String> CBBTHELOAI;
    private javax.swing.JTable TBLSACH;
    private javax.swing.JTextField TXTDONGIA;
    private javax.swing.JTextField TXTMASACH;
    private javax.swing.JTextField TXTTENSACH;
    private javax.swing.JTextField TXTTHELOAI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
