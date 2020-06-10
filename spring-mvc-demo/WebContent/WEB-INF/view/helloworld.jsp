<!DOCTYPE html>
<html>
	<head>
		<title>Confirm ??</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
	</head>
	<body class="container">
		<h1 class="title">Página de Confirmação</h1>
		<section class="content">
			<div class="content__name">
				<p>Nome do Aluno: <b>${param.studentName}</b></p>
			</div>
			<div class="content__message">
				<p>${message}</p>
				<p>${pageContext.request.contextPath}</p>
			</div>
		</section>
	</body>
</html>