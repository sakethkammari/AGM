<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<!-- <form action="t2"> -->
<div id="carsDiv">
</div>
<!-- </form> -->
<button id="addCarBtn">Add Car</button>
<script>
var current = 0;
var cars = new Array(5);
cars[0] = "Audi";
cars[1] = "Bentley";
cars[2] = "Mercedes";
cars[3] = "Mini";
cars[4] = "BMW";
document.getElementById("addCarBtn").onclick = function() {
       if (!(current > cars.length - 1))
       {
            document.getElementById("carsDiv").innerHTML += cars[current] + "<br />";
            current++;
       }
}
</script>



</body>
</html>