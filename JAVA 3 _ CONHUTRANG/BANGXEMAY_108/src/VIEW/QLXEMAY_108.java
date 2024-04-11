package VIEW;

import MODE.XeMay;
import SERVICE.XeMauService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLXEMAY_108 extends javax.swing.JFrame {

    private XeMauService service = new XeMauService();
    private DefaultTableModel mol = new DefaultTableModel();
    int index = -1;

    public QLXEMAY_108() {
        initComponents();
        setLocationRelativeTo(null);
        cbbsluong.removeAllItems();
        for (int i = 0; i < 3001; i++) {
            cbbsluong.addItem(String.valueOf(i));
        }
        filldata(service.GetAll());
    }

    void filldata(List<XeMay> xm) {
        mol = (DefaultTableModel) tblxemay.getModel();
        mol.setRowCount(0);
        for (XeMay x : xm) {
            mol.addRow(x.toDataRow());
        }
    }

    void showdata(int index) {
        XeMay xm = service.GetAll().get(index);
        txtmauxe.setText(xm.getMa());
        txttenxe.setText(xm.getTen());
        txtgiaban.setText(xm.getGiaban() + "");
        txtgiamhap.setText(xm.getGianhap() + "");
        cbbtthai.setSelectedItem(String.valueOf(xm.getTrangthai()));
        cbbsluong.setSelectedItem(String.valueOf(xm.getSoluong()));
    }

    XeMay readform() {
        String ma = txtmauxe.getText();
        String ten = txttenxe.getText();
        double gianhap = Double.parseDouble(txtgiamhap.getText());
        double giaban = Double.parseDouble(txtgiaban.getText());
        int tthai =  cbbtthai.getSelectedIndex();
        int soluong = cbbsluong.getSelectedIndex();
        return new XeMay(ma, ten, tthai, tthai, tthai, soluong);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmauxe = new javax.swing.JTextField();
        txttenxe = new javax.swing.JTextField();
        txtgiaban = new javax.swing.JTextField();
        txtgiamhap = new javax.swing.JTextField();
        cbbtthai = new javax.swing.JComboBox<>();
        cbbsluong = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblxemay = new javax.swing.JTable();
        BTNADD = new javax.swing.JButton();
        BTNUP = new javax.swing.JButton();
        BTNDALE = new javax.swing.JButton();
        BTNEXIT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mau xe");

        jLabel2.setText("Ten xe");

        jLabel3.setText("Trang thai");

        jLabel4.setText("Gia ban");

        jLabel5.setText("GIa Nhap");

        jLabel6.setText("So luong");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("SU DUNG BANG XE MAY");

        cbbtthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "còn hàng", "hết hàng" }));

        cbbsluong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblxemay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ma xe", "ten xe", "gia ban", "gia nhap", "trang thai", "so luong"
            }
        ));
        tblxemay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblxemayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblxemay);

        BTNADD.setText("ADD");
        BTNADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNADDActionPerformed(evt);
            }
        });

        BTNUP.setText("UPDATE");
        BTNUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNUPActionPerformed(evt);
            }
        });

        BTNDALE.setText("DELETE");
        BTNDALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDALEActionPerformed(evt);
            }
        });

        BTNEXIT.setText("EXIT");
        BTNEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEXITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttenxe, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(txtmauxe)
                    .addComponent(cbbtthai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbsluong, 0, 151, Short.MAX_VALUE)
                    .addComponent(txtgiamhap, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(BTNADD)
                .addGap(18, 18, 18)
                .addComponent(BTNUP)
                .addGap(18, 18, 18)
                .addComponent(BTNDALE)
                .addGap(18, 18, 18)
                .addComponent(BTNEXIT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtmauxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtgiamhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txttenxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cbbsluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cbbtthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNADD)
                    .addComponent(BTNUP)
                    .addComponent(BTNDALE)
                    .addComponent(BTNEXIT))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblxemayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblxemayMouseClicked
        index = tblxemay.getSelectedRow();
        showdata(index);
    }//GEN-LAST:event_tblxemayMouseClicked

    private void BTNADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNADDActionPerformed
        XeMay xm = readform();
        if (service.Insert(xm)>0) {
            JOptionPane.showMessageDialog(this, "them thanh cong");
            filldata(service.GetAll());
        }else{
            JOptionPane.showMessageDialog(this, "them that bai");
        }
    }//GEN-LAST:event_BTNADDActionPerformed

    private void BTNEXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEXITActionPerformed
        txtmauxe.setText("");
        txttenxe.setText("");
        txtgiaban.setText("");
        txtgiamhap.setText("");
        cbbsluong.setSelectedIndex(0);
        cbbtthai.setSelectedIndex(0);
    }//GEN-LAST:event_BTNEXITActionPerformed

    private void BTNDALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDALEActionPerformed
        // TODO add your handling code here:
        index = tblxemay.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "ban can chon dong de xoa");
        } else {
            int yasuo = JOptionPane.showConfirmDialog(this, "ban chac co muon xoa khong", "thong bao", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (yasuo == JOptionPane.YES_OPTION) {
                String ma = tblxemay.getValueAt(index, 0).toString();
                if (service.delete(ma) > 0) {
                    JOptionPane.showMessageDialog(this, "xoa thanh cong");
                    filldata(service.GetAll());
                } else {
                    JOptionPane.showMessageDialog(this, "xoa that bai");
                }
            } else {

            }

        }
    }//GEN-LAST:event_BTNDALEActionPerformed

    private void BTNUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNUPActionPerformed

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
            java.util.logging.Logger.getLogger(QLXEMAY_108.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLXEMAY_108.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLXEMAY_108.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLXEMAY_108.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLXEMAY_108().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNADD;
    private javax.swing.JButton BTNDALE;
    private javax.swing.JButton BTNEXIT;
    private javax.swing.JButton BTNUP;
    private javax.swing.JComboBox<String> cbbsluong;
    private javax.swing.JComboBox<String> cbbtthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblxemay;
    private javax.swing.JTextField txtgiaban;
    private javax.swing.JTextField txtgiamhap;
    private javax.swing.JTextField txtmauxe;
    private javax.swing.JTextField txttenxe;
    // End of variables declaration//GEN-END:variables
}
