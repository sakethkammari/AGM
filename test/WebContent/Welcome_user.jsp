<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.saketh.java.MyWorkController"%>
<%@page import="com.saketh.java.dao.isAdminDao"%>

<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>







<%-- //     			var uname1='${uname1}'; --%>
<!-- //     			if(isAdminDao.check(uname)) -->
<!-- //     			  window.location.href = "Welcome_Admin.jsp"; -->

<!-- // importClass(com.saketh.java.dao.yournamespace.isAdminDao); -->

<!-- // var ft = new yournamespace.isAdminDao(); -->

<!-- // if(isAdminDao.check(ft)) -->
<!-- // 	  window.location.href = "Welcome_Admin.jsp"; -->


<!-- // 	var addcontrols="<tr>" -->
<!-- //     	addcontrols+="<td>   ttt  </td>" -->
<!-- //     	addcontrols+="<td> rrrr  </td>" -->
<!-- //     	addcontrols+="<td> yyyyy </td>" -->
<!-- //     		addcontrols+="<td> koko  </td>" -->
<!-- //     			addcontrols+="</tr>"; -->
<!-- //     			$("table tbody").append(addcontrols); -->




<script>

//document.getElementById("filetextarea").addEventListener('click',function ()
// 	    {
// 	     alert("hello");
// 	     //validation code to see State field is mandatory.  
// 	    }  );

<%-- var test = <%=request.getAttribute("fielstext")%>; --%>

// console.log(test+"787878787");



</script>










<!-- //$(document).ready(function(){ -->
<!-- 	//$("#newrow").click(function() -->
<!-- // 		window.onload=function() -->
<!-- // 			{ -->

<!-- // 			  alert(" document isd  ready " ); -->
<!-- // 		         var addcontrols="<tr>" -->
<%-- // 		        	addcontrols+="<td>   ${id}  </td>" --%>
<%-- // 		        	addcontrols+="<td>  ${sname}  </td>" --%>
<%-- // 		        	addcontrols+="<td> ${status} </td>" --%>
<%-- // 		        		addcontrols+="<td>  ${assigned-by}  </td>" --%>
<!-- // 		        			addcontrols+="</tr>"; -->
<!-- // 		        		//	$("table tbody").append(addcontrols); -->
<!-- 			//} -->
<!-- //}); -->






<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<style>

.loader {
    position: fixed;
    z-index: 99;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: white;
    display: flex;
    justify-content: center;
    align-items: center;
}

.loader > img {
    width: 100px;
}

.loader.hidden {
    animation: fadeOut 1s;
    animation-fill-mode: forwards;
}

@keyframes fadeOut {
    100% {
        opacity: 0;
        visibility: hidden;
    }
}

.row .r1 {
	width: 300px;
	border: 15px solid green;
	padding: 50px;
	margin: 20px;
}

* {
	box-sizing: border-box;
}

/* Create three equal columns that floats next to each other */
.column {
	float: left;
	width: 33.33%;
	padding: 10px;
	height: 100px; /* Should be removed. Only for demonstration */
}

body {
	background-color: cyan;
	padding:10px;
}


 .row:after {
	content: "";
	display: table;
	clear: both;
}

.center {
	text-align: center;
	border: 3px solid green;
}
</style>
</head>
<body>

<div class="loader">
	 <img src="https://miro.medium.com/max/978/0*cWpsf9D3g346Va20.gif" alt="Loading..." />
</div>


<!-- <div id="loading"></div> -->
<!-- <form action="/StatusController"> -->
<!-- 						<input type="submit" name="myField" id="myField" value=" " /> -->
<!-- </form> -->




	<% 


// response.sendRedirect("Welcome_Admin.jsp");
%>



	<%
   String name = (String)request.getAttribute("status");
	System.out.println(name+"66");
%>






<%-- 	<%  --%>



<!-- // //if(session.getAttribute("username")==null) -->
<!-- // 	//	{ -->
<!-- // //			out.println("dont ever try this dude"); -->
			
<!-- // 		//	response.sendRedirect("index.jsp"); -->
<!-- // 		//} -->

<%-- %> --%>
	<div class="center">
		<h2>Agile Meeting Dashboard</h2>
	</div>

	<div class="row">

		<div class="column" style="background-color: #bbb;">

			<!--   <form action="StatusController" method="post">  -->
			<!--      	<button type="submit" class="btn btn-primary">Update Status</button> -->

			<select id="ddlFruits">
				<!-- 			    <option value=""></option> -->
				<option value="1">In Progress</option>
				<option value="2">Completed</option>

			</select> <input type="button" value="UPDATE:"
				onclick="GetSelectedTextValue()" />

           



			<script id="helper1" data-name1='${funame}'>
			//importClass(com.saketh.java.dao.yournamespace.StatusDao);
		 var funame = document.getElementById("helper1").getAttribute("data-name1");
			window.alert(funame);
			console.log(funame);
			    function GetSelectedTextValue() {
			        var ddlFruits = document.getElementById("ddlFruits");
			        var selectedText = ddlFruits.options[ddlFruits.selectedIndex].innerHTML;
			        var selectedValue = ddlFruits.value;
			        
			        
			      //  var sts=new com.saketh.java.dao.StatusDao();
			     //   var c=sts.update_sts(selectedText,funame);
			       // console.log(c);
			       	//	<input type="hidden" name="myField" id="myField" value='selectedText' />
			       
			       
			       
					//document.getElementById('myField').value =selectedText;
			       
// 			        var funame = document.getElementById("helper").getAttribute("data-name");
			    	//var rows = new yournamespace.StatusDao(selectedText,funame);
			    	
			        //window.alert(fuame+"88"+rows);
			        
			        // 			        <form action="">
// 			        <input type="hidden" name="myField" id="myField" value='selectedText' />
// 			        </form>
			        
			//         var uname2='${uname2}';
			<%--          var uname2 = <%=request.getAttribute("uname2")%>;  --%>
			//        alert(uname2+"gg");
			       
			     // window.alert("Selected Text: " + selectedText + " Value: " + selectedValue);
			    }
