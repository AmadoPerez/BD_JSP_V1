package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import dao.DAOAlumno;
import beans.Alumno;
import servlets.SAlumnos;

public final class mostrar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Mostrar</h1>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <a href=\"SAlumnos?accion=nuevo\">Agregar nuevo</a>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Matricula</th>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Apellido Paterno</th>\n");
      out.write("                        <th>Apellido Materno</th>\n");
      out.write("                        <th>Ddi</th>\n");
      out.write("                        <th>Dwi</th>\n");
      out.write("                        <th>Ecbd</th>\n");
      out.write("                        <th>promedio</th>\n");
      out.write("                        <th colspan=\"2\">Acción</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <body>\n");
      out.write("                    ");

                        DAOAlumno daoAlumno = new DAOAlumno();
                        ArrayList<Alumno> listAlumnos = daoAlumno.mostrar();
                        Alumno alumno = null;
                        for (int i = 0; i < listAlumnos.size(); i++) {
                            alumno = listAlumnos.get(i);

                    
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(alumno.getMatricula());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(alumno.getNombre());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(alumno.getApellidoP());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(alumno.getApellidoM());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(alumno.getDdi());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(alumno.getDwi());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(alumno.getEcbd());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(alumno.getProm());
      out.write("</td>\n");
      out.write("                    <td><a href=\"SAlumnos?accion=editar&matricula=");
      out.print(alumno.getMatricula());
      out.write("\">editar</a> </td>\n");
      out.write("                    <td><a href=\"SAlumnos?accion=eliminar&matricula=");
      out.print(alumno.getMatricula());
      out.write("\">Eliminar</a></td>\n");
      out.write("                    </t>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js\" integrity=\"sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
