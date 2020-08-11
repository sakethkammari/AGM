package com.saketh.java.dao;
import java.sql.*;
public class UserStoryDao {
	String db="agm_db";
	String username="root";
	String password="root"; 
	String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
	
	public boolean add(String name_story,String backlog,String release,String epic,String feature,String story,String acceptance,String points,String assign,String status) throws Exception
	{
		
		//uemail1=uemail1+"@gmail.com";
		try {
			System.out.println(" inside check bro");
			
		
		//	String query="insert into basic_cred values('"+uname1+"','"+upass1+"','"+uemail1+"')";
		//	String query="insert into story_cred values(1,'"+send-email+"','"+BLK-01+"','"+relese+"','"+EPC-01+"','"+Integrate with email server+"',   '"+using tools and freameworks etc+"','"+1. autocomplete 2.auto save+"',5,'"+sakethvamshi630@gmail.com+"');";
		
          String query="insert into story_cred(storyname,backlog,releasestory,epic,feature,storyinfo,acceptance,storypoints,assign_to,status) values('"+name_story+"','"+backlog+"','"+release+"','"+epic+"','"+feature+"','"+ story+"','"+ acceptance+"', '"+points+"' ,'"+ assign+"','"+ status+"')";
	
			
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

}
