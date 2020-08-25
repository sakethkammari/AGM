package com.saketh.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class UserStoryFilter
 */
@WebFilter("/UserStoryController")
public class UserStoryFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UserStoryFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		
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
		
		//System.out.println(epic+"okay epic done");
		if(name_story=="")
		{
			req.setAttribute("nameerror1", "Story name can't be null");
			req.getRequestDispatcher("UserStory.jsp").forward(request, response);
		}
		else if(backlog == "")
		{
			req.setAttribute("backerror1", "backlog  can't be null");
			req.getRequestDispatcher("UserStory.jsp").forward(request, response);
		}	
		else if(release == "")
		{
			req.setAttribute("releaseerror1", "release  can't be null");
			req.getRequestDispatcher("UserStory.jsp").forward(request, response);
		}
		else if(epic == "")
		{
			req.setAttribute("epicerror1", "epic  can't be null");
			req.getRequestDispatcher("UserStory.jsp").forward(request, response);
		}	
		else if( feature== "")
		{
			req.setAttribute("featureerror1", "feature  can't be null");
			req.getRequestDispatcher("UserStory.jsp").forward(request, response);
		}
		else if(story == "")
		{
			req.setAttribute("storyerror1", "story name can't be null");
			req.getRequestDispatcher("UserStory.jsp").forward(request, response);
		}	
		else if(acceptance == "")
		{
			req.setAttribute("acceptanceerror1", "acceptance  can't be null");
			req.getRequestDispatcher("UserStory.jsp").forward(request, response);
		}
		else if(points == "")
		{
			req.setAttribute("pointserror1", "points  can't be null or 0(zero)");
			req.getRequestDispatcher("UserStory.jsp").forward(request, response);
		}	
		else if(assign_to == "")
		{
			req.setAttribute("assign_toerror1", "assign_to name can't be null");
			req.getRequestDispatcher("UserStory.jsp").forward(request, response);
		}
		else
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