// 			    var un='${uname2}';  
// 			  //  alert(un+"uname");
// 			    console.log(un+"logggg");
			</script>




			      
		</div>
		<div class="column" style="background-color: #ccc;">
			<form action="LogoutCon" method="post">
				<button type="submit" class="btn btn-primary">Logout</button>
			</form>
		</div>
	</div>
	<div class="row r1"></div>

	<div class="row tr1">

		<table class="table table-bordered table-dark">
			<thead>
				<tr>
					<th scope="col">s.no</th>
					<th scope="col">story name</th>
					<th scope="col">status</th>
					<th scope="col">assigned by</th>
				</tr>
			</thead>
			<tbody>

			</tbody>

		</table>
	</div>

	<div>
		<form action="UserMeetingController">
			<div class="row">
				<div class="column">
					<button type="submit" class="btn btn-primary">View Meeting
						Notes (if any)</button>
				</div>
				<div class="column">
					<!-- 			<textarea  name="filetextarea" rows="10" cols="50"></textarea> -->
				</div>
			</div>
		</form>

	</div>
	
	

	<!-- <script> -->


	<!-- //     function input(){ -->
	<%-- //     	<c:set var="filedata1" scope="session" value="${filedata}"/> --%>
	<%-- //     	    var test = '${filedata1}'; --%>
	<!-- //        // var text = "here the text that you want to input."; -->
	<!-- //         document.forms.form1.area.value = text; -->
	<!-- //     } -->

	<!-- </script> -->
	<textarea name="filetextarea" id="fdata" rows="10" cols="50"></textarea>
	<script id="helper01" data-name01='${res}'>
	 var fr1 = document.getElementById("helper01").getAttribute("data-name01");
	 console.log("sss"+fr1+" okay finally");
	 window.alert(fr1+"fr11");
			document.getElementById('fdata').append(fr1);
	</script>

<script id="helper" data-name='${fr}'>


window.onload = function()
{

// $(document).ready(function() {
    // document is loaded and DOM is ready
    //alert("document is ready");
//         <c:set var="filedata1" scope="session" value="${filedata}"/>
//      	    var fdata = '${filedata}';
//     window.alert(fdata+"hj");
//     var x = document.getElementById('filetextarea'); 
//     x.value = fdata+""; 
     	  //  $('#filetextarea').text(fdata+""); 
    
    
//      <c:set var="id1" scope="session" value="${id}"/>
//      <c:set var="sname1" scope="session" value="${sname}"/>
//     <c:set var="status1" scope="session" value="${status}"/>
//     <c:set var="assignedby1" scope="session" value="${assigned-by}"/>
//      var test = '${id1}';
//      var test1 = '${sname1}';
//      var test2 = '${status1}';
//      var test3 ='${assignedby}';
    
//     var fres='${fres}';
//     var test=fres.split(" ");


 var fr = document.getElementById("helper").getAttribute("data-name");
 console.log(fr);  
 //window.alert(fr+"frrrrrr66666");
    var test=fr.split(/\r?\n/);
    
	var i;
	for( i=0;i<test.length-1;i++)
		{
		var test1=test[i].split(" ");


	var addcontrols="<tr>"
    	addcontrols+="<td>   "+test1[0]+"  </td>"
    	addcontrols+="<td>   "+test1[1]+"   </td>"
    	addcontrols+="<td>   "+test1[2]+" </td>"
    	addcontrols+="<td>  sakethkammari629@gmail.com </td>"
//     		addcontrols+="<td>   '"+test3+"'   </td>"
    			addcontrols+="</tr>";
    			$(".tr1 table tbody").append(addcontrols);
		}
    	
	//var preloader = document.getElementById("loading");
	//preloader.style.display = 'none';
};




</script>



<!-- <script> -->
<!-- // 		var preloader = document.getElementById("loading"); -->
<!-- // 		function mypreloader(){ -->
<!-- // 			preloader.style.display = 'none'; -->
<!-- // 		}; -->
<!-- <!-- </script> --> -->

 
    <script type="text/javascript">
    window.addEventListener("load", function () {
        const loader = document.querySelector(".loader");
        loader.className += " hidden"; 
    });
	</script>



<script>
var test="body"; 

function showNotification()
{
	const notification=new Notification("message from saketh",{
		body: test,
		icon: "https://media.glassdoor.com/sqll/937465/vsoft-technologies-squarelogo-1436855384554.png"
		
		
	});
	
	notification.onclick= (e) => {
	window.location.href="https://google.com";
	};
}

console.log(Notification.permission);

if(Notification.permission === "granted")
	{
		//window.alert("congo");
		showNotification();
	}
else if(Notification.permission != "denied")
	{
 Notification.requestPermission().then(permission => {
		if(Notification.permission === "granted")
			showNotification();
		//console.log(permission);
	});	
	}
</script>




</body>
</html>
