<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-3.6.4.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="xe/add">Add Xe</a></li>
				<li class="nav-item"><a class="nav-link" href="xe/list">List All Xe</a></li>
				<li class="nav-item"><a class="nav-link" href="xe/tien">Tong Tien Theo Ma xe</a></li>
				<li class="nav-item"><a class="nav-link" href="lichtrinh/add">Add Lich Trinh Xe</a></li>
				<li class="nav-item"><a class="nav-link" href="lichtrinh/list">List All Lich Trinh</a></li>
			</ul>
		</div>
	</nav>
</body>
</html>
