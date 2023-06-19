<%-- 
    Document   : User_Success_Story_View
    Created on : 10 Mar, 2023, 9:32:24 PM
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
        <title>User_success_story_view</title>
        <link rel="stylesheet" href="bootstrap.min.css">


        <style>


            td
            {
                font-weight: bold;
            }



            tr
            {
                background-color: whitesmoke;
            }
        </style>

    </head>
    <body>
        <%@include file="User_header.jsp"%>



        <div class="container-fluid">

            <br>
            <h1 style=" margin-top: 80px;">User Success Story  View list</h1>
            <div class="row">
                <div class="col-sm-4">  </div>  

                    <div class="col-sm-8">    
                        <a href="User_Success_Story.jsp"><input type="submit" name="btn" value="Add Your Success Story" class="btn btn-outline-warning" class="button"></a>
                    </div>
            </div>
            <br>

            <table class="table table-bordered" >
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">User ID</th>
                        <th scope="col">First User</th>
                        <th scope="col">Second User</th>
                        <th scope="col">Images</th>
                        <th scope="col">Description</th>
                        <th scope="col">Update</th>
                        <th scope="col">Delete</th>


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
                            String sql = "select * from User_Success_Story";

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    %>
                    <tr>
                <form action="User_Success_Story_Update.jsp" method="post">

                    <th scope="row"><%=counter++%></th>
                    <td><%=rs.getString("uid")%></td>
                    <input type="hidden" name="uid" value="<%=rs.getString("uid")%>">

                    <td><%=rs.getString("fname")%></td>
                    <input type="hidden" name="fname" value="<%=rs.getString("fname")%>">

                    <td><%=rs.getString("sname")%></td>
                    <input type="hidden" name="sname" value="<%=rs.getString("sname")%>">

                    <td><%=rs.getString("img")%></td>
                    <input type="hidden" name="img" value="<%=rs.getString("img")%>">

                    <td><%=rs.getString("descr")%></td>
                    <input type="hidden" name="descr" value="<%=rs.getString("descr")%>">

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
