package ADMIN;

public class FileMaintenance extends javax.swing.JFrame {


    public FileMaintenance() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        ipmbtn = new javax.swing.JButton();
        reportbtn = new javax.swing.JButton();
        paymentbtn = new javax.swing.JButton();
        consultantsbtn = new javax.swing.JButton();
        transactionbtn = new javax.swing.JButton();
        schedulingbtn = new javax.swing.JButton();
        standardsbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(210, 210, 210));
        jPanel3.setLayout(null);

        ipmbtn.setBackground(new java.awt.Color(153, 255, 153));
        ipmbtn.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        ipmbtn.setText("Inquiries and Proposals");
        ipmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipmbtnActionPerformed(evt);
            }
        });
        jPanel3.add(ipmbtn);
        ipmbtn.setBounds(60, 585, 343, 93);

        reportbtn.setBackground(new java.awt.Color(255, 153, 153));
        reportbtn.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        reportbtn.setText("Reports");
        reportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportbtnActionPerformed(evt);
            }
        });
        jPanel3.add(reportbtn);
        reportbtn.setBounds(60, 140, 343, 93);

        paymentbtn.setBackground(new java.awt.Color(153, 153, 255));
        paymentbtn.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        paymentbtn.setText("Payment");
        paymentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentbtnActionPerformed(evt);
            }
        });
        jPanel3.add(paymentbtn);
        paymentbtn.setBounds(60, 290, 343, 93);

        consultantsbtn.setBackground(new java.awt.Color(255, 153, 255));
        consultantsbtn.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        consultantsbtn.setText("Consultants");
        consultantsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultantsbtnActionPerformed(evt);
            }
        });
        jPanel3.add(consultantsbtn);
        consultantsbtn.setBounds(60, 440, 343, 93);

        transactionbtn.setBackground(new java.awt.Color(153, 255, 204));
        transactionbtn.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        transactionbtn.setText("Transactions");
        transactionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionbtnActionPerformed(evt);
            }
        });
        jPanel3.add(transactionbtn);
        transactionbtn.setBounds(520, 140, 343, 93);

        schedulingbtn.setBackground(new java.awt.Color(255, 255, 153));
        schedulingbtn.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        schedulingbtn.setText("Scheduling");
        schedulingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schedulingbtnActionPerformed(evt);
            }
        });
        jPanel3.add(schedulingbtn);
        schedulingbtn.setBounds(520, 290, 343, 93);

        standardsbtn.setBackground(new java.awt.Color(153, 204, 255));
        standardsbtn.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        standardsbtn.setText("System Standards");
        standardsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardsbtnActionPerformed(evt);
            }
        });
        jPanel3.add(standardsbtn);
        standardsbtn.setBounds(520, 440, 343, 93);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(20, 720, 72, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ADMIN/FileMaintenance bg.png"))); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(0, 0, 940, 760);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void standardsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardsbtnActionPerformed
        new System_Standards().setVisible(true);
        dispose();
    }//GEN-LAST:event_standardsbtnActionPerformed

    private void transactionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionbtnActionPerformed
        new Transaction().setVisible(true);
        dispose();
    }//GEN-LAST:event_transactionbtnActionPerformed

    private void consultantsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultantsbtnActionPerformed
        new Consultants().setVisible(true);
        dispose();
    }//GEN-LAST:event_consultantsbtnActionPerformed

    private void paymentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentbtnActionPerformed
        new Payments().setVisible(true);
        dispose();
    }//GEN-LAST:event_paymentbtnActionPerformed

    private void reportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportbtnActionPerformed
        new Reports().setVisible(true);
        dispose();
    }//GEN-LAST:event_reportbtnActionPerformed

    private void ipmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipmbtnActionPerformed
        new Inquiries_Admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_ipmbtnActionPerformed

    private void schedulingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schedulingbtnActionPerformed
        new adminScheduling().setVisible(true);
        dispose();
    }//GEN-LAST:event_schedulingbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AdminDash().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FileMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileMaintenance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultantsbtn;
    private javax.swing.JButton ipmbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton paymentbtn;
    private javax.swing.JButton reportbtn;
    private javax.swing.JButton schedulingbtn;
    private javax.swing.JButton standardsbtn;
    private javax.swing.JButton transactionbtn;
    // End of variables declaration//GEN-END:variables
}
