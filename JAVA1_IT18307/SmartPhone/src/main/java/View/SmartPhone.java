package View;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SmartPhone extends javax.swing.JFrame {

    private ArrayList<SanPham> dssp = new ArrayList<>();

    private String filename = "List_sp.dat";

    public SmartPhone() {
        initComponents();
        dssp.add(new SanPham("MacbookAir 2022", "LT1012", 29999, "Laptop"));
        dssp.add(new SanPham("Iphone 11", "SP2012", 30999, "SmartPhone"));
        dssp.add(new SanPham("Iphone SX Max", "SP3021", 159999, "SmartPhone"));

        this.LoadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbsanoham = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttensp = new javax.swing.JTextField();
        txtmaso = new javax.swing.JTextField();
        txtdongia = new javax.swing.JTextField();
        cbbdanhmuc = new javax.swing.JComboBox<>();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnxoafrom = new javax.swing.JButton();
        btnghifile = new javax.swing.JButton();
        btndocfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên SP");

        tbsanoham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên SP", "Mã SP", "Danh Mục", "Đơn Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbsanoham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbsanohamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbsanoham);

        jLabel2.setText("Mã SP");

        jLabel3.setText("Đơn giá");

        jLabel4.setText("Danh Mục");

        txttensp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttenspActionPerformed(evt);
            }
        });

        txtdongia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdongiaActionPerformed(evt);
            }
        });

        cbbdanhmuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "SmartPhone", " ", " " }));

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnxoafrom.setText("Xóa From");
        btnxoafrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoafromActionPerformed(evt);
            }
        });

        btnghifile.setText("Ghi File");
        btnghifile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnghifileActionPerformed(evt);
            }
        });

        btndocfile.setText("Đọc File");
        btndocfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndocfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnthem)
                                .addGap(18, 18, 18)
                                .addComponent(btnxoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnxoafrom)
                                .addGap(18, 18, 18)
                                .addComponent(btnghifile)
                                .addGap(18, 18, 18)
                                .addComponent(btndocfile))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtmaso))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtdongia)
                                    .addComponent(cbbdanhmuc, 0, 131, Short.MAX_VALUE))))
                        .addGap(0, 55, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtmaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbdanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnxoa)
                    .addComponent(btnxoafrom)
                    .addComponent(btnghifile)
                    .addComponent(btndocfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttenspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttenspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttenspActionPerformed

    private void txtdongiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdongiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdongiaActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        SanPham sp = this.getForm();
        if (sp == null) {
            return;
        }
        dssp.add(sp);
        this.LoadTable();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoafromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoafromActionPerformed
        // TODO add your handling code here:
        this.txttensp.setText("");
        this.txtmaso.setText("");
        this.txtdongia.setText("");
        this.cbbdanhmuc.setSelectedIndex(0);

    }//GEN-LAST:event_btnxoafromActionPerformed
    private void LoadTable() {
        DefaultTableModel dtm = (DefaultTableModel) this.tbsanoham.getModel();
        dtm.setRowCount(0);
        for (SanPham sp : dssp) {
            Object[] obj = {
                sp.getTen(),
                sp.getMasp(),
                sp.getDongia(),
                sp.getDanhmuc()

            };
            dtm.addRow(obj);
        }
        JOptionPane.showMessageDialog(this, "Load dữ liệu thành công");
    }

    private SanPham getForm() {
        String ten = this.txttensp.getText();
        String masp = this.txtmaso.getText();
        double dongia = Double.valueOf(this.txtdongia.getText());
        String danhmuc = this.cbbdanhmuc.getSelectedItem().toString();

        if (ten.length() == 0
                || masp.length() == 0) {
            JOptionPane.showMessageDialog(this, "Kh được để trống");
            return null;
        }

        SanPham sp = new SanPham(ten, masp, dongia, danhmuc);
        return sp;
    }
    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        int row = this.tbsanoham.getSelectedRow();
        if (row == -1) {
            return;
        }
        this.dssp.remove(row);
        this.LoadTable();
        JOptionPane.showMessageDialog(this, "Xóa thành công");
    }//GEN-LAST:event_btnxoaActionPerformed

    private void tbsanohamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsanohamMouseClicked
        int row = this.tbsanoham.getSelectedRow();
        if (row == -1) {
            return;
        }
        SanPham sp = this.dssp.get(row);

        this.txttensp.setText(sp.getTen());
        this.txtmaso.setText(sp.getMasp());
        this.txtdongia.setText(String.valueOf(sp.getDongia()));
        this.cbbdanhmuc.setSelectedItem(sp.getDanhmuc());


    }//GEN-LAST:event_tbsanohamMouseClicked

    private void btnghifileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnghifileActionPerformed
        File f = new File(filename);
        if (f.exists() == false) {
            JOptionPane.showMessageDialog(this, "File kh tồi tại");
            return;
        }

        try {
            //mở stream để ghi file
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dssp);
            //đóng stream
            oos.close();

            JOptionPane.showMessageDialog(this, "Ghi file thành công");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ghi file thất bại");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ghi file thất bại");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnghifileActionPerformed

    private void btndocfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndocfileActionPerformed
        File f = new File(filename);
        if (f.exists() == false) {
            JOptionPane.showMessageDialog(this, "File kh tồi tại");
            return;
        }
        

    }//GEN-LAST:event_btndocfileActionPerformed

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
            java.util.logging.Logger.getLogger(SmartPhone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmartPhone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmartPhone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmartPhone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmartPhone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndocfile;
    private javax.swing.JButton btnghifile;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton btnxoafrom;
    private javax.swing.JComboBox<String> cbbdanhmuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbsanoham;
    private javax.swing.JTextField txtdongia;
    private javax.swing.JTextField txtmaso;
    private javax.swing.JTextField txttensp;
    // End of variables declaration//GEN-END:variables
}
