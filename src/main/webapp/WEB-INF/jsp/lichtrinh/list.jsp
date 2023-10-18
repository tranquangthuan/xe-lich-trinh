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
<title>Lich Trinh List</title>
</head>
<body>

	<div align="center">
		<a href="add">Add new Lich Trinh</a> <a
			href="${pageContext.request.contextPath}">Home</a>
		<div>
			<form action="${pageContext.request.contextPath}/lichtrinh/search"
				method="get">
				<input type="text" name="searchKey" value="${searchKey }"> 
				<input type="submit" value="Search">
			</form>
		</div>
		<table class="table table-hover table-striped">
			<thead>
				<tr>
					<th width="10%">Ma Xe</th>
					<th width="10%">bienSo</th>
					<th width="10%">tenTaiXe</th>
					<th width="10%">tenNhanXe</th>
					<th width="10%">maTuyenXe</th>
					<th width="10%">tenTuyen</th>
					<th width="10%">ngayXuatBen</th>
					<th width="10%">gioXuatBen</th>
					<th width="10%">soLuongHanhKhach</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ltr" items="${lichTrinhs}" varStatus="status">
					<tr>
						<td>${ltr.xe.maXe}</td>
						<td>${ltr.xe.bienSo}</td>
						<td>${ltr.tenTaiXe}</td>
						<td>${ltr.xe.nhaXe.tenNhanXe}</td>
						<td>${ltr.tuyenXe.maTuyenXe}</td>
						<td>${ltr.tuyenXe.tenTuyen}</td>
						<td>${ltr.id.ngayXuatBen}</td>
						<td>${ltr.id.gioXuatBen}</td>
						<td>${ltr.soLuongHanhKhach}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>