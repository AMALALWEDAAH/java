<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<h1>Poke Book</h1>
<table>
    <thead>
        <tr>
            <th>Expense</th>
            <th>Vendor</th>
            <th>Amount</th>
        </tr>
    </thead>
    <tbody>
          <c:forEach var="expense" items="${expenses}">
         <!-- loop over all the books to show the details as in the wireframe! -->
         <tr>
            <td><a href="/expenses/show/${expense.id}"><c:out  value="${expense.title}"></c:out></a></td>
            <td><c:out  value="${expense.vendor}"></c:out></td>
            <td><c:out  value="${expense.amount}"></c:out></td>
        </tr>
         	
         </c:forEach>
    </tbody>
</table>
<br/>
<h1>New Book</h1>
<form:form action="/expenses/new" method="post" modelAttribute="expense">
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors path="vendor"/>
        <form:textarea path="vendor"/>
    </p>
     <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:input path="description"/>
    </p>   
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors path="amount"/>
        <form:input path="amount"/>
    </p>   
    <input type="submit" value="Submit"/>
</form:form>    

</body>
</html>