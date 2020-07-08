<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion Empleado</title>
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
<h1>Maestro de Empleado</h1>

</header>

<h2>Actualizar estado de Empleados</h2>



<form action="AdminEmpleado" method="get">

<label for="rutEmpleado">Rut</label>
<input type="text" name="rutEmpleado">
<input type="hidden" name="empleado" value="buscarPorRut">
<input type="submit" value="Buscar">
<br><br>

</form>

<c:forEach items="${listEmpleado}" var="empleado">
<form action="AdminEmpleado" method="get">
<label for="nombreEmpleado">Nombre : </label>
<label>${empleado.getNombreEmpleado()}</label>
<br><br>
<label for="estadoEmpleado">Estado</label>
<select id="estadoEmpleado" name="estadoEmpleado">
<option value="4">Activo</option>
<option value="5">Vacaciones</option>
<option value="6">Desvinculado</option>
</select>
<br><br>

<input type="hidden" name="idempleado" value="${empleado.getIdEmpleado()}">
<input type="hidden" name="empleado" value="actualizarEstado">
<input type="submit" value="Actualizar">

</form>
</c:forEach>
</body>
</html>