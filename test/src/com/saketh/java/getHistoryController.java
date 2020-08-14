package com.saketh.java;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saketh.java.dao.BeanTest;
import com.saketh.java.dao.HistoryDao;

/**
 * Servlet implementation class getHistoryController
 */
@WebServlet("/HistoryController")
public class getHistoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public getHistoryController() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		
		//HttpSession session = request.getSession();
	//String s =	(String)request.getAttribute("mail");
	//System.out.println(s+"uiuiuiui232323232aaa");
	
		HistoryDao dao=new HistoryDao();
		//String nothing="";
		try {
			String fres=dao.check();
			
			//<script id="helper" data-name="helper" src="helper.js"></script>
			
			System.out.println(fres+"8989");
			request.setAttribute("fres", fres);
			
			
			
			BeanTest bt=new BeanTest();
			bt.setFres(fres);
			
		//	System.out.print("fromt "+bt.getFres()+"7878878898");
			
			//request.getSession().setAttribute("fres", fres);
		//	RequestDispatcher rd=request.getRequestDispatcher("HistoryMediator.jsp");  
			try
			{
			RequestDispatcher rd=request.getRequestDispatcher("dummy5.jsp");  	  
			  
			rd.forward(request, response);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
		}catch (Exception e1) {
		
			System.out.println(e1);
		}
	// last send redirect to login 
	}

}
