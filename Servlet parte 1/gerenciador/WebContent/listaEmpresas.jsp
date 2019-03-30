<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	
	<ul class="list-group" style="width: 300px">
		<li class="list-group-item active" align="center"><b>Lista de empresas</b></li>
		<c:forEach var="empresa" items="${empresas}">
			<li class="list-group-item"><strong>${empresa.nome }</strong> - <fmt:formatDate value="${empresa.data }" pattern="dd/MM/yyyy" />
			<a href="/gerenciador/mostraEmpresa?id=${empresa.id }">Editar</a>
			<a href="/gerenciador/removeEmpresa?id=${empresa.id }">Remover</a></li>
		</c:forEach>
	</ul>

</body>
</html>