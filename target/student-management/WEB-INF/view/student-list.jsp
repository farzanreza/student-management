<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">

         <h1>Student Management System</h1>
         <br>
         <form action="showAddStudentPage">
           
           
         <input type="submit" value="ADD">
          
         </form>         
		<table border="1">
		        <thead>
		          <tr>
		             <td>
		                  id
		             </td>
		              <td>
		                  name
		             </td>
		              <td>
		                  mobile
		             </td>
		              <td>
		                  country
		             </td>
		          </tr>
		        </thead>
					<c:forEach var="student" items="${students}">
					   <tr>
							  <td>${student.id}</td>
							  <td>${student.name}</td>
							  <td> ${student.mobile}</td>
							  <td>${student.country}</td>
							  <td><a href="updateStudent?userId=${student.id}">Update</a></td>
							  <td><a href="deleteStudent?userId=${student.id}">Delete</a></td>
					   </tr>
					</c:forEach>
				
		</table>
</div>
</body>
</html>