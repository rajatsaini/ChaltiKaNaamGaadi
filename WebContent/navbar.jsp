<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="one">
	<a href="index.jsp">Home</a> |
	<c:choose>
		<c:when test="${validUser == 'true' }">
			<a href="trainSearch.jsp">Search Train</a> | 
			 <a href="logout">Logout</a>
			</c:when>
			<c:otherwise>
			<a href="login.jsp">Login</a> |
			<a href="register.jsp">Register</a></div>
			</c:otherwise>
	</c:choose>
	
	
	<br/>
	
</body>
</html>