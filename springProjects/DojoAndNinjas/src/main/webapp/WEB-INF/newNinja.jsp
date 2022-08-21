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
<title>New Dojo</title>
</head>
<body>
<h1>New Dojo</h1>
<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
            <form:errors style="color:red;" path="dojo"/>
        <br>
        <form:errors style="color:red;" path="age"/>
        <br>
        <form:errors style="color:red;" path="first_name"/>
        <br>
        <form:errors style="color:red;" path="last_name"/>
          
    <p>
        <form:label path="last_name">Last Name:</form:label>
        <form:input path="last_name"/>
    </p>
    <p>
        <form:label path="first_name">First Name:</form:label>
        <form:input path="first_name"/>
    </p>
    <p>
        <form:label path="age">Age:</form:label>
        <form:input path="age"/>
    </p>
    <p>
        <form:label path="dojo">Dojo:</form:label>
        <form:select path="dojo">
        	<c:forEach var="i" items="${dojos}">
        	<form:option value="${i}">${i.name}</form:option>
        	 </c:forEach>
        </form:select>
        
    </p>   
    <input type="submit" value="Create"/>
</form:form>    
</body>
</html>