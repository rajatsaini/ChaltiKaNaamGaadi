<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/stylesheet.css">
<title>Chalti ka naam Gadi</title>
<script src="javaScript/captcha.js"></script>
</head>
<body onload="DrawCaptcha()">
<div class="container">
<%@ include file="header.jsp" %>
	<%@ include file="navbar.jsp" %>
	<div class="toasterror"><h3>${invalid }</h3></div>
<form action="login" method="post" onsubmit="return ValidCaptcha()">
<table>
<tr><td><input type="text" name="username"  placeholder="username"></td></tr>
<tr><td><input type="password" name="password" placeholder="password"></td></tr>
</table>
<table style ="width: 150px;">
<tr>
    <td>
        <input type="text" id="txtCaptcha" readonly = "readonly"

            style="text-align: center; font-weight: bold; font-family: modern; background-color: beige;" />
        <input type="button" id="btnrefresh" value="Refresh" onclick="DrawCaptcha();" />
    </td>
</tr>
<tr>
    <td>
	<input style="" id="txtInput" type="text" placeholder="enter captcha"/>    </td>
</tr>
</table>
<tr><td><input class="button" type="submit" value="login");"/></td></tr>
New user? <a href="register.jsp">Register</a>.
</form>
<%@ include file="footer.jsp" %>
</div>
</body>
</html>