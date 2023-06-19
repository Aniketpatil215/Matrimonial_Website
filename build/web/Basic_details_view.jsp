<%-- 
    Document   : Basic_details_view
    Created on : 9 Mar, 2023, 7:04:46 PM
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
        <title>Basic_details_view</title>
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


        <div class="container-fluid"  >


            <br>
            <h1 style=" margin-top: 80px;">Basic Details View list</h1>
            <br>




            <table class="table table-bordered " >
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">User ID</th>
                        <th scope="col">Full Name</th>
                        <th scope="col">Gender</th>
                        <th scope="col">Age</th>
                        <th scope="col">DOB</th>
                        <th scope="col">Height</th>
                        <th scope="col">Weight</th>
                        <th scope="col">Image</th>
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
                            sql = "select * from Basic_Details where id='" + id + "' ";
                        } else {
                            sql = "select * from Basic_Details where uid='" + session.getAttribute("uid") + "' ";
                        }

                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                            st = cn.createStatement();

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    %>

                    <tr>
                <form action="Basic_details_Update.jsp" method="post">
                    <th scope="row"><%=counter++%></th>

                    <td><%=rs.getString("uid")%></td>
                    <input type="hidden" name="uid" value="<%=rs.getString("uid")%>">

                    <td><%=rs.getString("fname")%></td>
                    <input type="hidden" name="fname" value="<%=rs.getString("fname")%>">

                    <td><%=rs.getString("gender")%></td>
                    <input type="hidden" name="gender" value="<%=rs.getString("gender")%>">

                    <td><%=rs.getString("age")%></td>
                    <input type="hidden" name="age" value="<%=rs.getString("age")%>">

                    <td><%=rs.getString("dob")%></td>
                    <input type="hidden" name="dob" value="<%=rs.getString("dob")%>">

                    <td><%=rs.getString("height")%></td>
                    <input type="hidden" name="height" value="<%=rs.getString("height")%>">

                    <td><%=rs.getString("weight")%></td>
                    <input type="hidden" name="weight" value="<%=rs.getString("weight")%>">

                    <td><%=rs.getString("img")%></td>


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
