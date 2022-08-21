<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> 
	<span><b>Expense Details</b></span>
	<a href="/books" style="float:right">Go back</a>
	</p>
	<br>
<p>Expense Name: ${book.expense}</p>
<p>Expense Description: ${book.description}</p>
<p>Vendor: ${book.vendor}</p>
<p>Amount Spent: ${book.amount}</p>
</body>
</html>