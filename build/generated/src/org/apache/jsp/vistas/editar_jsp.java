package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import dao.DAOAlumno;
import beans.Alumno;
import servlets.SAlumnos;

public final class editar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Editar</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>pagina editar</h1>\n");
      out.write("        ");

            DAOAlumno dao = new DAOAlumno();
            String matricula = request.getAttribute("matricula").toString();
            Alumno alumno = dao.buscar(matricula);
        
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Editar</h1>\n");
      out.write("        <div>\n");
      out.write("            <form class=\"form\" action=\"SAlumnos\" method=\"POST\">\n");
      out.write("\n");
      out.write("                <!--CAJAS-DE-ENTRADA-DE-DATOS------------------------------------------------>\n");
      out.write("                <input class=\"tfMatricula\"  name=\"tfMatricula\" type=\"text\"  required maxlength=\"30\" value=\"");
      out.print(alumno.getMatricula());
      out.write("\">\n");
      out.write("                <input class=\"tfNombre\"     name=\"tfNombre\" type=\"text\"     required maxlength=\"30\" value=\"");
      out.print(alumno.getNombre());
      out.write("\">\n");
      out.write("                <input class=\"tfApellidoP\"  name=\"tfApellidoP\" type=\"text\"  required maxlength=\"30\" value=\"");
      out.print(alumno.getApellidoP());
      out.write("\">\n");
      out.write("                <input class=\"tfApellidoM\"  name=\"tfApellidoM\" type=\"text\"  required maxlength=\"30\" value=\"");
      out.print(alumno.getApellidoM());
      out.write("\">\n");
      out.write("                <input class=\"tfDDI\"        name=\"tfDdi\" type=\"number\"      required maxlength=\"30\" value=\"");
      out.print(alumno.getDdi());
      out.write("\">\n");
      out.write("                <input class=\"tfDWI\"        name=\"tfDwi\" type=\"number\"      required maxlength=\"30\" value=\"");
      out.print(alumno.getDwi());
      out.write("\">\n");
      out.write("                <input class=\"tfECBD\"       name=\"tfEcbd\" type=\"number\"     required maxlength=\"30\" value=\"");
      out.print(alumno.getEcbd());
      out.write("\">\n");
      out.write("                <input name=\"tfMatriculaOld\" type=\"hidden\" value=\"");
      out.print(alumno.getMatricula());
      out.write("\">\n");
      out.write("                <!--BOTON-DE-REGISTRAR-------------------------->\n");
      out.write("                <input type=\"submit\" class=\"btnRegistrar\" name=\"accion\" value=\"Actualizar\">\n");
      out.write("                <a href=\"SAlumnos\">Regresar</a>\n");
      out.write("\n");
      out.write("            </form> \n");
      out.write("        </div>\n");
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
