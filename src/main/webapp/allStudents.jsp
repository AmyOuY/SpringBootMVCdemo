<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>	All Students</title>
</head>
<body>
	<h2>All Students</h2>
	<hr>
	
	<table>
		<thead>
			<tr>
				<th style="text-align:left; width:100px">Student Id</th>
				<th style="text-align:left; width:100px">First Name</th>				
				<th style="text-align:left; width:100px">Last Name</th>				
				<th style="text-align:left; width:150px">Email</th>
				<th></th>
				<th></th>
				<th></th>			
			</tr>
		</thead>
		<tbody>
			<c:forEach var="student" items="${students}">
				<tr>
		        	<td style="width:100px">${student.studentId}</td>
		        	<td style="width:100px">${student.firstName}</td>		        	
		        	<td style="width:100px">${student.lastName}</td>		        	
		        	<td style="width:150px">${student.email}</td>		        			        	
		        	<td><a href="/studentDetail:id=${student.studentId}">Detail | </a></td>		        	
		        	<td><a href="/editStudent:id=${student.studentId}">Edit | </a></td>		        	
		        	<td><a href="/deleteStudent:id=${student.studentId}">Delete</a></td>
			    </tr>
			</c:forEach>
		</tbody>
	</table>
	
	<br>
	<br>
	<br>
	<a href="/newStudent">Add Student</a>
</body>
</html>