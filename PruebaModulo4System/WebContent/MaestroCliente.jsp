<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clientes</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>
<%    

if(session.getAttribute("sessionLogin") == null){
	
	response.sendRedirect("Intranet.jsp");
	
}

%>

<header class="allHeader">

<div class="cerrarsession">
<form action="AdminLogout" method="get">
<input type="submit" value="Cerrar Sesión">
</form>
</div>
<h1>Maestro de Clientes</h1>

</header>

<div class="enlaces">

<a href="RegistroCliente.jsp">Registro Cliente</a><br><br>
<a href="ListadoClienteRut.jsp">Listado Cliente</a><br><br>
<a href="ActualizarCliente.jsp">Actualizar Cliente</a><br><br>
 
 </div>

</body>
</html>