<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home Page</title>
</head>
<body>
<div align="center">
	<h1>Welcome to Employee Management System  </h1>
			<table cellpadding="2" border = "1">
	<tr>
	<th><a href="empform">Add Employee</a>
	</th>
	<th>
	<a href="viewemp">View Employees</a>
	</th>
	</tr>
    </table>
	<P>${serverTime}.</p>

</div>
</body>
</html>