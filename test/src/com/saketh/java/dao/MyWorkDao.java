package com.saketh.java.dao;
import java.sql.*;
public class MyWorkDao {

	
	public boolean check(String assignto,String points) throws Exception
	{
		
	
		try {
			//System.out.println(" inside check bro");
			String db="agm_db";
			String username="root";
			String password="root"; 
			String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
			String query="select * from basic_cred where uemail='"+assignto+"'";
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
			       
				return true;
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
	
		
		return false;
	}
	
	public String get(String assignto)
	{

		try {
			//System.out.println(" inside check bro");
			String db="agm_db";
			String username="root";
			String password="root"; 
			String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
			String query="select id,storyname,status from story_cred where assign_to='"+assignto+"' ";
			Class.forName("com.mysql.cj.jdbc.Driver");
			              //com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection(url, username, password);
			
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
			ResultSet rs=stmt.executeQuery(query);  
			  
			//getting the record of 3rd row  
			//rs.absolute(3);  
			if(rs.next())
			{
			//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
			
				int F_id = rs.getInt("id");
				String F_storyname = rs.getString("storyname");
				String F_status = rs.getString("status");
					
				String F_res =(F_id+"")+" "+F_storyname+" "+F_status;
				System.out.println("dao -> "+F_res+"f");
				return F_res;
			} 
			
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
		return "";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//		
//		PreparedStatement st=con.prepareStatement(sql);
//	    st.setString(1, uname);
//	    st.setString(2,upass);
//	    ResultSet rs=st.executeQuery();
//	    if(rs.next())
//	    {
//	    	//rs.getS
//	    	return true;
////	    }
//		return false;
//	
//	}
//	}

	
	

