/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN;

import EMPLOYEE.Inquiries;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class Consultants extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int q, i, id, deleteItem;

    public Consultants() {
        initComponents();
        save.setEnabled(false);
        
        
        String SUrl, Suser, Spass;
        SUrl = "jdbc:MYSQL://localhost:3306/ja consultancy services";
        Suser = "root";
        Spass = "";
        String query = "SELECT * FROM consultant_table";
        
    try{
             con = DriverManager.getConnection(SUrl,Suser,Spass);
             pst = con.prepareStatement(query);
             rs = pst.executeQuery();
             DefaultTableModel model = (DefaultTableModel)(table.getModel());    
             while(rs.next()){
                 model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
             }
    }catch (Exception ex){
        System.out.println("Error : " + ex.getMessage());
    }
    
    
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        constf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstntf = new javax.swing.JTextField();
        lastntf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        contactnotf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        searchtf = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        save.setBackground(new java.awt.Color(0, 153, 102));
        save.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save);
        save.setBounds(1100, 530, 110, 50);

        constf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        constf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                constfMouseClicked(evt);
            }
        });
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
        jPanel2.add(constf);
        constf.setBounds(1030, 260, 190, 40);

        emailtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtfActionPerformed(evt);
            }
        });
        jPanel2.add(emailtf);
        emailtf.setBounds(800, 350, 190, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Contact Number:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(1030, 150, 140, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(800, 330, 60, 16);

        firstntf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstntf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstntfActionPerformed(evt);
            }
        });
        jPanel2.add(firstntf);
        firstntf.setBounds(800, 260, 190, 40);

        lastntf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastntf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastntfActionPerformed(evt);
            }
        });
        jPanel2.add(lastntf);
        lastntf.setBounds(800, 170, 190, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Consultant ID:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(1030, 240, 120, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Last Name:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(800, 150, 90, 20);

        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CONSULTANT ID", "LAST NAME", "FIRST NAME", "CONTACT NO.", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(30, 140, 720, 470);

        contactnotf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactnotf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnotfActionPerformed(evt);
            }
        });
        contactnotf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactnotfKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contactnotfKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactnotfKeyTyped(evt);
            }
        });
        jPanel2.add(contactnotf);
        contactnotf.setBounds(1030, 170, 190, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("First Name:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(800, 240, 90, 20);

        add.setBackground(new java.awt.Color(153, 0, 0));
        add.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add);
        add.setBounds(890, 460, 110, 50);

        edit.setBackground(new java.awt.Color(48, 54, 66));
        edit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel2.add(edit);
        edit.setBounds(1030, 460, 110, 50);

        reset.setBackground(new java.awt.Color(204, 204, 204));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset);
        reset.setBounds(960, 530, 110, 50);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(30, 630, 110, 30);

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
        jPanel2.add(searchtf);
        searchtf.setBounds(30, 90, 220, 40);

        searchbtn.setBackground(new java.awt.Color(0, 102, 102));
        searchbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel2.add(searchbtn);
        searchbtn.setBounds(260, 90, 80, 40);

        Delete.setBackground(new java.awt.Color(51, 51, 0));
        Delete.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete);
        Delete.setBounds(820, 530, 110, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ADMIN/Consultant bg.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new FileMaintenance().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int id = Integer.parseInt(table.getValueAt(table.getSelectedRow(),0).toString());
        try{
               Class.forName("com.mysql.cj.jdbc.Driver");
           
         String url = "jdbc:MYSQL://localhost:3306/ja consultancy services";
         String user = "jaroot";
         String pass = "";
         
         Connection con = DriverManager.getConnection(url,user,pass);
         Statement st = con.createStatement();
         ResultSet res =st.executeQuery("select * from consultant_table where Cons_ID ="+id);
                        while(res.next()){
                            constf.setText(res.getString("Cons_ID"));
                            lastntf.setText(res.getString("Last_Name"));
                            firstntf.setText(res.getString("First_Name"));
                            contactnotf.setText(res.getString("Contact_No"));
                             emailtf.setText(res.getString("Email"));
                             
                             constf.setEditable(false);
                            lastntf.setEditable(false);
                            firstntf.setEditable(false);
                            contactnotf.setEditable(false);
                            emailtf.setEditable(false);
                        }
                
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableMouseClicked

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchtf.getText()));
    }//GEN-LAST:event_searchbtnActionPerformed

    private void searchtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtfKeyReleased
        if (searchtf.getText().equals("")){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchtf.getText()));     
        }
    }//GEN-LAST:event_searchtfKeyReleased

    private void contactnotfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnotfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnotfActionPerformed

    private void constfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constfActionPerformed

    private void lastntfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastntfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastntfActionPerformed

    private void firstntfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstntfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstntfActionPerformed

    private void emailtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtfActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
            int length = contactnotf.getText().length();
            if("".equals(lastntf.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Last Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(emailtf.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(firstntf.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "First Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(contactnotf.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Contact Number is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
              else if(length <11){
                 JOptionPane.showMessageDialog(new JFrame(), "Cell No. should contain 11 numbers", "Error!", JOptionPane.ERROR_MESSAGE);
            }
                else if(length >11){
                 JOptionPane.showMessageDialog(new JFrame(), "Cell No. should contain 11 numbers only.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(constf.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Consultant ID is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
            try{
            pst = con.prepareStatement("update consultant_table set Last_Name =?, First_Name =?, Contact_No =?, Email =? where Cons_ID=?");
            pst.setString(1,lastntf.getText());
            pst.setString(2,firstntf.getText());
            pst.setString(3,contactnotf.getText());
            pst.setString(4,emailtf.getText());
            pst.setString(5,constf.getText());

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0 ){
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int selectedRowIndex = table.getSelectedRow();

                model.setValueAt(constf.getText(), selectedRowIndex, 0);
                model.setValueAt(lastntf.getText(), selectedRowIndex, 1);
                model.setValueAt(firstntf.getText(), selectedRowIndex, 2);
                model.setValueAt(contactnotf.getText(), selectedRowIndex, 3);
                model.setValueAt(emailtf.getText(), selectedRowIndex, 4);

                JOptionPane.showMessageDialog(new JFrame(), "Updated Successfully", "Successed!", 2);
                
            } else{
                JOptionPane.showMessageDialog(new JFrame(), "Update Failed", "Warning!", JOptionPane.ERROR_MESSAGE);
            
            }

            constf.setText("");
            lastntf.setText("");
            firstntf.setText("");
            contactnotf.setText("");
            emailtf.setText("");
            constf.setEditable(true);
            
            add.setEnabled(true);
            save.setEnabled(false);

        } catch (SQLException ex) {
            Logger.getLogger(Inquiries.class.getName()).log(Level.SEVERE, null, ex);

        }

            }
          
          
        
    }//GEN-LAST:event_saveActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        emailtf.setText("");
        firstntf.setText("");
        contactnotf.setText("");
        constf.setText("");
        lastntf.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        if(table.getSelectedRow() <0){
        JOptionPane.showMessageDialog(null, "Please select an account!");
        
        }else{
        lastntf.setEditable(true);
        emailtf.setEditable(true);
        firstntf.setEditable(true);
        contactnotf.setEditable(true);
        
        add.setEnabled(false);
        save.setEnabled(true);
        }

        
    }//GEN-LAST:event_editActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String ipm, cn, stats, inq, serv, query;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MYSQL://localhost:3306/ja consultancy services";
            String user = "jaroot";
            String pass = "";

            Connection con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            int length = contactnotf.getText().length();

            if("".equals(lastntf.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Last Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(emailtf.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(firstntf.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "First Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(contactnotf.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Contact Number is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
              else if(length <11){
                 JOptionPane.showMessageDialog(new JFrame(), "Cell No. should contain 11 numbers", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            else if(length >11){
                 JOptionPane.showMessageDialog(new JFrame(), "Cell No. should contain 11 numbers only.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(constf.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Consultant ID is required", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                cn = lastntf.getText();
                stats = emailtf.getText();
                inq =  firstntf.getText();
                serv =  contactnotf.getText();
                ipm = constf.getText();
                query = "INSERT INTO consultant_table(Cons_ID, Last_Name, First_Name, Contact_No, Email)"
                + "VALUES('"+ipm+"','"+cn+"','"+inq+"','"+serv+"','"+stats+"')";

                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.addRow(new Object[] {constf.getText(),lastntf.getText(),firstntf.getText(),contactnotf.getText(),emailtf.getText()});

                st.executeUpdate(query);
                emailtf.setText("");
                firstntf.setText("");
                contactnotf.setText("");
                constf.setText("");
                lastntf.setText("");
                JOptionPane.showMessageDialog(new JFrame(), "Successfuly Registered", "Successed!", 1);
                con.close();

            }

        }catch (ClassNotFoundException ex){
            Logger.getLogger(Inquiries.class.getName()).log(Level.SEVERE,null,ex);
            //    System.out.println("Error" + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(Inquiries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

    private void searchtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtfActionPerformed

    private void constfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_constfMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_constfMouseClicked

    private void constfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_constfKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_constfKeyTyped

    private void contactnotfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactnotfKeyReleased
        
    }//GEN-LAST:event_contactnotfKeyReleased

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

       DefaultTableModel model = (DefaultTableModel) table.getModel();
        int selectedRowIndex = table.getSelectedRow();
//    DELETE FROM `inquiry_and_proposal` WHERE 0
try {
    
         id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
        
        int delete = JOptionPane.showConfirmDialog(null,"Confirm if you want to delete item","Warning",JOptionPane.YES_NO_OPTION);
        
        if (delete ==JOptionPane.YES_NO_OPTION) {
            Class.forName("com.mysql.cj.jdbc.Driver");
           
         String url = "jdbc:MYSQL://localhost:3306/ja consultancy services";
         String user = "jaroot";
         String pass = "";
         Connection con = DriverManager.getConnection(url,user,pass);
         
        String sqlConsultant = "DELETE FROM `consultant_table` WHERE `Cons_ID`=?";
        PreparedStatement consPayment = con.prepareStatement(sqlConsultant);
        consPayment.setInt(1, id);
        consPayment.executeUpdate();
        
        String sqltransaction = "DELETE FROM `transaction_table` WHERE `Cons_ID`=?";
        PreparedStatement pstTransaction = con.prepareStatement(sqltransaction);
        pstTransaction.setInt(1, id);
        pstTransaction.executeUpdate();

        model.removeRow(selectedRowIndex);
        JOptionPane.showMessageDialog(new JFrame(), "Row Deleted Successfully", "Success!", JOptionPane.CANCEL_OPTION);
        lastntf.setText("");
        firstntf.setText("");
        emailtf.setText("");
        contactnotf.setText("");
        constf.setText("");  
        

    } else {
        JOptionPane.showMessageDialog(new JFrame(), "No Row Selected", "Warning!", JOptionPane.WARNING_MESSAGE);
    }
} catch (Exception ex) {
    Logger.getLogger(InquiriesAdmin.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(new JFrame(), "Deletion Failed", "Error!", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_DeleteActionPerformed

    private void contactnotfKeyTyped(java.awt.event.KeyEvent evt){
    char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
    }}
    
    private void contactnotfKeyPressed(java.awt.event.KeyEvent evt){
   }
 
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
            java.util.logging.Logger.getLogger(Consultants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultants().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton add;
    private javax.swing.JTextField constf;
    private javax.swing.JTextField contactnotf;
    private javax.swing.JButton edit;
    private javax.swing.JTextField emailtf;
    private javax.swing.JTextField firstntf;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastntf;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchtf;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
