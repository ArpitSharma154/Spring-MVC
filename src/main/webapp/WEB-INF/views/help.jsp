<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored = "false"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h1>help called</h1>

<% String name = (String)request.getAttribute("name"); %>

<h1> my name is <%= name%></h1>

<hr>
<!--  printing integer list using jsp expression language -->

${nos }

<!--  using jstl for prining the list  -->
<c:forEach var="item" items="${nos }">
<h1>${item }</h1>
</c:forEach>

</body>
</html>