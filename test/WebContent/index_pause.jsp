<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="refresh" content="2;url=index.jsp"> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
/*    background-image: url('https://i.pinimg.com/474x/22/a7/d9/22a7d900e789f94176d15ac206ffcbe6.jpg');  */
background-color:skyblue;
}
</style>

<script type="text/javascript">

function validate()
{
		var uname=document.myform.t1.value;
		if(uname=="")
			{
			alert('please enter user name');
			document.myform.t1.focus();
			return false;
			}
		if(uname.length<3 || uname.length>15)
			{
				alert('username invalid length');
				document.myform.t1.focus();
				return false;
			}
		var pass=document.myform.t2.value;
		var illegaChar=/[\W_]/;
		if(pass=="")
			{
			alert('please enter  password');
			document.myform.t2.focus();
			return false;
			}
		else if(pass.length<6 || pass.length>15)
			{
				alert('password invalid length');
				document.myform.t2.focus();
				return false;
			}
		else if(illegalChar.test(pass))
			{
			alert('password contains illegal character');
			document.myform.t2.focus();
			return false;
			}
		
}
</script>

</head>
<body>

     <form action="getLogin1" name="myform" method="post">
     enter username : <input type="text" name="t1"><br/>
     
     enter passworddd : <input type="password" name="t2"><br/>
 <span style="color:red;"> ${error} </span>
<!--      enter email : <input type="email" name="t3"><br/> -->
     <input type="submit" onclick="return validate();">
     </form>
</body>
</html>