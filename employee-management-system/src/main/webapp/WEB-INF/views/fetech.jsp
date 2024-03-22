<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.*" %>
	<%@page import="com.te.ems.entity.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border=1 cellpadding=5>
			<tr>
				<th>employeeId</th>
				<th>employeeAge</th>
				<th>employeeEmailId</th>
			</tr>
		 <%
			List<Employee> employees=(List<Employee>) request.getAttribute("fetech");
            for(Employee employee:employees)
            {
         %> 	
			    <tr>
					<td><%= employee.getEmployeeId()%></td>
					<td><%= employee.getEmployeeAge()%></td>
					<td><%= employee.getEmployeeEmailId()%></td>
		        </tr>
		   <%}%>
</table> 

</body>
</html>