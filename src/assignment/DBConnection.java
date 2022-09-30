/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;

import java.sql.*;
import javax.swing.JOptionPane;
public class DBConnection {
    
    public Connection getconnection(){
        Connection con = null;
    try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:Salary","Admin","dt2255772");
            
        }
       catch (Exception ex)
       {
           JOptionPane.showMessageDialog(null,"Error connectioning to database"+ex,"Register Form", JOptionPane.ERROR_MESSAGE);
       }
    return con;
    }
    
    public  int insertvalues(String SQL)throws Exception{
    Connection conn = getconnection();
    Statement st = conn.createStatement();
    int noRows = st.executeUpdate(SQL);
    conn.close();
    return noRows;
    
    }
    public ResultSet SelectValues (String SQL)throws Exception
        {      	
            Connection conn =getconnection();
            PreparedStatement stmt=conn.prepareStatement(SQL);
            ResultSet  rs=stmt.executeQuery(); 
            System.out.println(" "+SQL);         
            return rs;
        }
    
}
