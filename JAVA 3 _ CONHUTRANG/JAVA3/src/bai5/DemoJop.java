/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bai5;

import javax.swing.JOptionPane;

/**
 *
 * @author Manhdepzai
 */
public class DemoJop extends javax.swing.JFrame {

    /**
     * Creates new form Formtdon2
     */
    public DemoJop() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbbtdon = new javax.swing.JComboBox<>();
        Messsage = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        btninput = new javax.swing.JButton();
        option = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        cbbtdon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Messsage.setText("Message");
        Messsage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesssageActionPerformed(evt);
            }
        });

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        btninput.setText("input");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });

        option.setText("option");
        option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Messsage, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(option, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btninput, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Messsage)
                    .addComponent(btninput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option)
                    .addComponent(confirm))
                .addGap(44, 44, 44)
                .addComponent(jButton5)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MesssageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesssageActionPerformed
        JOptionPane.showMessageDialog(this, "Hôm nay là thứ 7", "Thông báo ", 3);
    }//GEN-LAST:event_MesssageActionPerformed

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        String ten = JOptionPane.showInputDialog(this, "Mời Nhập tên ", "Nhập đi", 3);
        if (!ten.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chào bạn: " + ten);
        }
    }//GEN-LAST:event_btninputActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        int n = JOptionPane.showConfirmDialog(this, "Bạn có vợ chưa", "Hỏi Đáp", JOptionPane.YES_NO_CANCEL_OPTION, 3);
        if (n == 0) { // chọn yes
            JOptionPane.showMessageDialog(this, "Ok Bạn xuất sắc");
        }
        if (n == 1) { // chọn no
            JOptionPane.showMessageDialog(this, "Bạn tệ quá");
        }
        if (n == 2) { // cancel
            JOptionPane.showMessageDialog(this, "Hèn là hèn quá ");
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionActionPerformed
        Object[] op = {
            "Hoa", " Linh", "Ánh", "Hiền", "Nhung", "Hương"};
        JOptionPane.showOptionDialog(this, "CHọn tên đi bạn", "Chọn vợ", 0, 1, null, op, op[1]);
    }//GEN-LAST:event_optionActionPerformed

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
            java.util.logging.Logger.getLogger(DemoJop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoJop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoJop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoJop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoJop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Messsage;
    private javax.swing.JButton btninput;
    private javax.swing.JComboBox<String> cbbtdon;
    private javax.swing.JButton confirm;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton option;
    // End of variables declaration//GEN-END:variables
}