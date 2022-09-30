/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;

import java.sql.*;
import javax.swing.*;
public class Register_User extends javax.swing.JFrame {
 
 Admin obj = new Admin();
    public Register_User() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        combo_User = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_LName = new javax.swing.JTextField();
        txt_NIC = new javax.swing.JTextField();
        txt_Contact = new javax.swing.JTextField();
        txt_Username = new javax.swing.JTextField();
        txt_Password = new javax.swing.JTextField();
        txt_Confirm = new javax.swing.JTextField();
        txt_FName = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        combo_User.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        combo_User.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "User" }));
        combo_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_UserActionPerformed(evt);
            }
        });
        jPanel1.add(combo_User);
        combo_User.setBounds(160, 350, 110, 23);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("User Registration");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 20, 250, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 120, 110, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("NIC");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 220, 25, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Conctact Number");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 280, 107, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Usertype");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 350, 54, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Last Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 170, 66, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Confirm Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 480, 120, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Password");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 430, 56, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Username");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 390, 62, 17);
        jPanel1.add(txt_LName);
        txt_LName.setBounds(150, 170, 220, 30);
        jPanel1.add(txt_NIC);
        txt_NIC.setBounds(150, 220, 220, 30);
        jPanel1.add(txt_Contact);
        txt_Contact.setBounds(150, 280, 220, 30);
        jPanel1.add(txt_Username);
        txt_Username.setBounds(160, 390, 210, 30);
        jPanel1.add(txt_Password);
        txt_Password.setBounds(160, 430, 210, 30);

        txt_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Confirm);
        txt_Confirm.setBounds(160, 480, 210, 30);
        jPanel1.add(txt_FName);
        txt_FName.setBounds(150, 120, 220, 30);

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister);
        btnRegister.setBounds(160, 530, 100, 25);

        back.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\icons\\arrow-back-icon (1).png")); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(20, 20, 20, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\Pics\\JnFefL.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ConfirmActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
       boolean valid=true;// TODO add your handling code here:
           if(txt_FName.getText().toString().isEmpty()||txt_LName.getText().toString().isEmpty()||txt_NIC.getText().toString().isEmpty()
                   ||txt_Contact.getText().toString().isEmpty()){
               JOptionPane.showMessageDialog(null, "Field should not be blank","Register Form",JOptionPane.ERROR_MESSAGE);
               valid=false;
           }
           if(txt_Password.getText().toString().length()<8){
               JOptionPane.showMessageDialog(null, "Password must have 8 characters","Register form",JOptionPane.ERROR_MESSAGE);
           valid=false;
           }
           else if(!txt_Password.getText().toString().equals(txt_Confirm.getText().toString())){
               JOptionPane.showMessageDialog(null, "Password and confirm password should match","Register form",JOptionPane.ERROR_MESSAGE);
               valid=false;
               
           }
           else if(valid){
       
            obj.setF_Name(txt_FName.getText());
            obj.setL_Name(txt_LName.getText());
            obj.setNIC(txt_NIC.getText());
            obj.setContact(txt_Contact.getText());
            obj.setUsername(txt_Username.getText().trim());
            obj.setPassword(txt_Confirm.getText());
    
    //Insert the record into the table
    int rows=obj.Register(combo_User.getSelectedItem().toString());
    if(rows>0) 
    {
        JOptionPane.showMessageDialog(null, "User details have been registered");
    }
 

           }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void combo_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_UserActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       Main_Interface Main = new Main_Interface();
       dispose();
       Main.setVisible(true);
       Main.btn_Register.setEnabled(false);
       Main.btn_update.setEnabled(false);
       Main.btn_Generate.setEnabled(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Register_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox combo_User;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField txt_Confirm;
    private javax.swing.JTextField txt_Contact;
    private javax.swing.JTextField txt_FName;
    private javax.swing.JTextField txt_LName;
    private javax.swing.JTextField txt_NIC;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}
