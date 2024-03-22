<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>

<%
String message = (String) request.getAttribute("message");
%>



</head>
<body>

    <%if(message!=null){ %>
	<h4><%=message%></h4>
	<%}%>
	<h4>${reset}</h4>
	
	
     <h1>${head}</h1>
    <h2>Login Page</h2>

	<form action="login" method="post">

		<table>

			<tr>
				<td>Enter the Username</td>
				<td><input type="text" name="studentId"
					placeholder="ex:studentId:TY0123"></td>
			</tr>

			<tr>
				<td>Enter the password</td>
				<td><input type="password" name="password"
					placeholder="ex:12345"></td>
			</tr>
			
				<tr>
				
				<td><button>Login</button>
				</td>
			</tr>

		</table>

	</form>

</body>
</html>