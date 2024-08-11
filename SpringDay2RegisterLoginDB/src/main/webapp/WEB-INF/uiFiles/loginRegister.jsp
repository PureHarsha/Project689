<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spri" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login/Register Page</h1>

<spri:form modelAttribute="studentData" action="register">
Roll Number : <spri:input type="number" path="rollNum"/><br>
Name : <spri:input type="number" path="stName"/><br>
Mail : <spri:input type="number" path="stMail"/><br>
Joining Date : <spri:input type="number" path="joiningDate"/><br>
<input type="submit" value="Register">
</spri:form>


</body>
</html>