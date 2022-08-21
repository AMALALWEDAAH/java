<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
</head>
<body>
<h1>All Books</h1>
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Language</th>
            <th>Number of Pages</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
          <c:forEach var="book" items="${books}">
         <!-- loop over all the books to show the details as in the wireframe! -->
         <tr>
            <td><c:out  value="${book.id}"></c:out></td>
            <td><a href="/books/show/${book.id}"><c:out  value="${book.title}"></c:out></a></td>
            <td><c:out  value="${book.language}"></c:out></td>
            <td><c:out  value="${book.numberOfPages}"></c:out></td>
            <td><a href="/${book.id}/edit">edit</a>|<a href="/${book.id}/delete">delete</a></td>
        </tr>
         	
         </c:forEach>
    </tbody>
</table>
</body>
</html>