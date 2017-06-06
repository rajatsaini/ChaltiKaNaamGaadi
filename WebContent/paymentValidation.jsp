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
		var cardDetails = document.getElementById("cd").value;
		var cardNumber = cardDetails.toString().length;
		if(cardNumber == 3){
			var monthStr = document.getElementById("m").value;
			var yearStr = document.getElementById("y").value;
			var todayYear = new Date().getFullYear();
			if(monthStr>=1&&monthStr<=12){
				if(todayYear<yearStr){
					return true;
				}else {
					alert("check year of expiry");
					return false;
				}
			}else{
				alert("enter valid month");
				return false;

			}
		}else 
		 {
			alert("Please enter valid card number.");
			return false;
		 }
	}


</script>
</head>
<body>
<div class="container">
<%@ include file="header.jsp" %>
<%@ include file="navbar.jsp" %>
	<form action="paymentCompleted" onsubmit = "return validateCard()" >
	<table>
	<tr style="">Card Details</tr>
	<tr><td>Card Number</td><td><input id="cd" type ="text" name="cardDetails" placeholder="Card Number"/></td></tr>
	<tr><td>Expire Date</td><td><input id ="m" type="text"  name="expireMonth" size = "3" maxlength="2" placeholder = "Month"/></td>
			<td><input id="y" type="text" size = "5" name="expireYear"  maxlength="4" placeholder ="Year" /></td></tr>
	<tr><td></td><td><input type ="submit" class="button" value="Pay"/></td></tr>	
	</table>
	</form>
	<%@ include file="footer.jsp" %>
	</div>
</body>
</html>