package com.saketh.java;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saketh.java.dao.MyWorkDao;
import com.saketh.java.dao.MyWorkDaoNew;

/**
 * Servlet implementation class NewWorkController
 */
@WebServlet("/NWC")
public class NewWorkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewWorkController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("here dude");
		HttpSession session = request.getSession();
		String s1=""+session.getAttribute("username1");
		//System.out.println(s1+"okay");
		
		MyWorkDaoNew dao=new MyWorkDaoNew();
		String res="";
		try {
			
			String mail=dao.get_mail(s1);
			MyWorkDao d=new MyWorkDao();
			
			String fr=d.get(mail);
			System.out.println("frfrfrfrf"+"\n"+fr+"\n");
			request.setAttribute("fr", fr);
			RequestDispatcher rd = request.getRequestDispatcher("Welcome_user.jsp");  
			
			  
			rd.forward(request, response);
			//res=mail;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
		
		//request.setAttribute("fres", res);
		System.out.println("fres inside ..");
		//request.setAttribute("uname2", s1);
		
	//	RequestDispatcher rd=request.getRequestDispatcher("StatusMediator.jsp");  
		//servlet2 is the url-pattern of the second servlet  
		  
		//rd.forward(request, response);
		
		//response.sendRedirect("Welcome_user.jsp");
	
		
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
