<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/alteraEmpresa" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Última versão CSS compilada e minificada -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkEntradaServlet}" method="POST">
		<div class="form-group">
			<label for="InputNome">Nome da Empresa</label> 
			<input type="text" name="nome" value="${empresa.nome }" class="form-control" id="InputNome" style="width: 300px">
		</div>
		
		<div class="form-group">
			<label for="InputData">Data Abertura</label> 
			<input type="text" name="data" value="<fmt:formatDate value="${empresa.data}" pattern="dd/MM/yyyy"/>" class="form-control" id="InputData" style="width: 300px">
		</div>
		
		<div class="form-group">
			<input type="hidden" name="id" value="${empresa.id }" class="form-control" id="InputId" style="width: 300px">
		</div>
		
		<button type="submit" class="btn btn-primary" name="acao" value="AlteraEmpresa">Enviar</button>
	</form>
</body>
</html>