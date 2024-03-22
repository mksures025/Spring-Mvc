<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<%
String message = (String) request.getAttribute("message");
%>
</head>
<body>
	<%
	if (message != null) {
	%>
	<h1>
		<%=message%></h1>
	<%
	}
	%>
	<fieldset>
		<form action="login" method="post">
			<table border="2">
				<tr>
					<td>Enter Employee id</td>
					<td><input type="text" name="employeeId"
						placeholder="example TY001"></td>
				</tr>
				<tr>
					<td>Enter password</td>
					<td><input type="password" name="password"
						placeholder="example yyppooo"></td>
				</tr>
				<td></td>
				<td><button type="login">LOGIN</button></td>
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>