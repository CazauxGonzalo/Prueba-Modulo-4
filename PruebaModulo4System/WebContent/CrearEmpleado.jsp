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

<h2>Ingreso de Trabajador</h2>



<form action="AdminEmpleado" method="get">

<label for="rutEmpleado">Rut</label>
<input type="text" name="rutEmpleado"><br><br>
<label for="nombreEmpleado">Nombre</label>
<input type="text" name="nombreEmpleado"><br><br>
<label for="mailEmpleado">Email</label>
<input type="email" name="mailEmpleado"><br><br>
<label for="fechaContartacion">Contratacion</label>
<input type="date" name="fechaContartacion"><br><br>
<input type="hidden" value="4" name="estadoEmpl">

<label for="cargoEmpleado">Cargo</label>
<select id="cargoEmpleado" name="cargoEmpl">
<option value="1">Administrativo</option>
<option value="2">Profesional</option>
<option value="3">otro</option>
</select>
<br><br>

<input type="hidden" value="crear" name="empleado">
<input type="submit" value="Procesar">

</form>



</body>
</html>