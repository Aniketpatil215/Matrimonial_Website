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
public class Feedback extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String fname = req.getParameter("fname");
        String contact = req.getParameter("contact");
        String email = req.getParameter("email");
        String msg = req.getParameter("msg");
        String btn = req.getParameter("btn");

        out.println(fname);
        out.println(contact);
        out.println(email);
        out.println(msg);

        Database db = new Database();
        out.println(db.ConnectDB());

        if (btn.equals("Save")) {

            String insert = ("insert into Feedback (fname,contact,email,msg) values ('" + fname + "','" + contact + "','" + email + "','" + msg + "') ");
            String result = db.Insert(insert, "Record Inserted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Feedback Submitted ');");
            out.println("location='Feedback.jsp';");
            out.println("</script>");
        }

        if (btn.equals("Cancel")) {

            String delete = "delete from Feedback  where email='" + email + "'";
            String result = db.Delete(delete, "Record Deleted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Data Deleted ');");
            out.println("location='Feedback.jsp';");
            out.println("</script>");
        }

    }
}
