<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/stylesheet.css">
<title>Chalti ka naam Gadi</title>
</head>
<body>
<div class="container">
<%@ include file="header.jsp" %>
<%@ include file ="navbar.jsp" %>

<div class="toasterror"><h3>${trainerror }</h3></div>

<form action="search" method="post">
	<table >
		<tr>
		<td><input type = "text" name= "searchString" placeholder="Enter Name or number"></td>
		<td> <select name = "type" autofocus>
				<option value ="trainNumber">Train Number</option>
				<option value ="trainSource">Train Source</option>
				<option value ="trainDestination">Train Destination</option>
		</select></td></tr>
		<tr><td><input class = "button" type = "submit" value = "Search" > </td> </tr>
	</table>
	</form>
		<%@ include file="footer.jsp" %>
		</div>
</body>
</html>