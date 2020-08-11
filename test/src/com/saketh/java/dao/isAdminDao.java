package com.saketh.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class isAdminDao {

	String db="agm_db";
	String username="root";
	String password="root"; 
	String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
	
	public boolean add(String uname1) throws Exception
	{
		
		//uemail1=uemail1+"@gmail.com";
		try {
		//	System.out.println(" inside check bro");
			
		
			String query="select isAdmin from basic_cred where uname='"+uname1+"' ";
			Class.forName("com.mysql.jdbc.Driver");
          
         Connection con=DriverManager.getConnection(url, username, password);

        PreparedStatement st= con.prepareStatement(query);
       
         
      //  int count=st.executeUpdate();
    	ResultSet rs=st.executeQuery(query);
    	
    	 //  System.out.println(count+"no of rows affeted");
        
    	if(rs.next())
    	  return true;
    	else
    		return false;
        }
		
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	
		
	
	
}
}