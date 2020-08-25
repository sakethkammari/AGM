package com.saketh.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Meeting_Dao {

	
	String db="agm_db";
	String username="root";
	String password="root"; 
	String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
	
	public boolean add(String Note,String date) throws Exception
	{
		
		
		try {
			//System.out.println(" inside check bro");
			
		
			String query="insert into Meeting_Note values ('"+date+"','"+Note+"') ";
			Class.forName("com.mysql.cj.jdbc.Driver");
          
         Connection con=DriverManager.getConnection(url, username, password);

        PreparedStatement st= con.prepareStatement(query);
        { 
        int count=st.executeUpdate();
    	System.out.println(count+"no of rows affeted");
        return true;
        }
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	
	public String get_note(String date) throws Exception
	{
		
		
		try {
			//System.out.println(" inside check bro");
			
		
			String query="select * from Meeting_Note where metting_date='"+date+"'";
			Class.forName("com.mysql.cj.jdbc.Driver");
          
         Connection con=DriverManager.getConnection(url, username, password);

        PreparedStatement st= con.prepareStatement(query);
        
    	ResultSet rs=st.executeQuery();
    	String res="";
        while(rs.next())
        {
        	res= ( res+rs.getString("meeting_note") )+"\n";
        	
        }
        System.out.println(res+"resnote");
        return res;
       
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "";
	}
	
}
