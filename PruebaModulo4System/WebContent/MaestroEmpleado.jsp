<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<div class="enlaces">


<a href="CrearEmpleado.jsp">Crear Empleado</a><br><br>
<a href="AdministrarEmpleado.jsp">Administrar Empleado</a><br><br>
<a href="ListadoEmpleado.jsp">Consultar Empleados</a>

</div>
</body>
</html>