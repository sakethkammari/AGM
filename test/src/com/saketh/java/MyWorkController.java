package com.saketh.java;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saketh.java.dao.MyWorkDao;

/**
 * Servlet implementation class MyWorkController
 */
@WebServlet("/MyWork")
public class MyWorkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyWorkController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("chill dude lot more to do 00000000000000");
		
		MyWorkDao dao=new MyWorkDao();
		HttpSession session = request.getSession();
		String story_name= (String) (session).getAttribute("name_story");
		String status= (String) (session).getAttribute("status");
		String admin_name= (String) (session).getAttribute("adminname");
		String assign_to= (String) (session).getAttribute("assign_to");
		String points=  (String) (session).getAttribute("storypoints") ;
		String uname1=  (String) (session).getAttribute("username") ;
		try {
			if(dao.check(assign_to,points))
			{
				String final_str=dao.get(assign_to);
				
				
				String[] str=new String[7];
				str[3]=admin_name;
				request.setAttribute("assigned-by", str[3]);
				System.out.println(str[3]+"admin name : ");	
				System.out.println(str.length+"ohhh");
				
				
				 str=final_str.trim().split("\\s+");
				 
				 for(String g:str)
				 {
					 System.out.print(g+"kkk");
				 }
				System.out.println(str.length+"length"); 
				
				
				request.setAttribute("id", str[0]);
				request.setAttribute("sname", str[1]);
				request.setAttribute("status", str[2]);
				request.setAttribute("uname1", uname1);

				request.getRequestDispatcher("Welcome_user.jsp").forward(request, response);
				//req.getRequestDispatcher("welcome.jsp").forward(req, resp); 
			
				
				
				System.out.println(final_str);
				
			}
			
			else{
				response.sendRedirect("UserStory.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(s+"sssssssss"+s1);
		
	
//	    response.sendRedirect("Welcome_Admin.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
//		System.out.println(" 000");
//		
//		String s=request.getParameter("usr");
//		System.out.println(s+"sssssssss");
		//MyWorkDao dao=new MyWorkDao();
		
       //  HttpSession session = request.getSession();
		
		//session.setAttribute("test", "yohoooaaaaaaao");
		//request.getRequestDispatcher("getLogin").forward(request,response);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
