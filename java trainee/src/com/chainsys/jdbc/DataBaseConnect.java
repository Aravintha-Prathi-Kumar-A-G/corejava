package com.chainsys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConnect {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Class.forName("Oracle.jdbc.Driver.oracledriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		PreparedStatement ps=con.prepareStatement("select * from bcci_cricket");
ResultSet rs=ps.executeQuery();
while(rs.next())
{
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
		
}
	

	}

}
