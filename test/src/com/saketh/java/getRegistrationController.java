package com.saketh.java;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saketh.java.dao.RegistrationDao;

/**
 * Servlet implementation class getRegistrationController
 */
@WebServlet("/getRegistration")
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
		
		String uname1=request.getParameter("v1")+"";
		String upass1=request.getParameter("v2")+"";
		String umail1=request.getParameter("v3")+"";
		//HttpSession session = request.getSession();
		//HttpSession session = request.getSession();
		RegistrationDao dao=new RegistrationDao();
		try {
			if(dao.check(uname1, upass1, umail1))
			//if(uname1=="exam")
			{
				//request.setAttribute("existing-user", "you area an exixting user , please login to continue");
				response.sendRedirect("index.jsp");
			}
			else
			{
				//request.setAttribute("mail", umail1);
				request.setAttribute("mail", umail1);
				//getServletContext().getRequestDispatcher("/HistoryController").forward(request,response);
				getServletContext().setAttribute("mail", umail1);
				dao.add(uname1, upass1, umail1);
				response.sendRedirect("index.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
