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
 * Servlet Filter implementation class getRegistrationFilter
 */
@WebFilter("/getRegistration")
public class getRegistrationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public getRegistrationFilter() {
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
		
		String name=(String)req.getParameter("v1");
		System.out.println(name);
		try
		{
		if(name.length()>3)
		{
			chain.doFilter(request, response);
		}
		else if(name.length()<3 || name.length()>15 || name=="")
		{
			System.out.println("inside else if");
			req.setAttribute("nameerror", "please re-enter name properly ( length >3 and <15)");
			System.out.println("inavalid name format");
//			res.sendRedirect("register.jsp");
			  req.getRequestDispatcher("register.jsp").forward(request, response);
			
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
