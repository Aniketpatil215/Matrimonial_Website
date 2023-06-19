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
public class Working extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String uid = req.getParameter("uid");
        String employed_in = req.getParameter("employed_in");
        String bussiness_in = req.getParameter("bussiness_in");
        String annual_income = req.getParameter("annual_income");
        String working_address = req.getParameter("working_address");

        String btn = req.getParameter("btn");

        out.println(uid);
        out.println(employed_in);
        out.println(bussiness_in);
        out.println(annual_income);
        out.println(working_address);

        Database db = new Database();
        out.println(db.ConnectDB());

        if (btn.equals("Save & Next")) {

            
                Connection cn = null;
                Statement st = null;

                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                    st = cn.createStatement();
                    String sql = "select * from Working where uid='" + uid + "' ";
                    ResultSet rs = st.executeQuery(sql);
                    if (rs.next()) {

                        resp.setContentType("text/html;charset=UTF-8");
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Already Inserted Data ');");
                        out.println("location='Working_view.jsp';");
                        out.println("</script>");

                    } else {

                        String insert = ("insert into Working (uid,employed_in,bussiness_in,annual_income,working_address) values ('" + uid + "','" + employed_in + "','" + bussiness_in + "','" + annual_income + "','" + working_address + "') ");
                        String result = db.Insert(insert, "Record Inserted");
                        out.println(result);
                        resp.setContentType("text/html;charset=UTF-8");
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Record Inserted');");
                        out.println("location='Social.jsp';");
                        out.println("</script>");

                    }
                } catch (Exception ex) {
                    out.println(ex.toString());
                }
            }

            if (btn.equals("Update")) {

                String update = ("update  Working set employed_in='" + employed_in + "',bussiness_in='" + bussiness_in + "',annual_income='" + annual_income + "',working_address='" + working_address + "' where uid='" + uid + "'");
                String result = db.Update(update, "Record Updated");
                out.println(result);

                resp.setContentType("text/html;charset=UTF-8");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Record Updated');");
                out.println("location='Working_view.jsp';");
                out.println("</script>");

            }

            if (btn.equals("Delete")) {

                String delete = "delete from Working  where uid='" + uid + "'";
                String result = db.Delete(delete, "Record Deleted");
                out.println(result);

                resp.setContentType("text/html;charset=UTF-8");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Record Deleted');");
                out.println("location='Working_view.jsp';");
                out.println("</script>");

            }

        }
    }
