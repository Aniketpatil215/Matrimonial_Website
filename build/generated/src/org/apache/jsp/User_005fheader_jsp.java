package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class User_005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>User Header</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div class=\"logo\"><a href=\"#\">Matrimonial website</a></div>\n");
      out.write("                <input type=\"radio\" name=\"slider\" id=\"menu-btn\">\n");
      out.write("                <input type=\"radio\" name=\"slider\" id=\"close-btn\">\n");
      out.write("                <ul class=\"nav-links\">\n");
      out.write("                    <label for=\"close-btn\" class=\"btn close-btn\"><i class=\"fas fa-times\"></i></label>\n");
      out.write("                    <li><a href=\"Feedback.jsp\">Feedback</a></li>\n");
      out.write("                    <li><a href=\"Basic_details_User_profile.jsp\">View User's Profile</a></li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\" class=\"desktop-item\">Create Your Profile</a>\n");
      out.write("                        <input type=\"checkbox\" id=\"showMega\">\n");
      out.write("                        <label for=\"showMega\" class=\"mobile-item\">Create Your Profile</label>\n");
      out.write("                        <div class=\"mega-box\">\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <img src=\"Imagess/homeImg.jpg\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <header>Personal Details</header>\n");
      out.write("                                    <ul class=\"mega-links\">\n");
      out.write("                                        <li><a href=\"Basic_details.jsp\">Add Basic Details</a></li>\n");
      out.write("                                        <li><a href=\"Ethinicity.jsp\">Add Ethnicity Details</a></li>\n");
      out.write("                                        <li><a href=\"Social.jsp\">Add Social Details</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <header> Address Details </header>\n");
      out.write("                                    <ul class=\"mega-links\">\n");
      out.write("                                        <li><a href=\"Address.jsp\">Add Address Details</a></li>\n");
      out.write("                                        <li><a href=\"Working.jsp\">Add Working Details</a></li>\n");
      out.write("                                        <li><a href=\"Career.jsp\">Add Career Details</a></li>\n");
      out.write("                                        <li><a href=\"Contact.jsp\">Add Contact Details</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <header>Other Details</header>\n");
      out.write("                                    <ul class=\"mega-links\">\n");
      out.write("                                        <li><a href=\"Partner_preferance.jsp\">Partner Preference Details</a></li>\n");
      out.write("                                        <li><a href=\"Family.jsp\">Add Family Details</a></li>\n");
      out.write("                                        <li><a href=\"Lifestyle.jsp\">Add Lifestyle Details</a></li>\n");
      out.write("                                        <li><a href=\"User_Success_Story.jsp\">ADD SUCCESS STORY</a></li>\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav-links\">\n");
      out.write("                    <li>\n");
      out.write("\n");
      out.write("                        <a href=\"#\" class=\"desktop-item\">View/Update your Profile</a>\n");
      out.write("                        <input type=\"checkbox\" id=\"showMega\">\n");
      out.write("                        <label for=\"showMega\" class=\"mobile-item\">View/Update your Profile</label>\n");
      out.write("                        <div class=\"mega-box\">\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <img src=\"Imagess/homeImg.jpg\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <header> View Personal Details</header>\n");
      out.write("                                    <ul class=\"mega-links\">\n");
      out.write("                                        <li><a href=\"Basic_details_view.jsp\">View Basic Details</a></li>\n");
      out.write("                                        <li><a href=\"Ethinicity_view.jsp\">View Ethnicity Details</a></li>\n");
      out.write("                                        <li><a href=\"Social_view.jsp\">View Social Details</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <header> View Address Details </header>\n");
      out.write("                                    <ul class=\"mega-links\">\n");
      out.write("                                        <li><a href=\"Address_view.jsp\">View Address Details</a></li>\n");
      out.write("                                        <li><a href=\"Working_view.jsp\">View Working Details</a></li>\n");
      out.write("                                        <li><a href=\"Career_view.jsp\">View Career Details</a></li>\n");
      out.write("                                        <li><a href=\"Contact_view.jsp\">View Contact Details</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <header>View Other Details</header>\n");
      out.write("                                    <ul class=\"mega-links\">\n");
      out.write("                                        <li><a href=\"Partner_preferance_view.jsp\">View Partner Preference </a></li>\n");
      out.write("                                        <li><a href=\"Family_view.jsp\">View Family Details</a></li>\n");
      out.write("                                        <li><a href=\"Lifetyle_view.jsp\">View Lifestyle Details</a></li>\n");
      out.write("                                        <li><a href=\"User_Success_Story_View.jsp\">VIEW SUCCESS STORY</a></li>\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <label for=\"menu-btn\" class=\"btn menu-btn\"><i class=\"fas fa-bars\"></i></label>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
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
