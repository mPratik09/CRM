<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Leads</title>
</head>
<body>
	
<%--
	<% 
		if(request.getAttribute("msg_leads")!=null){
			out.println(request.getAttribute("msg_leads"));
		} 
	%>
--%>

	<h2>Enter Customers Details..</h2>
	
	<%
		if(session.getAttribute("emailid")!=null) {
	%>	
	<form action="createLeadServlet"	method="post">
		<table border="3">
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="f_name" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="l_name" /></td>
			</tr>
			<tr>
				<td>Email Id:</td>
				<td><input type="text" name="emailid" /></td>
			</tr>
			<tr>
				<td>Contact Num:</td>
				<td><input type="text" name="ph_num" /></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" name="city" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="Submit"	value= "Save"></td>
			</tr>
		</table>
	</form>
	
	
	<%
		}
	%>
</body>
</html>