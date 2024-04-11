/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Student;
import sevice.ST_Service;

/**
 *
 * @author Manhdepzai
 */
public class QLSVien extends javax.swing.JFrame {

    private ST_Service service = new ST_Service();
    private DefaultTableModel mol = new DefaultTableModel();
    int index = -1;

    public QLSVien() {
        initComponents();
        setLocationRelativeTo(null);
        filltable(service.getAll());
    }

    void filltable(List<Student> st) {
        mol = (DefaultTableModel) tblsv.getModel();
        mol.setRowCount(0);
        for (Student s : st) {
            mol.addRow(s.toDataRow());
        }
    }

    void showdata(int index) {
        Student s = service.getAll().get(index);
        TXTID.setText(String.valueOf(s.getId()));
        TXTNAME.setText(s.getName());
        TXTPASS.setText(s.getPass());
        TXTMARK.setText(String.valueOf(s.getMark()));
    }

    boolean testdata() {
        if ( TXTNAME.getText().isBlank() || TXTPASS.getText().isBlank() || TXTMARK.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Khong de trong dl");
            return false;
        }

        return true;
    }

    Student readform() {
        String name = TXTNAME.getText();
        String pass = TXTPASS.getText();
        int mark = Integer.parseInt(TXTMARK.getText());
        return new Student(name, pass, mark);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblsv = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TXTID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TXTNAME = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXTPASS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXTMARK = new javax.swing.JTextField();
        BTNADD = new javax.swing.JButton();
        BTNUPDATE = new javax.swing.JButton();
        BTNDELETE = new javax.swing.JButton();
        BTNEXIT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblsv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "PASS", "MARK"
            }
        ));
        tblsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsv);

        jLabel1.setText("ID");

        jLabel2.setText("NAME");

        jLabel3.setText("PASS");

        jLabel4.setText("MARK");

        BTNADD.setText("ADD");
        BTNADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNADDActionPerformed(evt);
            }
        });

        BTNUPDATE.setText("UPDATE");

        BTNDELETE.setText("DELETE");
        BTNDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDELETEActionPerformed(evt);
            }
        });

        BTNEXIT.setText("EXIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(TXTPASS, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(TXTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(TXTMARK, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(BTNADD)
                        .addGap(18, 18, 18)
                        .addComponent(BTNDELETE)
                        .addGap(18, 18, 18)
                        .addComponent(BTNUPDATE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNEXIT)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXTPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXTMARK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNDELETE)
                    .addComponent(BTNUPDATE)
                    .addComponent(BTNADD)
                    .addComponent(BTNEXIT))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsvMouseClicked
        int index = tblsv.getSelectedRow();
        showdata(index);
    }//GEN-LAST:event_tblsvMouseClicked

    private void BTNDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDELETEActionPerformed
        index = tblsv.getSelectedRow();
        int x = JOptionPane.showConfirmDialog(this, "Ban muon xoa khong", "xoa sinh vien", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        int id = Integer.parseInt(tblsv.getValueAt(index, 0).toString());
        if (x == JOptionPane.YES_OPTION) {
            if (service.delete_ST(id) > 0) {
                JOptionPane.showMessageDialog(this, "Xoa thanh cong");
                filltable(service.getAll());
            } else {
                JOptionPane.showMessageDialog(this, "xoa that bai");
            }
        }

    }//GEN-LAST:event_BTNDELETEActionPerformed

    private void BTNADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNADDActionPerformed
        if (testdata()) {
            Student st = this.readform();
            if (service.insert_ST(st) > 0) {
                JOptionPane.showMessageDialog(this, "them thanh cong");
                filltable(service.getAll());
            }else{
                JOptionPane.showMessageDialog(this, "them that bai");
            }
        }
    }//GEN-LAST:event_BTNADDActionPerformed

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
            java.util.logging.Logger.getLogger(QLSVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNADD;
    private javax.swing.JButton BTNDELETE;
    private javax.swing.JButton BTNEXIT;
    private javax.swing.JButton BTNUPDATE;
    private javax.swing.JTextField TXTID;
    private javax.swing.JTextField TXTMARK;
    private javax.swing.JTextField TXTNAME;
    private javax.swing.JTextField TXTPASS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsv;
    // End of variables declaration//GEN-END:variables
}
