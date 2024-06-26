package EMPLOYEE;

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

public class Inquiries extends javax.swing.JFrame {

    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int q, i, id, deleteItem;
    
    public static String sc,ipm;
    
    public Inquiries() {
        initComponents();
        this.setLocationRelativeTo(null);
        savebtn.setEnabled(false);

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
    
    btng2.add(rb4);
    btng2.add(rb5);
    btng2.add(rb6);
    
//    ipmtf.setEditable(false);
    inquirytf.setEditable(false);
    stat.setEditable(false);
    servicetf.setEditable(false);
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
        btng2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        companytf = new javax.swing.JTextField();
        stat = new javax.swing.JTextField();
        inquirytf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        savebtn = new javax.swing.JButton();
        next = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        month = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        resetbtn = new javax.swing.JButton();
        servicetf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        deletebtn = new javax.swing.JButton();
        searchtf = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        rb4 = new javax.swing.JRadioButton();
        rb6 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        ipmtf = new javax.swing.JTextField();
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
        jScrollPane1.setBounds(40, 190, 810, 540);

        companytf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(companytf);
        companytf.setBounds(890, 340, 220, 40);

        stat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(stat);
        stat.setBounds(1210, 520, 170, 40);

        inquirytf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inquirytf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inquirytfActionPerformed(evt);
            }
        });
        jPanel1.add(inquirytf);
        inquirytf.setBounds(890, 510, 220, 40);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Company Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(890, 310, 130, 18);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Inquiry Date:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(890, 420, 120, 18);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Status:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1210, 400, 110, 18);

        savebtn.setBackground(new java.awt.Color(0, 153, 102));
        savebtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("Save");
        savebtn.setAlignmentX(0.5F);
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        jPanel1.add(savebtn);
        savebtn.setBounds(1000, 650, 100, 40);

        next.setText("next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next);
        next.setBounds(1390, 760, 75, 23);

        addbtn.setBackground(new java.awt.Color(118, 8, 8));
        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.setAlignmentX(0.5F);
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn);
        addbtn.setBounds(890, 650, 100, 40);

        jButton5.setText("Back");
        jButton5.setAlignmentX(0.5F);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(40, 750, 70, 30);

        editbtn.setBackground(new java.awt.Color(48, 54, 66));
        editbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setText("Edit");
        editbtn.setAlignmentX(0.5F);
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
        jPanel1.add(editbtn);
        editbtn.setBounds(1110, 650, 100, 40);

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March ", "April", "May", "June", "July ", "August ", "September", "October", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        jPanel1.add(month);
        month.setBounds(890, 450, 100, 40);

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        jPanel1.add(day);
        day.setBounds(1000, 450, 70, 40);

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        jPanel1.add(year);
        year.setBounds(1080, 450, 70, 40);

        resetbtn.setBackground(new java.awt.Color(204, 204, 204));
        resetbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.setAlignmentX(0.5F);
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetbtn);
        resetbtn.setBounds(1220, 650, 100, 40);

        servicetf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        servicetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicetfActionPerformed(evt);
            }
        });
        jPanel1.add(servicetf);
        servicetf.setBounds(1210, 320, 170, 40);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Service Type:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1210, 190, 130, 30);

        rb1.setBackground(new java.awt.Color(255, 255, 255));
        rb1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb1.setText("Training");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        jPanel1.add(rb1);
        rb1.setBounds(1210, 225, 90, 30);

        rb2.setBackground(new java.awt.Color(255, 255, 255));
        rb2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb2.setText("Consultancy");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        jPanel1.add(rb2);
        rb2.setBounds(1210, 255, 100, 30);

        rb3.setBackground(new java.awt.Color(255, 255, 255));
        rb3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb3.setText("Audit");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });
        jPanel1.add(rb3);
        rb3.setBounds(1210, 285, 80, 30);

        deletebtn.setBackground(new java.awt.Color(255, 204, 204));
        deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.setAlignmentX(0.5F);
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn);
        deletebtn.setBounds(1330, 650, 100, 40);

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
        jPanel1.add(searchtf);
        searchtf.setBounds(40, 120, 220, 40);

        search.setBackground(new java.awt.Color(204, 0, 0));
        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(280, 120, 100, 40);

        rb4.setBackground(new java.awt.Color(255, 255, 255));
        rb4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb4.setText("Approved");
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });
        jPanel1.add(rb4);
        rb4.setBounds(1210, 430, 90, 25);

        rb6.setBackground(new java.awt.Color(255, 255, 255));
        rb6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb6.setText("Declined");
        rb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb6ActionPerformed(evt);
            }
        });
        jPanel1.add(rb6);
        rb6.setBounds(1210, 490, 80, 25);

        rb5.setBackground(new java.awt.Color(255, 255, 255));
        rb5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb5.setText("Pending");
        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });
        jPanel1.add(rb5);
        rb5.setBounds(1210, 460, 80, 25);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("IPM ID:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(890, 190, 70, 18);

        ipmtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipmtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipmtfActionPerformed(evt);
            }
        });
        jPanel1.add(ipmtf);
        ipmtf.setBounds(890, 220, 220, 40);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EMPLOYEE/inquriesbg.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 1480, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1481, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        if(table.getSelectedRow() <0){
        JOptionPane.showMessageDialog(null, "Please select an account!");
        
        }else{
            companytf.setEditable(true);
            month.setEnabled(true);
            day.setEnabled(true);
            year.setEnabled(true);
            savebtn.setEnabled(true);
            addbtn.setEnabled(false);
            
            ipmtf.setEditable(false);
            servicetf.setEditable(false);
            stat.setEditable(false);
            

            rb1.setEnabled(true);
            rb2.setEnabled(true);
            rb3.setEnabled(true);
            rb4.setEnabled(true);
            rb5.setEnabled(true);
            rb6.setEnabled(true);
}                                                            
        
        
      
                           
        

    }//GEN-LAST:event_editbtnActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        ClientDeets cd = new ClientDeets();
