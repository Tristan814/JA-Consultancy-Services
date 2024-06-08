package START;
import ADMIN.*;
import EMPLOYEE.*;


import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPasswordField;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logid = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        toadmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        logid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logidActionPerformed(evt);
            }
        });
        jPanel1.add(logid);
        logid.setBounds(110, 350, 300, 40);

        pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass);
        pass.setBounds(110, 450, 300, 40);

        loginbtn.setBackground(new java.awt.Color(153, 15, 0));
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn);
        loginbtn.setBounds(310, 540, 100, 40);

        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearbtn);
        clearbtn.setBounds(110, 540, 100, 40);

        toadmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toadmin.setForeground(new java.awt.Color(0, 255, 255));
        toadmin.setText("<< Admin");
        toadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toadminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toadminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toadminMouseExited(evt);
            }
        });
        jPanel1.add(toadmin);
        toadmin.setBounds(10, 720, 70, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 190, 170, 70);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 320, 80, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 420, 170, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/START/LOGIN BG.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logidActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed

String password, query, passDb = null;
int id;
String SUrl,Suser, Spass;
    SUrl = "jdbc:MYSQL://localhost:3306/ja consultancy services";
    Suser = "root";
    Spass = "";
    int notFound = 0;

try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(SUrl,Suser,Spass);
    Statement st =con.createStatement();
    if("".equals(logid.getText())){
        JOptionPane.showMessageDialog(null,"ID is Required","Error",JOptionPane.ERROR_MESSAGE);
    }
//    else if("".equals(pass.getText())){
//        JOptionPane.showMessageDialog(new JFrame(),"Password is Required","Error",JOptionPane.ERROR_MESSAGE);
//       
//    }
    else{
        try {
        id = Integer.parseInt(logid.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(new JFrame(), "ID must be a number", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Exit the try block if the ID is not a valid integer
                }
        password = pass.getText();
        
    }
    
    
    
       id = Integer.parseInt(logid.getText());
       password = pass.getText();

       query = "SELECT * FROM employee_table WHERE Employee_ID="+id;
       ResultSet rs = st.executeQuery(query);
       while(rs.next()){
           passDb = rs.getString("password");
           notFound = 1;
       }
       
       if(notFound == 1 && password.equals(passDb)){
                  logid.setText("");
       pass.setText("");
       
       showMessageDialog(null,"Login Successfuly");
       new EmployeeDash().setVisible(true);
       dispose();
       }else{
           JOptionPane.showMessageDialog(new JFrame(),"Incorrect ID or password","Error",JOptionPane.ERROR_MESSAGE);
       }
       
       logid.setText("");
       pass.setText("");
       
            
}catch(Exception e){
   System.out.println("Error!!" + e.getMessage());
}

    }//GEN-LAST:event_loginbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
            logid.setText("");
            pass.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void toadminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toadminMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_toadminMouseEntered

    private void toadminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toadminMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_toadminMouseExited

    private void toadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toadminMouseClicked

            // Prompt for admin password
            JPasswordField passwordField = new JPasswordField();
            int option = JOptionPane.showConfirmDialog(null, passwordField, "Enter Admin Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (option == JOptionPane.OK_OPTION) {
                char[] password = passwordField.getPassword();
                String adminPassword = "246810"; // Set your admin password here
                String enteredPassword = new String(password);
                
                if (enteredPassword.equals(adminPassword)) {
                    // Admin mode entered successfully
         JOptionPane.showMessageDialog(this,"Admin mode entered successfully!");
        new AdminDash().setVisible(true);
        dispose();
                } else {
                    // Incorrect admin password
                JOptionPane.showMessageDialog(this,"Incorrect admin password!");
                }
            } else {
                // User canceled the input
                JOptionPane.showMessageDialog(this,"Admin mode login canceled.");
            }

    }//GEN-LAST:event_toadminMouseClicked

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField logid;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel toadmin;
    // End of variables declaration//GEN-END:variables
}
