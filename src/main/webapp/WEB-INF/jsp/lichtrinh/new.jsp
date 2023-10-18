<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>
	<div align="center">
		<a href="${pageContext.request.contextPath}">Home</a>
		<form:form action="${pageContext.request.contextPath}/lichtrinh/save"
			method="post" modelAttribute="lichTrinhForm">
			<table>
				<tr>
					<td><form:label path="id.maXe">Ma Xe</form:label></td>
					<td><form:select path="id.maXe" items="${xes}"
							itemValue="maXe" itemLabel="maXe" /></td>
					<td><form:errors path="id.maXe" /></td>
				</tr>
				<tr>
					<td><form:label path="tenTaiXe">tenTaiXe</form:label></td>
					<td><form:input path="tenTaiXe" /></td>
					<td><form:errors path="tenTaiXe" /></td>
				</tr>
				<tr>
					<td><form:label path="tuyenXe.maTuyenXe">Ma tuyen Xe</form:label></td>
					<td><form:select path="tuyenXe.maTuyenXe" items="${tuyenXes}"
							itemValue="maTuyenXe" itemLabel="tenTuyen" /></td>
					<td><form:errors path="tuyenXe.maTuyenXe" /></td>
				</tr>
				<tr>
					<td><form:label path="id.ngayXuatBen">ngay Xuat Ben</form:label></td>
					<td><form:input type="date" path="id.ngayXuatBen" /></td>
					<td><form:errors path="id.ngayXuatBen" /></td>
				</tr>
				<tr>
					<td><form:label path="id.gioXuatBen">gio Xuat Ben</form:label></td>
					<td><form:input type="time" path="id.gioXuatBen" /></td>
					<td><form:errors path="id.gioXuatBen" /></td>
				</tr>
				<tr>
					<td><form:label path="soLuongHanhKhach">soLuongHanhKhach</form:label></td>
					<td><form:input path="soLuongHanhKhach" /></td>
					<td><form:errors path="soLuongHanhKhach" /></td>
				</tr>
				<tr>
					<td></td>
					<td><form:button value="Add">Add</form:button></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>