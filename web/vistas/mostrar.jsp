<%-- 
    Document   : mostrar
    Created on : 6/07/2022, 05:40:02 PM
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
        <title>JSP Page</title>

        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark">
            <a class="navbar-brand navbar-dark">Tabla de Alumnos</a>
        </nav> 
        <div>

            <a href="SAlumnos?accion=nuevo">Agregar nuevo</a>
            <table border="1" class="table table-hover table-dark">

                <thead>
                    <tr>
                        <th>Matricula</th>
                        <th>Nombre</th>
                        <th>Apellido Paterno</th>
                        <th>Apellido Materno</th>
                        <th>Ddi</th>
                        <th>Dwi</th>
                        <th>Ecbd</th>
                        <th>promedio</th>
                        <th colspan="2">Acción</th>
                    </tr>
                </thead>
                <body>
                    <%
                        DAOAlumno daoAlumno = new DAOAlumno();
                        ArrayList<Alumno> listAlumnos = daoAlumno.mostrar();
                        Alumno alumno = null;
                        for (int i = 0; i < listAlumnos.size(); i++) {
                            alumno = listAlumnos.get(i);

                    %>
                <tr>
                    <td><%=alumno.getMatricula()%></td>
                    <td><%=alumno.getNombre()%></td>
                    <td><%=alumno.getApellidoP()%></td>
                    <td><%=alumno.getApellidoM()%></td>
                    <td><%=alumno.getDdi()%></td>
                    <td><%=alumno.getDwi()%></td>
                    <td><%=alumno.getEcbd()%></td>
                    <td><%=alumno.getProm()%></td>
                    <td><a href="SAlumnos?accion=editar&matricula=<%=alumno.getMatricula()%>">editar</a> </td>
                    <td><a href="SAlumnos?accion=eliminar&matricula=<%=alumno.getMatricula()%>">Eliminar</a></td>
                    </t>
                    <%}%>
                    </tbody>
            </table>


        </div>
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>

    </body>
</html>
