<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<link href="<c:url value="/css/style.css" />" rel="stylesheet" />
</head>
<body>
	<form action="createuser" method="POST">
		<input type="text" name="firstName" />
		<input type="text" name="lastName" />
		<input type="submit" value="Create User" />
	</form>
</body>
</html>