
package assignment;

import java.sql.*;
import javax.swing.*;
public class Register_Employees extends javax.swing.JFrame {
Connection con;
   User objd = new User();
    public Register_Employees() {try
        {
            DBConnection cn=new DBConnection();
            con=cn.getconnection();
        }
       catch (Exception ex)
       {
           JOptionPane.showMessageDialog(null,"Error connectioning to database"+ex,"Register Form", JOptionPane.ERROR_MESSAGE);
       }
        initComponents();
        
        
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Emp_ID = new javax.swing.JTextField();
        Surname = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        NIC = new javax.swing.JTextField();
        Contact_No = new javax.swing.JTextField();
        Des = new javax.swing.JTextField();
        F_Name = new javax.swing.JTextField();
        combodept = new javax.swing.JComboBox();
        Male_B = new javax.swing.JRadioButton();
        Female_B = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_Register = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_BankN = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_Salary = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_Branch = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_AccNo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        combo_salarytype = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Date of Birth");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 210, 100, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Employee ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 90, 100, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("NIC");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 250, 60, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Contact No");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 280, 90, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Surname");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 150, 100, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 120, 110, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 180, 90, 15);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setText("Employee Registration");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 0, 390, 50);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setText("Employee Details");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 40, 220, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Designation");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 350, 100, 15);

        Emp_ID.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(Emp_ID);
        Emp_ID.setBounds(140, 90, 120, 20);

        Surname.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(Surname);
        Surname.setBounds(140, 150, 120, 19);

        DOB.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(DOB);
        DOB.setBounds(140, 210, 70, 19);

        NIC.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        NIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NICActionPerformed(evt);
            }
        });
        jPanel1.add(NIC);
        NIC.setBounds(140, 250, 130, 19);

        Contact_No.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(Contact_No);
        Contact_No.setBounds(140, 280, 130, 20);

        Des.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(Des);
        Des.setBounds(140, 350, 130, 19);

        F_Name.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(F_Name);
        F_Name.setBounds(140, 120, 120, 20);

        combodept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IT", "Administration", "Finance" }));
        jPanel1.add(combodept);
        combodept.setBounds(140, 310, 130, 30);

        Male_B.setBackground(new java.awt.Color(255, 255, 255));
        Male_B.setText("Male");
        Male_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Male_BActionPerformed(evt);
            }
        });
        jPanel1.add(Male_B);
        Male_B.setBounds(140, 180, 60, 25);

        Female_B.setBackground(new java.awt.Color(255, 255, 255));
        Female_B.setText("Female");
        Female_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Female_BActionPerformed(evt);
            }
        });
        jPanel1.add(Female_B);
        Female_B.setBounds(210, 180, 70, 25);

        jLabel9.setText("-----------------------------------------");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 70, 210, 10);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Department");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 310, 100, 15);

        btn_Register.setBackground(new java.awt.Color(255, 255, 0));
        btn_Register.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Register.setText("Register");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Register);
        btn_Register.setBounds(380, 340, 140, 40);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);
        btnClear.setBounds(550, 390, 60, 20);

        back.setBackground(new java.awt.Color(0, 255, 255));
        back.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\icons\\arrow-back-icon (1).png")); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(10, 10, 20, 20);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel14.setText("Bank Details");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(350, 50, 220, 30);

        jLabel15.setText("-----------------------------------------");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(350, 80, 210, 10);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Bank Name");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(330, 100, 110, 15);

        txt_BankN.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(txt_BankN);
        txt_BankN.setBounds(450, 100, 120, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Salary Type");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(330, 220, 100, 20);

        txt_Salary.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(txt_Salary);
        txt_Salary.setBounds(450, 250, 120, 19);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Branch");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(330, 130, 60, 20);

        txt_Branch.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(txt_Branch);
        txt_Branch.setBounds(450, 130, 120, 19);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Account Number");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(330, 160, 120, 20);

        txt_AccNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(txt_AccNo);
        txt_AccNo.setBounds(450, 160, 120, 19);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Salary");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(330, 250, 60, 20);

        combo_salarytype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monthly", "Hourly", " " }));
        jPanel1.add(combo_salarytype);
        combo_salarytype.setBounds(450, 220, 120, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\Pics\\white-striped-green-background_1409-892.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(643, 465));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Male_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Male_BActionPerformed
    gender = "Male";
    Male_B.setSelected(true);
    Female_B.setSelected(false);
    }//GEN-LAST:event_Male_BActionPerformed

    private void NICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NICActionPerformed

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed

