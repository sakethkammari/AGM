package com.saketh.java.dao;
import java.sql.*;
public class StatusDao {

	String db="agm_db";
	String username="root";
	String password="root"; 
	String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
	
	public boolean update_sts(String status1,String uname1) throws Exception
	{
		
		//uemail1=uemail1+"@gmail.com";
		try {
			System.out.println(" inside check bro sts");
			
		
	String query="update story_cred set status='"+status1+"' where assign_to=(select uemail from basic_cred where uname='"+uname1+"')";
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
	
	
	
	
	
	
	
	
	
	
	
	
}
