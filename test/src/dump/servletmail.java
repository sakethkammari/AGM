package dump;

import java.io.IOException;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servletmail
 */
@WebServlet("/smail")
public class servletmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletmail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		  String result;
		  HttpSession s = request.getSession();
		    // Get recipient's email-ID, message & subject-line from index.html page

		   // final String to =  request.getParameter("fmailf");
		    //System.out.println("mail 545"+to);
		  //  final String to = "sakethkammari629@gmail.com";
		   final String to = ""+s.getAttribute("assign2");
		  	System.out.println(to+"ooo7oooooooo");
		  //  final String subject = request.getParameter("sub");
		    //  final String subject="Story 444444444 Details";
		  final String subject=""+s.getAttribute("sname");
		  
		  final String messg = ""+s.getAttribute("sres");
		    //final String messg =  "ftestttt";
		 

		    // Sender's email ID and password needs to be mentioned

		    final String from = "sakethvamshi630@gmail.com";

		    final String pass = "Saketh@630";

		 

		    // Defining the gmail host

		    String host = "smtp.gmail.com";
		   // String host = "localhost:8080";

		 

		    // Creating Properties object

		    Properties props = new Properties();

		 

		    // Defining properties

		 /*   props.put("mail.smtp.host", host);

		    props.put("mail.transport.protocol", "smtp");

		    props.put("mail.smtp.auth", "true");

		    props.put("mail.smtp.starttls.enable", "true");

		    props.put("mail.user", from);

		    props.put("mail.password", pass);

		    props.put("mail.port", "587");*/
		    props.put("mail.smtp.starttls.enable", "true");
		    props.put("mail.smtp.host", host);
		    props.put("mail.transport.protocol", "smtp");
		    props.put("mail.smtp.port", "587");
		    props.put("mail.smtp.auth", "true");
		    props.put("mail.user", from);

		    props.put("mail.password", pass);

		 //443

		    // Authorized the Session object.

		    Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {

		        @Override

		        protected PasswordAuthentication getPasswordAuthentication() {

		            return new PasswordAuthentication("sakethvamshi630@gmail.com","Saketh@630");

		        }

		    });
		    mailSession.setDebug(true);
		 

		    try {

		        // Create a default MimeMessage object.

		        MimeMessage message = new MimeMessage(mailSession);

		        // Set From: header field of the header.

		        message.setFrom(new InternetAddress(from));

		        // Set To: header field of the header.

		        
		        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); 


		        // Set Subject: header field

		        message.setSubject(subject);

		        // Now set the actual message

		        message.setText(messg);

		        // Send message

		        Transport.send(message);

		        result = "Your mail sent successfully....";

		    } catch (MessagingException mex) {

		        mex.printStackTrace();

		        result = "Error: unable to send mail....";

		    }
	
	
		  String ff=  ""+s.getAttribute("fmailf");
		    request.setAttribute("fmailf", ff);
		  RequestDispatcher rd=request.getRequestDispatcher("Welcome_Admin.jsp");  
			  
			rd.forward(request, response);
		    //response.sendRedirect("Welcome_Admin.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
