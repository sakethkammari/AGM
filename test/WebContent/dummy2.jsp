<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- CSS only -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>




<style>
div
{
	display flex;
	flex-directin:column;
	align-items-center;
}

textarea
{
	margin-top:15px;
	width:50%;
}
</style>

<script type="text/javascript">
    function GetSelectedTextValue() {
        var ddlFruits = document.getElementById("ddlFruits");
        var selectedText = ddlFruits.options[ddlFruits.selectedIndex].innerHTML;
        var selectedValue = ddlFruits.value;
        alert("Selected Text:" +"99"+selectedText+"99"+ " Value:"+selectedValue);
    }
</script>



</head>
<body>




	<div>
<!--  		<input type="file"> -->
<!--  		<textarea cols="30" rows="10"></textarea> -->
<!--  	</div> -->
 	 	
<!--  	<script src="script2.js"></script> -->



<div class="btn-group">
    <button class="btn">Please Select From List</button>
    <button class="btn dropdown-toggle" data-toggle="dropdown">
        <span class="caret"></span>
    </button>
    <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu">
       <li><a tabindex="-1" href="#">Item I</a></li>
       <li><a tabindex="-1" href="#">Item II</a></li>
       <li><a tabindex="-1" href="#">Item III</a></li>
       <li class="divider"></li>
       <li><a tabindex="-1" href="#">Other</a></li>
    </ul>
</div>


<!-- <script> -->
<!-- // $( document ).ready(function() { -->
<!-- //     $('.dropdown').each(function (key, dropdown) { -->
<!-- //         var $dropdown = $(dropdown); -->
<!-- //         $dropdown.find('.dropdown-menu a').on('click', function () { -->
<!-- //             $dropdown.find('button').text($(this).text()).append(' <span class="caret"></span>'); -->
<!-- //         }); -->
<!-- //     }); -->
<!-- // }); -->
<!-- </script> -->

<select class="sel md-form">
  <option value="" disabled selected>Choose your option</option>
  <option value="1">Option 1</option>
  <option value="2">Option 2</option>
  <option value="3">Option 3</option>
</select>

<script src="script2.js"></script>



<!-- <button id="showarea" name="showarea" type="button" value="Show Textarea" ></button> -->
<!-- <textarea id="textarea" name="text"></textarea> -->
<!-- <button id="textarea-ok" name="ok" type="button" value="Ok" ></button> -->
<script type="text/javascript">
//     $("#textarea, #textarea-ok").hide(); // or you can have hidden w/ CSS -->
//     $("#showarea").click(function(){ 
//         $("#textarea").show(); 
//     }); 
//     $("#textarea-ok").click(function(){ 
//         $("#textarea").hide(); 
// }); 
<!-- </script> -->


<select id="ddlFruits">
    <option value=""></option>
    <option value="1">Apple</option>
    <option value="2">Mango</option>
    <option value="3">Orange</option>
</select>
<input type="button" value="Get Selected Text Value" onclick="GetSelectedTextValue()" />





</body>
</html>