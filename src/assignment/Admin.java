/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author R E V O
 */
public class Admin extends User  {
    

    private String Username;
    private String Password;
  
 public void setUsername(String Username)
    {
        this.Username=Username;
    }
 public String getUsername()
    {
        return Username;
    }
 
 public void setPassword(String Password)
    {
        this.Password=Password;
    }
 public String getPassword()
    {
        return Password;
    }
    @Override
     public int Register(String a){
        int noRows = 0;
        String SQL = "insert into Admin values('"+a+"','"+GetF_Name()+"','"+GetL_Name()+"','"+GetNIC()+"','"+GetContact()+"','"+getUsername()+"',"
                + "'"+getPassword()+"')";
        
        try{
        noRows = db.insertvalues(SQL);
        }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Username already exists");
        }
    return noRows;
    }
     
     public boolean validatePass(String a , String b)
    {
         boolean valid=true;
        if(!a.equals(b) )
        {
            JOptionPane.showMessageDialog(null,"Password should match");
        valid=false;
        
        }
        return valid;
    }
   
    
        public int Updates(String a )
    {      
        int noRows=0;                 
      String  SQL="update Admin set Username  ='"+getUsername()+"' where Username='"+a+"'";
        
   try{
        noRows= db.insertvalues(SQL); 
         }catch (Exception ex)
         {
         System.out.println("Error updating Customer:"+ex.toString());        
        }
        return noRows;
    }
       
        
        public int Updates()
    {      
        int noRows=0;                 
      String  SQL="update Admin set Password  ='"+getPassword()+"' where Username='"+getUsername()+"'";
        
   try{
        noRows= db.insertvalues(SQL); 
         }catch (Exception ex)
         {
         System.out.println("Error updating Customer:"+ex.toString());        
        }
        return noRows;
    }
        
      
      
      
      public ResultSet SearchUser()
    {  
           ResultSet rs=null;
 String SQL="select Usertype,First_Name,Last_Name,Username from Admin where Username ='"+getUsername()+"'";
        
        try{
         rs=db.SelectValues(SQL);  
         }catch (Exception ex)
         {
         System.out.println(" "+ex.toString());     
        }
        return rs;
    }
      
    
     
     
     
    public static void main(String args[]) {
  
    }
}
    
    
         
           
            
    


