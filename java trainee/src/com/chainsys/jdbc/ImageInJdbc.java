package com.chainsys.jdbc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ImageInJdbc {
	public static void main(String[] args) 
    { 
       // insert();
       retrieve();
    }
    public static void insert()
    {
     try
     {  
         Class.forName("oracle.jdbc.driver.OracleDriver");  
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
         PreparedStatement ps=con.prepareStatement("insert into imagetable values(?,?)");  
         ps.setString(1,"romi");  
  
         FileInputStream fin=new FileInputStream("D:\\Aravind\\pictures\\batman vs superman.jpg");  
         ps.setBinaryStream(2,fin,fin.available());  
         int i=ps.executeUpdate();  
         System.out.println(i+" records affected");   
         con.close();  
     }
     catch (Exception e) 
     {
         e.printStackTrace();
     }  
    }  
    public static void retrieve()
    {  
        try
        {  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");        
        PreparedStatement ps=con.prepareStatement("select * from imagetable");  
        ResultSet rs=ps.executeQuery();  
        if(rs.next())
        {              
            Blob b=rs.getBlob(2);//2 means 2nd column data  
            byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
                      
            FileOutputStream fout=new FileOutputStream("C:\\Users\\arav3116\\Downloads\\romi.jpg");  
            fout.write(barr);               
            fout.close();  
        }  
        System.out.println("ok");                
        con.close();  
        }
        catch (Exception e) 
        {
            e.printStackTrace(); 
        }  
    }

}
