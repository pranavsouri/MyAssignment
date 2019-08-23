<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Employee DB</h1>
	<form action="displayAll" method="post">
	<h2>
		<input type="submit" name="submit" value="Display all employee">
	</h2>
	</form>
	<form action="displayEmp" method="post">
	<h2>
		<input type="text" name="eid">
		<input type="submit" name="submit" value="DISPLAY">
	</h2>
	</form>
	<form action="displayDesg" method="post">
	<h2>
		<input type="text" name="designation">
		<input type="submit" name="submit" value="DISPLAY">
	</h2>
	</form>
	<form action="displayByAge" method="post">
	<h2>
		<input type="submit" name="submit" value="Display all employee">
	</h2>
	</form>
	
	
</body>
</html>