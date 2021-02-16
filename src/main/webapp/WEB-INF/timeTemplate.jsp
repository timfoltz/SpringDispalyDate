<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/timeStyle.css">
<script type="text/javascript" src="js/timeScript.js"></script>
<meta charset="ISO-8859-1">
<title>Time</title>
</head>
<body>
	<h1><c:out value="${time}"></c:out></h1>
</body>
</html>