/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class User {
    private String Emp_ID;
    private String F_Name;
    private String L_Name;
    private String DOB;
    private String NIC;
    private String Contact;
    private String Department;
    private String Designation;
    private String gende;
    private String Bank_Name;
     private String Branch;
      private String Acc_no;
       private String Salary_T;
        private String Salary;
        private String Status;
        
    
   
    DBConnection db = new DBConnection();
 
    
    public void setEmp_ID(String Emp_ID){
    this.Emp_ID = Emp_ID;
    }
    
    public String GetEmp_ID(){
    return Emp_ID;
    }
    
    public void setF_Name(String F_Name){
    this.F_Name = F_Name;
    }
    
    public String GetF_Name(){
    return F_Name;
    }
    
    public void setL_Name(String L_Name){
    this.L_Name = L_Name;
    }
    
    public String GetL_Name(){
    return L_Name;
    }
    
    public void setDOB(String DOB){
    this.DOB = DOB;
    }
    
    public String GetDOB(){
    return DOB;
    }
    
    public void setNIC(String NIC){
    this.NIC = NIC;
    }
    
    public String GetNIC(){
    return NIC;
    }
    
    public void setContact(String Contact){
    this.Contact = Contact;
    }
    
    public String GetContact(){
    return Contact;
    }
    
    public void setEDepartment(String Department){
    this.Department = Department;
    }
    
    public String GetDepartment(){
    return Department;
    }
    
    public void setDesignation(String Designation){
    this.Designation = Designation;
    }
    
    public String GetDesignation(){
    return Designation;
    }
     public void setgende(String gende){
    this.gende = gende;
    }
    
    public String Getgende(){
    return gende;
    }
      
       public void setBank_Name(String Bank_Name){
    this.Bank_Name = Bank_Name;
    }
    
    public String GetBank_Name(){
    return Bank_Name;
    }
       public void setBranch(String Branch){
    this.Branch = Branch;
    }
    
    public String GetBranch(){
    return Branch;
    }
       public void setAcc_no(String Acc_no){
    this.Acc_no = Acc_no;
    }
    
    public String GetAcc_no(){
    return Acc_no;
    }
       public void setSalary_T(String Salary_T){
    this.Salary_T = Salary_T;
    }
    
    public String GetSalary_T(){
    return Salary_T;
    }
         public void setSalary(String Salary){
    this.Salary = Salary;
    }
    
    public String GetSalary(){
    return Salary;
    }
    
      public void setStatus(String Status){
    this.Status = Status;
    }
    
    public String GetStatus(){
    return Status;
    }
    

    public int Register(String Gender){
        int noRows = 0;
        String SQL = "insert into Employee values('"+GetEmp_ID()+"','"+GetF_Name()+"','"+GetL_Name()+"','"+Gender+"','"+GetDOB()+"','"+GetNIC()+"',"
                + "'"+GetContact()+"','"+GetDesignation()+"','"+GetDepartment()+"','"+GetBank_Name()+"','"+GetBranch()+"',"
                + "'"+GetAcc_no()+"','"+GetSalary_T()+"','"+GetSalary()+"','Active')";
        
        try{
        noRows = db.insertvalues(SQL);
        }
        
        catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Error in registering employee" + ex);
        } 
        
    return noRows;
    }
    
    public boolean validate()
    {
         boolean valid=true;
        if(GetF_Name().isEmpty() || GetL_Name().isEmpty()|| GetDOB().isEmpty()|| GetNIC().isEmpty()|| GetContact().isEmpty()|| GetDepartment().isEmpty()
                ||GetDesignation().isEmpty()||GetBank_Name().isEmpty()||GetBranch().isEmpty()||GetAcc_no().isEmpty()
                ||GetSalary_T().isEmpty()||GetSalary().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Fill the blanks");
        valid=false;
        
        }
        return valid;
    }
     public int Insert_salary(String a,String b,String d,String e,String f ,String g,String h,String i,String j,String k  ){
        int noRows = 0;
        String SQL = "insert into Salary values('"+a+"','"+b+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
        
        try{
        noRows = db.insertvalues(SQL);
        }
        catch(Exception ex){}
    return noRows;
    }
     
      public ResultSet SearchEmployee()
    {  
           ResultSet rs=null;
 String SQL="select Emp_ID,F_Name,Surname,Gender,DOB,NIC,Contact_No,Designation,Department.Name,Status,Salary from Employee, Department where (Employee.Department_ID = Department.Department_ID) and Emp_ID='"+GetEmp_ID()+"';";
        
        try{
         rs=db.SelectValues(SQL);  
         }catch (Exception ex)
         {
         System.out.println(" "+ex.toString());     
        }
        return rs;
    }
     public ResultSet SearchEmployee2()
    {  
           ResultSet rs=null;
 String SQL="select F_Name,Surname,Contact_No,Salary_T,Salary from Employee where Emp_ID ='"+GetEmp_ID()+"';";
        
        try{
         rs=db.SelectValues(SQL);  
         }catch (Exception ex)
         {
         System.out.println(" "+ex.toString());     
        }
        return rs;
    }
     
     
      public int UpdateEmployee()
    {      
        int noRows=0;                 
      String  SQL="update Employee set F_Name  ='"+GetF_Name()+"' ,Surname='"+GetL_Name()+"',Gender='"+Getgende()+"',DOB='"+GetDOB()+"'"
              + ",NIC='"+GetNIC()+"' ,Contact_No='"+GetContact()+"',Designation='"+GetDesignation()+"',Salary = '"+GetSalary()+"' where Emp_ID='"+GetEmp_ID()+"'";      
        
   try{
        noRows= db.insertvalues(SQL); 
         }

   catch (Exception ex)
         {
         System.out.println("Error updating Customer:"+ex.toString());        
        }
        return noRows;
    }
     
     public int UpdateStatus()
    {      
        int noRows=0;                 
      String  SQL="update Employee set Status  ='"+GetStatus()+"' where Emp_ID='"+GetEmp_ID()+"'";      
        
   try{
        noRows= db.insertvalues(SQL); 
         }catch (Exception ex)
         {
         System.out.println("Error deactivating Employee:"+ex.toString());        
        }
        return noRows;
    }
     
      public int Update()
    {      
        int noRows=0;                 
      String  SQL="update employee set Salary  ='"+GetSalary()+"' where Emp_ID='"+GetEmp_ID()+"'";      
        
   try{
        noRows= db.insertvalues(SQL); 
         }catch (Exception ex)
         {
         System.out.println("Error updating Customer:"+ex.toString());        
        }
        return noRows;
    }
    public String AutoId()
    {
        String  IDS=null;
        try
        {
         String    SQL="select  Emp_ID  from Employee";
        int noRows=0; 
        ResultSet rs=db.SelectValues(SQL);  	
        String CID=null;       
        while (rs.next())
           {
            CID= rs.getString( "Emp_ID") ;
             System.out.println(CID);	
            }
     
       String x =CID.substring(1); 
      int  ID  =Integer.parseInt(x); 
      	
        if(ID>0 && ID<9)
        {
       ID=ID+1;
       IDS ="E00"+ID;     
        }
      else   if(ID>=9 && ID<99)
        {
       ID=ID+1;
        IDS ="E0"+ID;
        }
       else   if(ID>=99)
        {
       ID=ID+1;
        IDS ="E"+ID;
        }     
      }         
        catch (Exception ex)
         {
         System.out.println(" "+ex.toString());
         
        }
 return IDS;
    }
   
      public static void main(String args[]) {
    
    
    }
}


