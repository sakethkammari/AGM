package com.saketh.filter;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
 * Servlet Filter implementation class RegistrationPasswordFilter
 */
@WebFilter("/getRegistration1")
public class RegistrationPasswordFilter implements Filter {

    /**
     * Default constructor. 
     */
    public RegistrationPasswordFilter() {
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
		//chain.doFilter(request, response);
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		
		
		String password=(String)req.getParameter("v21");
		if(password=="")
		{
		  req.setAttribute("passerror", "Password cant be Null");	
		  req.getRequestDispatcher("register.jsp").forward(request, response);
		}
		else
		{
		//System.out.println(name);
		try
		{
			 String regex = "^(?=.*[0-9])"
                     + "(?=.*[a-z])(?=.*[A-Z])"
                     + "(?=.*[@#$%^&+=])"
                     + "(?=\\S+$).{8,20}$"; 
			 Pattern p = Pattern.compile(regex); 
			 Matcher m = p.matcher(password);
			 
			 if(m.matches())
			 {
				 chain.doFilter(request, response);
			 }
			
		else 
		{
			//System.out.println("inside else if");
			req.setAttribute("passerror", "Your Password is Weak ,  please enter as Eg: Abcd@123  ");
			
			//System.out.println("inavalid name format");
//			res.sendRedirect("register.jsp");
			  req.getRequestDispatcher("register.jsp").forward(request, response);
			
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}












