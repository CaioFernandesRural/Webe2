<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Usuário</title>
</head>
<body>
	<h1>Cadastre - se</h1>
	<form action="CadastroUsuario" method="POST">
		<label for="nome">Nome:</label>
		<input type="text" name="nome"/><br>
		<label for="matricula">Matrícula:</label>
		<input type="text" name="matricula" /><br>
		<label for="email">E-mail:</label>
		<input type="email" name="email" /><br>
		<label for="login">Login:</label>
		<input type="text" name="login" /><br>
		<label for="senha">Senha</label>
		<input type="password" name="senha" /><br>
		<button type="submit">Enviar</button>
	</form>
</body>
</html>