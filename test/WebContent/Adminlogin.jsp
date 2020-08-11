<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head> 
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->

<!-- CSS only -->


 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<style type="text/css">


.mytable
{
display:table;
}
.mytable .mytable-tr
{
display:table-row;

}

.mytable .mytable-tr .mytable-td
{
display:table-cell;
padding:20px;
border-bottom;
}

.a .b .c .title .te1
{
	border: 1px solid yellow;
	 border-collapse: collapse;
    width: 100%;
}
.c
{
	border: 1px solid yellow;
	 border-collapse: collapse;
    width: 100%;
}

.body
{
  margin: 10px;
}
 .my-container
 {
    border: 7px solid green;
    
   
    }
 .my-row
 {
   border: 3px solid red;
  justify-content: center; 
 }
 .inside-row
 {
/*   border: 3px solid cyan; */
   
 }
 .my-col
 {
  border: 3px solid blue;
  height: 250px;
  column-width: 100px;
 }
/* tr:nth-child(even) { */
/*   background-color: #dddddd; */
/* } */
/* table { */
/*   font-family: arial, sans-serif; */
/*   border-collapse: collapse; */
/*   width: 100%; */
/* } */
/* td, th { */
/*   border: 1px solid #dddddd; */
/*   text-align: left; */
/*   padding: 8px; */
/* } */

table.speaker-list {
  table-layout: fixed;
}

</style>	
<body>
<% 

response.setHeader("Cache-Control","no-cache ,no-store,must-revalidate");
response.setHeader("pragma","no-cache");
response.setHeader("Expires","0");

%>
<!-- inside home dude congo till now  -->
<%-- ${username } --%>

<div class="container-fluid my-container">
	<div class="row my-row">
	   row 1 col0
	   
	</div>
	<div class="row my-row">
		
		<div class="col-lg-1 my-col">
		
		    row 2 col1
<!-- 		    <button type="button" class="btn btn-primary">Primary</button> -->
		    <a class="btn btn-primary" href="UserStory.jsp" role="button">create</a></br>
		     <a class="btn btn-primary" href="history.jsp" role="button">history</a>
		      <a class="btn btn-primary" href="logout.jsp" role="button">logout</a>
		    
		</div>
		
		<div class="col-lg-11 my-col justify-content:center ">
		
		
		dd
		
		
		
<!-- 		<div class="row"> -->
<!-- 			<div class="col"> -->
<!-- 			            ooo <br/> -->
<!-- 			</div> -->
<!-- 			<div class="col-lg-4"> -->
<!-- 			ooo -->
<!-- 			</div> -->
<!-- 			<div class="col-lg-4"> -->
<!-- 			ooo -->
<!-- 			</div> -->
<!-- 			<div class="col-lg-4"> -->
<!-- 			ooo -->
<!-- 			</div> -->
		</div>
<!-- 		</div> -->
		</div>
<!-- 		    <div class="table-responsive">           -->
<!--   <table class="table"> -->
<!--     <thead> -->
<!--       <tr> -->
<!--         <th>#</th> -->
<!--         <th>Firstname</th> -->
<!--         <th>Lastname</th> -->
<!--         <th>Age</th> -->
<!--         <th>City</th> -->
<!--         <th>Country</th> -->
<!--       </tr> -->
<!--     <br/> -->
<!--     </thead> -->
    
<!--     <tbody> -->
<!--       <tr> -->
<!--         <td>1</td> -->
<!--         <td>Anna</td> -->
<!--         <td>Pitt</td> -->
<!--         <td>35</td> -->
<!--         <td>New York</td> -->
<!--         <td>USA</td> -->
<!--       </tr> -->
<!--       <br/> -->
<!--     </tbody> -->
<!--   </table> -->
<!--   </div> -->
		  
<!-- 		</div> -->
		      
		
		
		
		
		
		
		
		
<!-- 		<div class="table table-responsive"> -->
<!-- 		<table class="table"> -->
<!--   <thead> -->
<!--     <tr> -->
<!--       <th scope="col">#</th> -->
<!--       <th scope="col">First</th> -->
<!--       <th scope="col">Last</th> -->
<!--       <th scope="col">Handle</th> -->
<!--     </tr> -->
<!--   </thead> -->
<!--   <tbody> -->
<!--     <tr> -->
<!--       <th scope="row">1</th> -->
<!--       <td>Mark</td> -->
<!--       <td>Otto</td> -->
<!--       <td>@lgo</td> -->
<!--     </tr> -->
<!--     <tr> -->
<!--       <th scope="row">2</th> -->
<!--       <td>Jacob</td> -->
<!--       <td>Thornton</td> -->
<!--       <td>@fat</td> -->
<!--     </tr> -->
<!--     <tr> -->
<!--       <th scope="row">3</th> -->
<!--       <td>Larry</td> -->
<!--       <td>the Bird</td> -->
<!--       <td>@twitter</td> -->
<!--     </tr> -->
<!--   </tbody> -->
<!-- </table> -->
<!-- </div> -->
		
		
		
		
		
		
		
		
		
		
		
