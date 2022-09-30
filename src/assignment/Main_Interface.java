

package assignment;


public class Main_Interface extends javax.swing.JFrame {

    public Main_Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_update = new javax.swing.JButton();
        btn_Register = new javax.swing.JButton();
        btn_Generate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_Manageusers = new javax.swing.JButton();
        btn_RUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btn_update.setBackground(new java.awt.Color(251, 6, 29));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update/Deactivate Employees");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update);
        btn_update.setBounds(390, 270, 330, 60);

        btn_Register.setBackground(new java.awt.Color(251, 6, 29));
        btn_Register.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Register.setForeground(new java.awt.Color(255, 255, 255));
        btn_Register.setText("Register Employees");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Register);
        btn_Register.setBounds(390, 170, 330, 60);

        btn_Generate.setBackground(new java.awt.Color(251, 6, 29));
        btn_Generate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Generate.setForeground(new java.awt.Color(255, 255, 255));
        btn_Generate.setText("Generate Payslips");
        btn_Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Generate);
        btn_Generate.setBounds(390, 370, 330, 60);

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Log out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(690, 470, 90, 23);

        btn_Manageusers.setBackground(new java.awt.Color(251, 6, 29));
        btn_Manageusers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Manageusers.setForeground(new java.awt.Color(255, 255, 255));
        btn_Manageusers.setText("Manage Users");
        btn_Manageusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ManageusersActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Manageusers);
        btn_Manageusers.setBounds(70, 310, 280, 60);

        btn_RUser.setBackground(new java.awt.Color(251, 6, 29));
        btn_RUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_RUser.setForeground(new java.awt.Color(255, 255, 255));
        btn_RUser.setText("Register Users");
        btn_RUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RUserActionPerformed(evt);
            }
        });
        jPanel1.add(btn_RUser);
        btn_RUser.setBounds(70, 210, 280, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\Pics\\Untitled-1 copy.PNG")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 0, 300, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\Pics\\JnFefL.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(807, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
            dispose();
            Register_Employees Reg=new Register_Employees();
            Reg.setVisible(true);
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
            dispose();
            Other_Option OP=new Other_Option();
            OP.setVisible(true);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerateActionPerformed
            dispose();
            Salary_Calculation OP=new Salary_Calculation();
            OP.setVisible(true);
    }//GEN-LAST:event_btn_GenerateActionPerformed

    private void btn_RUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RUserActionPerformed
            dispose();
            Register_User OP=new Register_User();
            OP.setVisible(true);
    }//GEN-LAST:event_btn_RUserActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        dispose();
        Log op = new Log();
        op.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_ManageusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ManageusersActionPerformed
        dispose();
        Manage_Users op = new Manage_Users();
        op.setVisible(true);
    }//GEN-LAST:event_btn_ManageusersActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Generate;
    public javax.swing.JButton btn_Manageusers;
    public javax.swing.JButton btn_RUser;
    public javax.swing.JButton btn_Register;
    public javax.swing.JButton btn_update;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
