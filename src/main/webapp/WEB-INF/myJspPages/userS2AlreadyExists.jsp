<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Already Existed with this email i.e., <%=session.getAttribute("email") %></h1>
<a href="http://localhost:7575/">Click here for Register or Login</a>
</body>
</html>