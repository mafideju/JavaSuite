<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Customer Form</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
	</head>
	<body class="container">
		<form:form action="processForm" modelAttribute="customer" class="form">
			
			<form:input class="form-input" path="firstName" placeholder="Primeiro Nome *" />
			<form:errors path="firstName" cssClass="error" />

			<form:input class="form-input" path="lastName" placeholder="Último Nome" />
				
			<label for="freePasses">Tentativas: </label>
			<form:input class="form-input" path="freePasses" id="freePasses"/>
			<form:errors path="freePasses" cssClass="error" style="margin-bottom: 1rem;" />
				
			<label for="freePasses">CEP: </label>
			<form:input class="form-input" path="postalCode" id="postalCode"/>
			<form:errors path="postalCode" cssClass="error" style="margin-bottom: 1rem;" />
			
			<label for="courseCode">Código do Curso: </label>
			<form:input class="form-input" path="courseCode" id="postalCode"/>
			<form:errors path="courseCode" cssClass="error" style="margin-bottom: 1rem;" />
			
			<button class="button" type="submit">Enviar</button>
		</form:form>
	</body>
</html>