<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<h2>Login Here..</h2>
	<% if(request.getAttribute("msg_error")!=null){
		out.print(request.getAttribute("msg_error"));
	} %>
	
	<form action="loginServlet" method="post">
		<table border="5">
			<tr>
				<td>Name:</td>
				<td><input type="text" name="emailid" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
	
</body>
</html>