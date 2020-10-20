<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

<%
	String username = (String)request.getAttribute("username");
	String  password = (String)request.getAttribute("password");
	ArrayList<String> details = (ArrayList<String>)request.getAttribute("details"); 
%>

<%
  for(String s : details) {
%>
	
	  <h1><%= s%></h1>
	  
	  <%
  			}
	  %>
	
<h1> <%= username %> </h1>
<h1> <%= password %> </h1>
<h2> </h2>

</body>
</html>