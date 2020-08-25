<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<head>
<meta name="google-signin-client_id" content="389104228220-rkbphja10ljg7rjtmfnfkpef1qc5dlod.apps.googleusercontent.com">

<script src="https://apis.google.com/js/platform.js" async defer></script>
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
/* .loader > img { */
/*     width: 100px; */
/* } */

/* .loader.hidden { */
/*     animation: fadeOut 1s; */
/*     animation-fill-mode: forwards; */
/* } */

/* @keyframes fadeOut { */
/*     100% { */
/*         opacity: 0; */
/*         visibility: hidden; */
/*     } */
/* } */

body {
  margin: 0;
  padding: 0;
  background-color: #17a2b8;
  height: 100vh;
}
#login .container #login-row #login-column #login-box {
  margin-top: 120px;
  max-width: 600px;
  height: 320px;
  border: 1px solid #9C9C9C;
  background-color: #EAEAEA;
}
#login .container #login-row #login-column #login-box  {
  padding: 20px; 
}
#login .container #login-row #login-column #login-box #login-form #register-link {
   margin-top: -100px; 
}
.g-signin2
{
margin-left:650px;
margin-top:300px;
}
</style>
</head>

<body>


<script type="text/javascript">

function validate()
{
	
	
		var uname=document.myform.login.login-row.login-column.login-box.i1.value;
		window.alert("alala"+uname);
		if(uname=="")
			{
			window.alert('please enter user name');
			document.myform.login.login-row.login-column.login-box.i1.focus();
			return false;
			}
		if(uname.length<3 || uname.length>15)
			{
				alert('username invalid length');
				document.myform.i1.focus();
				return false;
			}
		var pass=document.myform.i2.value;
		var illegaChar=/[\W_]/;
		if(pass=="")
			{
			alert('please enter  password');
			document.myform.i2.focus();
			return false;
			}
		else if(pass.length<6 || pass.length>15)
			{
				alert('password invalid length');
				document.myform.i2.focus();
				return false;
			}
		else if(illegalChar.test(pass))
			{
			alert('password contains illegal character');
			document.myform.i2.focus();
			return false;
			}
		
}
</script>


<form action="getLogin" id="myform" method="post"> 
    <div id="login">
        <h3 class="text-center text-white pt-5">Welcome!</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
<!--                         <form id="login-form" class="form" action="" method="post"> -->
                            <h3 class="text-center text-info">Login(Admin/User)</h3>
                            
                            
                            <div class="form-group">
                                <label for="username"  class="text-info">Username:</label><br>
                                <input type="text" name="t1" id="i1" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Password:</label><br>
                                <input type="text" name="t2" id="i2" class="form-control">
                            </div>
                             <span style="color:red;">${nameerror}</span>
                             <h2> <span style="color:red;">${passerror1}</span></h2>
                            <div class="form-group">
                            <div class="row">
                            	<div class="col-md-4">
                            	
                            	<div class="loader">
	                                 <img src="https://miro.medium.com/max/978/0*cWpsf9D3g346Va20.gif" alt="Loading..." />
                              </div>
                            	
                                 <input type="submit" onclick="return validate();" name="submit" class="btn btn-info btn-md" value="submit">
                                 </div>
                                 
                                 
                          </form>  
                          <form action="register.jsp" method="post">     
                                 <div class="col-md-8">
                                 <small><b>Don't have an Account , Register Here!</b></small>
                                  <input type="submit" name="Sign-up" class="btn btn-info btn-md" value="sign-up">
                            	</div>
                            </div>
                            
<div class="g-signin2" data-onsuccess="onSignIn"></div>
<script src="googleInti.js"></script>
                            </div>
                          
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <>
    <script type="text/javascript">
    window.addEventListener("load", function () {
       //fuction test()
    	{
        const loader = document.querySelector(".loader");
        loader.className += " hidden"; 
    	}
    	});
	</script>
</body>
