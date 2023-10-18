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
		<form:form action="${pageContext.request.contextPath}/xe/save"
			method="post" modelAttribute="xeForm">
			<table>
				<tr>
					<td><form:label path="hangSanXuat">hangSanXuat</form:label></td>
					<td><form:input path="hangSanXuat" /></td>
					<td><form:errors path="hangSanXuat" /></td>
				</tr>
				<tr>
					<td><form:label path="loaiXe.maLoaiXe">maLoaiXe</form:label></td>
					<td><form:select path="loaiXe.maLoaiXe" items="${maLoaiXes}"
							itemValue="maLoaiXe" itemLabel="moTa" /></td>
					<td><form:errors path="loaiXe.maLoaiXe" /></td>
				</tr>
				<tr>
					<td><form:label path="bienSo">bienSo</form:label></td>
					<td><form:input path="bienSo" /></td>
					<td><form:errors path="bienSo" /></td>
				</tr>
				<tr>
					<td><form:label path="hanKiemDInh">hanKiemDInh</form:label></td>
					<td><form:input  type="date" path="hanKiemDInh" /></td>
					<td><form:errors path="hanKiemDInh" /></td>
				</tr>
				<tr>
					<td><form:label path="nhaXe.maNhaXe">maNhaXe</form:label></td>
					<td><form:select path="nhaXe.maNhaXe" items="${maNhaXes}"
							itemValue="maNhaXe" itemLabel="tenNhanXe" /></td>
					<td><form:errors path="nhaXe.maNhaXe" /></td>
				</tr>
				<tr>
					<td></td>
					<td><form:button value="Add">Add</form:button></td>
				</tr>
				<form:hidden path="maXe" />
			</table>
		</form:form>
	</div>
</body>
</html>