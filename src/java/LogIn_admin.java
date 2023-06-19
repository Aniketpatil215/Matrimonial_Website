/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*

/**
 *
 * @author Aniket
 */
public class LogIn_admin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String email = req.getParameter("Email");
        String pass = req.getParameter("pass");
        String btn = req.getParameter("btn");

        
        out.println(email);
        out.println(pass);



        Connection cn = null;
        Statement st = null;
        
       
        if (btn.equals("Login")) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");

                st = cn.createStatement();
                String sql = "select * from admin_signin where email='" + email + "' and pass='" + pass + "'";
                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Login Successfully');");
                    out.println("location='Basic_details_User_profile_admin_side.jsp';");


                    out.println("</script>");

                } else {

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Login Failed');");
                    out.println("location='LogIn_admin.jsp';");
                    out.println("</script>");

                    out.println("Login Failed");

                }

            } catch (Exception ex) {
                out.println(ex.toString());
            }

        }

    }

}
