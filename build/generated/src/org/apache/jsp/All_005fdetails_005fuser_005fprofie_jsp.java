package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class All_005fdetails_005fuser_005fprofie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>All_details_user_profie</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\"> \n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .profile-icon {\n");
      out.write("                height: 250px;\n");
      out.write("                width: 250px;\n");
      out.write("                object-fit: cover;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:hover{  \n");
      out.write("                background-color: #102770;\n");
      out.write("                color: #ffeba7;\n");
      out.write("                box-shadow: 0 8px 24px 0 rgba(16,39,112,.2);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            Connection cn = null;
            Statement st = null;

            /*<-----user_signin----> */
            String email = "";
            String contact = "";

            /*<-----basic_details---> */
            String fname = "";
            String age = "";
            String gender = "";
            String dob = "";
            String height = "";
            String weight = "";
            String img = "";
            String uid = "";

            /*<-----Ethinicity---> */
            String religion = "";
            String mother_tongue = "";

            /*<-----Social----> */
            String marital_status = "";
            String religion_cast = "";
            String horoscope = "";

            /*<-----Lifestyle----> */
            String hobbies = "";
            String intrest = "";

            /*<-----Working----> */
            String employed_in = "";
            String bussiness_in = "";
            String annual_income = "";
            String working_address = "";


            /*<-----Career----> */
            String high_qualification = "";
            String graduation_degree = "";
            String future_plan = "";

            /*<-----Family---> */
            String family_type = "";
            String family_income = "";
            String father_occupation = "";
            String mother_occupation = "";
            String brother = "";
            String sister = "";
            String gothra = "";
            String family_status = "";
            String about_family = "";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from user_signin where id='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    email = rs.getString("email");
                    contact = rs.getString("contact");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from basic_details where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    fname = rs.getString("fname");
                    age = rs.getString("age");
                    gender = rs.getString("gender");
                    dob = rs.getString("dob");
                    height = rs.getString("height");
                    weight = rs.getString("weight");
                    img = rs.getString("img");
                    uid = rs.getString("uid");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Ethinicity where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    religion = rs.getString("religion");
                    mother_tongue = rs.getString("mother_tongue");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Social where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    marital_status = rs.getString("marital_status");
                    religion_cast = rs.getString("religion_cast");
                    horoscope = rs.getString("horoscope");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Lifestyle where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    hobbies = rs.getString("hobbies");
                    intrest = rs.getString("intrest");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Career where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    high_qualification = rs.getString("high_qualification");
                    graduation_degree = rs.getString("graduation_degree");
                    future_plan = rs.getString("future_plan");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Working where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    employed_in = rs.getString("employed_in");
                    bussiness_in = rs.getString("bussiness_in");
                    annual_income = rs.getString("annual_income");
                    working_address = rs.getString("working_address");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Family where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    family_type = rs.getString("family_type");
                    family_income = rs.getString("family_income");
                    father_occupation = rs.getString("father_occupation");
                    mother_occupation = rs.getString("mother_occupation");
                    brother = rs.getString("brother");
                    sister = rs.getString("sister");
                    gothra = rs.getString("gothra");
                    family_status = rs.getString("family_status");
                    about_family = rs.getString("about_family");

                }

            } catch (Exception ex) {
                out.println(ex);
            }


        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section style=\"background-color: #eee;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <nav aria-label=\"breadcrumb\" class=\"bg-light rounded-3 p-3 mb-4\">\n");
      out.write("\n");
      out.write("                            <h5 style=\" font-style: oblique; font-weight: bold;text-align: center;\">User Profile</h5>\n");
      out.write("\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <img src=\"");
      out.print(img);
      out.write("\" alt=\"avatar\" class=\"profile-icon\"  >\n");
      out.write("                                <h3 class=\"my-3\">");
      out.print(fname);
      out.write(" </h3>\n");
      out.write("\n");
      out.write("                              \n");
      out.write("\n");
      out.write("                                <div >\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <a href=\"https://wa.me/+91");
      out.print(contact);
      out.write("\" class=\"btn btn-primary\">WhatsApp</a>\n");
      out.write("\n");
      out.write("                                    <a href=\"mailto:");
      out.print(email);
      out.write("\"   class=\"btn btn-danger ms-1\">Send Email</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"card mb-4 mb-lg-0\">\n");
      out.write("\n");
      out.write("                            <div class=\"card mb-4\" >\n");
      out.write("                                <div class=\"card-body\"   >\n");
      out.write("                                    <div class=\"row\" >\n");
      out.write("                                        <div class=\"col-sm-1\">  </div>\n");
      out.write("                                        <div class=\"col-sm-11\">\n");
      out.write("\n");
      out.write("                                            <div >\n");
      out.write("                                                <h5> Ethnicity , Social & Lifestyle  Details </h5>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <p class=\"mb-0\">Marital Status</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <p class=\"text-muted mb-0\">");
      out.print(marital_status);
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <p class=\"mb-0\">Religion-Cast </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <p class=\"text-muted mb-0\">");
      out.print(religion_cast);
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <p class=\"mb-0\">Mother tongue</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <p class=\"text-muted mb-0\">");
      out.print(mother_tongue);
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <p class=\"mb-0\">Horoscope</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <p class=\"text-muted mb-0\">");
      out.print(horoscope);
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <p class=\"mb-0\">Hobbies </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <p class=\"text-muted mb-0\">");
      out.print(hobbies);
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <p class=\"mb-0\">Intrest </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <p class=\"text-muted mb-0\">");
      out.print(intrest);
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"row\" >\n");
      out.write("                                    <div class=\"col-sm-4\">  </div>\n");
      out.write("                                    <div class=\"col-sm-5\">\n");
      out.write("                                        <h5> Personal Details </h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-3\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <p class=\"mb-0\">Full Name</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <p class=\"text-muted mb-0\">");
      out.print(fname);
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <p class=\"mb-0\">Age :</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <p class=\"text-muted mb-0\">");
      out.print(age);
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <p class=\"mb-0\">Date Of Birth :</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <p class=\"text-muted mb-0\">");
      out.print(dob);
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <p class=\"mb-0\">Height</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <p class=\"text-muted mb-0\">");
      out.print(height);
      out.write(" feet</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <p class=\"mb-0\">Weight</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <p class=\"text-muted mb-0\">");
      out.print(weight);
      out.write(" kg</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"card mb-4 mb-md-0\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"card mb-4\">\n");
      out.write("                                        <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-2\">  </div>\n");
      out.write("                                                <div class=\"col-sm-9\">\n");
      out.write("                                                    <h5> Career & Working Details </h5>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-1\"> </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"mb-0\">High Qualification</p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"text-muted mb-0\">");
      out.print(high_qualification);
      out.write("</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"mb-0\">Graduation Degree </p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"text-muted mb-0\">");
      out.print(graduation_degree);
      out.write("</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"mb-0\">Annual Income :</p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"text-muted mb-0\">");
      out.print(annual_income);
      out.write(" RS</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"mb-0\">Employed In  </p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"text-muted mb-0\">");
      out.print(employed_in);
      out.write("</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"mb-0\">Business In </p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"text-muted mb-0\">");
      out.print(bussiness_in);
      out.write("</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"mb-0\">Working Address</p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"text-muted mb-0\">");
      out.print(working_address);
      out.write("</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"mb-0\">Future Plan  </p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <p class=\"text-muted mb-0\">");
      out.print(future_plan);
      out.write("</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"card mb-4\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-4\">  </div>\n");
      out.write("                                            <div class=\"col-sm-7\">\n");
      out.write("                                                <h5> Family Details </h5>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-1\"> </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <hr>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"mb-0\">Family Type </p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"text-muted mb-0\">");
      out.print(family_type);
      out.write(" </p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"mb-0\">Family Income</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"text-muted mb-0\">");
      out.print(family_income);
      out.write(" Rs</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"mb-0\">Father Occupation</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"text-muted mb-0\">");
      out.print(father_occupation);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"mb-0\">Mother Occupation </p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"text-muted mb-0\">");
      out.print(mother_occupation);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-3\">\n");
      out.write("                                                <p class=\"mb-0\">Brother</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-3\">\n");
      out.write("                                                <p class=\"text-muted mb-0\">");
      out.print(brother);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-3\">\n");
      out.write("                                                <p class=\"mb-0\">Sister</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-3\">\n");
      out.write("                                                <p class=\"text-muted mb-0\">");
      out.print(sister);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"mb-0\"> Family Status  </p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"text-muted mb-0\">");
      out.print(family_status);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"mb-0\"> Gothra </p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"text-muted mb-0\">");
      out.print(gothra);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"mb-0\">About Family </p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <p class=\"text-muted mb-0\">");
      out.print(about_family);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>    \n");
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
