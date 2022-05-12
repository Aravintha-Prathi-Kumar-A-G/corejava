package com.chainsys.jdbc;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*; 

public class UpdateDataBase {

	public static void main(String[] args) throws Exception
	
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
			Statement stmt=con.createStatement();  
			
			// insert
		//stmt.executeUpdate("insert into bcci_cricket values(999,'Arjun',50000,18000,10034,45)");  
			// System.out.println("INSERTED");
			//Update 
			
			//int result=stmt.executeUpdate("update bcci_cricket set players_name='Arjun',salary=19000,score =33333,age=66 where jersy_no=49"); 
			// System.out.println("UPDATED");
			// delete
			
			int result=stmt.executeUpdate("delete from bcci_cricket where jersy_no=70");  
		
			if(result >0 )
			{
				System.out.println("Deleted Successfully");
			} 
			else
			{
				System.out.println(" Not Deleted ");
			}
			
			con.close();  
		}
		
		catch (SQLException err)
		{
			//System.out.println(" Not Deleted ");
			err.printStackTrace();
		}
		
			
	}

}
