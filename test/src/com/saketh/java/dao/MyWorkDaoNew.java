package com.saketh.java.dao;
import java.sql.*;
public class MyWorkDaoNew {

	
	public String get(String umail) throws Exception
	{
		System.out.println("3333"+umail+"22222");
	
		try {
			//System.out.println(" inside check bro");
			String db="agm_db";
			String username="root";
			String password="root"; 
			String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
			String query=" select id,storyname,status from story_cred where assign_to=(select uemail from basic_cred where uemail='"+umail+"') ";
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
			 String fmail="";
			// int k=0,k1=0,k2=0;
			while( rs.next() )//&& res)
			{
				System.out.println(" inside rs.next() email");
//				a.setAid(rs.getInt("aid"));
//				a.setAname(rs.getString("aname"));
//				a.setCourse(rs.getString("course"));
			       int id=rs.getInt("id");
			       String  sname=rs.getString("storyname");
			       String status = rs.getString("status");
				fmail= (fmail + id+" "+sname+" "+status )+"\n";
				
				
			}
			System.out.println("11111111111111"+fmail+"111111111111111111111111");
			return fmail;
			
			
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
			 String fr1="";
			 while(rs.next())//&& res)
				{
					//System.out.println(" inside rs.next() email");
				 		
				 
				      return rs.getString(1);
					
					
				}
				
				//return a;
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		
			
			return "";
		
		
		
		}
	
	
}
