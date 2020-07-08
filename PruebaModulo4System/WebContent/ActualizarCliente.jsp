<%@page import="javax.tools.DocumentationTool"%>
<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion Cliente</title>
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

<h2>Actualizar Cliente</h2>

<form action="AdminCliente" method="get">

<label>Rut Cliente</label>
<input type="text" name="rutCliente"><br><br>
<input type="submit" value="Buscar">
<input type="hidden" name="cliente" value="buscarRutCliente">
<input type="hidden" name="clienteActualizar" value="ClienteBuscarActualizar">

</form>



</body>
</html>