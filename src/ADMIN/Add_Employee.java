/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN;

import java.awt.Cursor;
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
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Admin
 */
public class Add_Employee extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int q, i, id, deleteItem;
    /**
     * Creates new form Add_Employee
     */
   
    
    public Add_Employee() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
            String SUrl,Suser, Spass;
    SUrl = "jdbc:MYSQL://localhost:3306/ja consultancy services";
    Suser = "root";
    Spass = "";
    String query = "SELECT * FROM employee_table";
    
    try{
             con = DriverManager.getConnection(SUrl,Suser,Spass);
             pst = con.prepareStatement(query);
             rs = pst.executeQuery();
             DefaultTableModel model = (DefaultTableModel)(emptable.getModel());    
             while(rs.next()){
                 model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
             }
    }catch (Exception ex){
        System.out.println("Error : " + ex.getMessage());
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        clearbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        cellno = new javax.swing.JTextField();
        empID = new javax.swing.JTextField();
        dateofb = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        emppass = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        backbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        emptable = new javax.swing.JTable();
        updatebtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        searchtxt = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Last Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 110, 100, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Age");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 290, 90, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("First Name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 200, 120, 20);

        addbtn.setBackground(new java.awt.Color(153, 0, 0));
        addbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel2.add(addbtn);
        addbtn.setBounds(530, 580, 138, 47);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Date of Birth");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(390, 110, 140, 20);
        jPanel2.add(jLabel10);
        jLabel10.setBounds(575, 167, 0, 0);

        clearbtn.setBackground(new java.awt.Color(204, 204, 204));
        clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearbtn.setText("CLEAR");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearbtn);
        clearbtn.setBounds(230, 580, 126, 47);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Employee ID");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(390, 350, 130, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Address");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 470, 110, 20);

        address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel2.add(address);
        address.setBounds(30, 490, 220, 37);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Email");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(390, 260, 100, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Cell No.");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 380, 100, 20);

        firstname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel2.add(firstname);
        firstname.setBounds(30, 220, 220, 37);

        cellno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cellno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellnoActionPerformed(evt);
            }
        });
        jPanel2.add(cellno);
        cellno.setBounds(30, 400, 221, 37);

        empID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        empID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIDActionPerformed(evt);
            }
        });
        jPanel2.add(empID);
        empID.setBounds(390, 370, 220, 37);

        dateofb.setEditable(false);
        dateofb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateofb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateofbActionPerformed(evt);
            }
        });
        jPanel2.add(dateofb);
        dateofb.setBounds(390, 180, 290, 37);

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email);
        email.setBounds(390, 280, 220, 37);

        age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageKeyTyped(evt);
            }
        });
        jPanel2.add(age);
        age.setBounds(30, 310, 220, 37);

        lastname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel2.add(lastname);
        lastname.setBounds(30, 130, 220, 37);

        emppass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emppass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emppassActionPerformed(evt);
            }
        });
        jPanel2.add(emppass);
        emppass.setBounds(390, 460, 220, 37);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Password");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(390, 440, 130, 20);

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        jPanel2.add(year);
        year.setBounds(590, 130, 90, 40);

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        jPanel2.add(day);
        day.setBounds(510, 130, 72, 40);

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        jPanel2.add(month);
        month.setBounds(390, 130, 110, 40);

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel2.add(backbtn);
        backbtn.setBounds(20, 640, 72, 23);

        emptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee_LastName", "Employee_FirstName", "Cell No.", "Address", "Birthday", "Email", "Age", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        emptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(emptable);
        if (emptable.getColumnModel().getColumnCount() > 0) {
            emptable.getColumnModel().getColumn(0).setResizable(false);
            emptable.getColumnModel().getColumn(1).setResizable(false);
            emptable.getColumnModel().getColumn(2).setResizable(false);
            emptable.getColumnModel().getColumn(3).setResizable(false);
            emptable.getColumnModel().getColumn(4).setResizable(false);
            emptable.getColumnModel().getColumn(5).setResizable(false);
            emptable.getColumnModel().getColumn(6).setResizable(false);
            emptable.getColumnModel().getColumn(7).setResizable(false);
            emptable.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(710, 120, 870, 510);

        updatebtn.setBackground(new java.awt.Color(255, 204, 102));
        updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(51, 51, 0));
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel2.add(updatebtn);
        updatebtn.setBounds(380, 580, 126, 47);

        editbtn.setFont(new java.awt.Font("STZhongsong", 1, 16)); // NOI18N
        editbtn.setText("Edit");
        editbtn.setAlignmentX(0.5F);
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
        jPanel2.add(editbtn);
        editbtn.setBounds(90, 580, 130, 50);

        searchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtActionPerformed(evt);
            }
        });
        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
        jPanel2.add(searchtxt);
        searchtxt.setBounds(800, 70, 220, 40);

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel2.add(searchbtn);
        searchbtn.setBounds(1050, 70, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ADMIN/add emp bg.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1600, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void cellnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellnoActionPerformed

    private void empIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIDActionPerformed

    private void dateofbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateofbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateofbActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
    String lname,fname,Password,eid,contact,eaddress,bday,mail,eage,query;
    String SUrl,Suser, Spass;
    SUrl = "jdbc:MYSQL://localhost:3306/ja consultancy services";
    Suser = "root";
    Spass = "";
    
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(SUrl,Suser,Spass);
    Statement st =con.createStatement();
    if("".equals(lastname.getText())){
        JOptionPane.showMessageDialog(new JFrame(),"sfsfd","Error",JOptionPane.ERROR_MESSAGE);      
    }
    else if("".equals(firstname.getText())){
        JOptionPane.showMessageDialog(new JFrame(),"First  Name is Required","Error",JOptionPane.ERROR_MESSAGE);
    }
   else if("".equals(emppass.getText())){
        JOptionPane.showMessageDialog(new JFrame(),"Password  is Required","Error",JOptionPane.ERROR_MESSAGE);
    } 
   else if("".equals(empID.getText())){
        JOptionPane.showMessageDialog(new JFrame(),"Employee ID  is Required","Error",JOptionPane.ERROR_MESSAGE);
   }
   else if("".equals(cellno.getText())){
        JOptionPane.showMessageDialog(new JFrame(),"Contact No.  is Required","Error",JOptionPane.ERROR_MESSAGE);
   }
   else if("".equals(address.getText())){
        JOptionPane.showMessageDialog(new JFrame(),"Employee ID  is Required","Error",JOptionPane.ERROR_MESSAGE);
   }
    else if("".equals(dateofb.getText())){
        JOptionPane.showMessageDialog(new JFrame(),"Date of Birth  is Required","Error",JOptionPane.ERROR_MESSAGE);
   }
     else if("".equals(age.getText())){
        JOptionPane.showMessageDialog(new JFrame(),"Age  is Required","Error",JOptionPane.ERROR_MESSAGE);
   }
      else if("".equals(email.getText())){
        JOptionPane.showMessageDialog(new JFrame(),"Email  is Required","Error",JOptionPane.ERROR_MESSAGE);
   }
   else{
       lname = lastname.getText();
       fname = firstname.getText();
       Password = emppass.getText();
       eid = empID.getText();
       contact = cellno.getText();
       eaddress =address.getText();
       bday = dateofb.getText();
       eage = age.getText();
       mail = email.getText();
       
       
       
       
       query = "INSERT INTO employee_table(Employee_ID,Employee_LastName,Employee_FirstName,Cellphone_No,Address,Birthday,Email,Age,Password)"+
               "VALUES('"+eid+"','"+lname+"','"+fname+"','"+contact+"','"+eaddress+"','"+bday+"','"+mail+"','"+eage+"','"+Password+"' )";
       

     
       st.execute(query);
        DefaultTableModel model = (DefaultTableModel) emptable.getModel();
        model.addRow(new Object[] {empID.getText(),lastname.getText(),firstname.getText(),emppass.getText(),cellno.getText(), address.getText(), dateofb.getText(),age.getText(),email.getText()});
        
        empID.setText("");
       lastname.setText("");
       firstname.setText("");
       emppass.setText("");
       cellno.setText("");
       address.setText("");
       dateofb.setText("");
       age.setText("");
       email.setText("");
       
       showMessageDialog(null,"Account added successfully");
       
       
       
       
   }
}catch(Exception e){
   System.out.println("Error!!" + e.getMessage());
}                         
    }//GEN-LAST:event_addbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
            
        
        int option = JOptionPane.showConfirmDialog (new JFrame(),"Are you sure you want to clear?","Confirmation",JOptionPane.OK_CANCEL_OPTION);
     
       
         if (option == JOptionPane.OK_OPTION) {
            lastname.setText("");
            firstname.setText("");
            empID.setText("");
            cellno.setText("");
            address.setText("");
            dateofb.setText("");
            email.setText("");
            age.setText("");
            emppass.setText("");
            month.setSelectedIndex(0);
            day.setSelectedIndex(0);
            year.setSelectedIndex(0);
            dateofb.setText("");
            
        } else   {
         }
            
            
    }//GEN-LAST:event_clearbtnActionPerformed

    private void ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyTyped
         char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_ageKeyTyped

    private void emppassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emppassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emppassActionPerformed

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
       dateofb.setText(tot2);

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

       dateofb.setText(a);
    }//GEN-LAST:event_monthActionPerformed

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
       
       dateofb.setText(tot);
    }//GEN-LAST:event_yearActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        new AdminDash().setVisible(true);
        dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
     
          try{
    pst = con.prepareStatement("update employee_table set Employee_LastName =?,Employee_FirstName =?,Cellphone_No =?,Address =?, Birthday =?, Email =?,Age =?,Password =? where Employee_ID=?");
    pst.setString(1,lastname.getText());
    pst.setString(2,firstname.getText());
    pst.setString(3,cellno.getText());
    pst.setString(4,address.getText());
    pst.setString(5,dateofb.getText());
    pst.setString(6,email.getText());
    pst.setString(7,age.getText());
    pst.setString(8,emppass.getText());
    pst.setString(9,empID.getText());
    
        
    int rowsAffected = pst.executeUpdate(); 
    
    if (rowsAffected > 0 ){
        DefaultTableModel model = (DefaultTableModel) emptable.getModel();
        int selectedRowIndex = emptable.getSelectedRow();
        
        model.setValueAt(empID.getText(), selectedRowIndex, 0);
        model.setValueAt(lastname.getText(), selectedRowIndex, 1);
        model.setValueAt(firstname.getText(), selectedRowIndex, 2);
        model.setValueAt(cellno.getText(), selectedRowIndex, 3);
        model.setValueAt(address.getText(), selectedRowIndex, 4);
        model.setValueAt(dateofb.getText(), selectedRowIndex, 5);
        model.setValueAt(email.getText(), selectedRowIndex, 6);
        model.setValueAt(age.getText(), selectedRowIndex, 7);
        model.setValueAt(emppass.getText(), selectedRowIndex, 8);
        
       JOptionPane.showMessageDialog(new JFrame(), "Updated Successfully", "Successed!", JOptionPane.OK_CANCEL_OPTION);
       con.close();
    } else{
        JOptionPane.showMessageDialog(new JFrame(), "Update Failed", "Warning!", JOptionPane.ERROR_MESSAGE);
       con.close();
    }
       
               
       lastname.setText("");
       firstname.setText("");
       age.setText("");
       cellno.setText("");
       address.setText("");
       dateofb.setText("");
       email.setText("");
       empID.setText("");
       emppass.setText("");
       
} catch (SQLException ex) {
            Logger.getLogger(Inquiries_Admin.class.getName()).log(Level.SEVERE, null, ex);
       
}
    }//GEN-LAST:event_updatebtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
    empID.setEditable(true);
    lastname.setEditable(true);
    firstname.setEditable(true);
    cellno.setEditable(true);
    address.setEditable(true);
    dateofb.setEditable(false);
    email.setEditable(true);
    age.setEditable(true);
    emppass.setEditable(true);
    month.setEnabled(true);
    day.setEnabled(true);
    year.setEnabled(true);      // TODO add your handling code here:

    }//GEN-LAST:event_editbtnActionPerformed

    private void emptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptableMouseClicked
      int id = Integer.parseInt(emptable.getValueAt(emptable.getSelectedRow(),0).toString());
        try{
               Class.forName("com.mysql.cj.jdbc.Driver");
           
         String url = "jdbc:MYSQL://localhost:3306/ja consultancy services";
         String user = "jaroot";
         String pass = "";
         
         Connection con = DriverManager.getConnection(url,user,pass);
         Statement st = con.createStatement();
         ResultSet res =st.executeQuery("select * from employee_table where Employee_ID ="+id);
                        while(res.next()){
                            empID.setText(res.getString("Employee_ID"));
                            lastname.setText(res.getString("Employee_LastName"));
                            firstname.setText(res.getString("Employee_FirstName"));
                            cellno.setText(res.getString("Cellphone_No"));
                            address.setText(res.getString("Address"));
                            dateofb.setText(res.getString("Birthday"));
                            email.setText(res.getString("Email"));
                            age.setText(res.getString("Age"));
                            emppass.setText(res.getString("Password"));
                             
                             empID.setEditable(false);
                             lastname.setEditable(false);
                             firstname.setEditable(false);
                             cellno.setEditable(false);
                             address.setEditable(false);
                            dateofb.setEditable(false);
                            email.setEditable(false);
                            age.setEditable(false);
                            emppass.setEditable(false);
                            month.setEnabled(false);
                            day.setEnabled(false);
                            year.setEnabled(false);
                        }
                        }
        catch(Exception e){
            e.printStackTrace();
        }
                
    }//GEN-LAST:event_emptableMouseClicked

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
       
        DefaultTableModel model = (DefaultTableModel) emptable.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        emptable.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchtxt.getText()));

//    DefaultTableModel model = (DefaultTableModel) emptable.getModel();
//    TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
//    tab
    }//GEN-LAST:event_searchbtnActionPerformed

    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtActionPerformed

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
        DefaultTableModel model = (DefaultTableModel) emptable.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        emptable.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchtxt.getText()));
    }//GEN-LAST:event_searchtxtKeyReleased

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
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField cellno;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField dateofb;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JButton editbtn;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empID;
    private javax.swing.JTextField emppass;
    private javax.swing.JTable emptable;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JButton updatebtn;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
