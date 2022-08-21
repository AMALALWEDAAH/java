<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

input[type=submit],input[type=text]{
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
<title>Create New Team</title>
</head>
<body>
<h1>New Team</h1>
<p ><a href="/home">Back to Dashboard</a></p>
<form:form action="/home" method="post" modelAttribute="team">
     <table>
			        <tr>
			       <td>
      
            <form:label path="teamName">Team Name:</form:label>
        <form:errors path="teamName"/>
            </td>
            <td>
            <form:input path="teamName"/>
              </td>
              </tr>
              <tr>
			       <td>
      
            <form:label path="gameDay">Game Day:</form:label>
        <form:errors path="gameDay"/>
            </td>
            <td>
            <form:input path="gameDay"/>
              </td>
              </tr>
      <tr>
             <td>
              <form:label path="skillLevel">Skill Level:</form:label>
        <form:errors path="skillLevel"/>
             </td> <td>
            <form:input path="skillLevel"/>
             </td>
       </tr>
        <tr>
        <td colspan="2" style="text-align: center;">
       <input type="submit" value="Submit"/>
         </td>
        </tr>
    </table>
</form:form>    

</body>
</html>