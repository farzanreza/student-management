<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/my-style-sheet.css"/>

</head>
<body>
<div>
		<h1 align="center">Student Management</h1>
		<div class="container">
				    <h1>Add Student Form </h1>
				    <form:form action="save-student" modelAttribute="student" method="POST">
						  <div class="mb-3 col-xs-3">
						    <label class="form-label input-sm">Name</label>
						    <form:input type="text" class="form-control input-sm" path="name"/>
						  </div>
						  <div class="mb-3 col-xs-3">
						    <label  class="form-label">Mobile</label>
						    <form:input type="text" class="form-control input-sm" path="mobile"/>
						  </div>
						  <div class="mb-3 col-xs-3">
						    <label  class="form-label">Country</label>
						    <form:input type="text" class="form-control input-sm" path="country"/>
						  </div>
						
						  <button type="submit" class="btn btn-primary">Submit</button>
						  
						  <a href="/student-management/showStudent" class="btn btn-secondary btn-md active" role="button" aria-pressed="true">Student-List</a>
		             </form:form>
		
		</div>
</div>
</body>
</html>