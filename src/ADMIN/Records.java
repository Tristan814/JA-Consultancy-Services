/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN;

import java.awt.Window;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class Records extends javax.swing.JFrame {

    /**
     * Creates new form Reports
     */
    public Records() {
        initComponents();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        searchtf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        search = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        companytf = new javax.swing.JTextField();
        reportidtf = new javax.swing.JTextField();
        inquirytf = new javax.swing.JTextField();
        year = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        rb33 = new javax.swing.JRadioButton();
        rb22 = new javax.swing.JRadioButton();
        rb11 = new javax.swing.JRadioButton();
        stat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rb3 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        servicetf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        daystf = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        durationtf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        amounttf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jTable1.setName(""); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setLayout(null);

        searchtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtfActionPerformed(evt);
            }
        });
        searchtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtfKeyReleased(evt);
            }
        });
        jPanel3.add(searchtf);
        searchtf.setBounds(40, 130, 270, 37);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Report_ID", "Company_Name", "Inquiry_Date", "Status", "Service_Type", "Total_Amount", "No_of_Days", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(40, 190, 1080, 510);

        search.setBackground(new java.awt.Color(0, 102, 102));
        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel3.add(search);
        search.setBounds(320, 130, 110, 38);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(890, 720, 110, 40);

        jButton1.setBackground(new java.awt.Color(48, 54, 66));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EDIT");
        jPanel3.add(jButton1);
        jButton1.setBounds(770, 720, 110, 40);

        companytf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(companytf);
        companytf.setBounds(1150, 220, 200, 40);

        reportidtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reportidtf.setEnabled(false);
        jPanel3.add(reportidtf);
        reportidtf.setBounds(1360, 90, 210, 40);

        inquirytf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inquirytf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inquirytfActionPerformed(evt);
            }
        });
        jPanel3.add(inquirytf);
        inquirytf.setBounds(1150, 380, 220, 40);

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        jPanel3.add(year);
        year.setBounds(1350, 320, 90, 40);

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        jPanel3.add(day);
        day.setBounds(1270, 320, 72, 40);

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July ", "August ", "September", "October", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        jPanel3.add(month);
        month.setBounds(1150, 320, 110, 40);

        rb33.setBackground(new java.awt.Color(255, 255, 255));
        rb33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb33.setText("Declined");
        rb33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb33ActionPerformed(evt);
            }
        });
        jPanel3.add(rb33);
        rb33.setBounds(1150, 540, 80, 25);

        rb22.setBackground(new java.awt.Color(255, 255, 255));
        rb22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb22.setText("Pending");
        rb22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb22ActionPerformed(evt);
            }
        });
        jPanel3.add(rb22);
        rb22.setBounds(1150, 510, 80, 25);

        rb11.setBackground(new java.awt.Color(255, 255, 255));
        rb11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb11.setText("Approved");
        rb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb11ActionPerformed(evt);
            }
        });
        jPanel3.add(rb11);
        rb11.setBounds(1150, 480, 90, 25);

        stat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statActionPerformed(evt);
            }
        });
        jPanel3.add(stat);
        stat.setBounds(1150, 570, 170, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("Service Type:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(1360, 450, 112, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Inquiry Date:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(1150, 290, 112, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Company Name:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(1150, 190, 116, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Report ID:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(1270, 100, 80, 20);

        rb3.setBackground(new java.awt.Color(255, 255, 255));
        rb3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb3.setText("Audit");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });
        jPanel3.add(rb3);
        rb3.setBounds(1360, 540, 80, 20);

        rb2.setBackground(new java.awt.Color(255, 255, 255));
        rb2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb2.setText("Consultancy");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        jPanel3.add(rb2);
        rb2.setBounds(1360, 510, 100, 20);

        rb1.setBackground(new java.awt.Color(255, 255, 255));
        rb1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb1.setText("Training");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        jPanel3.add(rb1);
        rb1.setBounds(1360, 480, 90, 20);

        servicetf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        servicetf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(servicetf);
        servicetf.setBounds(1360, 570, 170, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setText("No. of Days:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(1150, 630, 112, 20);

        daystf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daystfActionPerformed(evt);
            }
        });
        jPanel3.add(daystf);
        daystf.setBounds(1150, 660, 130, 40);

        jButton3.setBackground(new java.awt.Color(0, 153, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(1010, 720, 110, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setText("Status:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(1150, 450, 112, 20);

        durationtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationtfActionPerformed(evt);
            }
        });
        jPanel3.add(durationtf);
        durationtf.setBounds(1360, 660, 130, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setText("Duration:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(1360, 630, 112, 20);

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(20, 753, 90, 30);

        amounttf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(amounttf);
        amounttf.setBounds(1380, 220, 190, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("Total Amount:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(1380, 190, 102, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ADMIN/Records bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 1600, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtfActionPerformed

    private void searchtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtfKeyReleased

    }//GEN-LAST:event_searchtfKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchtf.getText()));
    }//GEN-LAST:event_searchActionPerformed

    private void inquirytfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inquirytfActionPerformed

    }//GEN-LAST:event_inquirytfActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        String c;
        String a;
        String selectedValue1 = month.getSelectedItem().toString();

        a = selectedValue1;
        String tot;
        String selectedValue3 = year.getSelectedItem().toString();

        c = selectedValue3;
        String b;

        String selectedValue2 = day.getSelectedItem().toString();

        b = selectedValue2;

        tot = a + "-" + b + "-" + c;

        inquirytf.setText(tot);
    }//GEN-LAST:event_yearActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        String a;
        String b;
        String c;
        String tot2;

        String selectedValue1 = month.getSelectedItem().toString();
        String selectedValue2 = day.getSelectedItem().toString();
        String selectedValue3 = year.getSelectedItem().toString();

        a = selectedValue1;
        b = selectedValue2;
        c = selectedValue3;

        tot2 = a + "-" + b;
        inquirytf.setText(tot2);
    }//GEN-LAST:event_dayActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        String a;
        String b;
        String c;

        String selectedValue1 = month.getSelectedItem().toString();
        String selectedValue2 = day.getSelectedItem().toString();
        String selectedValue3 = year.getSelectedItem().toString();

        a = selectedValue1;
        b = selectedValue2;
        c = selectedValue3;

        inquirytf.setText(a);
    }//GEN-LAST:event_monthActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        if (rb3.isSelected()){
            servicetf.setText(rb3.getText());
        }
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        if (rb2.isSelected()){
            servicetf.setText(rb2.getText());
        }
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed

        if (rb1.isSelected()){
            servicetf.setText(rb1.getText());
        }
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb33ActionPerformed
        if (rb33.isSelected()){
            stat.setText(rb33.getText());
        }
    }//GEN-LAST:event_rb33ActionPerformed

    private void rb22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb22ActionPerformed
        if (rb22.isSelected()){
            stat.setText(rb22.getText());
        }
    }//GEN-LAST:event_rb22ActionPerformed

    private void rb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb11ActionPerformed
        if (rb11.isSelected()){
            stat.setText(rb11.getText());
        }
    }//GEN-LAST:event_rb11ActionPerformed

    private void statActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statActionPerformed

    private void daystfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daystfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daystfActionPerformed

    private void durationtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationtfActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new FileMaintenance().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amounttf;
    private javax.swing.JTextField companytf;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JTextField daystf;
    private javax.swing.JTextField durationtf;
    private javax.swing.JTextField inquirytf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb11;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb22;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb33;
    private javax.swing.JTextField reportidtf;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchtf;
    public static javax.swing.JTextField servicetf;
    public static javax.swing.JTextField stat;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
