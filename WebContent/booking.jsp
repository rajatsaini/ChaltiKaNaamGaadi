<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/stylesheet.css">
<link rel="stylesheet" href="css/stylesheet.css">
<title>Chalti ka naam Gadi</title>
<script type="text/javascript" src="javaScript/selector.js">scroll_messages()</script>
</head>
<body>
<div class="container">
<%@ include file="header.jsp" %>
<%@ include file="navbar.jsp" %>
<table>
<!-- <form class="new" method="post" action="checkDetails">
<tr><td><input type="text" name="date" placeholder="dd/mm/yyyy"/></td></tr>
    <tr><div id="dynamicInput"></div></tr>
    <tr><input type="button" value="Add Passenger" onclick="addInput('dynamicInput');" />
    <input type="button" value="Book Ticket" /></tr>
</form> -->

<form action="checkDetails" method="post">
	<tr><td><input type="text" name="date" placeholder="dd/mm/yyyy"/></td></tr>
	
	<tr><td><input type="text" name="name" placeholder="Name"/></td>
	<td><input type="text" name="age" placeholder="Age"/></td>
	<td><input type="text" name="gender" placeholder="gender"/></td></tr>
	
	<tr><td><input type="text" name="name" placeholder="Name"/></td>
	<td><input type="text" name="age" placeholder="Age"/></td>
	<td><input type="text" name="gender" placeholder="gender"/></td></tr>
	
	<tr><td><input type="text" name="name" placeholder="Name"/></td>
	<td><input type="text" name="age" placeholder="Age"/></td>
	<td><input type="text" name="gender" placeholder="gender"/></td></tr>
	
	<tr><td><input type="text" name="name" placeholder="Name"/></td>
	<td><input type="text" name="age" placeholder="Age"/></td>
	<td><input type="text" name="gender" placeholder="gender"/></td></tr>
	
	<tr><td><input type="text" name="name" placeholder="Name"/></td>
	<td><input type="text" name="age" placeholder="Age"/></td>
	<td><input type="text" name="gender" placeholder="gender"/></td></tr>
	
	<tr><td><input type="text" name="name" placeholder="Name"/></td>
	<td><input type="text" name="age" placeholder="Age"/></td>
	<td><input type="text" name="gender" placeholder="gender"/></td></tr>
	
	<tr><input type="submit" value="Book Ticket" /></tr>
</form>

</table>
<%@ include file="footer.jsp" %>
</body>
</html>