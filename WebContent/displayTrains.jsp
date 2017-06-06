<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/stylesheet.css">
<title>Rail Gadi Information</title></head>
<body>
<div class="container">
<%@ include file="header.jsp" %>
<%@ include file="navbar.jsp" %>
	<table  style ="padding: 15px; text-align: left;border: 1px solid #ddd;">
			<th>Train Details : </th>
		<tr> 
			<td>Train Number </td>
			<td>Train Name </td>
			<td>Train Source  </td>
			<td>Train Destination </td>
			<td>Ticket Price </td>
			<td>Action </td>
			
		</tr>
		
	<c:forEach var="trains" items="${trainObj }">
		<tr> 
			<td>${trains.trainNumber }</td>
			<td>${trains.trainName }</td>
			<td>${trains.trainSource }</td>
			<td>${trains.trainDestination }</td>
			<td>${trains.ticketPrice }</td>
			<td>
			<form action="travelInfo" method="post">
			<input type="hidden" name="trainNumber" value="${trains.trainNumber}"/>
			<input class = "button" type = "submit" value ="Book"/></td></tr>
			</form>
	</c:forEach>
		
	</table>
	<%@ include file="footer.jsp" %>
	</div>
</body>
</html>