
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


<c:forEach items="${list}" var="listClientes">

<form action="AdminCliente">

<label for="nombreCliente">Nombre</label>
<input type="text" name="nombreCliente" value="${listClientes.getNombreCliente()}" ><br><br>
<label for="direccionCliente">Direccion</label>
<input type="text" name="direccionCliente" value="${listClientes.getDireccionCliente()}"><br><br>
<label for="comunaCliente">Comuna</label>
<input type="text" name="comunaCliente" value="${listClientes.getComunaCliente()}"><br><br>
<label for="actividadCliente">Actividad</label>
<input type="text" name="actividadCliente" value="${listClientes.getActividadEconomica()}"><br><br>
<label for="contactoCliente">Contacto</label>
<input type="text" name="contactoCliente" value="${listClientes.getContactoCliente()}"><br><br>
<label for="mailCliente">Email</label>
<input type="email" name="mailCliente" value="${listClientes.getMailContactoCliente()}"><br><br>
<input type="hidden" name="idCliente" value="${listClientes.getIdCliente()}">
<input type="hidden" name="cliente" value="actualizar">
<input type="submit" value="Procesar">


</form>
</c:forEach>


</body>
</html>