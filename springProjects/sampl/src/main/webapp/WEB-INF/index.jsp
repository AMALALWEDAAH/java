<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<!-- <script type="text/javascript" src="/js/app.js"></script> -->
<meta charset="UTF-8">
 <title>Current Visit Count</title>
</head>
<body>
    
    <p>You Have visited <a href="/your_server"> http://your_server </a> and <a href="/your_server/seconed"> http://your_server/seconed </a> <c:out value="${countToShow+countToShow1}"/> Times</p>
    <form action="/your_server/counter/reset">
        <button>reset!</button>
    </form>
</body>
</head>