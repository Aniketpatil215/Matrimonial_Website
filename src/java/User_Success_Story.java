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
public class User_Success_Story extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String uid = req.getParameter("uid");
        String fname = req.getParameter("fname");
        String sname = req.getParameter("sname");
        String img = req.getParameter("img");
        String descr = req.getParameter("descr");
        String btn = req.getParameter("btn");

        out.println(uid);
        out.println(fname);
        out.println(sname);
        out.println(img);
        out.println(descr);

        Database db = new Database();
        out.println(db.ConnectDB());

        if (btn.equals("Save & Next")) {
            Connection cn = null;
            Statement st = null;

            try {

                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from User_Success_Story where uid='" + uid + "' ";
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Already Inserted Data ');");
                    out.println("location='User_Success_Story_View.jsp';");
                    out.println("</script>");

                } else {

                    String insert = ("insert into User_Success_Story (uid,fname,sname,img,descr) values ('" + uid + "','" + fname + "','" + sname + "','Imagess/" + img + "','" + descr + "') ");
                    String result = db.Insert(insert, "Record Inserted");
                    out.println(result);

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Basic_details_User_profile.jsp';");
                    out.println("</script>");

                }
            } catch (Exception ex) {
                out.println(ex.toString());
            }
        }

        if (btn.equals("Update")) {

            String update = ("update  User_Success_Story set fname='" + fname + "',sname='" + sname + "',img='" + img + "',descr='" + descr + "' where uid='" + uid + "'");
            String result = db.Update(update, "Record Updated");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Updated');");
            out.println("location='User_Success_Story_View.jsp';");
            out.println("</script>");

        }

        if (btn.equals("Delete")) {

            String delete = "delete from User_Success_Story  where uid='" + uid + "'";
            String result = db.Delete(delete, "Record Deleted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Deleted');");
            out.println("location='User_Success_Story_View.jsp';");
            out.println("</script>");

        }

    }
}
