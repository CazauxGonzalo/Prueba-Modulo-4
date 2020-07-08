<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion Solicitud</title>
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

<h2>Listar Solicitudes</h2>


<form action="AdminSolicitud2" method="get">
<input type="hidden" name="solicitud" value="listartodos">
<input type="submit" value="Listar Todos">
</form>

<table>

<tr>

<th>ID</th>
<th>Cliente</th>
<th>Direccion</th>
<th>Comuna</th>
<th>Fecha Solicitud</th>
<th>Estado</th>
<th>Pago</th>
<th>Profesional</th>
<th>Fecha Visita</th>


</tr>





<c:forEach items="${listadoSolicitudes}" var="solicitud" >


<tr>

<th>${solicitud.getIdSolicitud()}</th>
<th>${solicitud.getIdCliente()}</th>
<th>${solicitud.getDireccionSolicitud()}</th>
<th>${solicitud.getComunaSolicitud()}</th>
<th>${solicitud.getFechaSolicitud()}</th>
<th>${solicitud.getEstadoSolicitud()}</th>
<th>${solicitud.getEstadoPagoSolicitud()}</th>
<th>${solicitud.getIdEmpleado()}</th>
<th>${solicitud.getFechaVisita()}</th>

</tr>



</c:forEach>



</table>



</body>
</html>