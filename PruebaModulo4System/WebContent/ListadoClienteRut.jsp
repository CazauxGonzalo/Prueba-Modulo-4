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
<h2>Listado de Clientes</h2>

<form action="AdminCliente" method="get">
<input type="hidden" name="cliente" value="listartodos">
<input type="submit" value="Listar Todos">

</form>

<form action="AdminCliente" method="get">
<input type="hidden" name="clienteActualizar" value="ClienteBuscarlistar">
<input type="hidden" name="cliente" value="buscarRutCliente">
<label for="rutCliente">Ingrese un RUT</label>
<input type="text" name="rutCliente">
<input type="submit" value="Listar por Rut">

</form>


<table>

<tr>

<th>Codigo Cliente</th>
<th>Rut</th>
<th>Nombre</th>
<th>Direccion</th>
<th>Comuna</th>
<th>Actividad Economica</th>
<th>Contacto</th>
<th>Mail Contacto</th>

</tr>


<c:forEach items="${listadoClientes}" var="customer" >


<tr>

<th>${customer.getIdCliente()}</th>
<th>${customer.getRutCliente()}</th>
<th>${customer.getNombreCliente()}</th>
<th>${customer.getDireccionCliente()}</th>
<th>${customer.getComunaCliente()}</th>
<th>${customer.getActividadEconomica()}</th>
<th>${customer.getContactoCliente()}</th>
<th>${customer.getMailContactoCliente()}</th>


</tr>



</c:forEach>


</table>


</body>
</html>