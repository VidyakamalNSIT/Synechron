<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home Page</title>
</head>
<body>
<div align="center">
<h3>Welcome ${userName}</h3>
<table cellpadding="2">
	<tr>
	<th>
	<form action="showform" method="post">
	<input type="submit" value="Add Employee">
	</form>
	</th>
	<th>
	<form action="viewemp">
	<input type="submit" value="View Employees">
	
	</form>
	</th>
	</tr>
    </table>
   </div>
</body>
</html>