<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>

    <!-- <link rel="stylesheet" type="text/css" href="./style.css" /> -->
   <!--  <script type="module" src="/index.js"></script> -->
 <style>
         #map {
    height: 100%;
  }
  
  /* 
   * Optional: Makes the sample page fill the window. 
   */
  html,
  body {
    height: 50%;
    margin: 0;
    padding: 0;
  }
    </style>
</head>
<body>
<p> 
	<span><b>Expense Details</b></span>
	<a href="/languages" style="float:right">Go back</a>
	</p>
	<br>
<p>${language.name}</p>
<p>${language.creator}</p>
<p>${language.version}</p>

<a href="/${language.id}/delete">delete</a> 
 <br>
 <a href="/${language.id}/edit">edit</a>
 
 <hr>
 <div id="map"></div>

    <!-- 
     The `defer` attribute causes the callback to execute after the full HTML
     document has been parsed. For non-blocking uses, avoiding race conditions,
     and consistent behavior across browsers, consider loading using Promises
     with https://www.npmjs.com/package/@googlemaps/js-api-loader.
    -->
    <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB5wZZXW-uvHCALhC9KNpJCYA2Fk_uRnWM&callback=initMap&v=weekly"
      defer
    ></script>
    <script>
        let map;

        function initMap() {
        map = new google.maps.Map(document.getElementById("map"), {
            center: { lat: -34.397, lng: 150.644 },
            zoom: 8,
        });
        }

window.initMap = initMap;
    </script>
</body>
</html>