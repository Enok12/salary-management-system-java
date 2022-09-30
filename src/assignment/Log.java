/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;
import  java.sql.*;
import javax.swing.JOptionPane;


public class Log extends javax.swing.JFrame {
Connection con;
   
    public Log() {
        DBConnection cn=new DBConnection();
            con=cn.getconnection();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        btnLogin.setBackground(new java.awt.Color(255, 255, 0));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin);
        btnLogin.setBounds(130, 440, 120, 50);

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsername);
        txtUsername.setBounds(140, 300, 190, 30);
        jPanel2.add(password);
        password.setBounds(140, 352, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 350, 80, 17);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Login");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 220, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\Pics\\Untitled-1 copy.PNG")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 40, 300, 150);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Username");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 300, 90, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\Pics\\JnFefL.jpg")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 390, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(406, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      
      try{
          boolean valid = true;
          
          if(txtUsername.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
          JOptionPane.showMessageDialog(null,"Fill all the data", "Login Form", JOptionPane.ERROR_MESSAGE);
          valid = false;
          }
          if (valid){
              String UserType=null;
                PreparedStatement stmLogin=con.prepareStatement("Select * from Admin where Username=? and Password=?");
                
                stmLogin.setString(1,txtUsername.getText());
                stmLogin.setString(2,password.getText());
                ResultSet rs=stmLogin.executeQuery();
                
                if (rs.next())
                {
                    UserType=rs.getString("Usertype").trim();
                    if(UserType.equals("Admin") )
                    {
                        JOptionPane.showMessageDialog(null,"Login Success as admin");
                        Main_Interface op = new Main_Interface();
                        dispose();
                        op.setVisible(true);
                        op.btn_Generate.setEnabled(false);
                        op.btn_update.setEnabled(false);
                        op.btn_Register.setEnabled(false);
                        
                        
                    }
                    if (UserType.equals("User")){
                    JOptionPane.showMessageDialog(null,"Login Success as User");
                    Main_Interface op = new Main_Interface();
                        dispose();
                        op.setVisible(true);
                        op.btn_RUser.setEnabled(false);
                        op.btn_Manageusers.setEnabled(false);
                        
                    }
                   
      
          }
           else
                    {
                        JOptionPane.showMessageDialog(null, "Login Unsuccesful");
                    }
          }
      }
      
      catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error to login in the system"+ ex);
        
      }
        
     
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
