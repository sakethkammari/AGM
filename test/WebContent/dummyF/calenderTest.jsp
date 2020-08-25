<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>
<body>
var $datePicker = $("div#datepicker");

var $datePicker = $("div");

$datePicker.datepicker({
    changeMonth: true,
    changeYear: true,
    inline: true,
    altField: "#datep",
}).change(function(e){
    setTimeout(function(){   
        $datePicker
            .find('.ui-datepicker-current-day')
            .parent()
            .after('<tr>\n\
                        <td colspan="8">\n\
                            <div> \n\
                                <button>8:00 am – 9:00 am </button>\n\
                            </div>\n\
                            <button>9:00 am – 10:00 am</button>\n\
                            </div>\n\
                            <button>10:00 am – 11:00 am</button>\n\
                            </div>\n\
                        </td>\n\
                   </tr>');

    });
});
<div id="datepicker"></div>
</body>
</html>