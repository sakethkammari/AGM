package com.saketh.java.dao;
import java.sql.*;
public class MyWorkDaoNew {

	
	public String get(String uname) throws Exception
	{
		
	
		try {
			//System.out.println(" inside check bro");
			String db="agm_db";
			String username="root";
			String password="root"; 
			String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
			String query=" select id,storyname,status from story_cred where assign_to=(select uemail from basic_cred where uemail='"+uname+"') ";
			Class.forName("com.mysql.cj.jdbc.Driver");
			              //com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection(url, username, password);
			PreparedStatement st=con.prepareStatement(query);
			 ResultSet rs=st.executeQuery();
//			boolean res=false;
//			try
//			{
//			//int x=Integer.parseInt(points);
//			 
//			//if(x>0)
//			//{
//				//res=true;
//			//}
//			}
//			catch(Exception e)
//			{
//				System.out.println(e+"exception");
//			}
			if(rs.next() )//&& res)
			{
				System.out.println(" inside rs.next() email");
//				a.setAid(rs.getInt("aid"));
//				a.setAname(rs.getString("aname"));
//				a.setCourse(rs.getString("course"));
			       int id=rs.getInt(1);
			       String  sname=rs.getString(2);
			       String status = rs.getString(3);
				String fres=id+" "+sname+" "+status;
				
				return fres;
			}
			else
			{
				System.out.println(" inside email chck ");
				//return false;
			}
			//return a;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		
		return "";
	}
	
	public String get_mail(String uname) throws Exception
	{
		try {
			//System.out.println(" inside check bro");
			String db="agm_db";
			String username="root";
			String password="root"; 
			String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
			String query=" select uemail from basic_cred where uname='"+uname+"' ";
			Class.forName("com.mysql.cj.jdbc.Driver");
			              //com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection(url, username, password);
			PreparedStatement st=con.prepareStatement(query);
			 ResultSet rs=st.executeQuery();
			 if(rs.next() )//&& res)
				{
					//System.out.println(" inside rs.next() email");

				      return rs.getString(1);
					
					
				}
				else
				{
					System.out.println(" inside chck ");
					//return false;
				}
				//return a;
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		
			
			return "";
		
		
		
		}
	
	
}
