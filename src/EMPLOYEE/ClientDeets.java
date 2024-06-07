package EMPLOYEE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClientDeets extends javax.swing.JFrame {


    public ClientDeets() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ipmidtf.setEditable(false);
        statustf.setEditable(false);
        datetf.setEditable(false);
        companyytf.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addresstf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        statustf = new javax.swing.JTextField();
        contactnotf = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        clienidtf = new javax.swing.JTextField();
        datetf = new javax.swing.JTextField();
        companyytf = new javax.swing.JTextField();
        ipmidtf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        addresstf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addresstf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(addresstf);
        addresstf.setBounds(340, 390, 250, 40);

        emailtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(emailtf);
        emailtf.setBounds(340, 500, 250, 40);

        statustf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statustf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(statustf);
        statustf.setBounds(340, 160, 250, 40);

        contactnotf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactnotf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contactnotf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactnotfKeyTyped(evt);
            }
        });
        jPanel1.add(contactnotf);
        contactnotf.setBounds(50, 500, 250, 40);

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(60, 680, 110, 40);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Company Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 320, 140, 18);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Address");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(400, 440, 130, 18);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contact Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 550, 140, 18);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(430, 550, 70, 18);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(490, 680, 100, 40);

        clienidtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clienidtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clienidtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clienidtfKeyTyped(evt);
            }
        });
        jPanel1.add(clienidtf);
        clienidtf.setBounds(50, 390, 250, 40);

        datetf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        datetf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(datetf);
        datetf.setBounds(50, 270, 250, 40);

        companyytf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        companyytf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(companyytf);
        companyytf.setBounds(340, 270, 250, 40);

        ipmidtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipmidtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ipmidtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipmidtfActionPerformed(evt);
            }
        });
        jPanel1.add(ipmidtf);
        ipmidtf.setBounds(50, 160, 250, 40);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Client ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 440, 90, 18);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("IPM ID");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(130, 210, 90, 18);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Status");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(420, 210, 90, 18);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Date of Inquiry");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 320, 140, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EMPLOYEE/Client Details bg.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 1300, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Inquiries().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               int n = JOptionPane.showConfirmDialog(new JFrame(), "Click YES to proceed", "Successed!", JOptionPane.YES_NO_OPTION);
                String ipm, cid, contactno, email, address, query;
        if(n == 0){
      
        if("".equals(clienidtf.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Client ID is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if("".equals(addresstf.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Address is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if("".equals(contactnotf.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Contact Number is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if("".equals(emailtf.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
         }   
        else{
         try{
              Class.forName("com.mysql.cj.jdbc.Driver");
           
         String url = "jdbc:MYSQL://localhost:3306/ja consultancy services";
         String user = "jaroot";
         String pass = "";
         
         Connection con = DriverManager.getConnection(url,user,pass);
         Statement st = con.createStatement();

         
          Scheduling cd = new Scheduling();
        cd.clientid.setText(clienidtf.getText());

       ipm = ipmidtf.getText();
       cid = clienidtf.getText();
       contactno =  contactnotf.getText();
       email =  emailtf.getText();
       address = addresstf.getText();
       query = "INSERT INTO client_table (Client_ID, IPM_ID, Contact_No, Email, Address)"
               + "VALUES('"+cid+"','"+ipm+"','"+contactno+"','"+email+"','"+address+"')";
         
        st.executeUpdate(query);
                cd.setVisible(true);
        this.dispose() ; 
     
       }catch (ClassNotFoundException | SQLException ex){
           Logger.getLogger(Inquiries.class.getName()).log(Level.SEVERE,null,ex);
           System.out.println("Error" + ex.getMessage());
           JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }
        }
         
        }else{ 
            //do nothing
        }
        
        
       

         
        
        

         
      

         
       

 
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void ipmidtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipmidtfActionPerformed
      //  Inquiries.ipmtf.getText();
                
//       ipm = ipmtf.getText();
//       cn = companytf.getText();
//       stats =  stat.getText();
//       inq =  inquirytf.getText();
//       serv = servicetf.getText();
    }//GEN-LAST:event_ipmidtfActionPerformed

    private void contactnotfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactnotfKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_contactnotfKeyTyped

    private void clienidtfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienidtfKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_clienidtfKeyTyped

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
            java.util.logging.Logger.getLogger(ClientDeets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientDeets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientDeets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientDeets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientDeets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstf;
    private javax.swing.JButton back;
    public javax.swing.JTextField clienidtf;
    public static javax.swing.JTextField companyytf;
    private javax.swing.JTextField contactnotf;
    public static javax.swing.JTextField datetf;
    private javax.swing.JTextField emailtf;
    public static javax.swing.JTextField ipmidtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField statustf;
    // End of variables declaration//GEN-END:variables
}
