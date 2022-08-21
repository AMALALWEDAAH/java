<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body{
        background-color: gray;
    }
</style>
</head>
<body>
<p>You Have visited <a>http://your_server</a><c:out value="${count}"/>Times</p>

</body>
</html>