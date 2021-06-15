<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Edit Student</h2>
	<hr>
	
	<form action="updateStudent">
		<label><strong>Student Id: </strong><input style="margin-bottom:20px" type="number" name="studentId" value=${student.studentId}></label><br>
		<label><strong>First Name: </strong><input style="margin-bottom:20px" type="text" name="firstName" value=${student.firstName}></label><br>
		<label><strong>Last Name: </strong><input style="margin-bottom:20px" type="text" name="lastName" value=${student.lastName}></label><br>
		<label><strong>Email: </strong><input style="margin-bottom:20px" type="text" name="email" value=${student.email}></label><br>
		<input type="submit"><br>
	</form>	

	<br>
	<br>
	<br>
	<a href="/student">Back to Student List</a>

</body>
</html>