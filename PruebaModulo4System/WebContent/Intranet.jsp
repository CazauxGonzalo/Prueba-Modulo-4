<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Intranet</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>


<div>



<form action="AdminAcceso" method="post" class="formularioInicio">
<h2>Acceso Usuarios</h2>
<label for="mail">Email</label>
<input type="email" name="mail" id="mail"><br><br>
<label for="clave">Clave</label>
<input type="password" name="clave" id="clave"><br><br>

<input type="submit" value="Ingresar">
</form>




</div>

</body>
</html>