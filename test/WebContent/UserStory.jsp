<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!--  <meta name="viewport" content="width=device-width, initial-scale=1"> -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<style>
.container
{
	background-color: white;
}
</style>
</head>
<body>
<form action="UserStoryController" method="post">
<div class="container">
 <div class="row">
 <div class="col-md-6">
   	 <div class="form-group">
      <label for="usr">Name of story*</label>
      <input type="text"  class="form-control" name="usr"> 
    </div>
    <h2><span style="color:red;">${nameerror1}</span></h2>
 </div>
 </div>
 <div class="row">
 <div class="col-md-6">
     <div class="form-group">
      <label for="backlog">Backlog*</label>
      <input type="text" class="form-control" name="backlog">
    </div>
    </div>
 </div>
  <h2><span style="color:red;">${backlogerror1}</span></h2>
 
 <div class="row">
 	<div class="col-md-6">
 	<div class="form-group">
      <label for="release">Release</label>
      <input type="text" class="form-control" name="release">
    </div>	
 	</div>
 <h3>	 <span style="color:red;">${releaseerror1}</span> </h3>
 	<div class="col-md-6">
       <div class="form-group">
      <label for="epic">Epic*</label>
      <input type="text" class="form-control" name="epic">
    </div>
 	</div>
 	 <h3><span style="color:red;">${epicerror1}</span></h3>
 </div>
  
 
  <div class="row">
  <div class="col-md-6">
      <div class="form-group">
      <label for="feature">Feature</label>
      <input type="text" class="form-control" name="feature">
    </div>
 </div>
 </div>
 
 <h2><span style="color:red;">${featureerror1}</span></h2>
 
 <div class="row-md-12">
 	<div clas="col-md-8">
      <div class="form-group">
      <label for="story">Story Description:</label>
      <textarea class="form-control" rows="5" name="story"></textarea>
    </div>
    </div>
    </div>
    <h2> <span style="color:red;">${storyerror1}</span></h2>
    
    <div class="row">
    <div class="col-md-6">
   	 <div class="form-group">
    	  <label for="accpetance">Acceptance criteria:</label>
      <textarea class="form-control" rows="5" name="acceptance"></textarea>  
    </div>
    </div>
    </div>
   <h2> <span style="color:red;">${acceptanceerror1}</span></h2>
    
    <div class="row">
    <div class="form-group">
      <label for="storypoint">story points *</label>
      <input type="text" class="form-control" name="storypoint">
    </div>
   <h2>  <span style="color:red;">${pointserror1}</span></h2>
    
<!--    	       <div class="dropdown"> -->
<!--     <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Status -->
<!--     <span class="caret"></span></button> -->
<!--     <ul class="dropdown-menu"> -->
<!--       <li><a href="#">New</a></li> -->
<!-- <!--       <li><a href="#">InProgress</a></li> --> 
<!-- <!--       <li><a href="#">Complete</a></li> --> 
<!--     </ul> -->
<!--   </div>   -->
   	    </div>
    
    <div class="row">
    
  
 </div> 
 
  
 
 <div class="row">
 <div class="col-md-8">
   	 <div class="form-group">
      <label for="asign">Assign To: *</label>
      <input type="text" class="form-control" name="assign">
    </div>
    </div>
    <div class="col-md-4">
      <div>
<!--         <button type="submit" class="btn btn-primary"><h3>CREATE</h3></button>  -->
              <div>
				<form action="UserStoryController" method="post">
					<input type="submit" value="CREATE" name="create"> 
				</form>
             </div>



<!--              <a class="btn btn-primary" href="MyWork" role="button">Create</a>  -->
    </div>
    </div>
   
    <div class="col-md-4">
      <div>
<!--        <button type="submit" class="btn btn-primary"><h3>Logout</h3></button> -->
<!--     	<a class="btn btn-primary" href="LogoutCon" role="button">Logout</a> -->
    </div>
    </div>
     
    
    
 
 
</div>
</div>
</form>

</body>
</html>