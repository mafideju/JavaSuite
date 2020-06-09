<!DOCTYPE html>
<html>
	<head>
		<title>Spring Form</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
	</head>
	<body class="container">
		<form action="processShoutForm" method="GET" class="form">
			<input class="form-input" type="text" name="studentName" placeholder="Nome de Guerra" />
			<button class="button" type="submit">Enviar</button>
		</form>
	</body>
</html>