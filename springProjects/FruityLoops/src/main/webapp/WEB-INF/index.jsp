<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        h1{
			text-align:left;
        	color:pink;
        }
        div{
        	margin: 20% 20%;
        }
        table {
            font-size: medium;
        	border-collapse: collapse;
	        font-family: arial, sans-serif;
	        border: 20px solid pink;
	        text-align: center;
	        width: 100%;
       
        }
        th, td {
        	
  			border-bottom: 1px solid pink;
		}
        
        
    </style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div>
<h1>Fruit Store</h1>
    <table>
            <tr>
                <th><p> Name</p></th>
                <th><p>Price</p></th>
  
            </tr>
    <c:forEach var="fruit" items="${fruits}">
         <tr>
         <td><p><c:out value="${fruit.name}"></c:out></p></td>
         <td><p><c:out value="${fruit.price}"></c:out></p></td>
         </tr>
    </c:forEach>
     </table></div>
</body>
</html>