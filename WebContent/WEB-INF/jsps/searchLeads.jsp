<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ include file="menu.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leads Reports</title>
</head>
<body>

<%-- 
<%
	response.setHeader("Cache-cotrol", "no-cache, no-store, must-revalidate");
	
//	if(session.getAttribute("emailid")==null){
	if(session==null){
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
%>
 --%>
 
<h2>Lead Reports</h2>
	<table border="2">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email Id</th>
			<th>Contact Number</th>
			<th>City</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>

		<%
			ResultSet allLeads = (ResultSet) request.getAttribute("allLeads");
			while (allLeads.next()) {
		%>
		<tr>
			<td><%= allLeads.getString(1) %></td>
			<td><%= allLeads.getString(2) %></td>
			<td><%= allLeads.getString(3) %></td>
			<td><%= allLeads.getString(4) %></td>
			<td><%= allLeads.getString(5) %></td>
			<td><a href="deleteServlet?emailid=<%= allLeads.getString(3) %>">Delete</a></td>
			<td><a href="updateServlet?emailid=<%= allLeads.getString(3) %>
					&ph_num=<%=allLeads.getString(4)%> &city=<%=allLeads.getString(5)%>">Update</a></td>
		
		</tr>

		<%
			}
		%>
	</table>
</body>
</html>