package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Partner_005fpreferance_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Partner_preferance_view</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("            <table class=\"table table-bordered \">\n");
      out.write("                <thead class=\"thead-dark\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">#</th>\n");
      out.write("                        <th scope=\"col\">User ID</th>\n");
      out.write("                        <th scope=\"col\">Residential Status</th>\n");
      out.write("                        <th scope=\"col\">Min-Age</th>\n");
      out.write("                        <th scope=\"col\">Max-Age</th>\n");
      out.write("                        <th scope=\"col\">Min-Height</th>\n");
      out.write("                        <th scope=\"col\">Max-Height</th>\n");
      out.write("                        <th scope=\"col\">Religion</th>\n");
      out.write("                        <th scope=\"col\">Mother Tongue</th>\n");
      out.write("                        <th scope=\"col\">Marital Status</th>\n");
      out.write("                        <th scope=\"col\">Manglik</th>\n");
      out.write("                        <th scope=\"col\">Min-Income</th>\n");
      out.write("                        <th scope=\"col\">Max-Income</th>\n");
      out.write("                        <th scope=\"col\">Education</th>\n");
      out.write("                        <th scope=\"col\">Occupation</th>\n");
      out.write("                        <th scope=\"col\">Update</th>\n");
      out.write("                        <th scope=\"col\">Delete</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("                    ");


                        Connection cn = null;
                        Statement st = null;
                        int counter = 1;

                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                            st = cn.createStatement();
                            String sql = "select * from Partner_Preferance";

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                <form action=\"Partner_preferance_Update.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <th scope=\"row\">");
      out.print(counter++);
      out.write("</th>\n");
      out.write("                    <td>");
      out.print(rs.getString("uid"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"uid\" value=\"");
      out.print(rs.getString("uid"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("residental_status"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"residental_status\" value=\"");
      out.print(rs.getString("residental_status"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("min_age"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"min_age\" value=\"");
      out.print(rs.getString("min_age"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("max_age"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"max_age\" value=\"");
      out.print(rs.getString("max_age"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("min_height"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"min_height\" value=\"");
      out.print(rs.getString("min_height"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("max_height"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"max_height\" value=\"");
      out.print(rs.getString("max_height"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("religion"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"religion\" value=\"");
      out.print(rs.getString("religion"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("mother_tongue"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"mother_tongue\" value=\"");
      out.print(rs.getString("mother_tongue"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("maritial_status"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"maritial_status\" value=\"");
      out.print(rs.getString("maritial_status"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("manglik"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"manglik\" value=\"");
      out.print(rs.getString("manglik"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("min_income"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"min_income\" value=\"");
      out.print(rs.getString("min_income"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("max_income"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"max_income\" value=\"");
      out.print(rs.getString("max_income"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("education"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"education\" value=\"");
      out.print(rs.getString("education"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("occupation"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"occupation\" value=\"");
      out.print(rs.getString("occupation"));
      out.write("\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <td>  <input type=\"Submit\" name=\"btn\" value=\"Update\" class=\"btn btn-success  \"  style=\"font-family: 'Times New Roman';\"></td>\n");
      out.write("                    <td><input type=\"Submit\" name=\"btn\"  value=\"Delete\" class=\"btn btn-danger \"   style=\"font-family: 'Times New Roman';\"></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                        }
                    } catch (Exception ex) {

                    }

                
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
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
