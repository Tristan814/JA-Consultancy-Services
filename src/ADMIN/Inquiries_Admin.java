package ADMIN;

import EMPLOYEE.*;
import ADMIN.*;
import static java.awt.event.PaintEvent.UPDATE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Inquiries_Admin extends javax.swing.JFrame {

    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int q, i, id, deleteItem;
    
//    Connection con1 ;
//    PreparedStatement pst1;
//    ResultSet rs1;
    
    
    public Inquiries_Admin() {
        initComponents();
        this.setLocationRelativeTo(null);

    String SUrl,Suser, Spass;
    SUrl = "jdbc:MYSQL://localhost:3306/ja consultancy services";
    Suser = "root";
    Spass = "";
    String query = "SELECT * FROM inquiry_and_proposal";
    
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
    
    btng.add(rb1);
    btng.add(rb2);
    btng.add(rb3);
    
    }
    
    public void upDateDB() throws SQLException, ClassNotFoundException
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:MYSQL://localhost:3306/ja consultancy services", "root", "");
    pst = con.prepareStatement("select * from connector");
    
    rs = pst.executeQuery();
    ResultSetMetaData stData = rs.getMetaData();
    
    q = stData.getColumnCount();
    DefaultTableModel RecordTable =(DefaultTableModel)table.getModel();
    RecordTable.setRowCount(0);

    while(rs.next()){
        Vector columnData = new Vector();
        
        for (i = 1; i <= q; i++)
        {
            columnData.add(rs.getString("IPM_ID"));
            columnData.add(rs.getString("Company_Name"));
            columnData.add(rs.getString("Inquiry_Date"));
            columnData.add(rs.getString("Service_Type"));
            columnData.add(rs.getString("Status"));
            
        }
        RecordTable.addRow(columnData);
}
            
    
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
            
 
    private void fetchdata(){
        
    String ipm = "IPM_ID";
    String cn = "Company_Name";
    String inq = "Inquiry_Date";
    String serv = "Service_Type"; 
    String stat = "Status"; 
    String query = "SELECT * FROM inquiry_and_proposal";
   // String SUrl,Suser, Spass;
    String url = "jdbc:MYSQL://localhost:3306/ja consultancy services";
//    Suser = "root";
//    Spass = "";
        

    

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        btng = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        companytf = new javax.swing.JTextField();
        stat = new javax.swing.JTextField();
        ipmtf = new javax.swing.JTextField();
        inquirytf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        month = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        servicetf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        update1 = new javax.swing.JButton();
        searchtf = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jButton3.setBackground(new java.awt.Color(118, 8, 8));
        jButton3.setFont(new java.awt.Font("STZhongsong", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add");
        jButton3.setAlignmentX(0.5F);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        table.setBackground(new java.awt.Color(204, 204, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IPM ID", "Company Name", "Inquiry Date", "Service Type", "Status"
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
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 170, 630, 540);

        companytf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(companytf);
        companytf.setBounds(1010, 190, 250, 50);

        stat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(stat);
        stat.setBounds(1050, 430, 210, 50);

        ipmtf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ipmtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipmtfActionPerformed(evt);
            }
        });
        jPanel1.add(ipmtf);
        ipmtf.setBounds(720, 190, 250, 50);

        inquirytf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inquirytf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inquirytfActionPerformed(evt);
            }
        });
        jPanel1.add(inquirytf);
        inquirytf.setBounds(720, 420, 250, 40);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IPM ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(720, 160, 70, 18);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Company Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1010, 160, 130, 18);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inquiry Date:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(720, 330, 120, 18);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1050, 370, 110, 18);

        update.setFont(new java.awt.Font("STZhongsong", 1, 16)); // NOI18N
        update.setText("Update");
        update.setAlignmentX(0.5F);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(910, 540, 150, 40);

        add.setBackground(new java.awt.Color(118, 8, 8));
        add.setFont(new java.awt.Font("STZhongsong", 1, 16)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.setAlignmentX(0.5F);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(720, 540, 150, 40);

        jButton5.setFont(new java.awt.Font("STZhongsong", 1, 16)); // NOI18N
        jButton5.setText("Back");
        jButton5.setAlignmentX(0.5F);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(20, 750, 120, 30);

        jButton6.setFont(new java.awt.Font("STZhongsong", 1, 16)); // NOI18N
        jButton6.setText("Edit");
        jButton6.setAlignmentX(0.5F);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(810, 610, 150, 40);

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March ", "April", "May", "June", "July ", "August ", "September", "October", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        jPanel1.add(month);
        month.setBounds(720, 360, 110, 40);

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        jPanel1.add(day);
        day.setBounds(838, 360, 72, 40);

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        jPanel1.add(year);
        year.setBounds(918, 360, 90, 40);

        jButton7.setFont(new java.awt.Font("STZhongsong", 1, 16)); // NOI18N
        jButton7.setText("Clear");
        jButton7.setAlignmentX(0.5F);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(990, 610, 150, 40);

        servicetf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(servicetf);
        servicetf.setBounds(1050, 300, 210, 50);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Service Type");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1050, 270, 110, 18);

        rb1.setBackground(new java.awt.Color(48, 54, 66));
        rb1.setForeground(new java.awt.Color(255, 255, 255));
        rb1.setText("Approved");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        jPanel1.add(rb1);
        rb1.setBounds(1030, 400, 90, 21);

        rb2.setBackground(new java.awt.Color(48, 54, 66));
        rb2.setForeground(new java.awt.Color(255, 255, 255));
        rb2.setText("Declined");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        jPanel1.add(rb2);
        rb2.setBounds(1120, 400, 80, 21);

        rb3.setBackground(new java.awt.Color(48, 54, 66));
        rb3.setForeground(new java.awt.Color(255, 255, 255));
        rb3.setText("Pending");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });
        jPanel1.add(rb3);
        rb3.setBounds(1200, 400, 80, 21);

        update1.setFont(new java.awt.Font("STZhongsong", 1, 16)); // NOI18N
        update1.setText("Delete");
        update1.setAlignmentX(0.5F);
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        jPanel1.add(update1);
        update1.setBounds(1100, 540, 150, 40);

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
        jPanel1.add(searchtf);
        searchtf.setBounds(80, 110, 280, 50);

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(370, 120, 140, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EMPLOYEE/Inquiries BG.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, -10, 1300, 820);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                            ipmtf.setEditable(true);
                            companytf.setEditable(true);
                            stat.setEditable(true);
                            inquirytf.setEditable(true);
                            servicetf.setEditable(true);        // TODO add your handling code here:
        

    }//GEN-LAST:event_jButton6ActionPerformed

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new FileMaintenance().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        
        ipmtf.setText("");
        companytf.setText("");
        stat.setText("");
        inquirytf.setText("");
        
        day.removeAllItems();
        month.removeAllItems();
        year.removeAllItems();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
 String ipm, cn, stats, inq, serv, query;
       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           
         String url = "jdbc:MYSQL://localhost:3306/ja consultancy services";
         String user = "jaroot";
         String pass = "";
         
         Connection con = DriverManager.getConnection(url,user,pass);
         Statement st = con.createStatement();

         if("".equals(ipmtf.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "IPM ID is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if("".equals(companytf.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Company Name is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if("".equals(stat.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Status is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if("".equals(inquirytf.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Inquiry Date is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if("".equals(servicetf.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Service Type is required", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else{
       ipm = ipmtf.getText();
       cn = companytf.getText();
       stats =  stat.getText();
       inq =  inquirytf.getText();
       serv = servicetf.getText();
       query = "INSERT INTO inquiry_and_proposal(IPM_ID, Company_Name, Inquiry_Date, Service_Type, Status)"
               + "VALUES('"+ipm+"','"+cn+"','"+inq+"','"+serv+"','"+stats+"')";
         
       
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[] {ipmtf.getText(),companytf.getText(),inquirytf.getText(),servicetf.getText(),stat.getText()});


       st.executeUpdate(query);
       ipmtf.setText("");
       companytf.setText("");
       stat.setText("");
       inquirytf.setText("");
       servicetf.setText("");
       JOptionPane.showMessageDialog(new JFrame(), "Successfuly Registered", "Successed!", JOptionPane.OK_OPTION);
       con.close();
       

         }
        
       }catch (ClassNotFoundException ex){
           Logger.getLogger(Inquiries_Admin.class.getName()).log(Level.SEVERE,null,ex);
       //    System.out.println("Error" + ex.getMessage());
       } catch (SQLException ex) {
            Logger.getLogger(Inquiries_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addActionPerformed

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

    private void inquirytfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inquirytfActionPerformed

    }//GEN-LAST:event_inquirytfActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        if (rb3.isSelected()){
        stat.setText(rb3.getText());
    }
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
     
        if (rb1.isSelected()){
        stat.setText(rb1.getText());
    }
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        if (rb1.isSelected()){
        stat.setText(rb1.getText());
    }
    }//GEN-LAST:event_rb2ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

