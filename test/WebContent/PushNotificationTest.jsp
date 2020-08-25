<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- <script -->
<!--   src="https://code.jquery.com/jquery-3.5.1.js" -->

<!--   </script> -->
  
<!--   <script src="jquery-3.5.1.min.js"></script> -->
<!--   <script src="push.min.js"> -->
  
<!--   </script> -->
<!--   <script src="serviceWorker.min.js"></script> -->

<!-- 	<script> -->
<!-- // 		function start() -->
<!-- // 		{ -->
<!-- // 			window.alert('pushh'); -->
<!-- // 			Push.create('Hello World!') -->
<!-- // 		} -->
<!-- 	</script> -->

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- <a href="javascript:void(0)" onclick="start()">startt</a> -->
<!-- <button onclick="start()">startt</button> -->
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















