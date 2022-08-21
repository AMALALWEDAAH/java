<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Customer Name:<c:out value="${name1}"/></h1>
<p>Item name: <c:out value="${itemName1}"/></p>
<p>Price:$ <c:out value="${price1}"/></p>
<p>Description: <c:out value="${description1}"/></p>
<p>Vendor: <c:out value="${vendor1}"/></p>
</body>
</html>