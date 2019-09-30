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

    <!-- DashForge CSS -->
    <link rel="stylesheet" href="static/assets/css/dashforge.css">
    <link rel="stylesheet" href="static/assets/css/dashforge.profile.css">

    <script src="static/lib/jquery/jquery.min.js"></script>
    <script src="static/lib/bootstrap/js/bootstrap.bundle.min.js"></script>
     
</head>


<body class="page-profile">

    <tiles:insertAttribute name="sidenavigation" ignore="true" />
	
    <div class="content ht-100v pd-0">
      <tiles:insertAttribute name="header" ignore="true" />
	

      <tiles:insertAttribute name="mainbody" ignore="true" />
	
    </div><!-- content -->

    <script src="static/lib/feather-icons/feather.min.js"></script>
    <script src="static/lib/perfect-scrollbar/perfect-scrollbar.min.js"></script>

       <script src="static/assets/js/dashforge.js"></script>
    <script src="static/assets/js/dashforge.aside.js"></script>
<script src="static/lib/js-cookie/js.cookie.js"></script>
    <!-- append theme customizer -->
        <link href="http://themepixels.me/dashforge/assets/css/skin.gradient1.css" rel="stylesheet"> 

  </body>

</html>