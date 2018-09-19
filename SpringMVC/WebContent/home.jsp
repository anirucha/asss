<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body>
	<h1>Welcome to Home Page</h1>
	<c:url var="myLogin" value="login.obj" />
	<form:form action="${myLogin}" modelAttribute="login">
	Login <form:input path="userName"/> <br>
	Password <form:input path="password"/>
	<input type="submit" value="LOGIN">
	</form:form>
</body>
</html>