//        Scheduling sc = new Scheduling();
        
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
         }else{
        cd.ipmidtf.setText(ipmtf.getText());
        cd.statustf.setText(stat.getText());
        cd.datetf.setText(inquirytf.getText());
        cd.companyytf.setText(companytf.getText());
        
        sc = servicetf.getText();
        
        int n = JOptionPane.showConfirmDialog(new JFrame(), "Click YES to proceed", "Successed!", JOptionPane.YES_NO_OPTION);
        if(n == 0){
        cd.setVisible(true);
        this.dispose();  
        }
        
         }
    }//GEN-LAST:event_nextActionPerformed

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
        new EmployeeDash().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
       
        
        ipmtf.setText("");
        companytf.setText("");
        stat.setText("");
        
        
        day.setSelectedIndex(0);
        month.setSelectedIndex(0);
        year.setSelectedIndex(0);
        
        servicetf.setText("");
        inquirytf.setText("");
        


    }//GEN-LAST:event_resetbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
 String ipm, cn, stats, inq, serv, query1;
       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           
         String url = "jdbc:MYSQL://localhost:3306/ja consultancy services";
         String user = "jaroot";
         String pass = "";
         
         Connection con = DriverManager.getConnection(url,user,pass);
         Statement st1 = con.createStatement();
         Statement st2 = con.createStatement();

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
       

       
       query1 = "INSERT INTO inquiry_and_proposal(IPM_ID, Company_Name, Inquiry_Date, Service_Type, Status)"
               + "VALUES('"+ipm+"','"+cn+"','"+inq+"','"+serv+"','"+stats+"')";
         
