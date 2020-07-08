<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>	
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion Solicitudes</title>
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
<h1>Maestro de Solicitudes</h1>

</header>
<h2>Mis Solicitudes Activas</h2>


<form action="AdminSolicitud2" method="get">
<input type="hidden" name="solicitud" value="misSolicitudes">
<input type="submit" value="Solicitudes Activas">
</form>



<table>

<tr>

<th>Actualizar Estado</th>
<th>ID</th>
<th>Cliente</th>
<th>Direccion</th>
<th>Comuna</th>
<th>Fecha Solicitud</th>
<th>Fecha Visita</th>


</tr>





<c:forEach items="${miSolicitudes}" var="solicitud">

<tr>

<th>
<form action="AdminSolicitud2">
<input type="hidden" name="solicitud" value="finalizaSolicitud">
<input type="hidden" name="actualizarEstado" value="${solicitud.getIdSolicitud()}">
<input type="submit" value="Procesar Solicitud">
</form>

 </th>
<th>${solicitud.getIdSolicitud() } </th>
<th>${solicitud.getIdCliente() } </th>
<th>${solicitud.getDireccionSolicitud() } </th>
<th>${solicitud.getComunaSolicitud() } </th>
<th>${solicitud.getFechaSolicitud() } </th>
<th>${solicitud.getFechaVisita() } </th>

</tr>





</c:forEach>




</table>


</body>
</html>