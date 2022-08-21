<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<style>
.buttom{
	margin: 0% 35%;}

p{
	display: flex;
  	justify-content: space-between;
}
</style>
<meta charset="UTF-8">
<title>Edit MyTask</title>
</head>
<body>
<div class="buttom">
	<p> 
	<span><b>Edit Expense</b></span>
	<div><a href="/languages" style="float:right">Go back</a><a href="/${language.id}/delete">delete</a> </div>
	</p>
	<br>
<form:form action="/${language.id}/update" method="post" modelAttribute="language">
    
    <input type="hidden" name="_method" value="put">
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