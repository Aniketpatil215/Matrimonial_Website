package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> User LogIn</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\"> \n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background:url(Imagess/homeImg.jpg);\n");
      out.write("                background-position:center;\n");
      out.write("                background-size: cover;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                background-image: linear-gradient(to right top, #051937, #003852, #00575b, #327457, #7a8c53);\n");
      out.write("                margin-top: 20px;\n");
      out.write("                background: transparent;\n");
      out.write("                background-color: rgba(255, 255, 255, 0.3);\n");
      out.write("                border-radius: 10px;\n");
      out.write("                border: 1px solid rgba(255,255,255,0.3); \n");
      out.write("                background: rgba(0,0,0,0.5);\n");
      out.write("                position: relative;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input\n");
      out.write("            {\n");
      out.write("                color: black;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-family: 'Times New Roman';\n");
      out.write("                font-weight: bold;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h2\n");
      out.write("            {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #fff; font-family: 'Times New Roman'; font-weight: bold;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            label\n");
      out.write("            {\n");
      out.write("                font-family: 'Times New Roman';\n");
      out.write("                font-size: 22px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            h6\n");
      out.write("            {\n");
      out.write("                color: #fff; font-family: 'Times New Roman'; font-weight: bold;text-decoration: underline;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Login_user\" method=\"post\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"container\"><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"login-detail\" class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-2\"></div>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <h2> User LogIn</h2><br>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-2\"></div>\n");
      out.write("                            </div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-3\"></div>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                                    <label>Email Id :</label> \n");
      out.write("                                    <input type=\"email\"  name=\"Email\" class=\"form-control\" id=\"name\" placeholder=\"Email\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">  </div>\n");
      out.write("\n");
      out.write("                            </div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-3\"></div>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                                    <label> Password :</label> \n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"pass\" id=\"name\" placeholder=\"Password\" onkeypress=\"javascript:return isAlphanumric(event)\"  minlength=\"8\" maxlength=\"12\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">  </div>\n");
      out.write("\n");
      out.write("                            </div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-5\"></div>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <a href=\"forgot_password_user.jsp\"> <h6>forgot password<h6></a>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-1\"></div>\n");
      out.write("                                                </div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-sm-3\"></div>\n");
      out.write("                                                    <div class=\"col-sm-3\">\n");
      out.write("                                                        <input type=\"Submit\"  value=\"Login\" name=\"btn\" class=\"btn btn-primary form-control \"  style=\"font-family: 'Times New Roman';\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-sm-3\">\n");
      out.write("                                                        <input type=\"reset\" name=\"btn\" value=\"Cancel\"class=\"btn btn-danger form-control\"   style=\"font-family: 'Times New Roman';\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-sm-3\"></div>\n");
      out.write("                                                </div><br><br>\n");
      out.write("\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-sm-3\"></div>\n");
      out.write("                                                    <div class=\"col-sm-7\">\n");
      out.write("                                                        <a href=\"User_SignIn.jsp\"> <h6>Create an New account , SignIn click here</h6>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-sm-2\"></div>\n");
      out.write("                                                </div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-3\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                </form>\n");
      out.write("                                                </body>\n");
      out.write("                                                </html>\n");
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
