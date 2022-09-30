/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
public class Other_Option extends javax.swing.JFrame {
     User objd = new User();
   
    public Other_Option() {
       
        initComponents();   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Clear = new javax.swing.JButton();
        btn_Deactivate = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        txt_FName = new javax.swing.JTextField();
        txt_NIC = new javax.swing.JTextField();
        txt_Des = new javax.swing.JTextField();
        jdepart = new javax.swing.JLabel();
        txt_Surname = new javax.swing.JTextField();
        jempid = new javax.swing.JLabel();
        txt_Gender = new javax.swing.JTextField();
        txt_DOB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_Number = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jstatus = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_Salary = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btn_Clear.setBackground(new java.awt.Color(255, 0, 0));
        btn_Clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Clear);
        btn_Clear.setBounds(110, 590, 90, 40);

        btn_Deactivate.setBackground(new java.awt.Color(255, 0, 0));
        btn_Deactivate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Deactivate.setForeground(new java.awt.Color(255, 255, 255));
        btn_Deactivate.setText("Deactivate");
        btn_Deactivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeactivateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Deactivate);
        btn_Deactivate.setBounds(160, 530, 120, 40);

        btn_update.setBackground(new java.awt.Color(255, 0, 0));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update);
        btn_update.setBounds(50, 530, 90, 40);

        txt_FName.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jPanel1.add(txt_FName);
        txt_FName.setBounds(410, 190, 160, 30);

        txt_NIC.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jPanel1.add(txt_NIC);
        txt_NIC.setBounds(410, 290, 160, 30);

        txt_Des.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jPanel1.add(txt_Des);
        txt_Des.setBounds(130, 390, 160, 30);

        jdepart.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jPanel1.add(jdepart);
        jdepart.setBounds(410, 340, 160, 30);

        txt_Surname.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jPanel1.add(txt_Surname);
        txt_Surname.setBounds(130, 240, 160, 30);

        jempid.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jPanel1.add(jempid);
        jempid.setBounds(130, 190, 150, 30);

        txt_Gender.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jPanel1.add(txt_Gender);
        txt_Gender.setBounds(410, 240, 160, 30);

        txt_DOB.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jPanel1.add(txt_DOB);
        txt_DOB.setBounds(130, 290, 160, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Surname");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 240, 80, 20);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 240, 60, 20);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Date of Birth");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 290, 90, 20);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("NIC");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 290, 25, 20);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Department");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 340, 90, 16);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("Contact Number");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 350, 140, 16);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("First Name");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(320, 190, 80, 20);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Employee ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 190, 110, 20);

        txt_Search.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        txt_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SearchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_Search);
        txt_Search.setBounds(180, 120, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Search Employee");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 130, 150, 17);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Designation");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 390, 80, 16);

        txt_Number.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jPanel1.add(txt_Number);
        txt_Number.setBounds(130, 340, 160, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\Pics\\Untitled-1 copy.PNG")); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(590, -30, 290, 260);

        jstatus.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jstatus.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jstatus);
        jstatus.setBounds(660, 270, 260, 80);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel14.setText("Status");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(660, 200, 180, 90);

        back.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\icons\\arrow-back-icon (1).png")); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(20, 20, 20, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Salary");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(320, 390, 39, 17);

        txt_Salary.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jPanel1.add(txt_Salary);
        txt_Salary.setBounds(420, 390, 150, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\Pics\\JnFefL.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int Confirm= JOptionPane.showConfirmDialog(null, "Are you sure you want to Update Record?","Confirmation",JOptionPane.YES_NO_OPTION);
if (Confirm==0){
        try {
    
       
    objd.setF_Name(txt_FName.getText().trim());
    objd.setL_Name(txt_Surname.getText().trim());
    objd.setgende(txt_Gender.getText().trim());
    objd.setDOB(txt_DOB.getText().trim());
    objd.setNIC(txt_NIC.getText().trim());
    objd.setContact(txt_Number.getText().trim());
    objd.setDesignation(txt_Des.getText().trim());
    objd.setSalary(txt_Salary.getText().trim());
    int Norows=objd.UpdateEmployee();
    if(Norows>0) 
    {
        JOptionPane.showMessageDialog(null, "Employee Details Updated");
    }
    else{
    JOptionPane.showMessageDialog(null,"Check Details to be updated");
    }
 }

    catch (Exception ex)
           {
             JOptionPane.showMessageDialog(null, "Error updating data"+ex);   
                }
        
}
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed

        jempid.setText("");
    txt_DOB.setText("");
    jdepart.setText("");
    txt_Des.setText("");
    txt_Gender.setText("");
    txt_Number.setText("");
    txt_FName.setText("");
    txt_Search.setText("");
    txt_Surname.setText("");
    txt_NIC.setText("");
    txt_Salary.setText("");
    jstatus.setText("");
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_DeactivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeactivateActionPerformed
      int Confirm= JOptionPane.showConfirmDialog(null, "Are you sure you want to Deactivate Employee?","Confirmation",JOptionPane.YES_NO_OPTION);
if (Confirm==0){
   jstatus.setText("Deactivated");
   objd.setStatus(jstatus.getText().toString());
   objd.UpdateStatus();
        }

    }//GEN-LAST:event_btn_DeactivateActionPerformed

    private void txt_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SearchKeyReleased
      try  
      {
          objd.setEmp_ID(txt_Search.getText());
        ResultSet rs=objd.SearchEmployee();
          
          
          
          if (rs.next())
          {
          jempid.setText(rs.getString("Emp_ID"));
          txt_FName.setText(rs.getString("F_Name"));
          txt_Surname.setText(rs.getString("Surname"));
          txt_Gender.setText(rs.getString("Gender"));
          txt_DOB.setText(rs.getString("DOB"));
          txt_NIC.setText(rs.getString("NIC"));
          txt_Number.setText(rs.getString("Contact_No"));
          txt_Des.setText(rs.getString("Designation"));
          jdepart.setText(rs.getString("Name").trim());
          jstatus.setText(""+rs.getString("Status"));
          txt_Salary.setText(rs.getString("Salary"));
        
          
      
         
          }
         
          }
      catch (Exception ex)
       {
           JOptionPane.showMessageDialog(null,"Error searchinig data"+ex);
       } 
    }//GEN-LAST:event_txt_SearchKeyReleased

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       Main_Interface Main = new Main_Interface();
       dispose();
               Main.setVisible(true);
               Main.btn_RUser.setEnabled(false);
               Main.btn_Manageusers.setEnabled(false);
    }//GEN-LAST:event_backActionPerformed

  
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
            java.util.logging.Logger.getLogger(Other_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Other_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Other_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Other_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Other_Option().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Deactivate;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jdepart;
    private javax.swing.JLabel jempid;
    private javax.swing.JLabel jstatus;
    private javax.swing.JTextField txt_DOB;
    private javax.swing.JTextField txt_Des;
    private javax.swing.JTextField txt_FName;
    private javax.swing.JTextField txt_Gender;
    private javax.swing.JTextField txt_NIC;
    private javax.swing.JTextField txt_Number;
    private javax.swing.JTextField txt_Salary;
    private javax.swing.JTextField txt_Search;
    private javax.swing.JTextField txt_Surname;
    // End of variables declaration//GEN-END:variables
private String gender;
}
