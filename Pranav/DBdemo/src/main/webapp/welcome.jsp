<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Welcome to Employee Portal page</h1>
<hr>
<form action = "displayAll" method ="post">
<h2>
<b> Click Here to see all Employee records</b><br>
<input type = "submit" name ="submit" value="Display all Employees">
</h2>

</form>
<hr>
<form action = "findByDesignation" method = "post">
<h2>
<b> Enter Employee Designation </b> <input type ="text" name = "designation" >
<input type = "submit" name="submit" value="Display">
</h2>

</form>
<hr>
<form action = "getEmpInSortedByAge" method = "post">
<h2>
<b> Employee Sorted by Age </b><br>
Enter designation <input type = "text" name ="designation">
<input type = "submit" name="submit" value="Display Employees by AGE">
</h2>

</form>
<hr>
<form action = "insertEmp" method = "post">
<h2>
<b> Give values to insert </b><br>
Enter ID <input type = "text" name ="eid"><br>
Enter Name <input type = "text" name ="ename"><br>
Enter Age <input type = "text" name ="age"><br>
Enter designation <input type = "text" name ="designation"><br>
<input type = "submit" name="submit" value="Insert into Employee table"><br>
<input type ="reset" name="reset" value="Reset the given values"><br>
</h2>

</form>
</body>
</html>