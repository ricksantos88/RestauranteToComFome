<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Área Restrita - Restaurante Tô Com Fome</title>
	</head>
	<body>
		<sec:ifLoggedIn>
			<h3>Olá ${usuario}</h3>
		</sec:ifLoggedIn>
		<a href="/RestauranteToComFome/j_spring_security_logout">Sair</a>
	</body>
</html>
