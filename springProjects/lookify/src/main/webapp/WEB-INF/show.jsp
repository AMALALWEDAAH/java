<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
	padding:0% 20%;
}
p{
	display: flex;
  	justify-content: space-between;
  	margin: 10% 0%
  	
}
</style>
<meta charset="UTF-8">
<title>Details</title>
</head>
<body>

<a href="/dashboard" style=" margin: 0% 0% 0% 100%;">Dashboard</a>

	<br>
<p><span>Title:</span><span>${song.title}</span></p>
<p><span>Artist:</span><span>${song.artist}</span></p>
<p><span>Rating:</span><span>${song.rating}</span></p>

<a href="/${song.id}/delete">delete</a> 

</body>
</html>