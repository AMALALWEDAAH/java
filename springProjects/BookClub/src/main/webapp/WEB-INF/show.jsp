<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
<title>Read Share</title>
</head>
<body>
<div>
<h1> ${book.title}</h1>
<p ><a href="/home">Back to the shelves</a></p></div>
<p><span style="color:red">${book.user.userName}</span> read <span style="color:purple">${book.title}</span> by <span style="color:green">${book.author}</span></p>
<p> Here are ${book.user.userName}'s thoughts:</p>
<hr>
<p>${book.my_thoughts}</p>
              
 </body>
</html>