

package assignment;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.*;


public class Salary_Calculation extends javax.swing.JFrame {
    
 User objd = new User();
 Salary obj = new Salary();
    public Salary_Calculation() {
        
         initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_FName = new javax.swing.JTextField();
        txt_LName = new javax.swing.JTextField();
        txt_ContactNo = new javax.swing.JTextField();
        txt_SalaryT = new javax.swing.JTextField();
        txt_Ref = new javax.swing.JTextField();
        txt_empID = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        Generate = new javax.swing.JButton();
        Calculate = new javax.swing.JButton();
        jepfcom = new javax.swing.JLabel();
        jetf = new javax.swing.JLabel();
        jtax = new javax.swing.JLabel();
        jfinal = new javax.swing.JLabel();
        jepfe = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Salary1 = new javax.swing.JTextField();
        btn_Upsalary = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        comboMonth = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Employee ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 140, 90, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 190, 80, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 240, 70, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Contact Number");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 290, 110, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Salary Type");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 340, 90, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Ref No");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 440, 60, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("EPF amount for Employee :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(400, 150, 170, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("EPF amount for Company:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(400, 200, 170, 17);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("ETF Amount:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(410, 250, 110, 17);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("Final Salary:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(420, 380, 150, 28);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("TAX Amount:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(410, 310, 100, 17);
        jPanel1.add(txt_FName);
        txt_FName.setBounds(130, 190, 150, 22);

        txt_LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LNameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_LName);
        txt_LName.setBounds(130, 240, 150, 22);
        jPanel1.add(txt_ContactNo);
        txt_ContactNo.setBounds(140, 290, 150, 22);
        jPanel1.add(txt_SalaryT);
        txt_SalaryT.setBounds(90, 340, 150, 22);

        txt_Ref.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_RefMouseClicked(evt);
            }
        });
        txt_Ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RefActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Ref);
        txt_Ref.setBounds(90, 440, 150, 22);
        jPanel1.add(txt_empID);
        txt_empID.setBounds(130, 140, 150, 22);

        btn_Search.setBackground(new java.awt.Color(255, 0, 51));
        btn_Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Search.setForeground(new java.awt.Color(240, 240, 240));
        btn_Search.setText("Search Employee");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Search);
        btn_Search.setBounds(20, 600, 170, 40);

        Generate.setBackground(new java.awt.Color(255, 0, 51));
        Generate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Generate.setForeground(new java.awt.Color(240, 240, 240));
        Generate.setText("Generate Payslips");
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });
        jPanel1.add(Generate);
        Generate.setBounds(530, 610, 220, 60);

        Calculate.setBackground(new java.awt.Color(255, 0, 0));
        Calculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Calculate.setForeground(new java.awt.Color(240, 240, 240));
        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });
        jPanel1.add(Calculate);
        Calculate.setBounds(530, 430, 130, 50);

        jepfcom.setBackground(new java.awt.Color(255, 255, 255));
        jepfcom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jepfcom);
        jepfcom.setBounds(580, 200, 130, 30);

        jetf.setBackground(new java.awt.Color(255, 255, 255));
        jetf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jetf);
        jetf.setBounds(580, 250, 120, 30);

        jtax.setBackground(new java.awt.Color(255, 255, 255));
        jtax.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jtax);
        jtax.setBounds(580, 310, 130, 30);

        jfinal.setBackground(new java.awt.Color(255, 255, 255));
        jfinal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPanel1.add(jfinal);
        jfinal.setBounds(580, 380, 140, 30);

        jepfe.setBackground(new java.awt.Color(255, 255, 255));
        jepfe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jepfe);
        jepfe.setBounds(580, 150, 150, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Salary ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 390, 43, 17);

        txt_Salary1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Salary1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Salary1);
        txt_Salary1.setBounds(90, 390, 150, 22);

        btn_Upsalary.setBackground(new java.awt.Color(255, 0, 51));
        btn_Upsalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Upsalary.setForeground(new java.awt.Color(240, 240, 240));
        btn_Upsalary.setText("Update");
        btn_Upsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpsalaryActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Upsalary);
        btn_Upsalary.setBounds(380, 610, 130, 60);

        jLabel15.setFont(new java.awt.Font("Minion Pro Cond", 1, 48)); // NOI18N
        jLabel15.setText("PaySlip Generation");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(210, 20, 420, 100);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("-----------------------------------------");
        jLabel16.setToolTipText("---------------------------------");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(190, 80, 440, 30);

        back.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\icons\\arrow-back-icon (1).png")); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(20, 20, 20, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Month");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 490, 48, 16);

        comboMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(comboMonth);
        comboMonth.setBounds(90, 490, 150, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Others\\ICBT Assigments\\ICBT Assignemnt 6\\Assignment\\Pics\\JnFefL.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 780, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(799, 726));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LNameActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        try 
      {
          objd.setEmp_ID(txt_empID.getText());
        ResultSet rs=objd.SearchEmployee2();
          
          
          
          if (rs.next())
          {
             
              txt_FName.setText(rs.getString("F_Name").trim());
              txt_LName.setText(rs.getString("Surname"));
              txt_ContactNo.setText(rs.getString("Contact_No"));
              txt_SalaryT.setText(rs.getString("Salary_T"));
              txt_Salary1.setText(rs.getString("Salary"));
             
              
         
          }else{
          JOptionPane.showMessageDialog(null, "Employee not found");
          }
         
          }
      catch (Exception ex)
       {
           JOptionPane.showMessageDialog(null,"Error searchinig data"+ex);
       } 
        
       
        
       
    
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        obj.setSalary(txt_Salary1.getText());
       jepfe.setText(""+obj.calculateEPFforemp());
       jepfcom.setText(""+obj.calculateEPFforcom());
       jetf.setText(""+obj.calculateETF());
       jtax.setText(""+obj.calculatetax());
       
       double epfforemp = obj.calculateEPFforemp();
       double etf = obj.calculateETF();
       double tax = obj.calculatetax();
       
       jfinal.setText(""+obj.calculateFinalsalary(epfforemp, etf));
       
       
        
       
       
    }//GEN-LAST:event_CalculateActionPerformed

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
        String value0= txt_empID.getText().trim();
        String value1 = txt_FName.getText().trim();
       String value2 =  txt_LName.getText().trim();
       String value3 = txt_Ref.getText();
       String value4 = jepfe.getText();
       String value5 = jepfcom.getText();
       String value6 = jetf.getText();
       String value7 = jtax.getText();
       String value8 = jfinal.getText();
       String value9 = txt_Salary1.getText();
       
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(value1+" "+value2+"-Salary Slip"+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();
        
          try{
        Document myDocument = new Document();
           PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
           myDocument.open();
           
           myDocument.add(new Paragraph("PAY SLIP",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
           myDocument.add(new Paragraph(new Date().toString()));
           myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
           myDocument.add((new Paragraph("EMPLOYEE DETAILS",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD))));
           myDocument.add((new Paragraph("Employee ID         : " +value0,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
           myDocument.add((new Paragraph("Name of Employee: " +value1 + " "+value2,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
           myDocument.add((new Paragraph("Salary ID               :" +value3,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
           myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
           myDocument.add(new Paragraph("SALARY",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
           myDocument.add(new Paragraph("Basic Salary        : Rs."+value9,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
           myDocument.add(new Paragraph("EPF to employee: Rs."+value4,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
           myDocument.add(new Paragraph("EPF to company : Rs." +value5,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
           myDocument.add(new Paragraph("ETF                     : Rs."+value6,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
           myDocument.add(new Paragraph("TAX                    : Rs."+value7,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
           myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
           myDocument.add(new Paragraph("TOTAL PAYMENT",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
           myDocument.add(new Paragraph("Net Pay : Rs." +value8,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
           myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
     
           myDocument.newPage();
           myDocument.close();  
           JOptionPane.showMessageDialog(null,"Payslip was successfully generated");
        
          }
          catch(Exception ex){
          
          
        }
        }
    }//GEN-LAST:event_GenerateActionPerformed

    private void txt_RefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RefActionPerformed

    private void txt_Salary1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Salary1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Salary1ActionPerformed

    private void txt_RefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_RefMouseClicked
txt_Ref.setText(obj.AutoRef());
    }//GEN-LAST:event_txt_RefMouseClicked

    private void btn_UpsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpsalaryActionPerformed
      
        try{
        objd.setSalary(txt_Salary1.getText().toString());
       objd.setEmp_ID(txt_empID.getText().toString());
       
       int Norows = objd.Update();
               if(Norows>0) 
    {
        JOptionPane.showMessageDialog(null, "Salary updated");
    }
 }
    catch (Exception ex)
           {
             JOptionPane.showMessageDialog(null, "Error updating data"+ex);   
                }
         obj.setSalary(txt_Salary1.getText());
       jepfe.setText(""+obj.calculateEPFforemp());
       jepfcom.setText(""+obj.calculateEPFforcom());
       jetf.setText(""+obj.calculateETF());
       jtax.setText(""+obj.calculatetax());
       
       double epfforemp = obj.calculateEPFforemp();
       double etf = obj.calculateETF();

       
       jfinal.setText(""+obj.calculateFinalsalary(epfforemp, etf));
       
       
       try{
      
       String value = txt_Ref.getText();
String value1 = txt_empID.getText();
String value3 = txt_FName.getText();
String value4= jepfe.getText();
String value5= jepfcom.getText();
String value6 = jetf.getText();
String value7 = jtax.getText();
String value8 = jfinal.getText();
String value9 = txt_Salary1.getText();

        int noRows = objd.Insert_salary(value, value1,value3, value4, value5, value6, value7, value8,value9,comboMonth.getSelectedItem().toString());
if(noRows > 0 ){
JOptionPane.showMessageDialog(rootPane, "Successfully Stored to the database");
}
       }
    catch (Exception ex)
           {
             JOptionPane.showMessageDialog(null, "Error updating data"+ex);   
                }
       
    }//GEN-LAST:event_btn_UpsalaryActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
         dispose();
            Main_Interface Main=new Main_Interface();
            Main.setVisible(true);
            Main.btn_RUser.setEnabled(false);
            Main.btn_Manageusers.setEnabled(false);
            
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
            java.util.logging.Logger.getLogger(Salary_Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salary_Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salary_Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salary_Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salary_Calculation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Generate;
    private javax.swing.JButton back;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Upsalary;
    private javax.swing.JComboBox comboMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jepfcom;
    private javax.swing.JLabel jepfe;
    private javax.swing.JLabel jetf;
    private javax.swing.JLabel jfinal;
    private javax.swing.JLabel jtax;
    private javax.swing.JTextField txt_ContactNo;
    private javax.swing.JTextField txt_FName;
    private javax.swing.JTextField txt_LName;
    private javax.swing.JTextField txt_Ref;
    private javax.swing.JTextField txt_Salary1;
    private javax.swing.JTextField txt_SalaryT;
    private javax.swing.JTextField txt_empID;
    // End of variables declaration//GEN-END:variables
}