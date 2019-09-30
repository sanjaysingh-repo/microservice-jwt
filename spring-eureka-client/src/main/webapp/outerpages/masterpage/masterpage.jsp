<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
            <c:set var="context" value="${pageContext.request.contextPath}" scope="request" />
<html lang="en">
<head>
   
	<!-- Page Title Here -->
    <title><tiles:insertAttribute name="title" ignore="true"></tiles:insertAttribute></title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Meta -->
    <meta name="description" content="Responsive Bootstrap 4 Dashboard Template">
    <meta name="author" content="ThemePixels">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="static/assets/img/favicon.png">

    
    <!-- vendor css -->
    <link href="static/lib/%40fortawesome/fontawesome-free/css/all.min.css" rel="stylesheet">
    <link href="static/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
	 <script src="static/lib/jquery/jquery.min.js"></script>
    <script src="static/lib/bootstrap/js/bootstrap.bundle.min.js"></script>
   
    <!-- DashForge CSS -->
    <link rel="stylesheet" href="static/assets/css/dashforge.css">
    <link rel="stylesheet" href="static/assets/css/dashforge.auth.css">
</head>

<body>
		
	<tiles:insertAttribute name="header" ignore="true" />
			
	<tiles:insertAttribute name="mainbody" ignore="true" />
			
	
	<script src="static/lib/feather-icons/feather.min.js"></script>
    <script src="static/lib/perfect-scrollbar/perfect-scrollbar.min.js"></script>

    
    <!-- append theme customizer -->
    <script src="static/lib/js-cookie/js.cookie.js"></script>
    <script src="static/assets/js/dashforge.settings.js"></script>
    

</body>
</html>