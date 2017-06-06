<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/stylesheet.css">
<title>Payment Gateway</title>
<script type="text/javascript">
	function validateCard(){
		var cardDetails = document.getElementById("cd");
		va cardNumber = cardDetails.toString().length();
		if(cardNumber == 5){
			return true;
		}else
			return false;
	}


</script>
</head>
<body>
<div class="container">
<%@ include file="header.jsp" %>
<%@ include file="navbar.jsp" %>
	<form action="paymentCompleted" method="post">
	<table>
	<tr style="">Card Details</tr>
	<tr><td>Card Number</td><td><input id="cd" type ="text" name="cardDetails"placeholder="Card Number"/></td></tr>
	<tr><td>Expire Date</td><td><input type="text"  name="expireMonth" size = "3" maxlength="2" placeholder = "Month"/></td>
			<td><input type="text" size = "5" name="expireYear"  maxlength="4" placeholder ="Year" /></td></tr>
	<tr><td><input type ="submit" value="Pay"/></td></tr>	
	</table>
	</form>
	<%@ include file="footer.jsp" %>
	</div>
</body>
</html>