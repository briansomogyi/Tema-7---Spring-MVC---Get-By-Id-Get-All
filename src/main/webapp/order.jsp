<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order page</title>
</head>
<body>
	<h1>Single order page</h1>
	<p>
		Id is: <strong><c:out value="${order.id}" /></strong>
	</p>
	<p>
		Description is: <strong><c:out value="${order.description}" /></strong>
	</p>
	<p>
		Status is: <strong><c:out value="${order.status}" /></strong>
	</p>
</body>
</html>