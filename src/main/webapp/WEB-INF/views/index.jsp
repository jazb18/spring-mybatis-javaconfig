<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<!--Import Google Icon Font-->
<link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet" href='<c:url value="/resources/css/materialize.min.css"/>' media="screen,projection" />
<!--Let browser know website is optimized for mobile-->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>

<body>
	<!--Import jQuery before materialize.js-->
	<script type="text/javascript" src='<c:url value="/resources/js/jquery-2.1.1.min.js"/>'></script>
	<script type="text/javascript" src='<c:url value="/resources/js/materialize.min.js"/>'></script>
	<script type="text/javascript" src="<c:url value="/resources/js/ejemplo.js"/>"></script>

	<div class="container">
		<form action="" id="formPrincipal" method="post">
			<div class="row">
				<div class="input-field col s6">
					<input name="ciudad" type="text" class="validate"> 
						<label for="ciudad">Ingrese Ciudad</label>
				</div>
				<div class="input-field col s6">
					<input name="poblacion" type="text" class="validate"> 
					<label for="poblacion">Poblaci&oacute;n</label>
				</div>
			</div>
			<a class="waves-effect waves-light btn" onclick="GrabarForm()"><i class="material-icons left">cloud</i>Guardar</a>
		</form>	
	</div>
</body>
</html>
