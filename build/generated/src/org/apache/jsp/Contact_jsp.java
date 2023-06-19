package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Contact Details</title>\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

        Connection cn=null;
            Statement st=null;
            String id="1";
            try
        {
         Class.forName("com.mysql.jdbc.Driver");
         cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website","root","root");
         st=cn.createStatement();
         String sql="select uid from User_Success_Story";
         ResultSet rs= st.executeQuery(sql);
         while(rs.next())
         { 
           id=String.valueOf(Integer.parseInt(rs.getString("uid"))+1);
         }
        
        }catch(Exception ex)
        {
          out.println(ex);
        }
        
      out.write("\n");
      out.write("        <form action=\"Contact\" method=\"post\">\n");
      out.write("\n");
      out.write("            <script src=\"validation.js\"></script>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"contact-detail\" class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-2\"></div>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <h2> Contact Details</h2>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-2\"></div>\n");
      out.write("                            </div><br>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-3\"></div>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                                    <label>User Id :</label> \n");
      out.write("                                    <input type=\"text\" name=\"uid\" value=\"");
      out.print(id);
      out.write("\" class=\"form-control\" id=\"name\" placeholder=\"Enter id\" onkeypress=\"javascript:return isNumber(event)\" >\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">  </div>\n");
      out.write("\n");
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
      out.write("                                    <input type=\"email\" name=\"email\" class=\"form-control\" id=\"name\" placeholder=\"Enter email id\">\n");
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
      out.write("                                    <label>Mobile No :</label> \n");
      out.write("                                    <input type=\"text\" name=\"contact\" class=\"form-control\" id=\"name\" placeholder=\"Enter mobile number\" onkeypress=\"javascript:return isContactno(event)\" maxlength=\"10\">\n");
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
      out.write("                                    <label>Suitable Time To Call :</label> \n");
      out.write("                                    <input type=\"time\" name=\"dtime\" class=\"form-control\" id=\"name\" placeholder=\"Enter time\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">  </div>\n");
      out.write("\n");
      out.write("                            </div><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-3\"></div>\n");
      out.write("                                <div class=\"col-sm-2\">\n");
      out.write("                                    <input type=\"Submit\" name=\"btn\" value=\"Save\" class=\"btn btn-primary form-control \"  style=\"font-family: 'Times New Roman';\"></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-2\">\n");
      out.write("                                    <input type=\"Submit\" name=\"btn\" value=\"Update\" class=\"btn btn-success form-control \"  style=\"font-family: 'Times New Roman';\"></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-2\">\n");
      out.write("                                    <input type=\"reset\" name=\"btn\"  value=\"Cancel\"class=\"btn btn-danger form-control\"   style=\"font-family: 'Times New Roman';\"></a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-sm-3\"></div>\n");
      out.write("                            </div><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-sm-3\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </form>\n");
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
