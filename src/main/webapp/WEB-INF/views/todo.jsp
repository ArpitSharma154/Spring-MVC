<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored = "false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todo</title>
</head>
<body>
<h1> ${heading  }</h1>

<!--  using jstl for prining the list  -->
<c:forEach var="item" items="${todoList }">
	<h1>${item.actionID }</h1>
	<h1>${item.actionType }</h1>
	<h1>${item.actionDesc }</h1>
</c:forEach>

</body>
</html>