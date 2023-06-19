package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
