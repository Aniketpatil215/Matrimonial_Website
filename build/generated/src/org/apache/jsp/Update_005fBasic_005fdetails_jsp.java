package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Update_005fBasic_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Basic Details</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\"> \n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            body\n");
      out.write("            {               \n");
      out.write("                background-image:url(Imagess/homeImg.jpg);\n");
      out.write("                background-position:center;\n");
      out.write("                background-size: cover;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                background: rgba(0,0,0,0.5);\n");
      out.write("\n");
      out.write("            }\n");
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
      out.write("\n");
      out.write("            label\n");
      out.write("            {\n");
      out.write("                font-family: 'Times New Roman';\n");
      out.write("                font-size: 22px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form action=\"Basic_Details\" method=\"post\">\n");
      out.write("\n");
      out.write("            <script src=\"validation.js\"></script>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("\n");
      out.write("                        <div class=\"basic-detail\" class=\"form-group\">\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-4\"></div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <h2> Basic Details</h2><br>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4\"></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-1\"></div>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                    <label>User Id :</label> \n");
      out.write("                                    <input type=\"text\" name=\"uid\"   class=\"form-control\" id=\"name\" placeholder=\"User ID\" onkeypress=\"javascript:return isNumber(event)\" >\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                    <label>Full Name :</label> \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"fname\" id=\"name\" placeholder=\"Enter full name\" onkeypress=\"javascript:return isString(event)\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-1\"></div>\n");
      out.write("                            </div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-1\"></div>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("\n");
      out.write("                                    <label>Gender :</label> \n");
      out.write("                                    <select name=\"gender\" class=\"form-control\">\n");
      out.write("                                        <option>Select</option>\n");
      out.write("                                        <option>Male</option>\n");
      out.write("                                        <option>Female</option>\n");
      out.write("                                    </select>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                    <label>Age :</label> \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"age\" id=\"name\" placeholder=\"Age\"  onkeypress=\"javascript:return isNumber(event)\" maxlength=\"2\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-1\"></div>\n");
      out.write("                            </div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-1\"></div>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                    <label> DOB :</label> \n");
      out.write("                                    <input type=\"date\" class=\"form-control\" name=\"dob\" id=\"name\" placeholder=\"Date of birth\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                    <label>Height :</label> \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"height\" id=\"name\" placeholder=\"Enter your height\" onkeypress=\"javascript:return isFloat(event)\"  maxlength=\"5\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-1\"></div>\n");
      out.write("                            </div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-1\"></div>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                    <label>Weight :</label> \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"weight\" id=\"name\" placeholder=\"Enter your Weight\"onkeypress=\"javascript:return isFloat(event)\" maxlength=\"5\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                    <label > Image :</label>\n");
      out.write("                                    <input type=\"file\"  name=\"img\" class=\"form-control\" onchange=\"redURL(this)\" accept=\"Image/*\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-1\"></div>\n");
      out.write("                            </div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-2\"></div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input type=\"Submit\" name=\"btn\" value=\"Update\" class=\"btn btn-primary form-control \"  style=\"font-family: 'Times New Roman';\"></a>\n");
      out.write("                                </div>  <div class=\"col-sm-4\">\n");
      out.write("\n");
      out.write("                                    <input type=\"Submit\" name=\"btn\" value=\"Delete\" class=\"btn btn-danger form-control \"  style=\"font-family: 'Times New Roman';\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-sm-2\"></div>\n");
      out.write("                            </div><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
