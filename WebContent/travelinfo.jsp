<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function validate(){
var date = new Date();
var userdate = document.getElementById("dateoftravel").value;
mydate=new Date(userdate);
if(date<mydate)
{
	 alert("Success.Today's date:"+date+" You've entered: "+mydate);    
	 return true;
}
else
{
    alert("Enter valid date.Today's date: "+date+" You've entered: "+mydate);
    return false;
}
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/stylesheet.css">
<title>Travel Information</title>
</head>
<body>
	<div class="container">
		<%@ include file="header.jsp"%>
		<%@ include file="navbar.jsp"%>
		<form action="bookTrain" method="post"  onsubmit = "return validate()" >
			<table>
				<tr>
					<td>Date of travel:</td>
					<td><input type="text" id="dateoftravel" name="dateoftravel"
						placeholder="mm/dd/yyyy" /></td>
				</tr>
				<tr>
					<td>Number of passengers:</td>
					<td><input type="text" name="passengerNumbers"
						placeholder="upto 6" /> </td></tr></table>
						<table>
						<tr><td><input class="button" type="submit" value="Book Ticket" />
					</td>
				</tr>
			</table>

		</form>
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>