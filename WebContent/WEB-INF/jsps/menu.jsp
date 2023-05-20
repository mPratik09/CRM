<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	
	<style type="text/css">
	/* 
		*{
			margin: 0px;
			padding: 0px;
		}
	*/
	#logout{
		float: right;
		margin: 10px; 
	}
	
	</style>
</head>

<body>

	<nav>
	
		<a href="createLeadServlet">Leads</a>
		<a href="reportsServlet">Reports</a>
		
 		<a href="logoutServlet">
	 		<input type="submit"	value="LOGOUT"	id="logout"> 
		</a>
		
	</nav>
	
</body>
</html>