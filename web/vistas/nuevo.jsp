<%-- 
    Document   : nuevo
    Created on : 6/07/2022, 05:40:14 PM
    Author     : Privado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Regitro</title>
        <link rel="stylesheet" href="css/estilos.css" type="text/css"/>
    
    </head>
    <body>
        <h1>Agregar Alumno</h1>
                   <!--FORMULARIO---->
        <form class="form" action="SAlumnos" method="POST">

        <!--CAJAS-DE-ENTRADA-DE-DATOS------------------------------------------------>
        <input class="txfMatricula"  name="tfMatricula" type="text" placeholder="Matricula" required maxlength="30">
        <input class="txfNombre"     name="tfNombre" type="text" placeholder="Nombre" required maxlength="30">
        <input class="txfApellidoP"  name="tfApellidoP" type="text" placeholder="ApellidoP" required maxlength="30">
        <input class="txfApellidoM"  name="tfApellidoM" type="text" placeholder="ApellidoM" required maxlength="30">
        <input class="txfDDI"        name="tfDdi" type="number" placeholder="DDI" required maxlength="30">
        <input class="txfDWI"        name="tfDwi" type="number" placeholder="DWI" required maxlength="30">
        <input class="txfECBD"       name="tfEcbd" type="number" placeholder="ECBD" required maxlength="30">
        <!--BOTON-DE-REGISTRAR-------------------------->
        <input type="submit" class="btnRegistrar" name="accion" value="Agregar">
        <a href="SAlumnos">Regresar</a>

        </form>
       
    </body>
</html>
