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


<h2>Creacion de Soliciud</h2>




<form action="AdminSolicitud2" method="get">

<label for="fechaSolicitud">Fecha Solicitud</label>
<input type="date" name="fechaSolicitud"><br><br>

<label for="cliente">Cliente</label>
<select id="cliente" name="idCliente">
<c:forEach items="${listadoClientes}" var="cliente">
<option value="${cliente.getIdCliente()}">${cliente.getNombreCliente()}</option>
</c:forEach>
</select><br><br>

<label for="direccionSolicitud">Direccion</label>
<input type="text" name="direccionSolicitud"><br><br>

<label for="comunaSolicitud">Comuna</label>
<input type="text" name="comunaSolicitud"><br><br>

<input type="hidden" name="estadoSolicitud" value="1">
<input type="hidden" name="estadoPago" value="1">

<label for="fechaVisita">Fecha Visita</label>
<input type="text" name="fechaVisita"><br><br>

<label for="horaVisita">Hora</label>
<select id="horaVisita" name="hora">
<option value="09">09</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="01">1</option>
<option value="02">2</option>
<option value="03">3</option>
<option value="04">4</option>
</select>

<select id="minVisita" name="minutos">
<option value="00">00</option>
<option value="15">15</option>
<option value="30">30</option>
<option value="45">45</option>
</select>
<br><br>


<label for="empleado">Profesional</label>
<select id="empleado" name="idEmpleado">
<c:forEach items="${listadoEmpleado}" var="empleado">
<option value="${empleado.getIdEmpleado()}">${empleado.getNombreEmpleado()}</option>
</c:forEach>
</select><br><br>


<input type="hidden" value="crear" name="solicitud" >
<input type="submit" value="Enviar Solicitud ">

</form>

</body>
</html>