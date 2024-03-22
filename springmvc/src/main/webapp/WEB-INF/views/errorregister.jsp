<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
	<div class="alert alert-danger" role="alert">
		<form:errors path="error.*" />
	</div>


	<h1>Dummy Register</h1>
	<form action="complex"  method="post">
		<table>

                
			<tr>
				<td>Enter the StudentID</td>
				<td><input type="text" name="id" placeholder="ex:auto123">
				</td>
			</tr>

			<tr>
				<td>Enter the student name</td>
				<td><input type="text" name="studentName"
					placeholder="ex:suresh"></td>
			</tr>

			<tr>
				<td>Enter the studentAge</td>
				<td><input type="text" name="studentAge" placeholder="ex:25">
				</td>
			</tr>

			<tr>
				<td>Enter the User-name</td>
				<td><input type="text" name="UserName"
					placeholder="ex:suresh25"></td>
			</tr>

			<tr>
				<td>Enter the password</td>
				<td><input type="text" name="password" placeholder="ex:98mk@12">
				</td>
			</tr>


			<tr>
				
				<td><button>submit</button>
				</td>
			</tr>


		</table>
	</form>

</body>
</html>