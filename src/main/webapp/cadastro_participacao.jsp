<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Participacao</title>
</head>
<body>
	<h1>Dados da Participação</h1>
	<form action="CadastroParticipacao" method="POST">
	  	<input type="file" id="documento" name="documento">
		<label for="numero">Número do processo:</label>
		<input type="text" name="numero"/></br>
		<label for="dataInicio">Data de início:</label>
		<input type="date" name="dataInicio" /></br>
		<label for="ch">Carga Horária Semanal:</label>
		<input type="number" name="ch" /></br>
		<label for="atribuicoes">Descreva suas atribuições:</label>
		<input type="text" name="atribuicoes" /></br>
		<button type="submit">Enviar</button>
	</form>
</body>
</html>