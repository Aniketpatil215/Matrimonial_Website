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
public class Adhar_card extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String Adharcard_no = req.getParameter("Adharcard_no");
        String btn = req.getParameter("btn");

        out.println(name);
        out.println(email);
        out.println(Adharcard_no);

        Database db = new Database();
        out.println(db.ConnectDB());

        if (btn.equals("Submit")) {

            String insert = ("insert into adharcard_number (name,email,Adharcard_no) values ('" + name + "','" + email + "','" + Adharcard_no + "') ");
            String result = db.Insert(insert, "Record Inserted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Inserted');");
            out.println("location='Adhar_card.jsp';");
            out.println("</script>");
        }

        
    }
}
