<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

input[type=submit]{
	width: 100%;
}
table {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

table td, table th {
  border: 1px solid #ddd;
  padding: 8px;
}
button{
	width: 100%;
}

table tr:nth-child(even){background-color: #f2f2f2;}

table tr:hover {background-color: #ddd;}

table th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color:gray;
  color: white;
}
</style>
<meta charset="UTF-8">
<title>House Honter</title>
</head>
<body>
    <h1>Welcome, House Hunter!</h1>
    <div class="form">
    <form:form action="/register" method="post" modelAttribute="newUser">
            <form:errors path="confirm" class="text-danger" />
            <form:errors path="password" class="text-danger" />
            <form:errors path="email" class="text-danger" />
            <form:errors path="userName" class="text-danger" />
            <table>
			    <thead>
			        <tr>
            <th colspan="2" style="text-align: center;">Register </th></tr>
			        
			        </thead>
			        <tr>
			       <td>
            <label>User Name:</label>
             </td>
              <td>
            <form:input path="userName"/>
        </td>
        </tr>
        <tr>
         <td>
            <label>Email:</label>
             </td>
              <td>
            <form:input path="email" />
             </td>
        
        </tr>
        <tr>
         <td>
            <label>Password:</label>
             </td> <td>
            <form:password path="password"/>
        </td>
        </tr>
        <tr>
        <td>
            <label>Confirm Password:</label>
             </td>
              <td>
            <form:password path="confirm"/>
         		</td>
        </tr>
        <tr>
        <td colspan="2" style="text-align: center;">
        <input type="submit" value="Register"/>
        </td>
        </tr>
        </table>
    </form:form></div>
    
    <div class="form">
    <form:form action="/login" method="post" modelAttribute="newLogin">
            <form:errors path="password"  />
            <form:errors path="email" />
             <table>
			    <thead>
			        <tr>
            <th colspan="2" style="text-align: center;">Log in </th></tr>
			        
			        </thead>
			        <tr>
			       <td>
      
            <label>Email:</label>
            </td>
            <td>
            <form:input path="email" />
              </td>
              </tr>
      <tr>
             <td>
            <label>Password:</label>
             </td> <td>
            <form:password path="password" />
             </td>
       </tr>
        <tr>
        <td colspan="2" style="text-align: center;">
        <input type="submit" value="Login"/>
         </td>
        </tr>
    </table>
    </form:form></div>
</body>
</html>

