<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Orders page</title>
<style>
table, th, td {
	border: 1px solid black;
}

.my-table {
	width: 100%;
}
</style>
</head>
<body>
	<h1>Orders page</h1>
	<table class="my-table">
		<tr>
			<th>Id</th>
			<th>Description</th>
			<th>Status</th>
			<th>Details</th>
		</tr>
		<c:forEach var="order" items="${orders}">
			<tr>
				<td><c:out value="${order.id}" /></td>
				<td><c:out value="${order.description}" /></td>
				<td><c:out value="${order.status}" /></td>
				<td><a href="<c:url value=" /Tema7/order?id=${order.id}" />">Details</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>