<!-- 		<table> -->
<!--   <tr> -->
<!--     <th>Company</th> -->
<!--     <th>Contact</th> -->
<!--     <th>Country</th> -->
<!--   </tr> -->
<!--   <tr> -->
<!--     <td>Alfreds Futterkiste</td> -->
<!--     <td>Maria Anders</td> -->
<!--     <td>Germany</td> -->
<!--   </tr> -->
<!--   <tr> -->
<!--     <td>Centro comercial Moctezuma</td> -->
<!--     <td>Francisco Chang</td> -->
<!--     <td>Mexico</td> -->
<!--   </tr> -->
<!--   <tr> -->
<!--     <td>Ernst Handel</td> -->
<!--     <td>Roland Mendel</td> -->
<!--     <td>Austria</td> -->
<!--   </tr> -->
<!--   <tr> -->
<!--     <td>Island Trading</td> -->
<!--     <td>Helen Bennett</td> -->
<!--     <td>UK</td> -->
<!--   </tr> -->
<!--   <tr> -->
<!--     <td>Laughing Bacchus Winecellars</td> -->
<!--     <td>Yoshi Tannamuri</td> -->
<!--     <td>Canada</td> -->
<!--   </tr> -->
<!--   <tr> -->
<!--     <td>Magazzini Alimentari Riuniti</td> -->
<!--     <td>Giovanni Rovelli</td> -->
<!--     <td>Italy</td> -->
<!--   </tr> -->
<!-- </table> -->
		
		
		
		
		
		
		
		
		
		
		
		

<!-- 	<div class="row a"> -->
<!-- 		<div class="col b"> -->
		
<!-- 	      <div class="mytable c"> -->
<!-- 	      	<div class="mytable-tr title"> -->
<!-- 	      	 	<div class="mytable-td te1">S.no</div> -->
<!-- 	      	 	<div class="mytable-td">work</div> -->
<!-- 	      	 	<div class="mytable-td">progress</div> -->
<!-- 	      	 	<div class="mytable-td">assigned by </div> -->
	      	</div>
	      </div>
	      
<!-- 	      <div class="col"> -->
<!-- 	      <div class="mytable"> -->
<!-- 	      	<div class="mytable-tr title"> -->
<!-- 	      	 	<div class="mytable-td te1">work</div> -->

<!-- 	      	</div> -->
<!-- 	      </div> -->
	      
	      
<!-- 	   </div> -->
	      
	    
<!-- 	      <div class="col"> -->
<!-- 	      <div class="mytable"> -->
<!-- 	      	<div class="mytable-tr title"> -->
<!-- 	      	 	<div class="mytable-td te1">progress</div> -->

<!-- 	      	</div> -->
<!-- 	      </div> -->
	      
	      
<!-- 	   </div> -->
	   
	     
<!-- 	      <div class="col"> -->
<!-- 	      <div class="mytable"> -->
<!-- 	      	<div class="mytable-tr title"> -->
<!-- 	      	 	<div class="mytable-td te1">assigned by</div> -->

<!-- 	      	</div> -->
<!-- 	      </div> -->
	      
<!-- 	      </div> -->
<!-- 	   </div> -->
<!-- 	   </div> -->
	   
	   
<!-- <!-- 	   <div class="row"> --> 
	   
<!-- <!-- 	      <div class="mytable-tr"> --> 
<!-- <!-- 	      	 	<div class="mytable-td">1</div> --> 
<!-- <!-- 	      	 	<div class="mytable-td">meeting at 2pm</div> --> 
<!-- <!-- 	      	 	<div class="mytable-td">on going</div> --> 
<!-- <!-- 	      	 	<div class="mytable-td"> M.Venkatesh </div> --> 
<!-- <!-- 	      	</div> --> 
<!-- <!-- 	  </div> --> 
<!-- 		</div> -->
		
	
	</div>
		<div class="row my-row">
	      row 3 col0
	    </div>
	</div>
   
   

</div>

</body>
</html>