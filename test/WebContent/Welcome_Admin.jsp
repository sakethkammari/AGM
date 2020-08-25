<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="style.css">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<!-- <meta name="viewport" content="width=device-width, initial-scale=1"> -->
<!-- <!-- CSS only -->
-->
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous"> -->

<!--   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"> -->



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

/* div .filediv */
/* { */
/* 	display: flex; */
/* 	width: 150%; */
/* 	flex-direction: column; */
/* 	align-items:center; */
/* 	background-color: coral; */

/* } */

/* textarea */
/* { */
/* 	margin-top: 5px; */
/* 	width:90%; */
/* } */
</style>



<script id="helper" data-name='${fmailf}'>



	// $(document).ready(function() {

		window.onload = function()
		{
	//window.alert('alert');
    
   // var fres='${Atask}';
   var fmail = document.getElementById("helper").getAttribute("data-name");
   window.alert(fmail+"famailll");
    var test=fmail.split(/\r?\n/);
    
	var i;
	for( i=0;i<test.length-1;i++)
		{
		var test1=test[i].split(" ");
    
    //var temp=test[]
	var addcontrols="<tr>"
    	addcontrols+="<td>   "+test1[0]+"  </td>"
    	addcontrols+="<td>   "+test1[1]+"   </td>"
    	addcontrols+="<td>   "+test1[2]+" </td>"
//     		addcontrols+="<td>   '"+test3+"'   </td>"
    			addcontrols+="</tr>";
    			$(".tr1 table tbody").append(addcontrols);
    
		}
	
	
	
};



</script>

<script type="text/javascript">

    window.addEventListener("load", function () {
    	
    	
        const loader = document.querySelector(".loader");
        loader.className += " hidden"; 
    		
    		
    	});
    
</script>










</head>
<body>


<div class="loader">
	 <img src="https://miro.medium.com/max/978/0*cWpsf9D3g346Va20.gif" alt="Loading..." />
</div>

	<% 

//if(session.getAttribute("username")==null)
	//	{
//			out.println("dont ever try this dude");
			
		//	response.sendRedirect("index.jsp");
		//}

%>
	<div class="center">
		<h2>Welcome Admin</h2>
	</div>

	<div class="row">
		<div class="column" style="background-color: #aaa;">
			<form action="UserStory.jsp">
				<button type="submit" class="btn btn-primary">create story</button>
			</form>
		</div>
		<div class="column" style="background-color: #bbb;">
			<form action="HistoryController" method="post">
				<button type="submit" class="btn btn-primary">Backlog</button>
			</form>
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

				</tr>
			</thead>
			<tbody>
				<!--     <tr> -->
				<!--       <th scope="row">1</th> -->
				<!--       <td>Mark</td> -->
				<!--       <td>Otto</td> -->
				<!--       <td>@mdo</td> -->
				<!--     </tr> -->
				<!--     <tr> -->
				<!--       <th scope="row">2</th> -->
				<!--       <td>Jacob</td> -->
				<!--       <td>Thornton</td> -->
				<!--       <td>@fat</td> -->
				<!--     </tr> -->
				<!--     <tr> -->
				<!--       <th scope="row">3</th> -->
				<!--       <td colspan="2">Larry the Bird</td> -->
				<!--       <td>@twitter</td> -->
				<!--     </tr> -->
			</tbody>
		</table>
	</div>



	<div class="btn-group" role="group"
		aria-label="Button group with nested dropdown">
		<!--   <button type="button" class="btn btn-secondary">1</button> -->
		<!--   <button type="button" class="btn btn-secondary">2</button> -->

		<div class="btn-group" role="group">
			<button id="btnGroupDrop1" type="button"
				class="btn btn-secondary dropdown-toggle" data-toggle="dropdown"
				aria-haspopup="true" aria-expanded="false">MEETING NOTE</button>
			<div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
				<a class="dropdown-item" href="NewNote">New Note</a><br />
				<!--       <a class="dropdown-item" href="ExistingNote">Add an Existing Note </a> -->

				<!-- 	<div id="contain"> -->
				<div>
					<!-- 		 <input type="text" name='+value+'[]> -->
					<h5>Add an Existing Note</h5>
				</div>


				<div class="filediv">
					<input type="file" id="F">

					<form action="filedataController" method="post">

						<textarea id="filedata" name="filedata" rows="20" cols="100">
    </textarea>	


						<button type="submit" class="btn btn-primary" id="but1">submit</button>
					</form>
				</div>
				<script src="script.js"></script>




			</div>
		</div>

	</div>





	<!-- 	<div> -->
	<!--  		<input type="file"> -->
	<!--  		<textarea cols="30" rows="10"></textarea> -->
	<!--  	</div> -->

	<!--  	<script src="script2.js"></script> -->











</body>
</html>
