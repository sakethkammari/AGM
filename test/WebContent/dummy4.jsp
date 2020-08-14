
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

d4

 
<%--   <c:out value="${param.fres12}"/> --%>
<%--   ${p1}  --%>

<input type="hidden" id="xID" name="x" value="${p1}">



<script type="text/javascript">
<c:set var="p1" scope="session" value="${param.fres12}"/>  
var r='${p1}';
window.alert(r+'988');
<cut value= "${fres}"/>
	<cut value= "${requestScope.fres}"/>
	<cut value= "${requestScope.request.fres}"/>
	${fres} 

</script>

<body>


<script type="text/javascript">


//var myAtt = document.getElementById("xID").value;

// +myAtt);
<%-- var r="<%= request.getAttribute("p1") %>"; --%>
//var x='${p1}';

</script>


<!-- <script type="text/javascript"> -->
<!-- // window.onload = function(){ -->
<!-- // 	alert("Hello! I am an alert box!!");	 -->
<!-- // 	window.alert('WWWgggg'); -->
<%-- // 	//var test2='${p1}'; --%>
<%-- <%-- 	//var name = "<%= request.getAttribute("p1") %>"; --%> 
<!-- // 	//window.alert(test2+'gggg'); -->
<!-- // }; -->


<!-- </script> -->




<script>

// 	var f='${p1}';
// window.alert(f+"hooo");


	//var test='${fres12}';
	//window.alert(test+"woeking");
// 	var jk='${fres12}';
// 	 //var jk = "<c:out value='${fres12}'/>";
// 	 window.alert('jhj'+jk);
	 
</script>



</body>
</html>