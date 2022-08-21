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
            <th>Expense</th>
            <th>vendor</th>
            <th>Amount</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
          <c:forEach var="book" items="${books}">
         <!-- loop over all the books to show the details as in the wireframe! -->
         <tr>
            <td><a href="/books/show/${book.id}"><c:out  value="${book.expense}"></c:out></a></td>
            <td><c:out  value="${book.vendor}"></c:out></td>
            <td>$<c:out  value="${book.amount}"></c:out></td>
            <td><p><a href="/${book.id}/edit">edit</a>  <a href="/${book.id}/delete"><button value="delete" style="background-color: red; color:white;">delete</button></a></p></td>
        </tr>
         	
         </c:forEach>
    </tbody>
</table></div>
<div class="buttom">
<h2>Track an expense:</h2>

<form:form action="/books/new" method="post" modelAttribute="book">
        <form:errors style="color:red;" path="expense"/>
        <br>
        <form:errors style="color:red;" path="vendor"/>
        <br>
        <form:errors style="color:red;" path="description"/>
        <br>
        <form:errors style="color:red;" path="amount"/>     
    <p>
        <form:label path="expense">Expense</form:label>
        <form:input path="expense"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:input path="vendor"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:textarea path="description"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        <form:input type="number" path="amount"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    
</div>
</body>
</html>