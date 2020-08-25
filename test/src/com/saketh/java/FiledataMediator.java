package com.saketh.java;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saketh.java.dao.Meeting_Dao;

/**
 * Servlet implementation class FiledataMediator
 */
@WebServlet("/FDM")
public class FiledataMediator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FiledataMediator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession(); 
		String s=""+session.getAttribute("fdata0");
		System.out.println(s+"okayaaaaaaaaaaaaaaaaaaaaaaaaaa gg444444444444444");
		session.setAttribute("dtest", s);
		
		Meeting_Dao daoo=new Meeting_Dao();
		LocalDate l1=LocalDate.now();
		String s1=""+l1;
		try {
			if(daoo.add(s,s1))
			{
				 System.out.println("done dude note");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("Welcome_Admin.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
