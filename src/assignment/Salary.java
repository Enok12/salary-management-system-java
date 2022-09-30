/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;

import java.sql.ResultSet;


public class Salary {
    
   private String EPF_emp; 
   private String EPF_com; 
   private String ETF; 
   private String Tax; 
   private String Final_Salary ;
   private String Salary ;
   
   DBConnection obj = new DBConnection();
  
    
    public void setEPF_emp(String EPF_emp){
    this.EPF_emp = EPF_emp;
    }
    
    public String GetEPF_emp(){
    return EPF_emp;
    }
    
    public void setEPF_com(String EPF_com){
    this.EPF_com = EPF_com;
    }
    
    public String GetEPF_com(){
    return EPF_com;
    }
    
    public void setETF(String ETF){
    this.ETF = ETF;
    }
    
    public String GetETF(){
    return ETF;
    }
    
    public void setTax(String Tax){
    this.Tax = Tax;
    }
    
    public String GetTax(){
    return Tax;
    }
    
    public void setFinal_Salary(String Final_Salary){
    this.Final_Salary = Final_Salary;
    }
    
    public String GetFinal_Salary(){
    return Final_Salary;
    }
    
    public void setSalary(String Salary){
    this.Salary = Salary;
    }
    
    public String GetSalary(){
    return Salary;
    }
   
    public double calculateEPFforemp(){
        
    String x = GetSalary();
    int salary = Integer.parseInt(x);
    
    
   final double EPF = 0.08;
   double epf = salary*EPF;
   
   
   return epf;
    }
    public double calculateEPFforcom(){
        
    String x = GetSalary();
    int salary = Integer.parseInt(x);
    
    
   final double EPF = 0.04;
   double epf = salary*EPF;
   
   
   return epf;
    }
    
    public double calculateETF(){
        
    String x = GetSalary();
    int salary = Integer.parseInt(x);
    
    
   final double ETF = 0.03;
   double etf = salary*ETF;
   
   
   return etf;
    }
    
    public double calculatetax (){
    String x = GetSalary();
    int salary = Integer.parseInt(x);
    int yearsalary = salary * 12;
    
   final double TAX = 0.125;
   double tax = yearsalary*TAX;
   double monthtax = tax/12;
        
    return monthtax;
    }
    
    public double calculateFinalsalary (double EPFemp,double ETF){
         String x = GetSalary();
    int salary = Integer.parseInt(x);
     double Deduction = EPFemp+ETF;
        
       double FinalSalary = salary - Deduction;
    
    return FinalSalary;
    }
    

    
        
        
          public String AutoRef()
    {
        String  IDS=null;
        try
        {
         String    SQL="select  ReferenceNo  from Salary";
        int noRows=0; 
        ResultSet rs=obj.SelectValues(SQL);  	
        String CID=null;       
        while (rs.next())
           {
            CID= rs.getString( "ReferenceNo") ;
             System.out.println(CID);	
            }
     
       String x =CID.substring(1); 
      int  ID  =Integer.parseInt(x); 
      	
        if(ID>0 && ID<9)
        {
       ID=ID+1;
       IDS ="R00"+ID;     
        }
      else   if(ID>=9 && ID<99)
        {
       ID=ID+1;
        IDS ="R0"+ID;
        }
       else   if(ID>=99)
        {
       ID=ID+1;
        IDS ="R"+ID;
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
