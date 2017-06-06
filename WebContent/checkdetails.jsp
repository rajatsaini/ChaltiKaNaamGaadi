<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/stylesheet.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<%@ include file="header.jsp" %>
	<%@ include file="navbar.jsp" %>
	<!--  <h3>This is check Details JSP page.</h3>-->
		<div class="toasterror"><h3>${ticketdetails}</h3></div>
	<p>${ticketString}</p>
	<form action="checkout" method="post">
		<input class="button" type="submit" value="proceed to checkout"/>
	</form>
	</div>
	<%@ include file="footer.jsp" %>
</div>
</body>
</html>