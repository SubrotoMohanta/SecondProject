<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Spring MVC with Maven project</title>
<style type="text/css">
body {
	background-image: url("paper.gif");
	background-color: #cccccc;
} 
</style>
<marquee direction="right"><h2><font color="blue">ALL RIGHT WELCOMe TO ENTER DETAILS</font></h2></marquee>

<marquee><style=background-color:yellow;border:1px solid black"><h2><font color="red">PLEASE ENTER YOUR DETAILS</font></h2></style></marquee>
<script type="text/javascript">

   function showlogin()
   {
   alert('show Enter details Form');
        var url="welcome.abi?method=personwelcome";
        document.forms[0].action=url;
        document.forms[0].submit();
      
   }

</script>
</head>

 <body>
	<br>
	<div style="text-align:center">
		<h2>
			Hai Yuva..!! This is My First Spring MCV Maven..<br> <br>
		</h2>
		<h3>
			<a href="add" onclick="showlogin()">Click here to See Welcome Message... </a>
		</h3>
	</div>
</body> 


</html>