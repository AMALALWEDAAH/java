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

.top{
	margin: 0% 10%;}
p{
	display: flex;
  	justify-content: space-between;
}
.bar{
	display: flex;
  	justify-content: space-between;
}
</style>
</head>
<body>
<h1>Burbank Location Ninjas</h1>
 <hr>
<table>
    <thead>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
        </tr>
    </thead>
    <tbody>
       
          <c:forEach var="dojo" items="${dojo.ninjas}">
         
         <tr>
            <td><c:out  value="${dojo.first_name}"></c:out></td>
            <td><c:out  value="${dojo.last_name}"></c:out></td>
            <td><c:out  value="${dojo.age}"></c:out></td>
        </tr>
         	
         </c:forEach>
    </tbody>
</table>
</body>
</html>