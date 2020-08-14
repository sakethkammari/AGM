<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.saketh.java.dao.BeanTest"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
.center1 {
  text-align: center;
  border: 5px solid green;
}

</style>
</head>
<body>

<div class="center1">
           <h1>HISTORY</h1>
		</div>

<div class="row tr1">
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

<%-- <script id="helper" data-name='${fres}' ></script> --%>

 	<script id="helper" data-name='${fres}'>
 	
		window.onload = function(){
			
<%-- 			f('<%= BeanTest.getFres() %>'); --%>
			//<c:import var="staticData" url="/com.saketh.java.dao"/>
		
			//BeanTest bt=new BeanTest();
			
			var name = document.getElementById("helper").getAttribute("data-name");
			//window.alert('name::'+name+"8") //working !!
			//var fresf=bt.getFres();
			//window.alert(fresf+"kjkj")
			
			var strarray=name.split(/\r?\n/);
			
			//var x1=strarray[0].split(" ");
			
			//window.alert(strarray[0]);
// 			for(var i:strarray)
// 				{
// 					console.log(i+"---");
// 				}
			
			var i;
			for( i=0;i<strarray.length-1;i++)
				{
				var temp=strarray[i].split(" ");
				
				//console.log(temp[0]+'::temo[0]')
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