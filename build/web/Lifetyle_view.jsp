<%-- 
    Document   : Lifetyle_view
    Created on : 10 Mar, 2023, 12:35:14 PM
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
        <title>Lifestyle_view</title>
        <link rel="stylesheet" href="bootstrap.min.css">
        <style>
            td
            {
                font-weight: bold;
            }

        </style>
    </head>
    <body>

        <%@include file="User_header.jsp"%>


        <div class="container-fluid">
            
            
            <br>
            <h1 style=" margin-top: 80px;">Lifestyle Details View list</h1>
            <br>

           

            <table class="table table-bordered ">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">User ID</th>
                        <th scope="col">Habit</th>
                        <th scope="col">Skill</th>
                        <th scope="col">Hobbies</th>
                        <th scope="col">Interest</th>
                        <th scope="col">favourite</th>
                        <th scope="col">Update</th>
                        <th scope="col">Delete</th>

                    </tr>
                </thead>

                <tbody>

                    <%

                        Connection cn = null;
                        Statement st = null;
                        int counter = 1;
                        
                        String sql = "";
                        String id = request.getParameter("id");
                        String btn = request.getParameter("btn");

                        if (btn != null) {
                            sql = "select * from lifestyle where id='" + id + "' ";
                        } else {
                            sql = "select * from lifestyle where uid='" + session.getAttribute("uid") + "' ";
                        }

                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                            st = cn.createStatement();

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    %>
                    <tr>
                <form action="Liestyle_Update.jsp" method="post">

                    <th scope="row"><%=counter++%></th>
                    <td><%=rs.getString("uid")%></td>
                    <input type="hidden" name="uid" value="<%=rs.getString("uid")%>">

                    <td><%=rs.getString("habit")%></td>
                    <input type="hidden" name="habit" value="<%=rs.getString("habit")%>">

                    <td><%=rs.getString("skill")%></td>
                    <input type="hidden" name="skill" value="<%=rs.getString("skill")%>">

                    <td><%=rs.getString("hobbies")%></td>
                    <input type="hidden" name="hobbies" value="<%=rs.getString("hobbies")%>">

                    <td><%=rs.getString("intrest")%></td>
                    <input type="hidden" name="intrest" value="<%=rs.getString("intrest")%>">

                    <td><%=rs.getString("favourite")%></td>
                    <input type="hidden" name="favourite" value="<%=rs.getString("favourite")%>">

                    <td>  <input type="Submit" name="btn" value="Update" class="btn btn-success  "  style="font-family: 'Times New Roman';"></td>
                    <td><input type="Submit" name="btn"  value="Delete" class="btn btn-danger "   style="font-family: 'Times New Roman';"></td>


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