objd.setEmp_ID(Emp_ID.getText().trim());
objd.setF_Name(F_Name.getText().trim());
objd.setL_Name(Surname.getText().trim());
objd.setDOB(DOB.getText().trim());
objd.setNIC(NIC.getText().trim());
objd.setContact(Contact_No.getText().trim());
objd.setEDepartment(getDepartmentId());
objd.setDesignation(Des.getText().trim());
objd.setAcc_no(txt_AccNo.getText().trim());
objd.setBank_Name(txt_BankN.getText().trim());
objd.setBranch(txt_Branch.getText().trim());
objd.setSalary_T(combo_salarytype.getSelectedItem().toString());
objd.setSalary(txt_Salary.getText().trim());
objd.setgende(gender);

boolean valid = objd.validate();
if(valid){
    
int noRows = objd.Register(gender);
if(noRows > 0 ){
JOptionPane.showMessageDialog(rootPane, "Employee Registered");
}
}


    }//GEN-LAST:event_btn_RegisterActionPerformed
    
           
    private void Female_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Female_BActionPerformed
        gender = "Female";
    Male_B.setSelected(false);
    Female_B.setSelected(true);
    }//GEN-LAST:event_Female_BActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
                                 
Emp_ID.setText(objd.AutoId());
        
    F_Name.setText("");
    Surname.setText("");
    DOB.setText("");
    NIC.setText("");
    Contact_No.setText("");
    Des.setText("");
    Female_B.setSelected(false);
    Male_B.setSelected(false);
    txt_BankN.setText("");
    txt_Branch.setText("");
    txt_AccNo.setText("");
    txt_Salary.setText("");
    
    
   
    }//GEN-LAST:event_btnClearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
            dispose();
            Main_Interface Main=new Main_Interface();
            Main.setVisible(true);
            Main.btn_RUser.setEnabled(false);
            Main.btn_Manageusers.setEnabled(false);
    }//GEN-LAST:event_backActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Emp_ID.setText(objd.AutoId());
        
        
        try
       {
           PreparedStatement stmtDep=con.prepareStatement("select Name from Department");
           
           ResultSet rs1=stmtDep.executeQuery();
           
           String DepName[]=new String[5];
           
           int index=0;
           while (rs1.next())
           {
               DepName[index]=rs1.getString("Name");
               
               index++;
           }
           combodept.setModel(new javax.swing.DefaultComboBoxModel(DepName));
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Error Dpeartment Name"+e, "Department Form",JOptionPane.ERROR_MESSAGE );
       }
        
        

    }//GEN-LAST:event_formWindowOpened

    public String getDepartmentId()
    {
        String DepartmentID="";
        String DepartmentName=(String)combodept.getSelectedItem();
        try
        {
            PreparedStatement stat=con.prepareStatement("select Department_ID from Department where Name=?");
            stat.setString(1,DepartmentName);
            ResultSet rs=stat.executeQuery();
            
            while(rs.next())
            {
                DepartmentID=rs.getString("Department_ID");
                
            }
            
        }
        catch(Exception ex)
        {
            
        }
        return DepartmentID;
    }
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
            java.util.logging.Logger.getLogger(Register_Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contact_No;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField Des;
    private javax.swing.JTextField Emp_ID;
    private javax.swing.JTextField F_Name;
    private javax.swing.JRadioButton Female_B;
    private javax.swing.JRadioButton Male_B;
    private javax.swing.JTextField NIC;
    private javax.swing.JTextField Surname;
    private javax.swing.JButton back;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btn_Register;
    private javax.swing.JComboBox combo_salarytype;
    private javax.swing.JComboBox combodept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_AccNo;
    private javax.swing.JTextField txt_BankN;
    private javax.swing.JTextField txt_Branch;
    private javax.swing.JTextField txt_Salary;
    // End of variables declaration//GEN-END:variables
private String gender;
}
