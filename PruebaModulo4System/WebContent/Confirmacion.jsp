<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmacion</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body >
<%    

if(session.getAttribute("sessionLogin") == null){
	
	response.sendRedirect("Intranet.jsp");
	
}

%>

<div class="confirmacion">
<h1>Operacion Realizada ok</h1>
</div>

</body>
</html>