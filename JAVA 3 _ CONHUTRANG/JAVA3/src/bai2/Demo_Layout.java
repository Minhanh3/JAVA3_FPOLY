package bai2;

import javax.swing.JOptionPane;

public class Demo_Layout extends javax.swing.JFrame {

    private double x = 0;
    private String pheptoan = "";

    public Demo_Layout() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtso = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnso1 = new javax.swing.JButton();
        btnso2 = new javax.swing.JButton();
        btnso3 = new javax.swing.JButton();
        btnchia = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnso4 = new javax.swing.JButton();
        btnso5 = new javax.swing.JButton();
        btnso6 = new javax.swing.JButton();
        btnnhan = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnso7 = new javax.swing.JButton();
        btnso8 = new javax.swing.JButton();
        btnso9 = new javax.swing.JButton();
        btntru = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btnso0 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btncong = new javax.swing.JButton();
        btnbang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANH DZ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("CASIO");

        txtso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtso.setText("KET QUA");

        jPanel1.setLayout(new java.awt.GridLayout(4, 5, 10, 10));

        btnso1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnso1.setText("1");
        btnso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnso1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnso1);

        btnso2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnso2.setText("2");
        btnso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnso2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnso2);

        btnso3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnso3.setText("3");
        btnso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnso3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnso3);

        btnchia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnchia.setText("/");
        btnchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnchia);

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("sqrt");
        jPanel1.add(jButton5);

        btnso4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnso4.setText("4");
        btnso4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnso4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnso4);

        btnso5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnso5.setText("5");
        btnso5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnso5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnso5);

        btnso6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnso6.setText("6");
        btnso6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnso6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnso6);

        btnnhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnnhan.setText("*");
        btnnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhanActionPerformed(evt);
            }
        });
        jPanel1.add(btnnhan);

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("%");
        jPanel1.add(jButton10);

        btnso7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnso7.setText("7");
        btnso7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnso7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnso7);

        btnso8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnso8.setText("8");
        btnso8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnso8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnso8);

        btnso9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnso9.setText("9");
        btnso9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnso9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnso9);

        btntru.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btntru.setText("-");
        btntru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntruActionPerformed(evt);
            }
        });
        jPanel1.add(btntru);

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton15.setText("1/x");
        jPanel1.add(jButton15);

        btnso0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnso0.setText("0");
        btnso0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnso0ActionPerformed(evt);
            }
        });
        jPanel1.add(btnso0);

        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton17.setText("+/-");
        jPanel1.add(jButton17);

        btnxoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnxoa.setText("C");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnxoa);

        btncong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncong.setText("+");
        btncong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncongActionPerformed(evt);
            }
        });
        jPanel1.add(btncong);

        btnbang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnbang.setText("=");
        btnbang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbangActionPerformed(evt);
            }
        });
        jPanel1.add(btnbang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtso)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtso, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnso1ActionPerformed
        // TODO add your handling code here:
        String kq = txtso.getText();
        if (kq.length() < 10) {
            if (kq.equals("0")) {
                kq = "";
            }
            long so = Long.parseLong(kq + btnso1.getText());
            txtso.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnso1ActionPerformed

    private void btnso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnso2ActionPerformed
        String kq = txtso.getText();
        if (kq.length() < 10) {
            if (kq.equals("0")) {
                kq = "";
            }
            long so = Long.parseLong(kq + btnso2.getText());
            txtso.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnso2ActionPerformed

    private void btnso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnso3ActionPerformed
        // TODO add your handling code here:
        String kq = txtso.getText();
        if (kq.length() < 10) {
            if (kq.equals("0")) {
                kq = "";
            }
            long so = Long.parseLong(kq + btnso3.getText());
            txtso.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnso3ActionPerformed

    private void btnso4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnso4ActionPerformed
        // TODO add your handling code here:
        String kq = txtso.getText();
        if (kq.length() < 10) {
            if (kq.equals("0")) {
                kq = "";
            }
            long so = Long.parseLong(kq + btnso4.getText());
            txtso.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnso4ActionPerformed

    private void btnso5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnso5ActionPerformed
        // TODO add your handling code here:
        String kq = txtso.getText();
        if (kq.length() < 10) {
            if (kq.equals("0")) {
                kq = "";
            }
            long so = Long.parseLong(kq + btnso5.getText());
            txtso.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnso5ActionPerformed

    private void btnso6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnso6ActionPerformed
        // TODO add your handling code here:
        String kq = txtso.getText();
        if (kq.length() < 10) {
            if (kq.equals("0")) {
                kq = "";
            }
            long so = Long.parseLong(kq + btnso6.getText());
            txtso.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnso6ActionPerformed

    private void btnso7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnso7ActionPerformed
        // TODO add your handling code here:
        String kq = txtso.getText();
        if (kq.length() < 10) {
            if (kq.equals("0")) {
                kq = "";
            }
            long so = Long.parseLong(kq + btnso7.getText());
            txtso.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnso7ActionPerformed

    private void btnso8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnso8ActionPerformed
        // TODO add your handling code here:
        String kq = txtso.getText();
        if (kq.length() < 10) {
            if (kq.equals("0")) {
                kq = "";
            }
            long so = Long.parseLong(kq + btnso8.getText());
            txtso.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnso8ActionPerformed

    private void btnso9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnso9ActionPerformed
        // TODO add your handling code here:
        String kq = txtso.getText();
        if (kq.length() < 10) {
            if (kq.equals("0")) {
                kq = "";
            }
            long so = Long.parseLong(kq + btnso9.getText());
            txtso.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnso9ActionPerformed

    private void btnso0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnso0ActionPerformed
        // TODO add your handling code here:
        String kq = txtso.getText();
        if (kq.length() < 10) {
            if (kq.equals("0")) {
                kq = "";
            }
            long so = Long.parseLong(kq + btnso0.getText());
            txtso.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnso0ActionPerformed

    private void btncongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncongActionPerformed
        x = Double.parseDouble(txtso.getText());
        pheptoan = "+";
        txtso.setText("0");
    }//GEN-LAST:event_btncongActionPerformed

    private void btntruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntruActionPerformed
        // TODO add your handling code here:
        x = Double.parseDouble(txtso.getText());
        pheptoan = "-";
        txtso.setText("0");
    }//GEN-LAST:event_btntruActionPerformed

    private void btnnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhanActionPerformed
        // TODO add your handling code here:
        x = Double.parseDouble(txtso.getText());
        pheptoan = "*";
        txtso.setText("0");
    }//GEN-LAST:event_btnnhanActionPerformed

    private void btnchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiaActionPerformed
        // TODO add your handling code here:
        x = Double.parseDouble(txtso.getText());
        pheptoan = "/";
        txtso.setText("0");
    }//GEN-LAST:event_btnchiaActionPerformed

    private void btnbangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbangActionPerformed
        String so = txtso.getText();
        if(so.isBlank()){
            JOptionPane.showMessageDialog(this, "Không được trống");
            return;
        }
        double kq = 0;
        double b = Double.parseDouble(txtso.getText());
       
        if (pheptoan.length() > 0) {
            if (pheptoan.equals("+")) {
                kq = x + b;
                txtso.setText(String.valueOf(kq));
            } else if (pheptoan.equals("-")) {
                kq = x - b;
                txtso.setText(String.valueOf(kq));
            } else if (pheptoan.equals("*")) {
                kq = x * b;
                txtso.setText(String.valueOf(kq));
            } else {
                kq = x / b;
                txtso.setText(String.valueOf(kq));
            }
            pheptoan = "";
            x = 0;
        }

    }//GEN-LAST:event_btnbangActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        txtso.setText("");
    }//GEN-LAST:event_btnxoaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo_Layout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbang;
    private javax.swing.JButton btnchia;
    private javax.swing.JButton btncong;
    private javax.swing.JButton btnnhan;
    private javax.swing.JButton btnso0;
    private javax.swing.JButton btnso1;
    private javax.swing.JButton btnso2;
    private javax.swing.JButton btnso3;
    private javax.swing.JButton btnso4;
    private javax.swing.JButton btnso5;
    private javax.swing.JButton btnso6;
    private javax.swing.JButton btnso7;
    private javax.swing.JButton btnso8;
    private javax.swing.JButton btnso9;
    private javax.swing.JButton btntru;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtso;
    // End of variables declaration//GEN-END:variables
}
