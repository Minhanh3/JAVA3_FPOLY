package View;

import Mode.SinhVien;
import Service.SinhVienService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View_SinhVien extends javax.swing.JFrame {

    private SinhVienService service = new SinhVienService();
    private DefaultTableModel mol = new DefaultTableModel();
    private int index = -1;// chỉ số của dòng trong bảng

    public View_SinhVien() {
        initComponents();
        setLocationRelativeTo(null);
        fillTable(service.getAll());
        // đổ dữ liệu từ data sang bảng

    }

    void fillTable(List<SinhVien> list) {
        mol = (DefaultTableModel) tblSinhvien.getModel();
        mol.setRowCount(0);
        for (SinhVien x : list) {
            mol.addRow(x.toDataRow());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhvien = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnsort = new javax.swing.JButton();
        btnfind = new javax.swing.JButton();
        btndele = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        btnfindname = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        tblSinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        tblSinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhvien);

        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnsort.setText("SORT");
        btnsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortActionPerformed(evt);
            }
        });

        btnfind.setText("FIND");
        btnfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindActionPerformed(evt);
            }
        });

        btndele.setText("DELETE");
        btndele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleActionPerformed(evt);
            }
        });

        btnreset.setText("RESET");

        btnfindname.setText("FINDNAME");
        btnfindname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnadd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btndele)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnfindname)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnfind)
                        .addGap(18, 18, 18)
                        .addComponent(btnsort)
                        .addGap(18, 18, 18)
                        .addComponent(btnreset)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnreset)
                    .addComponent(btnsort)
                    .addComponent(btnfind)
                    .addComponent(btndele)
                    .addComponent(btnupdate))
                .addGap(11, 11, 11)
                .addComponent(btnfindname)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhvienMouseClicked
        index = tblSinhvien.getSelectedRow();
        this.showData(index);

    }//GEN-LAST:event_tblSinhvienMouseClicked

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        if (this.testData()) {
            SinhVien sv = this.readForm();
            if (service.getSinhVien(sv.getId()) != null) { // trùng mã
                JOptionPane.showMessageDialog(this, "Mã trùng kh thêm được");
            } else {
                if (service.addSinhVien(sv) > 0) { // thêm thành công
                    JOptionPane.showMessageDialog(this, "Them thanh cong");
                    this.fillTable(service.getAll());
                } else {
                    JOptionPane.showMessageDialog(this, "Them that bai");
                }
            }
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btndeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleActionPerformed
        // chọn dòng cần xóa 
        index = tblSinhvien.getSelectedRow();
        int id = Integer.parseInt(tblSinhvien.getValueAt(index, 0).toString());
        if (service.deleteSinhVien(id) > 0) { // xóa được
            JOptionPane.showMessageDialog(this, "Xóa thành cong");
            fillTable(service.getAll());
        } else { // không xóa được
            JOptionPane.showMessageDialog(this, "Xóa thát bai");
        }
    }//GEN-LAST:event_btndeleActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        //chọn dòng cần update
        index = tblSinhvien.getSelectedRow();
        int id = Integer.parseInt(tblSinhvien.getValueAt(index, 0).toString());
        // lấy đối tượng mới tự form
        SinhVien sv = this.readForm();
        if (service.updateSinhVien(sv, id) > 0) { // update được
            JOptionPane.showMessageDialog(this, "Update thành cong");
            this.fillTable(service.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Update that bại");
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog(this, "Nhập ID cần tìm kiếm:"));
        if (service.getSinhVien(id) != null) {// tìm được
            for (int i = 0; i < tblSinhvien.getRowCount(); i++) {
                int gt = Integer.parseInt(tblSinhvien.getValueAt(i, 0).toString());
                if (gt == id) {
                    index = i;
                    break;
                }
            }//đóng for
            this.showData(index);
            tblSinhvien.setRowSelectionInterval(index, index);
            System.out.println(index);
        } else {
            JOptionPane.showMessageDialog(this, "Không tim thấy");
            txtid.setText("");
            txtname.setText("");
        }
    }//GEN-LAST:event_btnfindActionPerformed

    private void btnfindnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindnameActionPerformed
        String name = JOptionPane.showInputDialog(this, "Nhập tên cần tìm kiếm:");
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên.");
            return;
        } else {
            name = "%" + name + "%";
            if (service.findName(name).size() > 0)//timf tương đối 
            {
                JOptionPane.showMessageDialog(this, "Tìm được");
                fillTable(service.findName(name));
                txtid.setText("");
                txtname.setText("");
            } else { // khong tìm thấy
                JOptionPane.showMessageDialog(this, "khong tim được");
                mol = (DefaultTableModel) tblSinhvien.getModel();
                mol.setRowCount(0); // xóa trắng
                txtid.setText("");
                txtname.setText("");
            }
        }
//        List<SinhVien> svList = service.findName(name);
//        if (svList != null && !svList.isEmpty()) {
//            DefaultTableModel model = (DefaultTableModel) tblSinhvien.getModel();
//            mol.setRowCount(0);
//            for (SinhVien sv : svList) {
//                Object[] row = {sv.getId(), sv.getName()};
//                mol.addRow(row);
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Không tìm thấy SinhVien với tên: " + name);
//        }
    }//GEN-LAST:event_btnfindnameActionPerformed

    private void btnsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortActionPerformed
        List<SinhVien> lists = service.Sortname();
        fillTable(lists);
    }//GEN-LAST:event_btnsortActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_SinhVien().setVisible(true);
            }
        });
    }

    void showData(int index) {
        //lấy đối tượng sv từ list tai vị trí được chọn
        SinhVien sv = service.getAll().get(index);
        txtid.setText(String.valueOf(sv.getId()));
        txtname.setText(sv.getName());
        //nếu combo: getSelecitem
        //nếu có radio : if . else

    }

    SinhVien readForm() {
        int id = Integer.parseInt(txtid.getText().trim());
        String name = txtname.getText().trim();
        return new SinhVien(id, name);
    }

    boolean testData() {
        if (txtid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID rỗng");
            return false; // dừng
        } else { // đã có dl : check: id là số? id >=0
            try { // là số
                if (Integer.parseInt(txtid.getText()) < 0) {
                    JOptionPane.showMessageDialog(this, "id < 0");
                    return false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ID khong phải số");
                return false;
            }
        }

        //check ten 
        if (txtname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "name rỗng");
            return false;
        } else { // check tên là chữ cái ; áp dụng kh tiếng việt
            if (!txtname.getText().matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(this, "name sai định dạng");
                return false;
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndele;
    private javax.swing.JButton btnfind;
    private javax.swing.JButton btnfindname;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsort;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSinhvien;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
