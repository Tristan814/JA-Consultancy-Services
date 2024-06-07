/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ADMIN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Henreizh Nathan
 */
public class Reports extends javax.swing.JFrame {

    /**
     * Creates new form Reports
     */
    public Reports() {
        initComponents();
        this.setLocationRelativeTo(null);
        String SUrl, Suser, Spass;
SUrl = "jdbc:MYSQL://localhost:3306/ja consultancy services";
Suser = "root";
Spass = "";

// Correctly formatted SQL query
String query = 
    "SELECT Transaction_Table.trans_ID, Payment_Table.Total_Amount, Inquiry_and_Proposal.Service_Type, Client_Table.Client_ID\n" +
"FROM Transaction_Table\n" +
"\n" +
"LEFT JOIN Payment_Table ON  Transaction_Table.Client_ID = Payment_Table.client_ID\n" +
"\n" +
"LEFT JOIN Client_Table ON Transaction_Table.client_id = Client_Table.client_id\n"+
"LEFT JOIN Inquiry_and_Proposal ON Inquiry_and_Proposal.IPM_ID = Client_Table.IPM_ID\n" +
"\n" ;


try {
    Connection con = DriverManager.getConnection(SUrl, Suser, Spass);
    PreparedStatement pst = con.prepareStatement(query);
    ResultSet rs = pst.executeQuery();

    // Assuming reporttable is your JTable and model is its DefaultTableModel
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    
    // Clear the existing rows in the model
    model.setRowCount(0);

    while (rs.next()) {
        // Add a row to the model with the data from the result set
        model.addRow(new Object[]{rs.getString("trans_id"), rs.getString("total_amount"), rs.getString("service_type"), rs.getString("client_id")});
    }
    
    // Close resources
    rs.close();
    pst.close();
    con.close();
} catch (Exception ex) {
    System.out.println("Error: " + ex.getMessage());
}

        String url = "jdbc:mysql://localhost:3306/ja consultancy services";
        String user = "root";
        String password = "";

        String query1 = "SELECT SUM(total_amount) FROM payment_table";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query1)) {

            if (rs.next()) {
                double totalAmount = rs.getDouble(1);
                sumtf.setText("₱"+String.valueOf(totalAmount));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching data", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        

        
      String url1 = "jdbc:mysql://localhost:3306/ja consultancy services";
        String user2 = "root";
        String password1 = ""; 

        String query2 = "SELECT SUM(Total_Amount) AS total_amount_sum " +
                "FROM realreport " +
                "WHERE Service_Type = 'Consultancy'";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query2)) {

            if (rs.next()) {
                double totalBilling = rs.getDouble(1);
                cons.setText("₱"+String.valueOf(totalBilling));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching data", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            String url11 = "jdbc:mysql://localhost:3306/ja consultancy services";
        String user11 = "root";
        String password11 = ""; 

        String query3 = "SELECT SUM(Total_Amount) AS total_amount_sum " +
                "FROM realreport " +
                "WHERE Service_Type = 'Audit'";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query3)) {

            if (rs.next()) {
                double totalBilling = rs.getDouble(1);
                audit.setText("₱"+String.valueOf(totalBilling));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching data", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        String url111 = "jdbc:mysql://localhost:3306/ja consultancy services";
        String user111 = "root";
        String password111 = ""; 

        String query4 = "SELECT SUM(Total_Amount) AS total_amount_sum " +
                "FROM realreport " +
                "WHERE Service_Type = 'Training'";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query4)) {

            if (rs.next()) {
                double totalBilling = rs.getDouble(1);
                train.setText("₱"+String.valueOf(totalBilling));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching data", "Error", JOptionPane.ERROR_MESSAGE);
        }
      
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchtf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        sumtf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        constxt = new javax.swing.JLabel();
        cons = new javax.swing.JTextField();
        train = new javax.swing.JTextField();
        audit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Total Amount", "Service Type", "Client ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(300, 140, 780, 490);

        searchtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtfActionPerformed(evt);
            }
        });
        searchtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtfKeyPressed(evt);
            }
        });
        jPanel1.add(searchtf);
        searchtf.setBounds(710, 90, 200, 40);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(920, 90, 110, 40);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 670, 75, 23);

        sumtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sumtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sumtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumtfActionPerformed(evt);
            }
        });
        jPanel1.add(sumtf);
        sumtf.setBounds(20, 530, 250, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("TOTAL BILLING: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 510, 150, 20);

        constxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        constxt.setText("TOTAL (CONSULTANCY)");
        jPanel1.add(constxt);
        constxt.setBounds(50, 130, 230, 20);

        cons.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cons.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consActionPerformed(evt);
            }
        });
        jPanel1.add(cons);
        cons.setBounds(20, 150, 250, 40);

        train.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        train.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        train.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainActionPerformed(evt);
            }
        });
        jPanel1.add(train);
        train.setBounds(20, 260, 250, 40);

        audit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        audit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        audit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auditActionPerformed(evt);
            }
        });
        jPanel1.add(audit);
        audit.setBounds(20, 380, 250, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("TOTAL (TRAINING)");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 240, 180, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("TOTAL (AUDIT)");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 360, 130, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ADMIN/Reports bg.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1099, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new FileMaintenance().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchtf.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtfActionPerformed

    private void sumtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumtfActionPerformed

    private void consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consActionPerformed

    private void searchtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtfKeyPressed
       if(searchtf.getText().equals("")){
            DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(""));
       }
    }//GEN-LAST:event_searchtfKeyPressed

    private void trainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trainActionPerformed

    private void auditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_auditActionPerformed

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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField audit;
    private javax.swing.JTextField cons;
    private javax.swing.JLabel constxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchtf;
    private javax.swing.JTextField sumtf;
    private javax.swing.JTable table;
    private javax.swing.JTextField train;
    // End of variables declaration//GEN-END:variables
}
