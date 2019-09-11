package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;

public final class userRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Information</title>\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("        <form method=\"POST\" action=\"servlet/userInsert\">\n");
      out.write("            <pre>\n");
      out.write("            <input type=\"text\" name=\"id\" placeholder=\"Enter user ID \"/><br>\n");
      out.write("            <input type=\"text\" name=\"fname\" placeholder=\"Enter first name \" required/><br>\n");
      out.write("            <input type=\"text\" name=\"lname\" placeholder=\"Enter last name \" required/><br>\n");
      out.write("            <input type=\"text\" name=\"email\" placeholder=\"Enter email \" required/><br>\n");
      out.write("            \n");
      out.write("            <select name=\"userType\" required>\n");
      out.write("                <option value=\"\"> Enter user type </option>\n");
      out.write("                <option value=\"boc_staff\"> BOC Staff </option>\n");
      out.write("                <option value=\"home_owner\"> Home Owner </option>\n");
      out.write("            </select><br>\n");
      out.write("                \n");
      out.write("            <select name=\"userRole\" required>\n");
      out.write("                <option value=\"\"> Enter user role </option>\n");
      out.write("                <option value=\"AGM\"> AGM </option>\n");
      out.write("                <option value=\"DGM\"> DGM </option>\n");
      out.write("                <option value=\"Manager\"> Manager </option>\n");
      out.write("                <option value=\"Other\"> Other </option> \n");
      out.write("            </select><br>\n");
      out.write("            \n");
      out.write("            <input type=\"text\" name=\"contact\" placeholder=\"Enter contact number \" required/><br>\n");
      out.write("\n");
      out.write("            <select name=\"status\" required>\n");
      out.write("                <option value=\"\"> Enter user status </option>\n");
      out.write("                <option value=\"active\"> ACTIVE </option>\n");
      out.write("                <option value=\"resigned\"> RESIGNED </option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <input type=\"text\" name=\"username\" placeholder=\"Enter username \" required/><br>\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Enter Password \" required/><br>\n");
      out.write("            <input type=\"text\" name=\"cid\" placeholder=\"Enter created user ID \"/><br>\n");
      out.write("            <input type=\"text\" name=\"date\" placeholder=\"Enter created date \" required/><br><br>\n");
      out.write("            <input type=\"submit\" value=\"SAVE\"/>\n");
      out.write("            </pre>\n");
      out.write("        </form>     \n");
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
