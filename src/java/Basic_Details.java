/*mnb

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
public class Basic_Details extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String uid = req.getParameter("uid");
        String fname = req.getParameter("fname");
        String gender = req.getParameter("gender");
        String age = req.getParameter("age");
        String dob = req.getParameter("dob");
        String height = req.getParameter("height");
        String weight = req.getParameter("weight");
        String img = req.getParameter("img");
        String btn = req.getParameter("btn");

        out.println(uid);
        out.println(fname);
        out.println(gender);
        out.println(age);
        out.println(dob);
        out.println(height);
        out.println(weight);
        out.println(img);

        Database db = new Database();
        out.println(db.ConnectDB());

        int a = Integer.parseInt(age);
        out.println(a);
        HttpSession session = req.getSession();

        if (btn.equals("Save & Next")) {

            if (a <= 18) {

                resp.setContentType("text/html;charset=UTF-8");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Not Eligible');");
                out.println("location='Basic_Details.jsp';");
                out.println("</script>");

            } 
            
            else  {

                String insert = ("insert into Basic_Details (uid,fname,gender,age,dob,height,weight,img) values ('" + uid + "','" + fname + "','" + gender + "','" + age + "','" + dob + "','" + height + "','" + weight + "','Imagess/" + img + "') ");
                String result = db.Insert(insert, "Record Inserted");
                out.println(result);

                resp.setContentType("text/html;charset=UTF-8");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Record Inserted');");
                out.println("location='Address.jsp';");
                out.println("</script>");
            }

        }

        if (btn.equals("Update")) {

            String update = ("update  Basic_Details set fname='" + fname + "',gender='" + gender + "',age='" + age + "',dob='" + dob + "',height='" + height + "',weight='" + weight + "',img='Imagess/" + img + "' where uid='" + uid + "'");
            String result = db.Update(update, "Record Updated");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Updated');");
            out.println("location='Basic_details_view.jsp';");
            out.println("</script>");

        }

        if (btn.equals("Delete")) {

            String delete = "delete from Basic_Details  where uid='" + uid + "'";
            String result = db.Delete(delete, "Record Deleted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Deleted');");
            out.println("location='Basic_details_view.jsp';");
            out.println("</script>");

        }

    }
}
