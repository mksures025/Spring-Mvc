<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete page</title>
</head>
<body>

<%
String status=(String)request.getAttribute("status");
%>

<%if(status!=null){ %>
<h1><%=status%></h1>
<%}%>


 <h1>${head}</h1>
 
<form action="delete" method="post">

		<table>

			<tr>
				<td>Enter the StudentId</td>
				<td><input type="text" name="studentId"
					placeholder="ex:studentId:TY0123"></td>
			</tr>


			<tr>

				<td><button>delete</button></td>
			</tr>

		</table>

	</form>


</body>
</html>