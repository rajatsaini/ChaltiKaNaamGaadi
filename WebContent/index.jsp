<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/stylesheet.css">
<title>Chalti ka naam Gadi</title>
</head>
<body>
<div class="container">
	<%@ include file="header.jsp" %>
	<%@ include file="navbar.jsp" %>
	<div class="toasterror"><h3>${successRegistration}</h3></div>
<div class="blocks">
<h2>Mobile Friendly Website.</h2>
<table>
<tr><td><img src="images/mobile.png"/></td><td>Easier access to registration and train details on mobile phone.</td></tr>
</table>
</div>
<div class="blocks">
<img src="images/freewifi.png"/>
</div>

	<%@ include file="footer.jsp" %>
</div>
</body>
</html>