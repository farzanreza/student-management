<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/my-style-sheet.css"/>

</head>
<body clas="bg-secondary-subtle">
<h1 align="center">Student Management System</h1>
<div class="container">
         <form action="showAddStudentPage">   
         <input type="submit" value="ADD" class="btn btn-primary">
         <br> 
          
         </form>         
		<table border="1"  class="table table-striped">
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
							  <td><a href="deleteStudent?userId=${student.id}" onclick="if(!(confirm('Are you sure you want to delete'))) return false">Delete</a></td>
					   </tr>
					</c:forEach>
		</table>

		<img alt="Students cover"  src="/student-management/URLToReachResourcesFolder/images/fake-student.png" class="center" width="700" height="300"/>
</div>				


 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>