<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update leads</title>
</head>
<body>
	<form action="updateServlet" method="post">
		<table border="2">
			<tr>
				<td>Email id:</td>
				<td><input type = "text"	value = "<%= request.getAttribute("emailId") %>"	name = "emailid"	readonly></td>
			</tr>
			
			<tr>
				<td>Updated Phone Number:</td>
				<td><input type = "text"	value = "<%= request.getAttribute("phNum") %>"	name = "ph_num"></td>
			</tr>
			
			<tr>
				<td>Update City:</td>
				<td><input type = "text"	value = "<%= request.getAttribute("city") %>"	name = "city"></td>		
			</tr>
			
			<tr>
				<td colspan="2"><input type = "submit"	value = Update></td>
			</tr>
		</table>
	</form>
</body>
</html>