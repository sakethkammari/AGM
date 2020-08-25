package com.saketh.java;

import java.io.IOException;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saketh.java.dao.LoginDao;
import com.saketh.java.dao.RegistrationDao;

/**
 * Servlet implementation class getRegistrationController
 */
@WebServlet("/getRegistration1")
public class getRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getRegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("gott");
		
			
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public  static String getAlphaNumericString() 
    { 
			
     
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
 
        StringBuilder sb = new StringBuilder(32); 
  
        for (int i = 0; i < 32; i++) { 
  
       
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
          
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String uname1=request.getParameter("v11")+"";
		String upass1=request.getParameter("v21")+"";
		String umail1=request.getParameter("v31")+"";
		System.out.println(uname1+"okay");
		System.out.println(upass1);
		System.out.println(umail1);
		//HttpSession session = request.getSession();
		//HttpSession session = request.getSession();
		try {
		//String k = "Bar12345Bar12345";
		 //SecretKey key = new SecretKeySpec(k.getBytes(), "AES");
		//	String k=
			String k = getAlphaNumericString();
			
			LoginDao da=new LoginDao();
			if(da.set_key(uname1, k))
			{
				System.out.println("insertion done key");
			}
			else
			{
				System.out.println("insertion not done");
			}
			
			SecretKey key = new SecretKeySpec(k.getBytes(), "AES");
		RegistrationDao dao=new RegistrationDao(key);
		upass1=dao.encrypt(upass1);
		System.out.println(upass1+"upass1 final : ");
		
			if(dao.check(uname1, upass1, umail1))
				//if(uname1=="exam")
				{
					//request.setAttribute("existing-user", "you area an exixting user , please login to continue");
					request.setAttribute("exists", "You are an existing user , please Login to continue");
					response.sendRedirect("index.jsp");
				}
			
			else if( dao.isValidEmailAddress(umail1))
			{
				System.out.println("mail check done");
				request.setAttribute("mail", umail1);
				//getServletContext().getRequestDispatcher("/HistoryController").forward(request,response);
				getServletContext().setAttribute("mail", umail1);
				dao.add(uname1, upass1, umail1);
				response.sendRedirect("index.jsp");
				System.out.println("new test done");
			}
			else
			{
				System.out.println("mail check not working");
				response.sendRedirect("register.jsp");
			}
			
			
			
			//else
			{
				//request.setAttribute("mail", umail1);
				//request.setAttribute("mail", umail1);
				//getServletContext().getRequestDispatcher("/HistoryController").forward(request,response);
			//	getServletContext().setAttribute("mail", umail1);
				//dao.add(uname1, upass1, umail1);
				//response.sendRedirect("index.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
