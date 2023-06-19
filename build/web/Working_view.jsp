<%-- 
    Document   : Working_view
    Created on : 10 Mar, 2023, 9:35:19 PM
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
            <h1 style=" margin-top: 80px;">Working Details View list</h1>
            <br>

          

            <table class="table table-bordered ">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">User Id</th>
                        <th scope="col">Employed In</th>
                        <th scope="col">Business In</th>
                        <th scope="col">Annual Income</th>
                        <th scope="col">Working Address</th>
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
                            sql = "select * from working where id='" + id + "' ";
                        } else {
                            sql = "select * from working where uid='" + session.getAttribute("uid") + "' ";
                        }

                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                            st = cn.createStatement();

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    %>
                    <tr>
                <form action="Working_Update.jsp" method="post">

                    <th scope="row"><%=counter++%></th>
                    <td><%=rs.getString("uid")%></td>
                    <input type="hidden" name="uid" value="<%=rs.getString("uid")%>">

                    <td><%=rs.getString("employed_in")%></td>
                    <input type="hidden" name="employed_in" value="<%=rs.getString("employed_in")%>">

                    <td><%=rs.getString("bussiness_in")%></td>
                    <input type="hidden" name="bussiness_in" value="<%=rs.getString("bussiness_in")%>">

                    <td><%=rs.getString("annual_income")%></td>
                    <input type="hidden" name="annual_income" value="<%=rs.getString("annual_income")%>">

                    <td><%=rs.getString("working_address")%></td>
                    <input type="hidden" name="working_address" value="<%=rs.getString("working_address")%>">

                    <td><input type="Submit" name="btn" value="Update" class="btn btn-success  "  style="font-family: 'Times New Roman';"></td>
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
