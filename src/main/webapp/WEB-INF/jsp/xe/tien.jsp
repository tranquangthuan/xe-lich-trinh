<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-3.6.4.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<meta charset="ISO-8859-1">
<title>List Xe</title>
</head>
<body>

	<div align="center">
		<a href="add">Add new Xe</a> <a
			href="${pageContext.request.contextPath}">Home</a>
		<table class="table table-hover table-striped">
			<thead>
				<tr>
					<th width="10%">Ma Xe</th>
					<th width="10%">Tong Tien</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="x" items="${tiens}" varStatus="status">
					<tr>
						<td>${x.maXe}</td>
						<td>${x.tongTien}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>