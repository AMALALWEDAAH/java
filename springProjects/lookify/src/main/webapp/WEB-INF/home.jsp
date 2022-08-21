<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read Share</title>
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

.top{
	margin: 0% 10%;}
p{
	display: flex;
  	justify-content: space-between;
}
.bar{
	display: flex;
  	justify-content: space-between;
}
</style>
</head>
<body>
<div class="top">
<div class="bar">
	<a href="/songs/new">Add New</a>
	<a href="/search/topTen">Top Songs</a>
	<form action="/search" method="post">
      <input  type="search"
          placeholder="Search" name="desc" aria-label="Search">
      <button type="submit">Search Artists</button>
    </form>
	
</div>
 <hr>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Rating</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
       <c:forEach var="i" items="${result}">
               <tr>
                   <td><a href="/songs/${i.id}"><c:out value="${i.title}" /></a></td>
                   <td><c:out value="${i.rating}" /></td>
                   <td><a href="/${i.id}/delete">delete</a></td>
               </tr>
           </c:forEach>
       
          <c:forEach var="song" items="${songs}">
         
         <tr>
            <td><a href="/songs/${song.id}"><c:out  value="${song.title}"></c:out></a></td>
            <td><c:out  value="${song.rating}"></c:out></td>
            <td><a href="/${song.id}/delete">delete</a></td>
        </tr>
         	
         </c:forEach>
    </tbody>
</table></div>
</body>
</html>