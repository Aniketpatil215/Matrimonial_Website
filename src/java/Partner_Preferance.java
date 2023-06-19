
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
public class Partner_Preferance extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String uid = req.getParameter("uid");
        String residental_status = req.getParameter("residental_status");
        String min_age = req.getParameter("min_age");
        String max_age = req.getParameter("max_age");
        String min_height = req.getParameter("min_height");
        String max_height = req.getParameter("max_height");
        String religion = req.getParameter("religion");
        String mother_tongue = req.getParameter("mother_tongue");
        String maritial_status = req.getParameter("maritial_status");
        String manglik = req.getParameter("manglik");
        String min_income = req.getParameter("min_income");
        String max_income = req.getParameter("max_income");
        String education = req.getParameter("education");
        String occupation = req.getParameter("occupation");

        String btn = req.getParameter("btn");

        out.println(uid);
        out.println(residental_status);
        out.println(min_age);
        out.println(max_age);
        out.println(min_height);
        out.println(max_height);
        out.println(religion);
        out.println(mother_tongue);
        out.println(maritial_status);
        out.println(manglik);
        out.println(min_income);
        out.println(max_income);
        out.println(education);
        out.println(occupation);

        Database db = new Database();
        out.println(db.ConnectDB());

        if (btn.equals("Save & Next")) {

            Connection cn = null;
            Statement st = null;

            try {

                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Partner_Preferance where uid='" + uid + "' ";
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Already Inserted Data ');");
                    out.println("location='Partner_preferance_view.jsp';");
                    out.println("</script>");

                } else  {

                    String insert = ("insert into Partner_Preferance (uid,residental_status ,min_age,max_age,min_height,max_height,religion,mother_tongue,maritial_status,min_income,max_income,education,manglik,occupation) values ('" + uid + "','" + residental_status + "','" + min_age + "','" + max_age + "','" + min_height + "','" + max_height + "','" + religion + "','" + mother_tongue + "','" + maritial_status + "','" + min_income + "','" + max_income + "','" + education + "','" + manglik + "','" + occupation + "') ");
                    String result = db.Insert(insert, "Record Inserted");
                    out.println(result);

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Partner_preferance_view.jsp';");
                    out.println("</script>");
                }

            } catch (Exception ex) {
                out.println(ex.toString());
            }
        }

        if (btn.equals("Update")) {

            String update = ("update  Partner_Preferance set  residental_status='" + residental_status + "',min_age='" + min_age + "',max_age='" + max_age + "',min_height='" + min_height + "',max_height='" + max_height + "',religion='" + religion + "',mother_tongue='" + mother_tongue + "',min_income='" + min_income + "',max_income='" + max_income + "',education='" + education + "',manglik='" + manglik + "',occupation='" + occupation + "' where uid='" + uid + "'");
            String result = db.Update(update, "Record Updated");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Updated');");
            out.println("location='Partner_preferance_view.jsp';");
            out.println("</script>");

        }

        if (btn.equals("Delete")) {

            String delete = "delete from Partner_Preferance  where uid='" + uid + "'";
            String result = db.Delete(delete, "Record Deleted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Deleted');");
            out.println("location='Contact.jsp';");
            out.println("</script>");

        }

    }
}
