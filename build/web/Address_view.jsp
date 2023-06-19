<%-- 
    Document   : Address_view
    Created on : 9 Mar, 2023, 10:20:39 AM
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
        <title>Address_view</title>
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
            <h1 style=" margin-top: 80px;">Address View list</h1>
            <br>

        


            <table class="table table-bordered ">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">User ID</th>
                        <th scope="col">Country</th>
                        <th scope="col">State</th>
                        <th scope="col">City</th>
                        <th scope="col">Update</th>
                        <th scope="col">Delete</th>
                    </tr>
                </thead>

                <tbody>

                    <%

                        Connection cn = null;
                        Statement st = null;
                        int counter = 1;

                        String sql ="";
                        String id = request.getParameter("id");
                        String btn = request.getParameter("btn");

                        if (btn != null) {
                            sql = "select * from address where id='" + id + "' ";
                        } else {
                            sql = "select * from address where uid='"+session.getAttribute("uid")+"' ";
                        }

                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                            st = cn.createStatement();
                           

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    %>
                    <tr>
                <form action="Address_Update.jsp" method="post">

                    <th scope="row"><%=counter++%></th>
                    <td><%=rs.getString("uid")%></td>
                    <input type="hidden" name="uid" value="<%=rs.getString("uid")%>">

                    <td><%=rs.getString("country")%></td>
                    <input type="hidden" name="country" value="<%=rs.getString("country")%>">

                    <td><%=rs.getString("state")%></td>
                    <input type="hidden" name="state" value="<%=rs.getString("state")%>">

                    <td><%=rs.getString("city")%></td>
                    <input type="hidden" name="city" value="<%=rs.getString("city")%>">

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
