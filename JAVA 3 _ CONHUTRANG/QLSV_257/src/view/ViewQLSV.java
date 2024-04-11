package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mode.SinhVien;
import service.SinhVienService;

public class ViewQLSV extends javax.swing.JFrame {

    private SinhVienService service = new SinhVienService();
    private DefaultTableModel dtm = new DefaultTableModel();
    private int index = -1;

    public ViewQLSV() {
        initComponents();
        cbbnganh.removeAllItems();
        String[] menu = {"Phát triển phần mềm", " wed", "Thiết kế", "Khoa hoc may tinh", "Kinh te"};
        for (String item : menu) {
            cbbnganh.addItem(item);
        }
        setLocationRelativeTo(null);
        filltable(service.getAll());
    }

    private void filltable(List<SinhVien> list) {
        dtm = (DefaultTableModel) tblsinhvien.getModel();
        dtm.setRowCount(0);
        for (SinhVien sv : list) {
            dtm.addRow(sv.toDataRow());
        }
    }

    void showdata(int index) {
        SinhVien sv = service.getAll().get(index);
        txtma.setText(sv.getMa());
        txtten.setText(sv.getTen());
        txttuoi.setText(String.valueOf(sv.getTuoi()));
        txtkyhoc.setText(String.valueOf(sv.getTuoi()));
        cbbnganh.setSelectedItem(sv.getNganhhoc());
        txtdiemtb.setText(String.valueOf(sv.getDiemtb()));
        if (!String.valueOf(sv.isGioitinh()).contains("true")) {
            rdonu.setSelected(true);
        } else {
            rdonam.setSelected(true);
        }

    }

    boolean check() {
        if (txtma.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "masv không được bỏ trống");
            return false;
        }
        if (txttuoi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "tuoi không được bỏ trống");
            return false;
        } else {
            if (Integer.valueOf(txttuoi.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Tuoi sai định dạngv");
                return false;
            }
        }
        if (txtdiemtb.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "diemTB không được bỏ trống");
            return false;
        } else {
            if (Float.valueOf(txtdiemtb.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Tuoi sai định dạngv");
                return false;
            }
        }
        if (txtkyhoc.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "KyHoc không được bỏ trống");
            return false;
        } else {
            if (Integer.valueOf(txtkyhoc.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Tuoi sai định dạngv");
                return false;
            }
        }
        if (txtten.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Name không được bỏ trống");
            return false;
        } else {//có name check :name là chữ cái ; không có tiếng việt
            if (!txtten.getText().matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(this, "Name sai định dạng");
                return false;
            }
            return true;
        }
    }

    SinhVien readform() {
        SinhVien sv = new SinhVien();
        sv.setMa(txtma.getText());
        sv.setTen(txtten.getText());
        sv.setTuoi(Integer.parseInt(txttuoi.getText()));
        sv.setDiemtb(Float.parseFloat(txtdiemtb.getText()));
        sv.setHocky(Integer.parseInt(txtkyhoc.getText()));
        if (rdonam.isSelected()) {
            sv.setGioitinh(true); // Chọn 'Nam'
        } else {
            sv.setGioitinh(false); // Chọn 'Nữ'
        }
        sv.setNganhhoc((String) cbbnganh.getSelectedItem());
        return sv;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnremo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsinhvien = new javax.swing.JTable();
        txttuoi = new javax.swing.JTextField();
        txtten = new javax.swing.JTextField();
        txtma = new javax.swing.JTextField();
        txtkyhoc = new javax.swing.JTextField();
        txtdiemtb = new javax.swing.JTextField();
        cbbnganh = new javax.swing.JComboBox<>();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Quản lý SinhVien");

        jLabel3.setText("Điểm Trung Bình");

        jLabel4.setText("Kỳ Học");

        jLabel5.setText("Tên");

        jLabel6.setText("Giới Tính");

        jLabel7.setText("Tuổi");

        jLabel8.setText("Ngành học ");

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnremo.setText("Remove");
        btnremo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoActionPerformed(evt);
            }
        });

        tblsinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Ma", "Tên", "Tuổi", "Học Kỳ", "Ngành học", "Điểm trung bình", "Giới Tính"
            }
        ));
        tblsinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsinhvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsinhvien);

        cbbnganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rdonam);
        rdonam.setText("Nam");

        buttonGroup1.add(rdonu);
        rdonu.setText("Nữ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbnganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtkyhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtdiemtb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdonam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdonu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnadd)
                                .addGap(18, 18, 18)
                                .addComponent(btnupdate)
                                .addGap(28, 28, 28)
                                .addComponent(btnremo)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txttuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbbnganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtkyhoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtdiemtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdonam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdonu)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnupdate)
                    .addComponent(btnremo))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblsinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsinhvienMouseClicked
        int index = tblsinhvien.getSelectedRow();
        showdata(index);
    }//GEN-LAST:event_tblsinhvienMouseClicked

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        if (check()) {
            SinhVien sv = this.readform();
            if (service.getSinhVien(sv.getMa()) != null) {
                JOptionPane.showMessageDialog(this, "mã SV trùng");
            } else {
                if (service.addSinhVien(sv) > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    filltable(service.getAll());
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thất bại");
                }
            }
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if (check()) {
            SinhVien sv = this.readform();
            int index = tblsinhvien.getSelectedRow();
            // Cập nhật thông tin cho đối tượng sv
            if (service.upDateSV(sv, sv.getMa()) > 0) {
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                filltable(service.getAll());
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại");
            }
        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnremoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoActionPerformed
        // TODO add your handling code here:
        if (check()) {
            SinhVien sv = this.readform();
            String maSinhVien = tblsinhvien.getValueAt(index, 1).toString();
            if (service.deleteSV(maSinhVien) > 0) {
                JOptionPane.showMessageDialog(this, "Delete thành công");
                filltable(service.getAll());
            } else {
                JOptionPane.showMessageDialog(this, "Delete thất bại");
            }
        }
    }//GEN-LAST:event_btnremoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewQLSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnremo;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbnganh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JTable tblsinhvien;
    private javax.swing.JTextField txtdiemtb;
    private javax.swing.JTextField txtkyhoc;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtten;
    private javax.swing.JTextField txttuoi;
    // End of variables declaration//GEN-END:variables
}
