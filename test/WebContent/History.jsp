<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- CSS only -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.center1 {
  text-align: center;
  border: 5px solid green;
}

</style>


<!-- <script> -->
<%-- // 	var f='${fres12}'; --%>
<!-- // 	window.alert('ff'+f); -->
<!-- </script> -->

<script>
// $(document).ready(function() {
  
//    var rr = "<c:out value='${fres12}'/>";
// 	alert(rr+"testing");
//   }
</script>


</head>
<body>

${param.fres}
param

<c:set var="fres" scope="session" value="${param.fres}"/> 


		<div class="center1">
           <h1>HISTORY</h1>
		</div>


<div class="row">
<table class="table table-striped table-dark">
  <thead>
    <tr>
  		
      <th scope="col">id</th>
      <th scope="col">story name</th>
      <th scope="col">feature</th>
      <th scope="col">acceptance</th>
      <th scope="col">storypoints </th>
      <th scope="col">asigned to</th>
       <th scope="col">status</th>
    </tr>
  </thead>
   

  <tbody>
  
<!--     <tr> -->
<!--       <th scope="row">1</th> -->
<!--       <td>Mark</td> -->
<!--       <td>Otto</td> -->
<!--       <td>@mdo</td> -->
<!--        <td>Mark</td> -->
<!--       <td>Otto</td> -->
<!--       <td>@mdo</td> -->
<!--     </tr> -->

    
  </tbody>
</table>
</div>



<!--   <script> -->
<!-- //   <script> -->
<!--    var foo = document.getElementById('foo'); -->
<!--     alert(foo+'doneee'); -->
<!--    foo.textContent = "bar"; -->
<!--   </script> -->
<!--   </script> -->
  
 	<script>
 	
		window.onload = function(){
	//
	
// 	  var foo = document.getElementById('foo');
//   alert(foo+'doneee');
//   foo.textContent = "bar";
	
	
	
	
	//var fresf='${fres}';
	//window.alert('WWWgggg'+fresf);
	//var fresf = "<c:out value='${fres12}'/>";
	//window.alert(fresf+"fresfff");
	//console.log(fresf);
	//console.log('oh bhai !!!!!!11');
	BeanTest bt=new BeanTest();
	var fresf=bt.getFres();
	var strarray=fresf.split("\n");
	<%
		String id="OK";
		out.print(id);
	%>
	console.log('');
	var i;
	for( i=0;i<strarray.length;i++)
		{
		var temp=strarray[i].split(" ");
		
		console.log(temp[0]+'::temo[0]')
		var addcontrols="<tr>"
	    	addcontrols+="<td>   '"+temp[0]+"'  </td>"
	    	addcontrols+="<td>   '"+temp[1]+"'   </td>"
	    	addcontrols+="<td>   '"+temp[2]+"' </td>"
	    	addcontrols+="<td>   '"+temp[3]+"'   </td>"
	    	addcontrols+="<td>   '"+temp[4]+"'   </td>"
	    	addcontrols+="<td>   '"+temp[5]+"' </td>"
	    	addcontrols+="<td>   '"+temp[6]+"'   </td>"
	    	
	    	addcontrols+="</tr>";
	    			$(".tr1 table tbody").append(addcontrols);
		
		}
	
	
	//window.alert(fres+'jersyyyyyyyyy');
};
 
</script>


</body>
</html>