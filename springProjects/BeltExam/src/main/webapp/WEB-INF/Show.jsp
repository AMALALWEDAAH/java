<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<style>
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
<title>Team Details</title>
</head>
<body>
<h1> ${team.teamName}</h1>
<p ><a href="/home">Dashboard</a></p>
<p>teamName: ${team.teamName}</p>
<p>gameDay: ${team.gameDay} </p>
<p>skillLevel:  ${team.skillLevel}</p>
<p>Players:  ${team.user.userName}</p>
<hr>
<h2>Add Player:</h2>
<form:form action="/home" method="post" modelAttribute="player">
     <table>
			        <tr>
			       <td>
      
            <form:label path="Player">Player Name:</form:label>
        <form:errors path="Player"/>
            </td>
            <td>
            <form:input path="Player"/>
              </td>
              </tr>
   <tr>
        <td colspan="2" style="text-align: center;">
       <input type="submit" value="Submit"/>
         </td>
        </tr>
    </table>
</form:form>  
<%--   <c:if test="${house.user.id == 'user_id'}">
 --%>      	          
<a href="/${team.id}/delete">Delete</a>
<br>
<a href="/home/${team.id}/edit">Edit</a>
<%--   </c:if>                
 --%></body>
</html>