//       query2 = "INSERT INTO transaction_table (Trans_ID, Cons_ID, Client_ID, Payment_ID, Schedule_ID)"
//               + "VALUES(?,'"+cons+"',?,?,?)";
       
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[] {ipmtf.getText(),companytf.getText(),inquirytf.getText(),servicetf.getText(),stat.getText()});


       st1.executeUpdate(query1);

       JOptionPane.showMessageDialog(null, "Successfuly Registered", "Successed!", 1 );


         }
        
       }catch (ClassNotFoundException ex){
           Logger.getLogger(Inquiries.class.getName()).log(Level.SEVERE,null,ex);
       //    System.out.println("Error" + ex.getMessage());
       } catch (SQLException ex) {
            Logger.getLogger(Inquiries.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addbtnActionPerformed

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

Scheduling sc = new Scheduling();
        
            if (rb3.isSelected()){
        servicetf.setText(rb3.getText());
          sc.servetf.setText(servicetf.getText());
    }
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
     
        
        Scheduling sc = new Scheduling();
      
        ;
       
        if (rb1.isSelected()){
        servicetf.setText(rb1.getText());
        sc.servetf.setText(servicetf.getText());
        
        
    }
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
Scheduling sc = new Scheduling();
      

        if (rb2.isSelected()){
        servicetf.setText(rb2.getText());
          sc.servetf.setText(servicetf.getText());
    }
    }//GEN-LAST:event_rb2ActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
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
       ipmtf.setText("");
       companytf.setText("");
       inquirytf.setText("");
       servicetf.setText("");
       stat.setText("");
       
       ipmtf.setEditable(true);
       companytf.setEditable(true);
       inquirytf.setEditable(true);
       servicetf.setEditable(true);
       stat.setEditable(true);
       
       savebtn.setEnabled(false);
       addbtn.setEnabled(true);
       
//       con.close();
    } else{
        JOptionPane.showMessageDialog(new JFrame(), "Update Failed", "Warning!", JOptionPane.ERROR_MESSAGE);
//       con.close();
    }

       
} catch (SQLException ex) {
            Logger.getLogger(Inquiries.class.getName()).log(Level.SEVERE, null, ex);
       
}
         }
    

    }//GEN-LAST:event_savebtnActionPerformed

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
                             
                             
                            companytf.setEditable(false);
                            stat.setEditable(false);
                            inquirytf.setEditable(false);
                            servicetf.setEditable(false);
                            ipmtf.setEditable(false);
                            
                            month.setEnabled(false);
                            day.setEnabled(false);
                            year.setEnabled(false);
                            
                            rb1.setEnabled(false);
                            rb2.setEnabled(false);
                            rb3.setEnabled(false);
                            rb4.setEnabled(false);
                            rb5.setEnabled(false);
                            rb6.setEnabled(false);
                            
                            addbtn.setEnabled(false);
                        }
                
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_tableMouseClicked

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
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
         String sql = "DELETE FROM `inquiry_and_proposal` WHERE IPM_ID=?";
         pst = con.prepareStatement(sql);
         pst.setInt(1,id);
         pst.executeUpdate(); 
        String sqlClient = "DELETE FROM `client_table` WHERE `IPM_ID`=?";
        PreparedStatement pstClient = con.prepareStatement(sqlClient);
        pstClient.setInt(1, id);
        pstClient.executeUpdate();
        
        model.removeRow(selectedRowIndex);
        JOptionPane.showMessageDialog(new JFrame(), "Row Deleted Successfully", "Success!", JOptionPane.CANCEL_OPTION);
        ipmtf.setText("");
        companytf.setText("");
        inquirytf.setText("");
        servicetf.setText("");
        stat.setText("");
        

    } else {
        JOptionPane.showMessageDialog(new JFrame(), "No Row Selected", "Warning!", JOptionPane.WARNING_MESSAGE);
    }
} catch (Exception ex) {
    Logger.getLogger(InquiriesAdmin.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(new JFrame(), "Deletion Failed", "Error!", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_deletebtnActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchtf.getText()));
        
    }//GEN-LAST:event_searchActionPerformed

    private void searchtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtfKeyReleased

    }//GEN-LAST:event_searchtfKeyReleased

    private void searchtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtfActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        if (rb4.isSelected()){
        stat.setText(rb4.getText());
    }
    }//GEN-LAST:event_rb4ActionPerformed

    private void rb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb6ActionPerformed
        if (rb6.isSelected()){
        stat.setText(rb6.getText());
        }
    }//GEN-LAST:event_rb6ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
        if (rb5.isSelected()){
        stat.setText(rb5.getText());
        }
    }//GEN-LAST:event_rb5ActionPerformed

    private void ipmtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipmtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipmtfActionPerformed

    private void servicetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicetfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servicetfActionPerformed

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
            java.util.logging.Logger.getLogger(Inquiries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inquiries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inquiries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inquiries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inquiries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.ButtonGroup btng;
    private javax.swing.ButtonGroup btng2;
    public static javax.swing.JTextField companytf;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    public static javax.swing.JTextField inquirytf;
    public static javax.swing.JTextField ipmtf;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> month;
    public static javax.swing.JButton next;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JRadioButton rb6;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchtf;
    public static javax.swing.JTextField servicetf;
    public static javax.swing.JTextField stat;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
