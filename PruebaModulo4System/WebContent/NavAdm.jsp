<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>	
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>
<%@ page import="cl.ggc.model.Empleado, java.util.*,cl.ggc.DAO.EmpleadoDAO " %>

<%    

if(session.getAttribute("sessionLogin") == null){
	
	response.sendRedirect("Intranet.jsp");
	
}

%>

<header class="allHeader">

<div class="cerrarsession">
<form action="AdminLogout" method="get" >
<input type="submit" value="Cerrar Sesión" >
</form>
</div>

<h1> Sistema de Gestion </h1>

<c:forEach items="${sessionLogin}" var="userLog" >

<p>User : ${userLog.getNombreEmpleado()} </p>

</c:forEach>

</header>

<div class="enlaces">

<a href="MaestroCliente.jsp">Maestro Cliente </a><br><br>
<a href="MaestroEmpleado.jsp"> Maestro Empleados </a><br><br>
<a href="MaestroSolicitud.jsp"> Maestro Solicitudes </a>

</div>



</body>
</html>