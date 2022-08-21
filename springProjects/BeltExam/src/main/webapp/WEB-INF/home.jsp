<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
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
<meta charset="ISO-8859-1">
<title> Kickball League Dashboard</title>
</head>
<body>
<h1>Welcome, <c:out value="${user.userName}" />!</h1>
<a href="/logout">logout</a>
<table>
    <thead>
        <tr>
            <th>Team Name</th>
            <th>Skill Level(1-5)</th>
            <th>Players</th>
            <th>Game Day</th>
        </tr>
    </thead>
    <tbody>
          <c:forEach var="team" items="${teams}">
         <!-- loop over all the books to show the details as in the wireframe! -->
         <tr>
            <td><a href="/home/${team.id}"><c:out  value="${team.teamName}"></c:out></a></td>
             <td><c:out  value="${team.skillLevel}"></c:out></td>
              <td>9/9</td>
              <td><c:out  value="${team.gameDay}"></c:out></td>
        </tr>
         	
         </c:forEach>
    </tbody>
</table>
         <br/>
         <button><a href="/home/new">Create New Team</a></button>
</body>
</html>