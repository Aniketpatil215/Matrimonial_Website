<%-- 
    Document   : Adhar_card_view
    Created on : 18 Apr, 2023, 10:57:56 AM
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


            body
            {
                background-color: #138496;
            }

            tr
            {
                background-color: whitesmoke;
            }
        </style>

    </head>
    <body>
        <%@include file="Admin_header.jsp"%>


        <div class="container-fluid">

            <table class="table table-bordered" >
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Name</th>
                        <th scope="col">Email Id</th>
                        <th scope="col">Aadhar Number</th>
                        <th scope="col">Action </th>


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
                            String sql = "select * from adharcard_number";

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    %>
                    <tr>
                <form action="Adhar_card.jsp" method="post">

                    <th scope="row"><%=counter++%></th>

                    <td><%=rs.getString("name")%></td>
                    <input type="hidden" name="name" value="<%=rs.getString("name")%>">

                    <td><%=rs.getString("email")%></td>
                    <input type="hidden" name="email" value="<%=rs.getString("email")%>">

                    <td><%=rs.getString("Adharcard_no")%></td>
                    <input type="hidden" name="Adharcard_no" value="<%=rs.getString("Adharcard_no")%>">

                    <td><input type="Submit" name="btn" value="Approved" class="btn btn-success  "  style="font-family: 'Times New Roman';"></td>


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
