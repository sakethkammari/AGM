<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

  pageEncoding="ISO-8859-1"%>

<%@ page import="javax.servlet.RequestDispatcher" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

jkjkjkjkj
${fres}
jkjjkjkjk
<%
System.out.println("okay fres");
%>
<c:set var="foo" value="bar"/>

<!--    response.sendRedirect("Welcom_Admin.jsp"); -->

<%--   ${fres} --%>
<!--   alert('ss'); -->
  
   
<%--   <%  --%>
<!-- // 	RequestDispatcher rd=request.getRequestDispatcher("History.jsp");   -->
		 
		  
<!-- // 		rd.forward(request, response); -->
<%-- 	%> --%>
		
  <jsp:forward page="History.jsp" >
 
    <jsp:param name="fres" value="${fres}"/>
 
 </jsp:forward>

<%
	System.out.println("2 okay");
%>
</body>
</html>