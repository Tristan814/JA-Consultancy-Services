/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EMPLOYEE;

import static EMPLOYEE.ClientDeets.ipmidtf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Scheduling extends javax.swing.JFrame {

    Object idc;
    public Scheduling() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        clientid.setEditable(false);
        servetf.setEditable(false);
        ipmtf.setEditable(false);
        servetf.setText(Inquiries.sc);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sched = new javax.swing.JTextField();
        ipmtf = new javax.swing.JTextField();
        clientid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        totalamount = new javax.swing.JTextField();
        payment = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        noofdays = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        duration = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        reporttf = new javax.swing.JTextField();
        constf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        servetf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        transtf = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(680, 740));
        jPanel1.setLayout(null);

        sched.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sched.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                schedKeyTyped(evt);
            }
        });
        jPanel1.add(sched);
        sched.setBounds(370, 130, 230, 40);

        ipmtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipmtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipmtfActionPerformed(evt);
            }
        });
        ipmtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ipmtfKeyTyped(evt);
            }
        });
        jPanel1.add(ipmtf);
        ipmtf.setBounds(700, 130, 230, 40);

        clientid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clientid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientidActionPerformed(evt);
            }
        });
        jPanel1.add(clientid);
        clientid.setBounds(30, 130, 230, 40);

        jButton1.setBackground(new java.awt.Color(249, 249, 249));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 580, 100, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("SCHED ID:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(370, 100, 90, 18);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("NO. OF DAYS:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(370, 320, 110, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("TOTAL AMOUNT:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 210, 140, 18);

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(880, 570, 110, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("CLIENT ID:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 100, 90, 20);

        totalamount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalamountKeyTyped(evt);
            }
        });
        jPanel1.add(totalamount);
        totalamount.setBounds(30, 240, 230, 40);

        payment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        payment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paymentKeyTyped(evt);
            }
        });
        jPanel1.add(payment);
        payment.setBounds(30, 350, 230, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("PAYMENT ID:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 320, 140, 20);

        noofdays.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noofdays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noofdaysKeyTyped(evt);
            }
        });
        jPanel1.add(noofdays);
        noofdays.setBounds(370, 350, 230, 40);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("IPM ID");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(700, 100, 190, 20);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(740, 570, 120, 40);

        duration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        duration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                durationKeyTyped(evt);
            }
        });
        jPanel1.add(duration);
        duration.setBounds(370, 460, 230, 40);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("DURATION:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(370, 430, 110, 18);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("RECORD ID:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(700, 210, 160, 18);

        reporttf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reporttf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporttfActionPerformed(evt);
            }
        });
        reporttf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                reporttfKeyTyped(evt);
            }
        });
        jPanel1.add(reporttf);
        reporttf.setBounds(700, 240, 230, 40);

        constf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        constf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constfActionPerformed(evt);
            }
        });
        constf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                constfKeyTyped(evt);
            }
        });
        jPanel1.add(constf);
        constf.setBounds(30, 460, 230, 40);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("CONSULTANT ID:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 430, 160, 18);

        servetf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(servetf);
        servetf.setBounds(370, 240, 230, 40);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("SERVICE TYPE");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(370, 210, 110, 18);

        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Check Consultants >>");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 440, 140, 16);

        transtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        transtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transtfActionPerformed(evt);
            }
        });
        transtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transtfKeyTyped(evt);
            }
        });
        jPanel1.add(transtf);
        transtf.setBounds(700, 350, 230, 40);

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("TRANSACTION ID:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(700, 320, 190, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EMPLOYEE/sched bg.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1040, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new ClientDeets().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
 String client, ser, pay, tot, sche, nod, dura, trans, cons, rec, ipm2, query1, query2, query3, query4, query5;

       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           
         String url = "jdbc:MYSQL://localhost:3306/ja consultancy services";
         String user = "jaroot";
         String pass = "";
         
         Connection con = DriverManager.getConnection(url,user,pass);
         Statement st = con.createStatement();

         if("".equals(clientid.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Client ID is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if("".equals(payment.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Payment ID is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if("".equals(totalamount.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Total Amount is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if("".equals(sched.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Sched ID is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if("".equals(noofdays.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Number of Days is required", "Error", JOptionPane.ERROR_MESSAGE);
         }

         else if("".equals(ipmtf.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Duration is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if ("".equals(constf.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Duration is Consultant ID", "Error", JOptionPane.ERROR_MESSAGE);
           }

         else{
        

 
       client = clientid.getText();
       pay = payment.getText();
       tot =  totalamount.getText();
       sche =  sched.getText();
       nod = noofdays.getText();
       dura = duration.getText();
       trans = ipmtf.getText();
       cons = constf.getText();
       ser = servetf.getText();
       rec = reporttf.getText();
       ipm2 = ipmtf.getText();
       
       query1 = "INSERT INTO payment_table (Payment_ID, Total_Amount, Client_ID)"
               + "VALUES(?,?,?)";
       //('"+pay+"','"+tot+"','"+client+"')
       query2 = "INSERT INTO scheduling_id (Sched_ID, No_of_Days, Duration, Client_ID)"
               + "VALUES(?,?,?,?)";
       //('"+sche+"','"+nod+"','"+dura+"','"+client+"')
        query3 = "INSERT INTO transaction_table (Trans_ID, Cons_ID, Client_ID, Payment_ID, Sched_ID)"
               + "VALUES(?,?,?,?,?)";
        query4 = "INSERT INTO realreport (Trans_ID, Total_Amount, Service_Type, Client_ID)"
               + "VALUES(?,?,?,?)";
        
        query5 = "INSERT INTO records_table (record_id, IPM_ID, Payment_ID, Sched_ID)"
               + "VALUES(?, ?, ?, ?)";
       
       
       PreparedStatement preparedStatement1 = con.prepareStatement(query1);
       preparedStatement1.setString(1,pay);
       preparedStatement1.setString(2,tot);
       preparedStatement1.setString(3,client);
       
       PreparedStatement preparedStatement2 = con.prepareStatement(query2);
       preparedStatement2.setString(1,sche);
       preparedStatement2.setString(2,nod);
       preparedStatement2.setString(3,dura);
       preparedStatement2.setString(4,client);
       
       PreparedStatement preparedStatement3 = con.prepareStatement(query3);
       preparedStatement3.setString(1,trans);
       preparedStatement3.setString(2,cons);
       preparedStatement3.setString(3,client);
       preparedStatement3.setString(4,pay);
       preparedStatement3.setString(5,sche);
       
       PreparedStatement preparedStatement4 = con.prepareStatement(query4);
       preparedStatement4.setString(1,trans);
       preparedStatement4.setString(2,tot);
       preparedStatement4.setString(3,ser);
       preparedStatement4.setString(4,client);
       
       PreparedStatement preparedStatement5 = con.prepareStatement(query5);
       preparedStatement5.setString(1, rec);
       preparedStatement5.setString(2, ipm2);
       preparedStatement5.setString(3, pay);
       preparedStatement5.setString(4, sche);
       
        preparedStatement1.executeUpdate();
        preparedStatement2.executeUpdate();
        preparedStatement3.executeUpdate();
        preparedStatement4.executeUpdate();
        preparedStatement5.executeUpdate();
       
//            st.executeUpdate(query1);
//            st.executeUpdate(query2);
            
               JOptionPane.showMessageDialog(null, "Successfuly Registered", "Successed!", 1 );
        
        new EmployeeDash().setVisible(true);
        this.dispose();

         }
        
       }catch (ClassNotFoundException ex){
           Logger.getLogger(Inquiries.class.getName()).log(Level.SEVERE,null,ex);
       //    System.out.println("Error" + ex.getMessage());
       } catch (SQLException ex) {
            Logger.getLogger(Inquiries.class.getName()).log(Level.SEVERE, null, ex);
        }


       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void clientidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientidActionPerformed

    }//GEN-LAST:event_clientidActionPerformed

    private void ipmtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipmtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipmtfActionPerformed

    private void reporttfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporttfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reporttfActionPerformed

    private void constfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constfActionPerformed

    private void ipmtfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ipmtfKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_ipmtfKeyTyped

    private void reporttfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reporttfKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_reporttfKeyTyped

    private void constfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_constfKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_constfKeyTyped

    private void paymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_paymentKeyTyped

    private void totalamountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalamountKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_totalamountKeyTyped

    private void schedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_schedKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_schedKeyTyped

    private void noofdaysKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noofdaysKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_noofdaysKeyTyped

    private void durationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_durationKeyTyped

    }//GEN-LAST:event_durationKeyTyped

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new Consultantstrans().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void transtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transtfActionPerformed

    private void transtfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transtfKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_transtfKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scheduling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField clientid;
    private javax.swing.JTextField constf;
    public javax.swing.JTextField duration;
    public static javax.swing.JTextField ipmtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField noofdays;
    private javax.swing.JTextField payment;
    private javax.swing.JTextField reporttf;
    private javax.swing.JTextField sched;
    public static javax.swing.JTextField servetf;
    private javax.swing.JTextField totalamount;
    private javax.swing.JTextField transtf;
    // End of variables declaration//GEN-END:variables
}
