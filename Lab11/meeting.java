package com.san;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class meeting 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","admin");
		
		Statement st = conn.createStatement();
		
		st.executeUpdate("create table Meeting(NameOfParticipant varchar(40),MeetingID int,ScheduledTime varchar(20),Email varchar(40),Mobile varchar(10));");
        st.executeUpdate("insert into Meeting values('Sanskar',1105,'Monday','sanskar@gmail.com','1122334455');");
		st.executeUpdate("insert into Meeting values('Somnath',1144,'Tuesday','somnath@gmail.com','1234567890');");
		st.executeUpdate("insert into Meeting values('Jaggannath',1144,'Tuesday','jagannath@gmail.com','4874574847');");
		st.executeUpdate("insert into Meeting values('Badrinath',1144,'Wednesday','badrinath@gmail.com','6378249273');");
	
		System.out.println("\n----------Part A----------\n");
		ResultSet rs = st.executeQuery("select * from Meeting");
		
		ResultSetMetaData rmd = rs.getMetaData();
		
		System.out.println("\nNumber of Columns of the table :- "+rmd.getColumnCount());
		System.out.println("\nColumn names of the table :- ");
		for(int i=1;i<=rmd.getColumnCount();i++)
		{
			System.out.println(rmd.getColumnName(i));
		}
		
		System.out.println("\n----------Part B----------\n");
		System.out.println("Participants names who are in meeting 1144 :- ");
		while(rs.next())
		{
			if(rs.getInt(2)==1144)
			{
				System.out.println(rs.getString(1));
			}
		}
		
		System.out.println("\n----------Part C----------\n");
		st.executeUpdate("Insert into Meeting(NameOfParticipant,ScheduledTime) values('Mridul','Friday');");
        rs = st.executeQuery("select * from Meeting");
        String s="Mridul";
        
        while(rs.next())
        {
            if(s.compareTo(rs.getString(1))==0)
            {
                System.out.println(rs.getInt(2));
            }
        }
        
        System.out.println("\n----------Part D----------\n");
        rs = st.executeQuery("select * from Meeting");
        int k=0;
         while(rs.next())
         {
             if(rs.getInt(2)==1105)
             {
                 k++;
             }
         }
         System.out.println("Meeting ID :- 1105\nNumber of people :- "+k);
         System.out.println("\n----------Part E----------\n");
         System.out.println("Participants those who are attending Tuesday meeting :- ");
         rs=st.executeQuery("select * from Meeting");
         s="Tuesday";
         while(rs.next())
         {
             if(s.compareTo(rs.getString(3))==0)
             {
                 System.out.println(rs.getString(1));
             }
         }

	}
}
