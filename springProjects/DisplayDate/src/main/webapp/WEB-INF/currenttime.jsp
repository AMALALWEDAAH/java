<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app1.js"></script>
<meta charset="UTF-8">
<title>Time</title>
</head>
<body>
<p id="green"><c:out value="${time}"></c:out></p>
</body>
</html>