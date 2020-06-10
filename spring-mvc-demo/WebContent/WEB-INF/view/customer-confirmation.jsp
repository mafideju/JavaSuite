<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Customer Confirmation</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
	</head>
	<body class="container">
		<h2>O nome de ${customer.firstName} ${customer.lastName} está confirmado com ${customer.freePasses} 
		tentativas liberadas.</h2>
		<h2>
		 	O CEP para contato é ${customer.postalCode}. O curso escolhido é o ${customer.courseCode}.
		</h2>
	</body>
</html>