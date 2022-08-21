<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold</title>
    <style>
        .boxs{
            display: flex;
        }
        .box{
            margin: 2%;
            justify-content:space-evenly;
            flex: 1 25%;
            border: 2px solid black;
            text-align: center;
            font-size: 20px;
            padding: 5%;
        }
        #Ygold{
            border: 2px solid black;
            padding: auto 5%;
            font-size: 15px;
        }
        div#scroll {
            margin: 2%;
            border: 2px solid black;
            width: 90%;
            height: 200px;
            overflow-x: hidden;
            overflow-y:scroll;
            text-align:justify;
        }
        label {
            margin: 2%;
        }
    </style>
</head>
<body>
    <div class="boxs">
        <label for="ygold">Your Gold:</label>
        <div id="ygold">
            
            <p><c:out value="${gold}"/></p>
            
        </div>
    </div>
    <div class="boxs">
        <div class="box"> <p>Farm</p>
            <p>(earns 10-20 gold)</p>
            <form action="process_money" method="post">
                
                <input type="hidden" id="Farm" name="Farm" value="1487">
                <button name="farm">Find Gold!</button></form>
        </div>
        <div class="box"><p>Cave</p>
            <p>(earns 5-10 gold)</p>
            <form action="process_money" method="post">
                
                <input type="hidden" id="Cave" name="Cave" value="2487">
                <button name="cave">Find Gold!</button></form></div>
        <div class="box"><p>House</p>
            <p>(earns 2-5 gold)</p>
            <form action="process_money" method="post">
                
                <input type="hidden" id="House" name="House" value="3487">
                <button name="house">Find Gold!</button></form></div>
        <div class="box"><p>Casino!</p>
            <p>(earns 0-50 gold)</p>
            <form action="process_money" method="post">
                
                <input type="hidden" id="Casino" name="Casino" value="4487">
                <button name="quest">Find Gold!</button></form>
            </div>
    </div>
    <label for="activities">activities:</label>
        <div id="scroll">
            <c:forEach var="activity" items="${Activities}">
                <c:choose>
                    <c:when test="${not fn:contains(activity, '-') }">
                        <p style="color:green"><c:out  value="${activity}"></c:out></p>
                    </c:when>
                    <c:otherwise>
                        <p style="color:red"><c:out   value="${activity}"></c:out></p>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </div>
</body>
</html>