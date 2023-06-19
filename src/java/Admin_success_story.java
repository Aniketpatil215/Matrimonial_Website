/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aniket
 */
public class Admin_success_story extends HttpServlet {

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

            String insert = ("insert into Admin_success_story (uid,fname,sname,img,descr) values ('" + uid + "','" + fname + "','" + sname + "','Imagess/" + img + "','" + descr + "') ");
            String result = db.Insert(insert, "Record Inserted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Inserted');");
            out.println("location='Admin_success_story.jsp';");
            out.println("</script>");
        }

        if (btn.equals("Update")) {

            String update = ("update  Admin_success_story set fname='" + fname + "',sname='" + sname + "',img='Imagess/" + img + "',descr='" + descr + "' where uid='" + uid + "'");
            String result = db.Update(update, "Record Updated");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Updated');");
            out.println("location='Admin_success_story_view_list.jsp';");
            out.println("</script>");
        }
        if (btn.equals("Delete")) {

            String delete = "delete from Admin_success_story  where uid='" + uid + "'";
            String result = db.Delete(delete, "Record Deleted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Deleted');");
            out.println("location='Admin_success_story_view_list.jsp';");
            out.println("</script>");

        }

    }
}
