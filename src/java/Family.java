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
public class Family extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String uid = req.getParameter("uid");
        String family_type = req.getParameter("family_type");
        String family_value = req.getParameter("family_value");
        String family_income = req.getParameter("family_income");
        String father_occupation = req.getParameter("father_occupation");
        String mother_occupation = req.getParameter("mother_occupation");
        String brother = req.getParameter("brother");
        String sister = req.getParameter("sister");
        String family_based_on = req.getParameter("family_based_on");
        String gothra = req.getParameter("gothra");
        String family_status = req.getParameter("family_status");
        String about_family = req.getParameter("about_family");

        String btn = req.getParameter("btn");

        out.println(uid);
        out.println(family_type);
        out.println(family_value);
        out.println(family_income);
        out.println(father_occupation);
        out.println(mother_occupation);
        out.println(brother);
        out.println(sister);
        out.println(family_based_on);
        out.println(gothra);
        out.println(family_status);
        out.println(about_family);

        Database db = new Database();
        out.println(db.ConnectDB());

        if (btn.equals("Save & Next")) {
            Connection cn = null;
            Statement st = null;

            try {

                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Family where uid='" + uid + "' ";
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Already Inserted Data ');"); 
                    out.println("</script>");

                } else {

                    String insert = ("insert into Family (uid,family_type,family_value,family_income,father_occupation,mother_occupation,brother,sister,family_based_on,gothra,family_status,about_family) values ('" + uid + "','" + family_type + "','" + family_value + "','" + family_income + "','" + father_occupation + "','" + mother_occupation + "','" + brother + "','" + sister + "','" + family_based_on + "','" + gothra + "','" + family_status + "','" + about_family + "') ");
                    String result = db.Insert(insert, "Record Inserted");
                    out.println(result);

                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Lifestyle.jsp';");
                    out.println("</script>");

                }
            } 
            catch (Exception ex) {
                out.println(ex.toString());
            }
        }

        if (btn.equals("Update")) {

            String update = ("update  Family set family_type='" + family_type + "',family_value='" + family_value + "',family_income='" + family_income + "',father_occupation='" + father_occupation + "', mother_occupation='" + mother_occupation + "',brother='" + brother + "',sister='" + sister + "',family_based_on='" + family_based_on + "', gothra='" + gothra + "',family_status='" + family_status + "',about_family='" + about_family + "' where uid='" + uid + "'");
            String result = db.Update(update, "Record Updated");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Updated');");
            out.println("location='Family_view.jsp';");
            out.println("</script>");

        }

        if (btn.equals("Delete")) {

            String delete = "delete from Family  where uid='" + uid + "'";
            String result = db.Delete(delete, "Record Deleted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Deleted');");
            out.println("location='Family_view.jsp';");
            out.println("</script>");
            
            
            

        }

    }
}