try{
    pst = con.prepareStatement("update inquiry_and_proposal set Company_Name =?, Inquiry_Date =?, Service_Type =?, Status =? where IPM_ID=?");
    pst.setString(1,companytf.getText());
    pst.setString(2,inquirytf.getText());
    pst.setString(3,servicetf.getText());
    pst.setString(4,stat.getText());
    pst.setString(5,ipmtf.getText());
    
        
    int rowsAffected = pst.executeUpdate(); 
    
    if (rowsAffected > 0 ){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int selectedRowIndex = table.getSelectedRow();
        
        model.setValueAt(ipmtf.getText(), selectedRowIndex, 0);
        model.setValueAt(companytf.getText(), selectedRowIndex, 1);
        model.setValueAt(inquirytf.getText(), selectedRowIndex, 2);
        model.setValueAt(servicetf.getText(), selectedRowIndex, 3);
        model.setValueAt(stat.getText(), selectedRowIndex, 4);
        
       JOptionPane.showMessageDialog(new JFrame(), "Updated Successfully", "Successed!", JOptionPane.OK_CANCEL_OPTION);
       con.close();
    } else{
        JOptionPane.showMessageDialog(new JFrame(), "Update Failed", "Warning!", JOptionPane.ERROR_MESSAGE);
       con.close();
    }
       
               
       ipmtf.setText("");
       companytf.setText("");
       stat.setText("");
       inquirytf.setText("");
       servicetf.setText("");
       
} catch (SQLException ex) {
            Logger.getLogger(Inquiries_Admin.class.getName()).log(Level.SEVERE, null, ex);
       
}

    }//GEN-LAST:event_updateActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
        int id = Integer.parseInt(table.getValueAt(table.getSelectedRow(),0).toString());
        try{
               Class.forName("com.mysql.cj.jdbc.Driver");
           
         String url = "jdbc:MYSQL://localhost:3306/ja consultancy services";
         String user = "jaroot";
         String pass = "";
         
         Connection con = DriverManager.getConnection(url,user,pass);
         Statement st = con.createStatement();
         ResultSet res =st.executeQuery("select * from inquiry_and_proposal where IPM_ID ="+id);
                        while(res.next()){
                            ipmtf.setText(res.getString("IPM_ID"));
                            companytf.setText(res.getString("Company_Name"));
                            stat.setText(res.getString("Status"));
                            inquirytf.setText(res.getString("Inquiry_Date"));
                             servicetf.setText(res.getString("Service_Type"));
                             
                             ipmtf.setEditable(false);
                            companytf.setEditable(false);
                            stat.setEditable(false);
                            inquirytf.setEditable(false);
                            servicetf.setEditable(false);
                        }
                
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_tableMouseClicked

    private void ipmtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipmtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipmtfActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
try {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    int selectedRowIndex = table.getSelectedRow();

    if (selectedRowIndex != -1) {
        model.removeRow(selectedRowIndex);
        JOptionPane.showMessageDialog(new JFrame(), "Row Deleted Successfully", "Success!", JOptionPane.OK_CANCEL_OPTION);
    } else {
        JOptionPane.showMessageDialog(new JFrame(), "No Row Selected", "Warning!", JOptionPane.WARNING_MESSAGE);
    }
} catch (Exception ex) {
    Logger.getLogger(Inquiries_Admin.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(new JFrame(), "Deletion Failed", "Error!", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_update1ActionPerformed

    private void searchtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtfActionPerformed

    private void searchtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtfKeyReleased
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchtf.getText()));
    }//GEN-LAST:event_searchtfKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchtf.getText()));

    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Inquiries_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inquiries_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inquiries_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inquiries_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Inquiries_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup btng;
    private javax.swing.JTextField companytf;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JTextField inquirytf;
    private javax.swing.JTextField ipmtf;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchtf;
    private javax.swing.JTextField servicetf;
    private javax.swing.JTextField stat;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
