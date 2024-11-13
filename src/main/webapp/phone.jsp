<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Phone page</title>
</head>
<body>
	<h1>Single phone page</h1>
	<p>
		Id is: <strong><c:out value="${phone.id}" /></strong>
	</p>
	<p>
		Description is: <strong><c:out value="${phone.brand}" /></strong>
	</p>
</body>
</html>