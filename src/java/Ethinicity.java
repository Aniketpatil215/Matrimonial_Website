
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
public class Ethinicity extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String uid = req.getParameter("uid");
        String religion = req.getParameter("religion");
        String castt = req.getParameter("castt");
        String mother_tongue = req.getParameter("mother_tongue");
        String family_based_on = req.getParameter("family_based_on");

        String btn = req.getParameter("btn");

        out.println(uid);
        out.println(religion);
        out.println(castt);
        out.println(mother_tongue);
        out.println(family_based_on);

        Database db = new Database();
        out.println(db.ConnectDB());

        if (btn.equals("Save & Next")) {
            Connection cn = null;
            Statement st = null;

            try {

                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Ethinicity where uid='" + uid + "' ";
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Already Inserted Data ');");
                    out.println("location='Ethinicity_view.jsp';");
                    out.println("</script>");

                } else {

                    String insert = ("insert into Ethinicity (uid,religion,castt,mother_tongue,family_based_on) values ('" + uid + "','" + religion + "','" + castt + "','" + mother_tongue + "','" + family_based_on + "') ");
                    String result = db.Insert(insert, "Record Inserted");
                    out.println(result);

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Career.jsp';");
                    out.println("</script>");
                }

            } catch (Exception ex) {
                out.println(ex.toString());
            }
        }

        if (btn.equals("Update")) {

            String update = ("update  Ethinicity set religion='" + religion + "',castt='" + castt + "',mother_tongue='" + mother_tongue + "',family_based_on='" + family_based_on + "' where uid='" + uid + "'");
            String result = db.Update(update, "Record Updated");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Updated');");
            out.println("location='Ethinicity_view.jsp';");
            out.println("</script>");
        }

        if (btn.equals("Delete")) {

            String delete = "delete from Ethinicity  where uid='" + uid + "'";
            String result = db.Delete(delete, "Record Deleted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Deleted');");
            out.println("location='Ethinicity_view.jsp';");
            out.println("</script>");

        }

    }
}
