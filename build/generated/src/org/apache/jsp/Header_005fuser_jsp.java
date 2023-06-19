package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Header_user </title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-warning\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Online Matrimony Website</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Homepage.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"User_Success_Story_View.jsp\">Success Story </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"User_Success_Story.jsp\">  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Basic_details.jsp\">Basic Details </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Basic_details_Update.jsp\">Basic Details Update  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Basic_details_view.jsp\"> Basic Details View  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Basic_details_User_profile.jsp\"> Basic Details User Profile </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Address.jsp\">Address Details </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Address_Update.jsp\">Address Details Update  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Address_view.jsp\"> Address Details View  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Ethinicity.jsp\"> Ethnicity Details  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Ethinicity_Update.jsp\">Ethnicity Details Update  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Ethinicity_view.jsp\"> Ethnicity Details View  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Career.jsp\"> Career Details  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Career_Update.jsp\">Career Details Update  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Career_view.jsp\"> Career Details View  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Working.jsp\"> Working Details  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Working_Update.jsp\">Working Details Update  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Working_view.jsp\"> Working Details View  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Social.jsp\"> Social Details  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Social_Update.jsp\">Social Details Update  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Social_view.jsp\"> Social Details View  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Family.jsp\"> Family Details  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Family_Update.jsp\">Family Details Update  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Family_view.jsp\"> Family Details View  </a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                      <li class=\"nav-item\">\n");
      out.write("                          <a class=\"nav-link\" href=\"Lifestyle.jsp\"> Lifestyle Details  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Liestyle_Update.jsp\">Lifestyle Details Update  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Lifetyle_view.jsp\"> Lifestyle Details View  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                          <a class=\"nav-link\" href=\"Partner_preferance.jsp\"> Partner Preferance Details  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Partner_preferance_Update.jsp\">Partner Preferance Details Update  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Partner_preferance_view.jsp\"> Partner Preferance Details View  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                          <a class=\"nav-link\" href=\"Search_partner_profile.jsp\"> Search Partner Profile Details  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Search_partner_profile_Update.jsp\">Search Partner Profile Details Update  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Search_partner_profile_view.jsp\"> Search Partner Profile Details View  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Contact.jsp\">  Contact Details  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Contact_Update.jsp\">Contact Details Update  </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Contact_view.jsp\"> Contact Details View  </a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                         <a class=\"nav-link\" href=\"Feedback.jsp\"> Feedback </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
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
