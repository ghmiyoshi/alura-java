<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- 		Scriplet -->
	<%-- 	<% String nomeEmpresa = (String) request.getAttribute("empresa"); %> --%>
	<%-- 	<%= nomeEmpresa %> --%>
	<%-- 	<% out.println(nomeEmpresa); %> --%>

	<c:if test="${not empty empresa}">
		<h3>Empresa ${empresa.nome } data de abertura ${empresa.data }
			cadastrada com sucesso!</h3>
	</c:if>

	<c:if test="${empty empresa.nome}">
		<h3>Nenhuma empresa cadastrada!</h3>
	</c:if>

</body>
</html>