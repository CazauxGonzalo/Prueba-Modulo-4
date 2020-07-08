<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>	
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion Empleados</title>
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

<h2>Listado de Empleados</h2>

<form action="AdminEmpleado" method="get">
<input type="hidden" name="empleado" value="listartodos">
<input type="submit" value="Listar Todos">

</form>


<table>

<tr>

<th>Codigo</th>
<th>Rut</th>
<th>Nombre</th>
<th>mail</th>
<th>Contratacion</th>
<th>Estado</th>
<th>Cargo</th>


</tr>


<c:forEach items="${listadoEmpleado}" var="employed" >


<tr>

<th>${employed.getIdEmpleado()}</th>
<th>${employed.getRutEmpleado()}</th>
<th>${employed.getNombreEmpleado()}</th>
<th>${employed.getMailEmpleado()}</th>
<th>${employed.getFechaContratacion()}</th>
<th>${employed.getEstadoEmpleado()}</th>
<th>${employed.getCargoEmpleado()}</th>



</tr>



</c:forEach>



</table>


</body>
</html>