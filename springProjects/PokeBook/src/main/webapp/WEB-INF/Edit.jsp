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
	<a href="/books" style="float:right">Go back</a>
	</p>
	<br>
<form:form action="/${book.id}/update" method="post" modelAttribute="book">
    
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="expense">expense</form:label>
        <form:errors path="expense"/>
        <form:input path="expense" value="${book.expense}"/>
    </p>
    <p>
        <form:label path="vendor">vendor</form:label>
        <form:errors path="vendor"/>
        <form:textarea path="vendor" value="${book.vendor}"/>
    </p>
    <p>
        <form:label path="description">description</form:label>
        <form:errors path="description"/>
        <form:input path="description" value="${book.description}"/>
    </p>
    <p>
        <form:label path="amount">amount</form:label>
        <form:errors path="amount"/>     
        <form:input  path="amount" value="${book.amount}"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    
</div>
</body>
</html>