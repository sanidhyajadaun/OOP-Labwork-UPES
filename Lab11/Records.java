package com.san;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Records 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//  TODO Auto-generated method stub
		
				//loading the Driver class
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//using the getConnection() to connect to the database 
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","admin");
				
				//created an object of the Statement class
				Statement st = conn.createStatement();
				
				int result = st.executeUpdate("create table RecordEmp(sno int,name varchar(40), mail varchar(40));");
				
				System.out.println(result+" rows are affected..!");
				
	}

}
