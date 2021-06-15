<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Detail</h2>
	<hr>

	<p><strong>Student Id:</strong>  ${student.studentId}</p>
	<p><strong>First Name:</strong>  ${student.firstName}</p>
	<p><strong>Last Name:</strong>  ${student.lastName}</p>
	<p><strong>Email:</strong>  ${student.email}</p>
	
	<br>
	<br>
	<br>
	<a href="/student">Back to Student List</a>
</body>
</html>