<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Confirmation</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
	</head>
	<body class="container">
		<h2>O nome de ${student.firstName} ${student.lastName} est� confirmado.</h2>
		<h3>Est� no pa�s ${student.country}</h3>
		<h3>Linguagem favorita � ${student.favoriteLanguage}</h3>
		<ul>
		<h3>O(s) sistema(s) operacional(is) do ${student.firstName} � (s�o): </h3>
			<c:forEach var="item" items="${student.operatingSystems}">
				<li>${item}</li>
			</c:forEach>
		</ul>
		<!-- <h3>O sistema operacional do ${student.firstName} � o ${student.operatingSystems}</h3> -->
	</body>
</html>