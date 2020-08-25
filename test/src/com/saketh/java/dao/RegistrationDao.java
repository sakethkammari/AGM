package com.saketh.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

//import java.sql.DriverManager;
//import java.sql.PreparedStatement;

public class RegistrationDao {
	 Cipher ecipher;
	  Cipher dcipher;
	String db="agm_db";
	String username="root";
	String password="root"; 
	String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
	
	public RegistrationDao(SecretKey key) throws Exception {
		    ecipher = Cipher.getInstance("AES");
		    dcipher = Cipher.getInstance("AES");
		    ecipher.init(Cipher.ENCRYPT_MODE, key);
		    dcipher.init(Cipher.DECRYPT_MODE, key);
	}
	 public String encrypt(String str) throws Exception {
		    
		    byte[] utf8 = str.getBytes("UTF8");

		
		    byte[] enc = ecipher.doFinal(utf8);

		
		    return new sun.misc.BASE64Encoder().encode(enc);
		  }
	 public String decrypt(String str) throws Exception {
		   
		    byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);

		    byte[] utf8 = dcipher.doFinal(dec);

		   
		    return new String(utf8, "UTF8");
		  }
	 
	public  static String getAlphaNumericString() 
	    { 
				
	     
	        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	                                    + "0123456789"
	                                    + "abcdefghijklmnopqrstuvxyz"; 
	  
	 
	        StringBuilder sb = new StringBuilder(25); 
	  
	        for (int i = 0; i < 32; i++) { 
	  
	       
	            int index 
	                = (int)(AlphaNumericString.length() 
	                        * Math.random()); 
	  
	          
	            sb.append(AlphaNumericString 
	                          .charAt(index)); 
	        } 
	  
	        return sb.toString(); 
	    } 
	 
	 
	public boolean add(String uname1,String upass1,String uemail1) throws Exception
	{
		
		//String k = getAlphaNumericString();
		
		LoginDao da=new LoginDao();
		//if(da.set_key(uname1,k))
		{
			//System.out.println("insertion done!");
		}
		//else
		{
			//System.out.println("insertion not done:(");
		}
		
	///	System.out.println(k+"hhh");
		//BeanTest bt=new BeanTest(); 
		//bt.setk(k);
		
		//System.out.println(k+"okakkkkyyyy12");
		 //SecretKey key = new SecretKeySpec(k.getBytes(), "AES");
		 //System.out.println(key+"");
		 //RegistrationDao encrypter = new RegistrationDao(key);
		 
		 //System.out.println(upass1+"before enc");
		 
		 //upass1 = encrypter.encrypt(upass1);
		
		
		System.out.println(uname1+"aa");
		System.out.println(upass1+"aa new1111111111111111111111111111111111111111111111111111");
		System.out.println(uemail1+"aa");
		//uemail1=uemail1+"@gmail.com";
		try {
			System.out.println(" inside check bro");
			
			//InternetAddress
			String query="insert into basic_cred values ('"+uname1+"','"+upass1+"','"+uemail1+"',0 )";
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
	
	public boolean check(String uname1,String upass1,String uemail1) throws Exception
	{
		try {
			
		//	String query="select * from basic_cred where uname="+uname1+" and upass="+upass1+" and uemail="+uemail1+"";
			String query="select * from basic_cred";
			Class.forName("com.mysql.cj.jdbc.Driver");
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
	public  boolean isValidEmailAddress(String email) {
		System.out.println("mail test called");
		   boolean result = true;
		   try {
		      InternetAddress emailAddr = new InternetAddress(email);
		      emailAddr.validate();
		   } catch (AddressException ex) {
		      result = false;
		   }
		   System.out.println(result);
		   return result;
		  
		}
	
	
	
	}
	


