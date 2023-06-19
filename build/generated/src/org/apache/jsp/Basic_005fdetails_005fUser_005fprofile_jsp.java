package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Basic_005fdetails_005fUser_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Basic_details_User_profile</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            h1{\n");
      out.write("                font-family: Times New Roman;\n");
      out.write("                font-style: oblique;\n");
      out.write("                color: #fff;\n");
      out.write("                font-weight: bold;text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .jumbotron{\n");
      out.write("                background: #23074d; \n");
      out.write("                background: -webkit-linear-gradient(to left, #cc5333, #23074d); \n");
      out.write("                background: linear-gradient(to left, #cc5333, #23074d);\n");
      out.write("                border-bottom: 2px solid whitesmoke;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                background: #F0F2F0;  /* fallback for old browsers */\n");
      out.write("                background: -webkit-linear-gradient(to right, #000C40, #F0F2F0);  /* Chrome 10-25, Safari 5.1-6 */\n");
      out.write("                background: linear-gradient(to right, #000C40, #F0F2F0); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n");
      out.write("\n");
      out.write("                font-family: 'PT Sans', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .profile-container {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                height: 100vh;\n");
      out.write("                margin: 0 30px;\n");
      out.write("                border: 2px solid black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .profile-card {\n");
      out.write("                display: inline-block;\n");
      out.write("                flex: 1 1 30%;\n");
      out.write("                max-width: 400px;\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 30px;\n");
      out.write("                margin: 10px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                transition: .3s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .profile-card:hover {\n");
      out.write("                transform: scale(1.1);\n");
      out.write("                box-shadow: 0 0 25px -5px #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .profile-icon {\n");
      out.write("                height: 250px;\n");
      out.write("                width: 250px;\n");
      out.write("                object-fit: cover;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .profile-name {\n");
      out.write("                font-size: 28px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                margin: 25px 0 10px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .profile-position {\n");
      out.write("                font-size: 16px;\n");
      out.write("                color: #777;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("          \n");
      out.write("\n");
      out.write("            @media screen and (max-width: 1000px) {\n");
      out.write("                .profile-name {\n");
      out.write("                    font-size: 18px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 800px) {\n");
      out.write("                .profile-card {\n");
      out.write("                    padding: 20px 15px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .profile-name {\n");
      out.write("                    font-size: 16px;\n");
      out.write("                }\n");
      out.write("                .jumbotron{\n");
      out.write("                    display: inline-block;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"validation.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <h1 > User Profile's</h1><br><br>\n");
      out.write("\n");
      out.write("            <form action=\"Basic_details_User_profile.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">   \n");
      out.write("\n");
      out.write("                        <input type=\"text\" name=\"age\"    class=\"form-control\" id=\"name\" placeholder=\"Search by Age\" maxlength=\"2\" onkeypress=\"javascript:return isNumber(event)\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\"> \n");
      out.write("                        <input type=\"text\" name=\"height\"    class=\"form-control\" id=\"name\" placeholder=\"Search by Height\" maxlength=\"4\" onkeypress=\"javascript:return  isFloat(evt)\" >\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <input type=\"text\" name=\"weight\"    class=\"form-control\" id=\"name\" placeholder=\"Search by Weight\" maxlength=\"4\" onkeypress=\"javascript:return  isFloat(evt)\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <input type=\"submit\" name=\"btn\" value=\"Search Profile\" class=\"btn btn-primary\" class=\"button\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </form><br>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");


                Connection cn = null;
                Statement st = null;
                int counter = 1;
                String btn = request.getParameter("btn");
                String age = request.getParameter("age");
                String height = request.getParameter("height");
                String weight = request.getParameter("weight");

                String sql = "";
                if (btn != null) {
                    sql = "select * from basic_details where age='" + age + "' or  height='" + height + "' or  weight='" + weight + "' ";

                } else {
                    sql = "select * from basic_details";
                }
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                    st = cn.createStatement();

                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"profile-card\">\n");
      out.write("                <form action=\"All_details_user_profie.jsp\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" name=\"uid\" value=\"");
      out.print(rs.getString("uid"));
      out.write("\">\n");
      out.write("                    <img src=");
      out.print(rs.getString("img"));
      out.write(" alt=\"image1\" class=\"profile-icon\" />\n");
      out.write("                    <div class=\"profile-name\">");
      out.print(rs.getString("fname"));
      out.write("<hr></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"profile-position\">AGE: ");
      out.print(rs.getString("age"));
      out.write(" years</div>\n");
      out.write("                    <div class=\"profile-position\">Gender :");
      out.print(rs.getString("gender"));
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" name=\"btn\" value=\"View Profile\" class=\"btn btn-danger\" class=\"button\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                    }
                } catch (Exception ex) {

                }

            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
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
