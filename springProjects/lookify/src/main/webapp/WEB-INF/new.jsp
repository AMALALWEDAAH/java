<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<meta charset="UTF-8">
<title>Add Song</title>
</head>
<body>
<a href="/dashboard">Dashboard</a>
<form:form action="/songs/new" method="post" modelAttribute="song">
        <form:errors style="color:red;" path="title"/>
        <br>
        <form:errors style="color:red;" path="artist"/>
        <br>
        <form:errors style="color:red;" path="rating"/>
          
    <p>
        <form:label path="title">Title</form:label>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="artist">Artist</form:label>
        <form:input path="artist"/>
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:select path="rating">
        	<option value="1">1</option>
        	<option value="2">2</option>
        	<option value="3">3</option>
        	<option value="4">4</option>
        	<option value="5">5</option>
        	<option value="6">6</option>
        	<option value="7">7</option>
        	<option value="8">8</option>
        	<option value="9">9</option>
        	<option value="10">10</option>
        </form:select>
        
    </p>   
    <input type="submit" value="Add song"/>
</form:form>    
</body>
</html>