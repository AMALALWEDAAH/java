<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<style>
div{
 border: 5px solid black;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> 
	<span><b>Top Ten Song:</b></span>
	<a href="/languages" style="float:right">Go back</a>
	</p>
	<br>
	<div>
		
		<c:forEach var="song" items="${songs}">
         
        <p><c:out  value="${song.rating}"></c:out> - <a href="/songs/${song.id}"><c:out  value="${song.title}"></c:out></a> - <c:out  value="${song.artist}"></c:out></p>
           
            
         	
         </c:forEach>
		
	</div>
</body>
</html>