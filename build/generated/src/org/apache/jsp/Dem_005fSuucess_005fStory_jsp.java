package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dem_005fSuucess_005fStory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Dem_Suucess_Story Page</title>\n");
      out.write("        <style>\n");
      out.write("            @import url(https://fonts.googleapis.com/css?family=Varela+Round);\n");
      out.write("\n");
      out.write("            html, body { background: #333 url(\"https://codepen.io/images/classy_fabric.png\"); }\n");
      out.write("\n");
      out.write("            .slides {\n");
      out.write("                padding: 0;\n");
      out.write("                width: 609px;\n");
      out.write("                height: 420px;\n");
      out.write("                display: block;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .slides * {\n");
      out.write("                user-select: none;\n");
      out.write("                -ms-user-select: none;\n");
      out.write("                -moz-user-select: none;\n");
      out.write("                -khtml-user-select: none;\n");
      out.write("                -webkit-user-select: none;\n");
      out.write("                -webkit-touch-callout: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .slides input { display: none; }\n");
      out.write("\n");
      out.write("            .slide-container { display: block; }\n");
      out.write("\n");
      out.write("            .slide {\n");
      out.write("                top: 0;\n");
      out.write("                opacity: 0;\n");
      out.write("                width: 609px;\n");
      out.write("                height: 420px;\n");
      out.write("                display: block;\n");
      out.write("                position: absolute;\n");
      out.write("\n");
      out.write("                transform: scale(0);\n");
      out.write("\n");
      out.write("                transition: all .7s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .slide img {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav label {\n");
      out.write("                width: 200px;\n");
      out.write("                height: 100%;\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("\n");
      out.write("                opacity: 0;\n");
      out.write("                z-index: 9;\n");
      out.write("                cursor: pointer;\n");
      out.write("\n");
      out.write("                transition: opacity .2s;\n");
      out.write("\n");
      out.write("                color: #FFF;\n");
      out.write("                font-size: 156pt;\n");
      out.write("                text-align: center;\n");
      out.write("                line-height: 380px;\n");
      out.write("                font-family: \"Varela Round\", sans-serif;\n");
      out.write("                background-color: rgba(255, 255, 255, .3);\n");
      out.write("                text-shadow: 0px 0px 15px rgb(119, 119, 119);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .slide:hover + .nav label { opacity: 0.5; }\n");
      out.write("\n");
      out.write("            .nav label:hover { opacity: 1; }\n");
      out.write("\n");
      out.write("            .nav .next { right: 0; }\n");
      out.write("\n");
      out.write("            input:checked + .slide-container  .slide {\n");
      out.write("                opacity: 1;\n");
      out.write("\n");
      out.write("                transform: scale(1);\n");
      out.write("\n");
      out.write("                transition: opacity 1s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input:checked + .slide-container .nav label { display: block; }\n");
      out.write("\n");
      out.write("            .nav-dots {\n");
      out.write("                width: 100%;\n");
      out.write("                bottom: 9px;\n");
      out.write("                height: 11px;\n");
      out.write("                display: block;\n");
      out.write("                position: absolute;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-dots .nav-dot {\n");
      out.write("                top: -5px;\n");
      out.write("                width: 11px;\n");
      out.write("                height: 11px;\n");
      out.write("                margin: 0 4px;\n");
      out.write("                position: relative;\n");
      out.write("                border-radius: 100%;\n");
      out.write("                display: inline-block;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.6);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-dots .nav-dot:hover {\n");
      out.write("                cursor: pointer;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.8);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input#img-1:checked ~ .nav-dots label#img-dot-1,\n");
      out.write("            input#img-2:checked ~ .nav-dots label#img-dot-2,\n");
      out.write("            input#img-3:checked ~ .nav-dots label#img-dot-3,\n");
      out.write("            input#img-4:checked ~ .nav-dots label#img-dot-4,\n");
      out.write("            input#img-5:checked ~ .nav-dots label#img-dot-5,\n");
      out.write("            input#img-6:checked ~ .nav-dots label#img-dot-6 {\n");
      out.write("                background: rgba(0, 0, 0, 0.8);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul class=\"slides\">\n");
      out.write("            <input type=\"radio\" name=\"radio-btn\" id=\"img-1\" checked />\n");
      out.write("            <li class=\"slide-container\">\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                    <img src=\"http://farm9.staticflickr.com/8072/8346734966_f9cd7d0941_z.jpg\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <label for=\"img-6\" class=\"prev\">&#x2039;</label>\n");
      out.write("                    <label for=\"img-2\" class=\"next\">&#x203a;</label>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <input type=\"radio\" name=\"radio-btn\" id=\"img-2\" />\n");
      out.write("            <li class=\"slide-container\">\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                    <img src=\"http://farm9.staticflickr.com/8504/8365873811_d32571df3d_z.jpg\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <label for=\"img-1\" class=\"prev\">&#x2039;</label>\n");
      out.write("                    <label for=\"img-3\" class=\"next\">&#x203a;</label>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <input type=\"radio\" name=\"radio-btn\" id=\"img-3\" />\n");
      out.write("            <li class=\"slide-container\">\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                    <img src=\"http://farm9.staticflickr.com/8068/8250438572_d1a5917072_z.jpg\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <label for=\"img-2\" class=\"prev\">&#x2039;</label>\n");
      out.write("                    <label for=\"img-4\" class=\"next\">&#x203a;</label>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <input type=\"radio\" name=\"radio-btn\" id=\"img-4\" />\n");
      out.write("            <li class=\"slide-container\">\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                    <img src=\"http://farm9.staticflickr.com/8061/8237246833_54d8fa37f0_z.jpg\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <label for=\"img-3\" class=\"prev\">&#x2039;</label>\n");
      out.write("                    <label for=\"img-5\" class=\"next\">&#x203a;</label>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <input type=\"radio\" name=\"radio-btn\" id=\"img-5\" />\n");
      out.write("            <li class=\"slide-container\">\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                    <img src=\"http://farm9.staticflickr.com/8055/8098750623_66292a35c0_z.jpg\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <label for=\"img-4\" class=\"prev\">&#x2039;</label>\n");
      out.write("                    <label for=\"img-6\" class=\"next\">&#x203a;</label>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <input type=\"radio\" name=\"radio-btn\" id=\"img-6\" />\n");
      out.write("            <li class=\"slide-container\">\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                    <img src=\"http://farm9.staticflickr.com/8195/8098750703_797e102da2_z.jpg\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <label for=\"img-5\" class=\"prev\">&#x2039;</label>\n");
      out.write("                    <label for=\"img-1\" class=\"next\">&#x203a;</label>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-dots\">\n");
      out.write("                <label for=\"img-1\" class=\"nav-dot\" id=\"img-dot-1\"></label>\n");
      out.write("                <label for=\"img-2\" class=\"nav-dot\" id=\"img-dot-2\"></label>\n");
      out.write("                <label for=\"img-3\" class=\"nav-dot\" id=\"img-dot-3\"></label>\n");
      out.write("                <label for=\"img-4\" class=\"nav-dot\" id=\"img-dot-4\"></label>\n");
      out.write("                <label for=\"img-5\" class=\"nav-dot\" id=\"img-dot-5\"></label>\n");
      out.write("                <label for=\"img-6\" class=\"nav-dot\" id=\"img-dot-6\"></label>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
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
