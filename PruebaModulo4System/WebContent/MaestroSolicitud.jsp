<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<div class="enlaces">


<a href="AdminSolicitud">Ingresar Solicitud</a><br><br>
<a href="ListarSolicitud.jsp">Listar Solicitud</a><br><br>
<a href="ActualizarEstadoSolicitud.jsp">Actualizar Estado</a><br><br>
<a href="ReAgendarSolicitud.jsp">ReAgendar Visita</a><br><br>
<a href="MisSolicitudes.jsp">Mis Solicitudes</a>

</div>

</body>
</html>