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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Aniket
 */
public class Basic_details_profile extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession();

        String uid = req.getParameter("uid");
        String age = req.getParameter("age");
        String height = req.getParameter("height");
        String weight = req.getParameter("weight");

        String btn = req.getParameter("btn");

        out.println(uid);
        out.println(age);
        out.println(height);
        out.println(weight);

        Database db = new Database();
        out.println(db.ConnectDB());
        
        if (btn.equals("View Profile")) {
            Connection cn = null;
                Statement st = null;
            
             try {

                    Class.forName("com.mysql.jdbc.Driver");
                    cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                    st = cn.createStatement();
                    String sql = "select * from basic_details where uid='"+session.getAttribute("uid")+"'";
                    ResultSet rs = st.executeQuery(sql);

                    if (rs.next()) {
                        session.setAttribute("uid", uid);
            resp.sendRedirect("All_details_user_profie.jsp");
                    }
                    else
                    {
                        
                        resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Plz First Create Account');");
                    out.println("location='Basic_details_User_profile.jsp';");
                    out.println("</script>");
                        
                     
                    }
                    
                    }catch(Exception ex)
                    {
                    
                    }

            
        
    }
    
    }

}
