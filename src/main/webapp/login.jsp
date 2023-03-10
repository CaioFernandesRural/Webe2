<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<form action="/trabe/LoginUsuario" method="post">
	  	<label for="login">Login:</label>
		<input type="text" name="login"/><br>
		<label for="senha">Senha</label>
		<input type="password" name="senha"/><br>
		<button type="submit">Enviar</button>
	</form>
</body>
</html>