<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="${linkEntradaServlet }" method=POST>
		Login: <input type="text" name="login"/></br>
		Senha: <input type="password" name="senha"/></br>
		<input type="submit" name="acao" value="Login"/>	
	</form>
	
</body>
</html>