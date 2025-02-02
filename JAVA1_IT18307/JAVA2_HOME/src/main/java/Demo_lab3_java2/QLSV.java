/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Demo_lab3_java2;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manhdepzai
 */
public class QLSV extends javax.swing.JFrame {

    private ArrayList<SinhVien> qlsv = new ArrayList<>();

    public QLSV() {
        initComponents();

        qlsv.add(new SinhVien("Mạnhdz", 52, "cntt", "Yến", "Có phần thưởng"));
        qlsv.add(new SinhVien("Mạnhdz nhes", 46, "tkdh", "Yến", "Khong phần thưởng"));

        this.loadTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        txtdiem = new javax.swing.JTextField();
        txthocluc = new javax.swing.JTextField();
        cbbnganh = new javax.swing.JComboBox<>();
        chkphthuog = new javax.swing.JCheckBox();
        btnhthem = new javax.swing.JButton();
        btnxpa = new javax.swing.JButton();
        btncapnhat = new javax.swing.JButton();
        btnnhapmoi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblqlsv = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel2.setText("Họ Và tên");

        jLabel3.setText("Điểm");

        jLabel4.setText("Ngành");

        jLabel5.setText("Học Lực");

        cbbnganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cntt", "TKdh", "TKwed", "MTK", " " }));
        cbbnganh.setSelectedIndex(1);

        chkphthuog.setText("Có Phần Thưởng");

        btnhthem.setText("Thêm");
        btnhthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhthemActionPerformed(evt);
            }
        });

        btnxpa.setText("Xóa");
        btnxpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxpaActionPerformed(evt);
            }
        });

        btncapnhat.setText("Cập Nhật");
        btncapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatActionPerformed(evt);
            }
        });

        btnnhapmoi.setText("Nhập Mới");
        btnnhapmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhapmoiActionPerformed(evt);
            }
        });

        tblqlsv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Họ và Tên", "Điểm", "Ngành", "Học lực", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblqlsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblqlsvMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblqlsv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txthoten)
                            .addComponent(txtdiem)
                            .addComponent(txthocluc)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbnganh, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnhthem)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnxpa)
                                        .addGap(18, 18, 18)
                                        .addComponent(btncapnhat)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnnhapmoi))
                                    .addComponent(chkphthuog, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbnganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txthocluc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkphthuog)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhthem)
                    .addComponent(btnxpa)
                    .addComponent(btncapnhat)
                    .addComponent(btnnhapmoi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhthemActionPerformed
        // TODO add your handling code here:
        SinhVien sv = this.getForm();
        qlsv.add(sv);
        loadTable();
    }//GEN-LAST:event_btnhthemActionPerformed

    private void tblqlsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblqlsvMouseClicked
        // TODO add your handling code here:
//        int row = this.tblqlsv.getSelectedRow();
//        if(row == -1 ){
//        return;}
//        SinhVien sv = this.qlsv.get(row);
//        this.txthoten.setText(sv.getHoten());
//        this.txtdiem.setText.(sv.getDiem());

//        this.cbbnganh.setSelectedItem(sv.getNganh());
//        
    }//GEN-LAST:event_tblqlsvMouseClicked

    private void btnnhapmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhapmoiActionPerformed
        // TODO add your handling code here:
        this.txthoten.setText("");
        this.txtdiem.setText("");
        this.cbbnganh.setSelectedIndex(0);
        this.txthocluc.setText("");
        this.chkphthuog.setSelected(false);

    }//GEN-LAST:event_btnnhapmoiActionPerformed

    private void btnxpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxpaActionPerformed
        // TODO add your handling code here:
        int row = this.tblqlsv.getSelectedRow();
        if (row == -1) {
            return;
        }
        this.qlsv.remove(row);
        this.loadTable();
    }//GEN-LAST:event_btnxpaActionPerformed

    private void btncapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatActionPerformed
        // TODO add your handling code here:
        int row = this.tblqlsv.getSelectedRow();
        if (row == -1) {
            return;
        }
        SinhVien sv = this.getForm();
        qlsv.set(row, sv);
        this.loadTable();
    }//GEN-LAST:event_btncapnhatActionPerformed
    private void loadTable() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblqlsv.getModel();
        dtm.setRowCount(0);
        for (SinhVien sinhVien : qlsv) {
            Object[] obj = {
                sinhVien.getHoten(),
                sinhVien.getDiem(),
                sinhVien.getNganh(),
                sinhVien.getHocluc(),
                sinhVien.getTrangthai()
            };
            dtm.addRow(obj);
        }

    }

    private SinhVien getForm() {
        String hoten = this.txthoten.getText();
        double diem = Double.parseDouble(this.txtdiem.getText());
        String nganh = this.cbbnganh.getSelectedItem().toString();
        String hocluc = this.txthocluc.getText();
        String trangthai = this.chkphthuog.isSelected() == true
                ? " Có Phần thường" : " Không có phần thưởng";

        SinhVien sv = new SinhVien(hoten, diem, nganh, hocluc, trangthai);
        return sv;
    }

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
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncapnhat;
    private javax.swing.JButton btnhthem;
    private javax.swing.JButton btnnhapmoi;
    private javax.swing.JButton btnxpa;
    private javax.swing.JComboBox<String> cbbnganh;
    private javax.swing.JCheckBox chkphthuog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tblqlsv;
    private javax.swing.JTextField txtdiem;
    private javax.swing.JTextField txthocluc;
    private javax.swing.JTextField txthoten;
    // End of variables declaration//GEN-END:variables
}
