<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
div{
	 display: flex;
  justify-content: space-between;
}
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
<meta charset="ISO-8859-1">
<title>Login & Registration</title>
</head>
<body>
<div>
<h1 style="color:purple;">Welcome, <c:out value="${user.userName}" />!</h1>
<a href="/logout">Logout!</a>
</div>
<div>
<p>Books from everyone's shelves:</p>
<a href="/books/new">+ Add a To My shelf!</a>
</div>
<br>
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author Name</th>
            <th>Posted By</th>
        </tr>
    </thead>
    <tbody>
          <c:forEach var="book" items="${books}">
         <!-- loop over all the books to show the details as in the wireframe! -->
         <tr>
              <td><c:out  value="${book.id}"></c:out></td>
            <td><a href="/home/${book.id}"><c:out  value="${book.title}"></c:out></a></td>
             <td><c:out  value="${book.author}"></c:out></td>
              <td><c:out  value="${book.user.userName}"></c:out></td>
        </tr>
         	
         </c:forEach>
    </tbody>
</table>
</body>
</html>