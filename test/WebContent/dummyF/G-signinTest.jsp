<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<meta name="google-signin-client_id" content="389104228220-rkbphja10ljg7rjtmfnfkpef1qc5dlod.apps.googleusercontent.com">

<script src="https://apis.google.com/js/platform.js" async defer></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style>
.g-signin2
{
margin-left:650px;
margin-top:300px;
}
.data
{
	display:none;
}
</style>
<script src="googleInti.js"></script>
<title>Insert title here</title>
</head>
<body>


<div class="g-signin2" data-onsuccess="onSignIn"></div>
<script >
function onSignIn(googleUser)
{
	window.alert('dvywhdvwukbjk');
	window.alert('ss');
	var profile=googleUser.getBasicProfile();
	$(".g-signin2").css("display","none");
	$(".data").css("display","block");
	$("#pic").attr('src',profile.getImageUrl());
	$("#email").text(profile.getEmail());
	$("#h1").text("tetstststst");
	
}
<h1 id="h1"></h1>
</script>



<div class="data">
<p>Profile details</p>

<img id="pic" class="img-circle" width="100" height="100">


<p>Email Addres</p>x
<p id="email" class="alert alert-danger"></p>
<button onclick="signout()" class="btn btn-danger">SignOut</button>

</div>



</body>
</html>


























