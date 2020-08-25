<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<textarea id="textarea" rows="5" cols="15"></textarea>
<button id="button">Download</button>


<script>

var button=document.getElementById('button')
button.addEventListener('click',function(e)
		{
//	alert('clickerdd');
 var textareaval = document.getElementById('textarea').value;
	var filename="test.txt";

download(textareaval,filename)


		})
		
function download(textareaval,filename)
{
	
	var element=document.createElement('a');
	element.setAttribute('href','data:text/plain;charset=utf-8,'+encodeURIComponent(textareaval))
	element.setAttribute('download',filename);
	element.style.display='none'
	document.body.appendChild(element)
	element.click()
	document.body.removeChild(element)
	}
		
		
		
</script>

</body>
</html>








