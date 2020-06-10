<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Form</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
	</head>
	<body class="container">
		<form:form action="processForm" modelAttribute="student" class="form">
			
			<form:input class="form-input" path="firstName" placeholder="Primeiro Nome *" />
			<form:input class="form-input" path="lastName" placeholder="Último Nome" />
			
			<form:select class="form-select" path="country">
				<form:options items="${student.countryOptions}" />
			</form:select>
			
			<div>
				<form:radiobutton path="favoriteLanguage" value="Java" />Java
				<form:radiobutton path="favoriteLanguage" value="JavaScript" />JavaScript
				<form:radiobutton path="favoriteLanguage" value="C#" />C#
				<form:radiobutton path="favoriteLanguage" value="Python" />Python			
			</div>
			
			<div>
				<form:checkbox path="operatingSystems" value="Linux" id="linux" />
				<label for="linux">Linux</label>
				<form:checkbox path="operatingSystems" value="Mac OS" id="mac" />
				<label for="mac">Mac OS</label>
				<form:checkbox path="operatingSystems" value="Windows" id="windows" />
				<label for="windows">Windows</label>			
			</div>
				
			<button class="button" type="submit">Enviar</button>
		</form:form>
	</body>
</html>