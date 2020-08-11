package com.saketh.java.dao;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;

public class RegistrationDao {
	String db="agm_db";
	String username="root";
	String password="root"; 
	String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
	
	public boolean add(String uname1,String upass1,String uemail1) throws Exception
	{
		
		//uemail1=uemail1+"@gmail.com";
		try {
			System.out.println(" inside check bro");
			
		
			String query="insert into basic_cred values('"+uname1+"','"+upass1+"','"+uemail1+"')";
			Class.forName("com.mysql.jdbc.Driver");
          
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
	
	public boolean check(String uname1,String upass1,String uemail1) throws Exception
	{
		try {
			
		//	String query="select * from basic_cred where uname="+uname1+" and upass="+upass1+" and uemail="+uemail1+"";
			String query="select * from basic_cred";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, username, password);
			PreparedStatement st= con.prepareStatement(query);
			
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				System.out.println("inside rs.next()");
				String cname=rs.getString("uname");
				String cpass=rs.getString("upass");
				String cemail=rs.getString("uemail");
				
				if( (uname1.equals(cname)) && (upass1.equals(cpass)) && (uemail1.equals(cemail)) )
				{
					return true;
				//	response.sendRedirect()
				}
				else
				{
					System.out.println("inside else work on this ");
					return false;
				}
				
				
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		  System.out.println(e);
		}
		return false;
	}
	}
	


