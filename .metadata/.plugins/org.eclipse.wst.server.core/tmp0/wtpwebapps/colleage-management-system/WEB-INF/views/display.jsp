<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.*" %>
	<%@page import="com.te.cms.entity.Student"%>
<%-- //<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
//<%@page isELIgnored="false"%> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Record</title>
</head>
<body>

	<h1>${head}</h1>

	<h2>Student Records</h2>

<% 
  List<Student>student=(List<Student>)request.getAttribute("list");

%>
   <%for(Student list: student){ %>
			    <tr>
					<td><%=list.getStudentId()%></td>
					<td><%=list.getStudentName() %></td>
					<td><%=list.getStudentAge() %></td>
		        </tr>
		        System.out.println("-----------------------");
      <%} %>
</body>
</html>