<%-- 
    Document   : editar
    Created on : 6/07/2022, 05:39:51 PM
    Author     : Privado
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="dao.DAOAlumno"%>
<%@page import="beans.Alumno"%>
<%@page import="servlets.SAlumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar</title>
        <link rel="stylesheet" href="css/estilos.css" type="text/css"/>

    </head>
    <body>
        <h1>pagina editar</h1>
        <%
            DAOAlumno dao = new DAOAlumno();
            String matricula = request.getAttribute("matricula").toString();
            Alumno alumno = dao.buscar(matricula);
        %>

        <h1>Editar</h1>
        <div>
            <form class="form" action="SAlumnos" method="POST">

                <!--CAJAS-DE-ENTRADA-DE-DATOS------------------------------------------------>
                <input class="tfMatricula"  name="tfMatricula" type="text"  required maxlength="30" value="<%=alumno.getMatricula()%>">
                <input class="tfNombre"     name="tfNombre" type="text"     required maxlength="30" value="<%=alumno.getNombre()%>">
                <input class="tfApellidoP"  name="tfApellidoP" type="text"  required maxlength="30" value="<%=alumno.getApellidoP()%>">
                <input class="tfApellidoM"  name="tfApellidoM" type="text"  required maxlength="30" value="<%=alumno.getApellidoM()%>">
                <input class="tfDDI"        name="tfDdi" type="number"      required maxlength="30" value="<%=alumno.getDdi()%>">
                <input class="tfDWI"        name="tfDwi" type="number"      required maxlength="30" value="<%=alumno.getDwi()%>">
                <input class="tfECBD"       name="tfEcbd" type="number"     required maxlength="30" value="<%=alumno.getEcbd()%>">
                <input name="tfMatriculaOld" type="hidden" value="<%=alumno.getMatricula()%>">
                <!--BOTON-DE-REGISTRAR-------------------------->
                <input type="submit" class="btnRegistrar" name="accion" value="Actualizar">
                <a href="SAlumnos">Regresar</a>

            </form> 
        </div>

    </body>
</html>
