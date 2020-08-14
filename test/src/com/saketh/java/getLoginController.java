package com.saketh.java;
// 8 02 97 %
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saketh.java.dao.LoginDao;

/**
 * Servlet implementation class getLoginController
 */
@WebServlet("/getLogin")
public class getLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	//System.out.println("polam mei seeeds came");
	PrintWriter out=response.getWriter();
	out.println("yoyoyoyoyo");
	
	
	String uname=request.getParameter("t1")+"";
	String upass=request.getParameter("t2")+"";
	//String uemail=request.getParameter("t3")+"";
	HttpSession session = request.getSession();
	LoginDao dao=new LoginDao();
	//  02
try {
	if(dao.check(uname, upass,1))
	{
		System.out.println("inside 1 congo");

	//	session.setAttribute("adminname",  );
		session.setAttribute("adminname", uname );
	//	response.sendRedirect("Welcome_Admin.jsp");
		RequestDispatcher rd=request.getRequestDispatcher("UserStoryController");  
		  
		  
		rd.forward(request, response);
	
		
		//response.sendRedirect("Welcome_Admin.jsp");
		
		//response.sendRedirect("UserStory.jsp");
		
	}
      else if(dao.check(uname, upass))
	  {
	 System.out.println("inside 2");	
		
		session.setAttribute("username1", uname);

		//response.sendRedirect("UserStory.jsp");
		
		
		//response.sendRedirect("jQueryDemo.html");
		
		
//		response.sendRedirect("Welcome_user.jsp");
		
		System.out.println("aaaaaaabbbbbb");
		//request.getRequestDispatcher("Welcome_user.jsp").forward(request,response);
		System.out.println("aaaaaaabbbbbbaaaaaaaaaa");
		RequestDispatcher rd=request.getRequestDispatcher("NWC");  
		
		  
		rd.forward(request, response);
		//String omg=(String) session.getAttribute("test");
		
		//System.out.println(omg+"ahhhhhhhhhhhhhhh");
	//	response.sendRedirect("MyWork");
		
		
		
	}
	else
	{
		request.setAttribute("error", "INVALID CREDENTIALS : ");
		System.out.println(" inside else if bro");
		out.print("invalid credentials plz login with valid ");
		//response.sendRedirect("index.jsp");
		  request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
} catch (Exception e) {
	System.out.println(e);
}
	
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		//doGet(request, response);
//	}

}
