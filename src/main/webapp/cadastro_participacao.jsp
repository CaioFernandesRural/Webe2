<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Participacao</title>
</head>
<body>
	<h1>Dados da Participa��o</h1>
	<form action="CadastroParticipacao" method="POST">
	  	<input type="file" id="documento" name="documento">
		<label for="numero">N�mero do processo:</label>
		<input type="text" name="numero"/></br>
		<label for="dataInicio">Data de in�cio:</label>
		<input type="date" name="dataInicio" /></br>
		<label for="ch">Carga Hor�ria Semanal:</label>
		<input type="number" name="ch" /></br>
		<label for="atribuicoes">Descreva suas atribui��es:</label>
		<input type="text" name="atribuicoes" /></br>
		<button type="submit">Enviar</button>
	</form>
</body>
</html>