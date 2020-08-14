package com.saketh.java;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saketh.java.dao.MyWorkDaoNew;
import com.saketh.java.dao.UserStoryDao;

/**
 * Servlet implementation class getUserStoryController
 */
@WebServlet("/UserStoryController")
public class getUserStoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getUserStoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s=request.getParameter("usr")+"";
		System.out.println(s);
		//System.out.println("congo lot more to go");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name_story=request.getParameter("usr");
		String backlog=request.getParameter("backlog");
		String release=request.getParameter("release");
		String epic=request.getParameter("epic");
		String feature=request.getParameter("feature");
//		String category=request.getParameter("category");
		String story=request.getParameter("story");
		String acceptance=request.getParameter("acceptance");
		String points=(request.getParameter("storypoint"));
//		String resource=request.getParameter("resource");
		String assign_to=request.getParameter("assign");
		String status="New";
		//System.out.println(s);
		
		
		
		
		
		UserStoryDao dao=new UserStoryDao();
		
		try {
//			if(dao.check(name_story,backlog,release,epic,feature,story,acceptance,points,assign_to,status))
//			if(dao.check(name_story))
//			{
//				
//				response.sendRedirect("index.jsp");
//			}
//			else
//			{
			String res=backlog+"\n"+release+"\n"+epic+"\n"+"Feature : "+feature+"\n"+"Story : "+story+"\n"+"Acceptance : "+acceptance+" ";
			
				dao.add(name_story,backlog,release,epic,feature,story,acceptance,points,assign_to,status);
				HttpSession session = request.getSession();
//				
			String Admin_name = (String) session.getAttribute("adminname");
			System.out.println(Admin_name+"admin name new");
//				session.setAttribute("name_story", name_story);
//				session.setAttribute("status", status);
//				session.setAttribute("assign_to", assign_to);
//				session.setAttribute("storypoints", points);
//				
			
			MyWorkDaoNew m1=new MyWorkDaoNew();
			
			String mail= ""+m1.get_mail(Admin_name);
				System.out.println(mail+"gmail of admin");
			
				String fmail=""+m1.get(mail);
				System.out.println("abc"+fmail+"final test");
		
//				request.setAttribute("fmailf", fmail);
//				//email
//				request.setAttribute("sres", res);
//				request.setAttribute("sname", name_story);
//				request.setAttribute("assign2", assign_to);
				// HttpSession session = request.getSession();
			     // session.setAttribute("assign2",assign_to);
			      session.setAttribute("fmailf", fmail);
					//email
					session.setAttribute("sres", res);
				session.setAttribute("sname", name_story);
				session.setAttribute("assign2", assign_to);
					// HttpSession session = request.getSession();
				
				RequestDispatcher rd=request.getRequestDispatcher("smail");  
			  			  
			rd.forward(request, response);
			
				//session.setAttribute("adminname",Admin_name );
				//System.out.println(name+"done");
				 // request.getRequestDispatcher("MyWork").forward(request, response);
				
				//session.setAttribute("", );
				 //response.sendRedirect("MyWork");
				
				// major change
				//response.sendRedirect("Welcome_Admin.jsp");
				// Main step response.sendRedirect("Welcome_Admin.jsp");
							//}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
		
		
	}

}
