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

/**
 *
 * @author Aniket
 */
public class Admin_SignIn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String radio = req.getParameter("radio");
        String dob = req.getParameter("dob");
        String email = req.getParameter("email");
        String contact = req.getParameter("contact");
        String pass = req.getParameter("pass");
        String btn = req.getParameter("btn");

        out.println(fname);
        out.println(lname);
        out.println(email);
        out.println(contact);
        out.println(pass);

        Database db = new Database();
        out.println(db.ConnectDB());

        if (btn.equals("SignIn")) {

            Connection cn = null;
            Statement st = null;

            try {

                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from admin_signin where email='" + email + "' ";
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Already Registered');");
                    out.println("location='Admin_register.html';");
                    out.println("</script>");

                } else {
                    String insert = ("insert into admin_signin (fname,lname,radio,dob,email,contact,pass)values ('" + fname + "','" + lname + "','" + radio + "','" + dob + "','" + email + "','" + contact + "','" + pass + "')");
                    String result = db.Insert(insert, "Record Inserted");
                    out.println(result);

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Signin Successfully');");
                    out.println("location='Admin_login.html';");
                    out.println("</script>");
                }
            } catch (Exception ex) {
                out.println(ex.toString());
            }

        }
        if (btn.equals("Cancel")) {

            String delete = "delete from admin_signin  where email='" + email + "'";
            String result = db.Delete(delete, "Record Deleted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Deleted');");
            out.println("location='Admin_register.html';");
            out.println("</script>");

        }

        if (btn.equals("Save")) {
            String update = ("update  admin_signin set pass='" + pass + "' where email='" + email + "'");
            String result = db.Update(update, "Password Change");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Password Change');");
            out.println("location='Admin_login.html';");
            out.println("</script>");
        }

    }

}
