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
public class Address extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String uid = req.getParameter("uid");
        String country = req.getParameter("country");
        String state = req.getParameter("state");
        String city = req.getParameter("city");
        String btn = req.getParameter("btn");

        out.println(uid);
        out.println(country);
        out.println(state);
        out.println(city);

        Database db = new Database();
        out.println(db.ConnectDB());

        if (btn.equals("Save & Next")) {
            Connection cn = null;
            Statement st = null;

            try {

                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Address where uid='" + uid + "' ";
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Already Inserted Data ');");
                    out.println("location='Address_view.jsp';");
                    out.println("</script>");

                } else {

                    String insert = ("insert into Address (uid,country,state,city) values ('" + uid + "','" + country + "','" + state + "','" + city + "') ");
                    String result = db.Insert(insert, "Record Inserted");
                    out.println(result);

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Ethinicity.jsp';");
                    out.println("</script>");
                }
            } catch (Exception ex) {
                out.println(ex.toString());
            }
        }
            if (btn.equals(
                    "Update")) {

                String update = ("update  Address set country='" + country + "',state='" + state + "',city='" + city + "' where uid='" + uid + "'");
                String result = db.Update(update, "Record Updated");
                out.println(result);

                resp.setContentType("text/html;charset=UTF-8");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Record Updated');");
                out.println("location='Address_view.jsp';");
                out.println("</script>");

            }

            if (btn.equals(
                    "Delete")) {

                String delete = "delete from Address  where uid='" + uid + "'";
                String result = db.Delete(delete, "Record Deleted");
                out.println(result);

                resp.setContentType("text/html;charset=UTF-8");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Record Deleted');");
                out.println("location='Address_view.jsp';");
                out.println("</script>");

            }

        }
    }
