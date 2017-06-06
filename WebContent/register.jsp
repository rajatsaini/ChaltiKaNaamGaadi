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
<form action="register" method="post">
<table>
<tr><td><input type="text" name="uname" placeholder="username"/></td></tr>
<tr><td><input type="text" name="umail" placeholder="email@example.com"/></td></tr>
<tr><td><input type="password" name="upass" placeholder="password"/></td></tr>
</table>
<tr><td><input class="button" type="submit" value="register"/></td></tr>
Already registered? <a href="login">Login</a>.
</form>
<%@ include file="footer.jsp" %>

</div>
</body>
</html>