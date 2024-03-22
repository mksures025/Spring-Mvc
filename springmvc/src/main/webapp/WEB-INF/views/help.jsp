<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>

	<h1>This help page</h1>

	<!--   using normal way to import from model to view -->
	<%--  <% 
      String name=(String)request.getAttribute("name");
      Integer rollnumber=(Integer)request.getAttribute("rollnumber");
      LocalDateTime dateTime=(LocalDateTime)request.getAttribute("time");
    %>
    
   <h1>My name <%=name%></h1>
    <h1>My rollnumber <%=rollnumber%></h1>
       <h1>My time <%=dateTime%></h1>
 --%>

	<!-- using express jsp -->

	<%-- first we need add configuration that <%@page isELIgnored="false" %> --%>
	<h1>My name ${name}</h1>
	<h1>My rollnumber ${rollnumber}</h1>
	<h1>My time ${time}</h1>
	
	<hr>
	<!-- to print in collection format -->
	${marks}
	
	
	<!-- to print in loop -->
	
	<c:forEach  var="item" items="${marks}">
	
<%-- 	<h2>${item}</h2> --%>

    <h2><c:out value="${item}"></c:out></h2>
	
	</c:forEach>
	


</body>
</html>