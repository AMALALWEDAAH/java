<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<meta charset="UTF-8">
<title>Create New Team</title>
</head>
<body>
<div>
<h1>Add a book to Your Shelf!</h1>
<p ><a href="/home">Back to the shelves</a></p></div>
<form:form action="/home" method="post" modelAttribute="book">
  
      
            <form:label path="title">Title:</form:label>
        <form:errors path="title"/>
 
            <form:input path="title"/>

      
            <form:label path="author">Author:</form:label>
        <form:errors path="author"/>

            <form:input path="author"/>

              <form:label path="my_thoughts">My thoughts:</form:label>
        <form:errors path="my_thoughts"/>
        <form:input path="my_thoughts"/>

    <input type="submit" value="Create"/>
</form:form>    
</body>
</html>