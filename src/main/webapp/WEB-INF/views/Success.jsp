<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>

<!--  retriving value at view  -->
<h1> Welcome , ${user.email} </h1>
<h1> Your password is , ${user.password}</h1>

</body>
</html>