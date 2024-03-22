<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>

  <h1>${head}</h1>

<h2>Password Update</h2>
	<form action="update" method="post">

		<table>

			<tr>
				<td>Enter the StudentId</td>
				<td><input type="text" name="studentId"
					placeholder="ex:studentId:TY0123"></td>
			</tr>

			<tr>
				<td>Enter the OldPassword</td>
				<td><input type="password" name="oldPassword"
					placeholder="ex:12@34"></td>
			</tr>

			<tr>
				<td>Enter the NewPassword</td>
				<td><input type="password" name="newPassword"
					placeholder="ex:12@34"></td>
			</tr>


			<tr>

				<td><button>Update</button></td>
			</tr>

		</table>

	</form>



</body>
</html>