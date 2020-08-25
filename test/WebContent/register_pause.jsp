<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="refresh" content="2;url=register.jsp"> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<style>
body {
/*    background-image: url('https://i.pinimg.com/474x/22/a7/d9/22a7d900e789f94176d15ac206ffcbe6.jpg');  */
background-color:skyblue;
}
</style>

</head>
<body>

<% 

response.setHeader("Cache-Control","no-cache ,no-store,must-revalidate");
response.setHeader("pragma","no-cache");
response.setHeader("Expires","0");

%>

<% 
		String name=(String)request.getAttribute("nameerror");
		System.out.println(name+"00");
%>

${nameerror} 
<h2>please enter your credentials </h2>
<form action="getRegistration" method="post">
 enter Name: <input type="text" name="v1" ></br>
 enter password :<input type="text" name="v2"></br>
  enter E-Mail :  <input type="text" name="v3"></br>
  
  <span style="color:red;">${nameerror}</span>
   <span style="color:red;">${passerror}</span>
      <span style="color:red;">${mailerror}</span>
 <input type="submit">

</form>

</body>
</html>