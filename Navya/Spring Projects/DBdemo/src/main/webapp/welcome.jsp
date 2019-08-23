<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Employee Portal Page</h1>
<hr>
<form action="displayAll" method="post">
<h2>
Click here to see all the employee records<br>
<input type="submit" value="display all employees" name="submit">
 </h2>
</form>
<form action="displayEmp" method="post">
<h2>
Enter Emp Id<br>
<input type="text" name="eid">
<input type="submit" value="Display employee" name="submit">
</h2>
</form>
<form action="displayByDesignation" method="post">
<h2>
Enter Designation <br>
<input type="text" name="designation">
<input type="submit" value="Display" name="submit">
</h2>
</form>
<form action="displayByAge" method="post">
<h2>

<input type="text" name="designation">
<input type="submit" value="Display all employees" name="submit">
</h2>
</form>
<form action="insertEmp" method="post">
<h2>
ID:<input type="text" name="eid">
Name:<input type="text" name="name">
Age:<input type="text" name="age">
Designation:<input type="text" name="designation">
<input type="submit" value="insert" name="insert">
<input type="reset" value="reset" name="reset">
</h2>
</form>
<form action="collect" method="post">
<h2>
ID:<input type="text" name="deptid">
Name:<input type="text" name="name1">
Age:<input type="text" name="manager">
<input type="submit" value="insert" name="insert">
<input type="reset" value="reset" name="reset">
</h2>
</form>
</body>
</html>