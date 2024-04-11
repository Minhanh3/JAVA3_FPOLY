package view;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;
import service.NhanVienService;
import service.NhanVienServiceImpl;

public class QLNhanVien extends javax.swing.JFrame {

    NhanVienService nhanVienService = new NhanVienServiceImpl();

    private DefaultTableModel defaultTableModel;

    private QLNhanVien() {
        initComponents();
    }

    private void initTable() {
        defaultTableModel = (DefaultTableModel) tblListStudent.getModel();
        defaultTableModel.setColumnIdentifiers(new String[]{"Mã", "Tên", "Giới Tính", "Thâm Niên", "Thưởng"});
    }

    private void initComboBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbbThamNien.getModel();
        for (int i = 0; i < 100; i++) {
            model.addElement(i + 1);
        }
    }

    private void fillTable() {
        defaultTableModel.setRowCount(0);
        for (NhanVien nhanVien : nhanVienService.getList()) {
            defaultTableModel.addRow(new Object[]{nhanVien.getMaNV(), nhanVien.getTenNV(), nhanVien.isGioiTinh(), nhanVien.getThamNien(), nhanVien.tinhThuong()});
        }
    }

    private void clearForm() {
        txtStudentId.setText("");
        txtName.setText("");
        cbbThamNien.setSelectedIndex(0);
        rdGenderMale.setSelected(true);
    }

    private void lastNhatVienList() {
        String studentId = (String) tblListStudent.getValueAt(nhanVienService.getList().size() - 1, 0);
        for (NhanVien nhanVien : nhanVienService.getList()) {
            if (studentId.equals(nhanVien.getMaNV())) {
                txtStudentId.setText(studentId);
                txtName.setText(nhanVien.getTenNV());
                if (nhanVien.isGioiTinh()) {
                    rdGenderMale.setSelected(true);
                } else {
                    rdGenderFemale.setSelected(true);
                }
                cbbThamNien.setSelectedItem(nhanVien.getThamNien());
                break;
            }
        }
    }

    private void fillNhanVienToForm() {
        int selectedRow = tblListStudent.getSelectedRow();

        if (selectedRow >= 0) {
            String studentId = (String) tblListStudent.getValueAt(selectedRow, 0);

            for (NhanVien nhanVien : nhanVienService.getList()) {
                if (studentId.equals(nhanVien.getMaNV())) {
                    txtStudentId.setText(studentId);
                    txtName.setText(nhanVien.getTenNV());
                    if (nhanVien.isGioiTinh()) {
                        rdGenderMale.setSelected(true);
                    } else {
                        rdGenderFemale.setSelected(true);
                    }
                    cbbThamNien.setSelectedItem(nhanVien.getThamNien());
                    break;
                }
            }
        }
    }

    private void dataTable() {
        nhanVienService.getList().add(new NhanVien("HS01", "Long", true, 100));
        nhanVienService.getList().add(new NhanVien("HS02", "Nghia", true, 54));
        nhanVienService.getList().add(new NhanVien("HS03", "Huy", false, 43));
        nhanVienService.getList().add(new NhanVien("HS04", "Tai", true, 23));
        nhanVienService.getList().add(new NhanVien("HS05", "Luat", true, 53));
    }

    private void checkId() {
        int check = 0;
        for (NhanVien nhanVien : nhanVienService.getList()) {
            if (txtStudentId.getText().equals(nhanVien.getMaNV())) {
                check++;
            }
        }
        if (check == 0) {
            String maNV = txtStudentId.getText();
            String tenNV = txtName.getText();
            Integer thamNien = (Integer) cbbThamNien.getSelectedItem();
            nhanVienService.addNhanVien(maNV, tenNV, rdGenderMale.isSelected(), thamNien);
            fillTable();
        } else {
            JOptionPane.showMessageDialog(this, "Id trùng", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    private String checkChoice() {
        int check = 0;
        if (txtStudentId.getText().equalsIgnoreCase("")) {
            txtStudentId.setBackground(Color.orange);
            check++;
        } else {
            txtStudentId.setBackground(Color.white);
        }
        if (txtName.getText().equalsIgnoreCase("")) {
            txtName.setBackground(Color.orange);
            check++;
        } else {
            txtName.setBackground(Color.white);
        }
        if (check > 0) {
            return "stop";
        }
        return "done";
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdGender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnFix = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNote = new javax.swing.JButton();
        txtStudentId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        rdGenderMale = new javax.swing.JRadioButton();
        rdGenderFemale = new javax.swing.JRadioButton();
        cbbThamNien = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListStudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Mã Nhân Viên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Quản Lý Nhân Viên");

        jLabel3.setText("Giới Tính");

        jLabel4.setText("Tên Nhân VIên");

        jLabel5.setText("Tháng");

        jLabel6.setText("Thâm Niên");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("00.02.30");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnFix.setText("Sửa");
        btnFix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFixActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNote.setText("Ghi file");
        btnNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoteActionPerformed(evt);
            }
        });

        rdGender.add(rdGenderMale);
        rdGenderMale.setSelected(true);
        rdGenderMale.setText("Nam");

        rdGender.add(rdGenderFemale);
        rdGenderFemale.setText("Nữ");

        tblListStudent.setModel(new javax.swing.table.DefaultTableModel(
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
        tblListStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListStudent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtName))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(37, 37, 37)
                                .addComponent(rdGenderMale)
                                .addGap(43, 43, 43)
                                .addComponent(rdGenderFemale))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(20, 20, 20)
                                .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnThem)
                .addGap(87, 87, 87)
                .addComponent(btnFix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(83, 83, 83)
                .addComponent(btnNote)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(cbbThamNien, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdGenderMale)
                    .addComponent(rdGenderFemale))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbbThamNien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnFix)
                    .addComponent(btnDelete)
                    .addComponent(btnNote))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        dataTable();

        initTable();

        initComboBox();

        fillTable();

        setLocationRelativeTo(null);

        lastNhatVienList();
    }//GEN-LAST:event_formWindowOpened

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        checkChoice();
        if (checkChoice().equals("stop")) {
            JOptionPane.showMessageDialog(this, "Vui long dien vao o to dam.!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int choice = JOptionPane.showConfirmDialog(this, "Ban co chac muon them khong!", "Thong Bao", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                checkId();
                clearForm();
            }
            JOptionPane.showMessageDialog(this, "Thanh cong");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnFixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFixActionPerformed
        checkChoice();
        if (checkChoice().equals("stop")) {
            JOptionPane.showMessageDialog(this, "Vui long chon ban ghi ben duoi de sua!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int choice = JOptionPane.showConfirmDialog(this, "Ban co chac muon them khong!", "Thong Bao", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                int index = tblListStudent.getSelectedRow();
                String maNV = txtStudentId.getText();
                String tenNV = txtName.getText();
                Integer thamNien = (Integer) cbbThamNien.getSelectedItem();
                nhanVienService.fixNhanVien(index, maNV, tenNV, rdGenderMale.isSelected(), thamNien);
                fillTable();
                clearForm();
            }
            JOptionPane.showMessageDialog(this, "Thanh cong");
        }
    }//GEN-LAST:event_btnFixActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        checkChoice();
        if (checkChoice().equals("stop")) {
            JOptionPane.showMessageDialog(this, "Vui long chon ban ghi ben duoi de sua!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int choice = JOptionPane.showConfirmDialog(this, "Ban co chac muon them khong!", "Thong Bao", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                int index = tblListStudent.getSelectedRow();
                nhanVienService.deleteNhanVien(index);
                fillTable();
                clearForm();
            }
            JOptionPane.showMessageDialog(this, "Thanh cong");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoteActionPerformed
        JOptionPane.showConfirmDialog(this, "Chuc nang ko the thuc hien do nguoi lam chua biet lam chuc nang nay ... :((");
        clearForm();
    }//GEN-LAST:event_btnNoteActionPerformed

    private void tblListStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListStudentMouseClicked
        fillNhanVienToForm();
    }//GEN-LAST:event_tblListStudentMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFix;
    private javax.swing.JButton btnNote;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbbThamNien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.ButtonGroup rdGender;
    private javax.swing.JRadioButton rdGenderFemale;
    private javax.swing.JRadioButton rdGenderMale;
    private javax.swing.JTable tblListStudent;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables

}
