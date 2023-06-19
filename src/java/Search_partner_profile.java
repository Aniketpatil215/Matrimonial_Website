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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Aniket
 */
public class Search_partner_profile extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        PrintWriter out = resp.getWriter();

        String age = req.getParameter("age");
        String height = req.getParameter("height");
        String weight = req.getParameter("weight");

        String btn = req.getParameter("btn");

        out.println(age);
        out.println(height);

        out.println(weight);

        Database db = new Database();
        out.println(db.ConnectDB());

        if (btn.equals("Search Profile")) {

            session.setAttribute("age", age);
            session.setAttribute("education", height);
            session.setAttribute("religion", weight);

            resp.sendRedirect("Basic_details_User_profile.jsp");
            
           
        }

    }
}
