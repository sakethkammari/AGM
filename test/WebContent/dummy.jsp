
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<jsp:forward page="unknown.jsp" >
 
    <jsp:param name="username" value="Tom"/>
 
</jsp:forward>



<!-- <script>  -->

<!-- // $(document).ready(function() { -->

<%-- <%-- var test = eval('<%=request.getAttribute("name")%>'); --%> --%>
<!-- // alert("your total is :"+ test +"rs"); -->
<!-- // }); -->
<!-- </script> -->


</head>
<body>


<!-- <form action="grave"> -->
<!-- <input type="submit" value="submit"> -->
<!-- </form> -->
<%-- ${name }89 --%>



<!-- <script type="text/javascript">  -->
<!-- // //window.alert('dddd'); -->
<!-- // // $(document).ready(function() { -->
<!-- // //var total = 30 ; -->

<!-- // <p id="demo">76656565</p> -->

<%-- <%-- var test = <%=request.getAttribute("text")%>; --%> 
<%-- <%-- var test = eval('<%=request.getAttribute("text")%>'); --%>
<%-- var test =<%=request.getAttribute("text") %>; --%>
<!-- // var x=9; -->
<!-- // document.getElementById("demo").innerHTML = -->
<!-- // 	"The value of z is: " + x; -->
<!-- </script> -->


<!-- // console.log(test+"323232"); -->
<!-- // alert("your total is :"+ test +"rs"); -->

<!-- //});  -->





<% 
 String name1=(String)request.getAttribute("name");
 System.out.println(name1+"8765599");
// working
%>



<!-- <script> -->

<%-- var test = <%=request.getAttribute("text")%>; --%>
<!-- // window.alert(test); -->
<!-- // // console.log(test+"787878787"); -->
<!--  // document.write(test+"4545454"); -->

<!-- </script> -->




<!--  <p id="demo">98988989</p> -->
<!-- <script type="text/javascript"> -->
<!-- // window.onload = function(){ -->
<!-- // window.alert(5 + 6); -->

<%-- var test = <%=session.getAttribute("text")%>; --%>
  
<!-- //   document.getElementById("demo").innerHTML =	"The value of z is: " + test; -->

<!-- // }; -->
<!--  </script> -->
 
 <%!
 		String g1g="ghghgh787878";
 %>
  
<%-- <jsp:forward page="login.jsp" /> --%>
 
<%--     <jsp:param name="username" value="Tom"/> --%>
 
<%-- </jsp:forward> --%>
 
<%--  <c:out value="${'Welcome to javaTpoint'}"/>   --%>
 <c:out value="${'param test'}"/><br/> 
  <c:set var="p1" scope="session" value="${param.text}"/>  
<%--  <c:out value="${param.text}"/> --%>
 <c:out value="${'param testttt'}"/>
<%--   <c:out value="${name}"/>  --%>
  <c:out value="${p1}"/> 
  
<%--   <c:set var="Income1" scope="session" value="${9090}"/>   --%>
 <c:set var="Income" scope="session" value="${g1g}"/>  
<c:out value="${Income}"/>  
   
<!--  <script type="text/javascript"> -->
<%--     var test = <%=request.getAttribute("try")%>; --%>
<!-- //     window.alert(test); -->
<!-- </script> -->

<script type="text/javascript">
window.onload = function(){
	//window.alert('WWWgggg');
	var test2='${p1}';
	window.alert(test2+'gggg');
};


</script>


</body>
</html>







