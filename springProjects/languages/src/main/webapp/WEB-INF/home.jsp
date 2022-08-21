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
.buttom{
	margin: 0% 40%;}
.top{
	margin: 0% 20%;}
p{
	display: flex;
  	justify-content: space-between;
}
</style>
</head>
<body>
<div class="top">
<h1>PokeBooks</h1>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
          <c:forEach var="language" items="${languages}">
         
         <tr>
            <td><a href="/languages/show/${language.id}"><c:out  value="${language.name}"></c:out></a></td>
            <td><c:out  value="${language.creator}"></c:out></td>
            <td><c:out  value="${language.version}"></c:out></td>
            <td><p><a href="/${language.id}/delete">delete</a>  <a href="/${language.id}/edit">edit</a></p></td>
        </tr>
         	
         </c:forEach>
    </tbody>
</table></div>
<div class="buttom">
<h2>Track an expense:</h2>

<form:form action="/languages/new" method="post" modelAttribute="language">
        <form:errors style="color:red;" path="name"/>
        <br>
        <form:errors style="color:red;" path="creator"/>
        <br>
        <form:errors style="color:red;" path="version"/>
          
    <p>
        <form:label path="name">Name</form:label>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="version">Version</form:label>
        <form:textarea path="version"/>
    </p>   
    <input type="submit" value="Submit"/>
</form:form>    
</div>
</body>
</html>