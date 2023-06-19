<%-- 
    Document   : Admin_success_story_view_list
    Created on : 21 Mar, 2023, 12:32:35 PM
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
        <title>Admin_success_story_view_list</title>
        <link rel="stylesheet" href="bootstrap.min.css">
        <style>

            body
            {               
                background: rgba(0,0,0,0.5);

            }

        </style>
    </head>
    <body>

        <%@include file="Admin_header.jsp"%>

        <div class="container-fluid">

            <table class="table table-bordered ">
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
                            String sql = "select * from Admin_success_story";

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    %>
                    <tr>
                <form action="Admin_success_story_Update.jsp" method="post">

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
