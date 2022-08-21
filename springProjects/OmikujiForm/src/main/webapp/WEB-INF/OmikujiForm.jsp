<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
       
        <title>Omikuji</title> <link rel="stylesheet" href="css/main.css">
    </head>
    <body>
      
    <div >
      <form action="/omikuji" method="post">
        <h1> Send an Omikuji </h1>
        
        
         <label for="num">Pick any number from 5 to 25:</label>
          <select  name="num">
              <option value="5">5</option>
              <option value="10">10</option>
              <option value="15">15</option>
              <option value="20">20</option>
              <option value="25">25</option>
              
          </select>
        
          <label for="city">Enter the name of any city:</label>
          <input type="text" name="city">
        
          <label for="name">Enter the name of any real person:</label>
          <input type="text"  name="name">
       
          <label for="hobby">Enter Professional endeavor or hobby:</label>
          <input type="text"       name="hobby">
          
          
          <label for="living_type">Enter any type of living thing:</label>
          <input type="text"       name="living_type">
        
          
         <label for="Say">Say something nice to someone:</label>
          <textarea  name="Say"></textarea>
        
       
        
     <p>Send and show a friend</p>
          
        
       
        <button type="submit">Send</button>
        
       </form>
        </div>
      
    </body>
</html>

