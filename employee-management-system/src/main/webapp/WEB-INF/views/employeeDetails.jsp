<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String message = (String) request.getAttribute("message");
%>
<body>
	<h2>Employee Details</h2>

	<c:if test="${not empty employee}">
		<p>Employee ID: ${employee.employeeId}</p>
		<p>Employee Age: ${employee.employeeAge}</p>
		<p>Employee Email: ${employee.employeeEmailId}</p>
	</c:if>
	<%
	if (message != null) {
	%>
	<h1>
		<%=message%></h1>
	<%
	}
	%>
</body>
</html>