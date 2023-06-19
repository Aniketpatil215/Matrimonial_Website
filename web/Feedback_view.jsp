<%-- 
    Document   : Feedback_view
    Created on : 31 Mar, 2023, 8:09:45 PM
    Author     : Aniket
--%>


<%@page import="java.sql.ResultSet"%>   
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback_view</title>
        <link rel="stylesheet" href="bootstrap.min.css">

    </head>
    <body>
        <%@include file="Admin_header.jsp"%>


        <div class="container-fluid">

            <table class="table table-bordered ">
                <thead class="thead-dark">

                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Full Name</th>
                        <th scope="col">Contact</th>
                        <th scope="col">Email</th>
                        <th scope="col">Message</th>
                    </tr>

                </thead>

                <tbody>

                    <%

                        Connection cn = null;
                        Statement st = null;
                        int counter = 1;

                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                            st = cn.createStatement();
                            String sql = "select * from feedback";

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    %>

                    <tr>
                <form action="Basic_details_Update.jsp" method="post">
                    <th scope="row"><%=counter++%></th>


                    <td><%=rs.getString("fname")%></td>
                    <input type="hidden" name="fname" value="<%=rs.getString("fname")%>">

                    <td><%=rs.getString("contact")%></td>
                    <input type="hidden" name="contact" value="<%=rs.getString("contact")%>">

                    <td><%=rs.getString("email")%></td>
                    <input type="hidden" name="email" value="<%=rs.getString("email")%>">

                    <td><%=rs.getString("msg")%></td>
                    <input type="hidden" name="msg" value="<%=rs.getString("msg")%>">


                </form>
                </tr>

                <%
                        }
                    } catch (Exception ex) {

                    }

                %>

                </tbody>
            </table>

        </div>

    </body>
</html>
