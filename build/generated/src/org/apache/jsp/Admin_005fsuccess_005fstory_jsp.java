package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Admin_005fsuccess_005fstory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Admin_header.jsp");
  }

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
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Admin Success Story</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\"> \n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            body\n");
      out.write("            {             \n");
      out.write("                background:url(Imagess/homeImg2.jpg);\n");
      out.write("                background-position:center;\n");
      out.write("                background-size: cover;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                background-image: linear-gradient(to right top, #051937, #003852, #00575b, #327457, #7a8c53);\n");
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
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Admin_header  </title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Sidebar */\n");
      out.write("            #sidebar {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                height: 100%;\n");
      out.write("                width: 250px;\n");
      out.write("                background-color: #f4f4f4;\n");
      out.write("                padding: 10px;\n");
      out.write("                transition: all 0.3s ease;\n");
      out.write("                box-shadow: 8px 8px 20px #c3c3c3, -8px -8px 20px #ffffff;\n");
      out.write("                z-index: 9999;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #sidebar.hide {\n");
      out.write("                transform: translateX(-250px);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Sidebar Menu */\n");
      out.write("            .menu {\n");
      out.write("                list-style: none;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .menu li {\n");
      out.write("                padding: 10px 0;\n");
      out.write("                border-bottom: 1px solid #ccc;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .menu li:hover {\n");
      out.write("                background-color: #ebebeb;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Content */\n");
      out.write("            #content {\n");
      out.write("                margin-left: 250px;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Neumorphic Effect */\n");
      out.write("            .neumorphic {\n");
      out.write("                background-color: #f4f4f4;\n");
      out.write("                box-shadow: 8px 8px 20px #c3c3c3, -8px -8px 20px #ffffff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Toggle Button */\n");
      out.write("            #toggle {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 10px;\n");
      out.write("                right: 10px;\n");
      out.write("                width: 50px;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: #f4f4f4;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                box-shadow: 8px 8px 20px #c3c3c3, -8px -8px 20px #ffffff;\n");
      out.write("                cursor: pointer;\n");
      out.write("                z-index: 9999;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #toggle span {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                display: block;\n");
      out.write("                width: 20px;\n");
      out.write("                height: 2px;\n");
      out.write("                background-color: #333;\n");
      out.write("                transition: all 0.2s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #toggle.hide span:first-child {\n");
      out.write("                transform: translate(-50%, -50%) rotate(45deg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #toggle.hide span:last-child {\n");
      out.write("                transform: translate(-50%, -50%) rotate(-45deg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #toggle.hide span:nth-child(2) {\n");
      out.write("                transform: translate(-50%, -50%) scale(0);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"sidebar\" class=\"neumorphic\">\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                   <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Homepage.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"User_profile_view_admin_side.jsp\">User Basic Profile</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"All_details_user_profie_admin_side.jsp\">User All Details Profile </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Admin_success_story_view_list.jsp\"> View Success Story  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Admin_success_story.jsp\"> Add Success story </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Feedback_view.jsp\"> Feedback </a>\n");
      out.write("                    </li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"toggle\" class=\"neumorphic\">\n");
      out.write("            <span></span>\n");
      out.write("            <span></span>\n");
      out.write("            <span></span>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            const toggleButton = document.getElementById('toggle');\n");
      out.write("            const sidebar = document.getElementById('sidebar');\n");
      out.write("\n");
      out.write("            toggleButton.addEventListener('click', function () {\n");
      out.write("                sidebar.classList.toggle('hide');\n");
      out.write("                toggleButton.classList.toggle('hide');\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script> \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            Connection cn = null;
            Statement st = null;
            String id = "1";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select uid from Admin_success_story";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    id = String.valueOf(Integer.parseInt(rs.getString("uid")) + 1);
                }

            } catch (Exception ex) {
                out.println(ex);
            }
        
      out.write("\n");
      out.write("        <form action=\"Admin_success_story\" method=\"post\">\n");
      out.write("            <script src=\"validation.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"success-detail\" class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-3\"></div>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <h2> Add Success Story</h2>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\"></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-2\"></div>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("\n");
      out.write("                                    <label>User Id :</label> \n");
      out.write("                                    <input type=\"text\" name=\"uid\" value=\"");
      out.print(id);
      out.write("\" class=\"form-control\" id=\"name\" placeholder=\"Enter ID\" onkeypress=\"javascript:return isNumber(event)\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-2\">  </div>\n");
      out.write("\n");
      out.write("                            </div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-2\"></div>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("\n");
      out.write("                                    <label>First User Name :</label> \n");
      out.write("                                    <input type=\"text\" name=\"fname\" class=\"form-control\" id=\"name\" placeholder=\"Enter first user\"onkeypress=\"javascript:return isString(event)\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-2\">  </div>\n");
      out.write("\n");
      out.write("                            </div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-2\"></div>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("\n");
      out.write("                                    <label>Second User Name :</label> \n");
      out.write("                                    <input type=\"text\" name=\"sname\" class=\"form-control\" id=\"name\" placeholder=\"Enter second user\" onkeypress=\"javascript:return isString(event)\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-2\">  </div>\n");
      out.write("\n");
      out.write("                            </div><br>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-2\"></div>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("\n");
      out.write("                                    <label > Image :</label>\n");
      out.write("                                    <input type=\"file\" name=\"img\" name=\"name2\" class=\"form-control\" onchange=\"redURL(this)\" accept=\"Image/*\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-2\">  </div>\n");
      out.write("\n");
      out.write("                            </div><br>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-2\"></div>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("\n");
      out.write("                                    <label>Description :</label> \n");
      out.write("                                    <input type=\"textarea\" name=\"descr\"  class=\"form-control\" id=\"name\" placeholder=\"Enter description  \">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-2\">  </div>\n");
      out.write("\n");
      out.write("                            </div><br><br>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-2\"></div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input type=\"reset\" value=\"Cancel\" class=\"btn btn-danger form-control \"  style=\"font-family: 'Times New Roman';\">\n");
      out.write("                                </div>  <div class=\"col-sm-4\">\n");
      out.write("\n");
      out.write("                                    <input type=\"Submit\" name=\"btn\" value=\"Save & Next\" class=\"btn btn-success form-control \"  style=\"font-family: 'Times New Roman';\">\n");
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
