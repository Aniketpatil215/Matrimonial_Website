package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Family_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Family_view</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("            <table class=\"table table-bordered \">\n");
      out.write("                <thead class=\"thead-dark\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">#</th>\n");
      out.write("                        <th scope=\"col\">User ID</th>\n");
      out.write("                        <th scope=\"col\">Family Type</th>\n");
      out.write("                        <th scope=\"col\">Family Value</th>\n");
      out.write("                        <th scope=\"col\">Family Income</th>\n");
      out.write("                        <th scope=\"col\">Father Occupation</th>\n");
      out.write("                        <th scope=\"col\">Mother Occupation</th>\n");
      out.write("                        <th scope=\"col\">Brother</th>\n");
      out.write("                        <th scope=\"col\">Sister</th>\n");
      out.write("                        <th scope=\"col\">Family Based On</th>\n");
      out.write("                        <th scope=\"col\">Gothra</th>\n");
      out.write("                        <th scope=\"col\">Family Status</th>\n");
      out.write("                        <th scope=\"col\">About Family </th>\n");
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
                            String sql = "select * from Family";

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                <form action=\"Ethinicity_Update.jsp\" method=\"post\">\n");
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
      out.print(rs.getString("family_type"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"family_type\" value=\"");
      out.print(rs.getString("family_type"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("family_value"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"family_value\" value=\"");
      out.print(rs.getString("family_value"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("family_income"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"family_income\" value=\"");
      out.print(rs.getString("family_income"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("father_occupation"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"father_occupation\" value=\"");
      out.print(rs.getString("father_occupation"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("mother_occupation"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"mother_occupation\" value=\"");
      out.print(rs.getString("mother_occupation"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("brother"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"brother\" value=\"");
      out.print(rs.getString("brother"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("sister"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"sister\" value=\"");
      out.print(rs.getString("sister"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("family_based_on"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"family_based_on\" value=\"");
      out.print(rs.getString("family_based_on"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("gothra"));
      out.write("</td>\n");
      out.write("                    <input type=\"gothra\" name=\"uid\" value=\"");
      out.print(rs.getString("gothra"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("family_status"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"family_status\" value=\"");
      out.print(rs.getString("family_status"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("about_family"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"about_family\" value=\"");
      out.print(rs.getString("about_family"));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <td>  <input type=\"Submit\" name=\"btn\" value=\"Update\" class=\"btn btn-success  \"  style=\"font-family: 'Times New Roman';\"></td>\n");
      out.write("                    <td><input type=\"Submit\" name=\"btn\"  value=\"Delete\" class=\"btn btn-danger \"   style=\"font-family: 'Times New Roman';\"></td>\n");
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
