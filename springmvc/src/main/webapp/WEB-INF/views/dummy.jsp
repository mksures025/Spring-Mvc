<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>

<%@page isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>

</head>
<body>

	<h1>Welcome to CMS</h1>

	<%
	List<String> friends = (List<String>) request.getAttribute("f");
	%>


	<%
	for (String str : friends) {
	%>

	<h1><%=str%></h1>
	<%
	}
	%>

	<c:forEach var="friend" items="friends">

		<h1>${friend}</h1>

	</c:forEach>

</body>
</html>