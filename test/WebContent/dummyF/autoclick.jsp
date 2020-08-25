<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
<form id="myform" action="/t2101">
<div id="carsDiv">
<button type="button"  id="AT">autotest</button>
<input type="text" id="tx1"></input>
<input type="text" id="tx2"></input>

</div>
</form>
<!-- </form> -->

<!-- <button id="ATa">Add Car</button> -->

<!-- <script> -->
<!-- // var selectetext = "Mango"; -->
<!-- // var user = "vamshi" -->
<!-- // document.getElementById("AT").onclick = function() { -->
	
<!-- // 	document.getElementById("tx1").value="selectetextaa"; -->
<!-- // 	document.getElementById("tx2").value=user; -->
<!-- // 	document.getElementById("myform").submit(); -->
<!-- // //        if (!(current > cars.length - 1)) -->
<!-- // //        { -->
<!-- // //             document.getElementById("carsDiv").innerHTML += cars[current] + "<br />"; -->
<!-- // //             current++; -->
<!-- // //        } -->
<!-- // }; -->
<!-- </script> -->

<script>

window.onload = function(){
    var button = document.getElementById('myform');
	document.getElementById("tx1").value="selectetextaa";
	document.getElementById("tx2").value="bhbhb";
    setInterval(function(){
    
        button.click();
        document.getElementById("myform").submit();
    });  // this will make it click again every 1000 miliseconds
};
</script>



</body>
</html>