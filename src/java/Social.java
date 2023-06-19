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
public class Social extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String uid = req.getParameter("uid");
        String marital_status = req.getParameter("marital_status");
        String mother_tongue = req.getParameter("mother_tongue");
        String religion_cast = req.getParameter("religion_cast");
        String horoscope = req.getParameter("horoscope");
        String btn = req.getParameter("btn");

        out.println(uid);
        out.println(marital_status);
        out.println(mother_tongue);
        out.println(religion_cast);
        out.println(horoscope);

        Database db = new Database();
        out.println(db.ConnectDB());

        if (btn.equals("Save & Next")) {
            Connection cn = null;
            Statement st = null;

            try {

                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Social where uid='" + uid + "' ";
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Already Inserted Data ');");
                    out.println("location='Social_view.jsp';");
                    out.println("</script>");

                } else {

                    String insert = ("insert into Social (uid,marital_status,mother_tongue,religion_cast,horoscope) values ('" + uid + "','" + marital_status + "','" + mother_tongue + "','" + religion_cast + "','" + horoscope + "') ");
                    String result = db.Insert(insert, "Record Inserted");
                    out.println(result);

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Family.jsp';");
                    out.println("</script>");

                }

            } catch (Exception ex) {
                out.println(ex.toString());
            }
        }

        if (btn.equals("Update")) {

            String update = ("update  Social set marital_status='" + marital_status + "',mother_tongue='" + mother_tongue + "',religion_cast='" + religion_cast + "',horoscope='" + horoscope + "' where uid='" + uid + "'");
            String result = db.Update(update, "Record Updated");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Updated');");
            out.println("location='Social_view.jsp';");
            out.println("</script>");

        }

        if (btn.equals("Delete")) {

            String delete = "delete from Social  where uid='" + uid + "'";
            String result = db.Delete(delete, "Record Deleted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Deleted');");
            out.println("location='Social_view.jsp';");
            out.println("</script>");

        }

    }
}
