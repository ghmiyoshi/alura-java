<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novaEmpresa" var="linkServletEmpresa" />
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
	<form action="${linkServletEmpresa}" method="POST">
		<div class="form-group">
			<label for="InputNome">Nome da Empresa</label> 
			<input type="text" name="nome" class="form-control" id="InputNome" style="width: 300px">
		</div>
		
		<div class="form-group">
			<label for="InputData">Data Abertura</label> 
			<input type="text" name="data" class="form-control" id="InputData" style="width: 300px">
		</div>
		
		<button type="submit" class="btn btn-primary" name="acao" value="NovaEmpresa">Enviar</button>
	</form>
</body>
</html>