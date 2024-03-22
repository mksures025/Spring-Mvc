<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<fieldset>
<form action="register" method="post">   
<table border="2" >
       <tr>
       <td>Enter Employee id</td>
       <td><input type="text" name="empId" placeholder="example TY001"></td>
       </tr>
       <tr>
       <td>Enter Employee age</td>
       <td><input type="text" name="empAge" placeholder="example 72"></td>
       </tr>
       <tr>
       <td>Enter Employee email id:</td>
       <td><input type="email" name="empEmail" placeholder="emaple abc@gmail.com"></td>
       </tr>
       <tr>
       <td>Enter password</td>
       <td><input type="password" name="password" placeholder="example yyppooo"></td>
       </tr>
       <td></td>
       <td><button type="submit">Register</button></td>
       </tr>
   </table>
   </form>
   </fieldset>
   
</body>
</html>