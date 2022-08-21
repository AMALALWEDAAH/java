<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Omikuji</title>
         <link rel="stylesheet" href="css/main.css">
         <style>
           body{
          text-align: center;
          font-size: 30px;
           }
           div {

  border-radius: 5px;
  background-color:dodgerblue;
  padding: 20px;
  margin: 0% 30% ;
}
         </style>
    </head>
    <body>
     
        <h1> Here's your Omikuji </h1>
    <div >
         <p>In<c:out value="${num}"/> years,you will live in <c:out value="${city}"/> with <c:out value="${name}"/> as your roommate, <c:out value="${hobby}"/> for a living. the next time you see a <c:out value="${living_type}"/>, you will have good lock.Also, <c:out value="${Say}"/></p>
        </div>
        <a href="/"> Go Back </a>
        
     
      
    </body>
</html>

