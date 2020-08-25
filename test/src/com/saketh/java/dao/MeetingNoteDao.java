package com.saketh.java.dao;
import java.sql.*;
public class MeetingNoteDao {
	// not in use

	String db="agm_db";
	String username="root";
	String password="root"; 
	String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
	public void add(String filedata) throws Exception
	{
		
		//uemail1=uemail1+"@gmail.com";
		try {
			System.out.println(" inside file data dao bro");
			
		
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
	
}
