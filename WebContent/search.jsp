<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/stylesheet.css">
<title>Chalti Ka Naam Gadi</title>
</head>
<body>
<div class="container"><%@ include file="header.jsp" %>

<form action="booking" method="GET">
<table>
<tr><td>
Select Option :</td><td>
<select id="Type">
      <option value='trainNumber' selected>Train Number</option>
      <option value='source'>Source</option>
      <option value='destination'>Destination</option>
    </select></td></tr>
<tr><td>Enter your <span id="QueryName">query</span></td><td>
<input id="Value" name="car" type="text"></td></tr>
<tr><td><button class="button" id="submit" type="submit" value="Submit">Submit Query</button>
</td></tr></table>

<%@ include file="footer.jsp" %>
</div>
</body>
</html>