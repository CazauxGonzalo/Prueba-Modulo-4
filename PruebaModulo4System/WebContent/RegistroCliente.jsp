<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion Clientes</title>
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

<h2>Registro de Cliente</h2>

<form action="AdminCliente" method="get">

<label for="rutCliente">Rut</label>
<input type="text" name="rutCliente"><br><br>
<label for="nombreCliente">Nombre</label>
<input type="text" name="nombreCliente"><br><br>
<label for="direccionCliente">Direccion</label>
<input type="text" name="direccionCliente"><br><br>
<label for="comunaCliente">Comuna</label>
<input type="text" name="comunaCliente"><br><br>
<label for="actividadCliente">Actividad</label>
<input type="text" name="actividadCliente"><br><br>
<label for="contactoCliente">Contacto</label>
<input type="text" name="contactoCliente"><br><br>
<label for="mailCliente">Email</label>
<input type="email" name="mailCliente"><br><br>
<input type="hidden" name="cliente" value="registrar">
<input type="submit" value="Procesar">


</form>

</body>
</html>