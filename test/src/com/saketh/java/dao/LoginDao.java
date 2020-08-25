package com.saketh.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.crypto.spec.SecretKeySpec;
public class LoginDao {

//	//String db="bhai";
//	String url="jdbc:mysql://localhost:3306/agm_db";
//	String username="root";
//	String password="root";
//	
//	String sql="select * from basic_cred where uname=? and pass=? ";

	
	 //SecretKey key = new SecretKeySpec(k.getBytes(), "AES");
	 //RegistrationDao encrypter = new RegistrationDao(key) 
	
	
	public boolean set_key(String uname,String key) throws Exception
	{
		//System.out.println("name:"+uname1);
		//System.out.println("pass:"+upass1);
		System.out.println("set key called");
		
		try {
			//System.out.println(" inside check bro");
			String db="agm_db";
			String username="root";
			String password="root"; 
			String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
			//String query="select uname from basic_cred where uname= "+uname1+"   + 'and' + upass="+upass1+"   ";
			String query="insert into e_key values ('"+uname+"' , '"+key+"') ";
			//String query="select * from alien where aid=  '"+aid+"' ";
		//	String query="select * from alien";
			Class.forName("com.mysql.cj.jdbc.Driver");
			              //com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection(url, username, password);
			 //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "root");
			PreparedStatement st= con.prepareStatement(query);
			//Statement st=con.createStatement();
			
			int count=st.executeUpdate();
			//st.setString(3, c);
		//	ResultSet rs=st.executeQuery();
			//rs.next();
			
			if(count==1)
			{
				
				System.out.println(" inside rs.next() keyyy");
//				a.setAid(rs.getInt("aid"));
//				a.setAname(rs.getString("aname"));
//				a.setCourse(rs.getString("course"));
			    
				return true;
			}
			else
			{
				System.out.println("check  44 dude: ");
				return false;
			}
			//return a;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		
		return false;
	}

	public static String get_key(String uname1) throws Exception
	{
			System.out.println("get key called");
		 
		try {
			//System.out.println(" inside check bro latest : ");
			String db="agm_db";
			String username="root";
			String password="root"; 
			String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
			//String query="select uname from basic_cred where uname= "+uname1+"   + 'and' + upass="+upass1+"   ";
			String query="select ukey from e_key where uname='"+uname1+"' ";
			//String query="select * from alien where aid=  '"+aid+"' ";
		//	String query="select * from alien";
			Class.forName("com.mysql.cj.jdbc.Driver");
			              //com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection(url, username, password);
			 //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "root");
			PreparedStatement st= con.prepareStatement(query);
			//Statement st=con.createStatement();
			//st.setString(1,uname1);
			//st.setString(2,upass1);
			
			ResultSet rs=st.executeQuery();
			//rs.next();
			
			System.out.println(rs);
			if(rs.next())
			{
				
				System.out.println(" s11111111111111  ");
//				a.setAid(rs.getInt("aid"));
//				a.setAname(rs.getString("aname"));
//				a.setCourse(rs.getString("course"));
			    String s1=rs.getString("ukey");
			    System.out.println(s1+"s1 key  ");
				return s1;
			}
			else
			{
				System.out.println(" key pass check bro !");
				return "";
			}
			//return a;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		
		return "";
	}
	
	
	public boolean check(String uname1,String upass1) throws Exception
	{
		System.out.println("chewck user called !");
	//	BeanTest bt=new BeanTest();
		//String k=bt.getk();
	//	System.out.println(k+"k from bean");
		
		String k=LoginDao.get_key(uname1);
		System.out.println("key: "+k+" 00000 old1");
		 upass1 = new RegistrationDao(new SecretKeySpec(k.getBytes(), "AES")).encrypt(upass1);
		
		 
		//System.out.println("namenew:"+uname1);
		System.out.println("passnew45 new1 :"+upass1);
		try {
			System.out.println(" inside check bro latest : ");
			String db="agm_db";
			String username="root";
			String password="root"; 
			String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
			//String query="select uname from basic_cred where uname= "+uname1+"   + 'and' + upass="+upass1+"   ";
			String query="select * from basic_cred where uname=? and upass=? and isAdmin=0 ";
			//String query="select * from alien where aid=  '"+aid+"' ";
		//	String query="select * from alien";
			Class.forName("com.mysql.cj.jdbc.Driver");
			              //com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection(url, username, password);
			 //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "root");
			PreparedStatement st= con.prepareStatement(query);
			//Statement st=con.createStatement();
			st.setString(1,uname1);
			st.setString(2,upass1);
			
			ResultSet rs=st.executeQuery();
			//rs.next();
			
			System.out.println(rs);
			if(rs.next())
			{
				
				System.out.println(" inside rs.next() a,b ");
//				a.setAid(rs.getInt("aid"));
//				a.setAname(rs.getString("aname"));
//				a.setCourse(rs.getString("course"));
			    
				return true;
			}
			else
			{
				System.out.println("check klkkllk dude: ");
				return false;
			}
			//return a;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		
		return false;
	}

	
	public boolean checka(String uname1,String upass1,int c) throws Exception
	{
		System.out.println("name:"+uname1);
		System.out.println("pass:"+upass1);
		System.out.println("c:"+c);
		
		try {
			//System.out.println(" inside check bro");
			String db="agm_db";
			String username="root";
			String password="root"; 
			String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
			//String query="select uname from basic_cred where uname= "+uname1+"   + 'and' + upass="+upass1+"   ";
			String query="select * from basic_cred where uname=? and upass=? and isAdmin=1";
			//String query="select * from alien where aid=  '"+aid+"' ";
		//	String query="select * from alien";
			Class.forName("com.mysql.cj.jdbc.Driver");
			              //com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection(url, username, password);
			 //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "root");
			PreparedStatement st= con.prepareStatement(query);
			//Statement st=con.createStatement();
			st.setString(1,uname1);
			st.setString(2,upass1);
			//st.setString(3, c);
			ResultSet rs=st.executeQuery();
			//rs.next();
			
			if(rs.next())
			{
				
				System.out.println(" inside rs.next() a,b,c");
//				a.setAid(rs.getInt("aid"));
//				a.setAname(rs.getString("aname"));
//				a.setCourse(rs.getString("course"));
			    
				return true;
			}
			else
			{
				System.out.println("check  44 dude: ");
				return false;
			}
			//return a;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		
		return false;
	}





}


		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con=DriverManager.getConnection(url,username,password);
//	    PreparedStatement st=con.prepareStatement(sql);
//	    st.setString(1, uname);
//	    st.setString(2,upass);
//	    ResultSet rs=st.executeQuery();
//	    if(rs.next())
//	    {
//	    	return true;
//	    }
	    
	    
	    
		




	
	


