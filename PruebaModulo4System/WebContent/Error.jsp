<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>

<%    

if(session.getAttribute("sessionLogin") == null){
	
	response.sendRedirect("Intranet.jsp");
	
}

%>

<div class="error">
<h1>No se ha podido completar la operacion</h1>

<h3>Intentalo Nuevamente</h3>

</div>

</body>
</html>