package com.saketh.java.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import javax.servlet.RequestDispatcher;
public class HistoryDao {

	public HistoryDao()
	{
		//System.out.println("called cons");
	}
	
	public String check() throws Exception
	{
		try {
			System.out.println(" inside check bro");
			String db="agm_db";
			String username="root";
			String password="root"; 
			String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
			//String query="select uname from basic_cred where uname= "+uname1+"   + 'and' + upass="+upass1+"   ";
			String query="select id,storyname,feature ,acceptance,storypoints,assign_to, status from story_cred;";
			//String query="select * from alien where aid=  '"+aid+"' ";
		//	String query="select * from alien";
			Class.forName("com.mysql.cj.jdbc.Driver");
			              //com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection(url, username, password);
			 //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "root");
			PreparedStatement st= con.prepareStatement(query);
			ResultSet rs=st.executeQuery();
			String res="";
			while(rs.next())
			{
				System.out.println("inside rs.next() history ");
				
				String cid=rs.getString("id");
				String cstoryname=rs.getString("storyname");
				String cfeature=rs.getString("feature");
				String cacceptance=rs.getString("acceptance");
				String cstorypoints=rs.getString("storypoints");
				String cassignto=rs.getString("assign_to");
				String cstatus=rs.getString("status");
				
				res =( res+cid+" "+cstoryname+" "+cfeature+" "+cacceptance+" "+cstorypoints+" "+cassignto+" "+cstatus+" ")+"\n";
				  
								
				
				
			}
			System.out.println(res+"res final test111111111");
			return res;
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		System.out.println(e);
		}
		
		
		
		
		return "";
	
	}
	
}
