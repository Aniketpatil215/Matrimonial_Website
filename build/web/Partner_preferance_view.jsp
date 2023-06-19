<%-- 
    Document   : Partner_preferance_view
    Created on : 10 Mar, 2023, 12:42:59 PM
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
        <title>Partner_preferance_view</title>
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
            <h1  style=" margin-top: 80px;">Partner Preference Details View list</h1>
            <br>



            <table class="table table-bordered ">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">User ID</th>
                        <th scope="col">Residential Status</th>
                        <th scope="col">Min-Age</th>
                        <th scope="col">Max-Age</th>
                        <th scope="col">Min-Height</th>
                        <th scope="col">Max-Height</th>
                        <th scope="col">Religion</th>
                        <th scope="col">Mother Tongue</th>
                        <th scope="col">Marital Status</th>
                        <th scope="col">Manglik</th>
                        <th scope="col">Min-Income</th>
                        <th scope="col">Max-Income</th>
                        <th scope="col">Education</th>
                        <th scope="col">Occupation</th>
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
                            sql = "select * from partner_preferance where id='" + id + "' ";
                        } else {
                            sql = "select * from partner_preferance where uid='" + session.getAttribute("uid") + "' ";
                        }

                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                            st = cn.createStatement();

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    %>
                    <tr>
                <form action="Partner_preferance_Update.jsp" method="post">

                    <th scope="row"><%=counter++%></th>
                    <td><%=rs.getString("uid")%></td>
                    <input type="hidden" name="uid" value="<%=rs.getString("uid")%>">

                    <td><%=rs.getString("residental_status")%></td>
                    <input type="hidden" name="residental_status" value="<%=rs.getString("residental_status")%>">

                    <td><%=rs.getString("min_age")%></td>
                    <input type="hidden" name="min_age" value="<%=rs.getString("min_age")%>">

                    <td><%=rs.getString("max_age")%></td>
                    <input type="hidden" name="max_age" value="<%=rs.getString("max_age")%>">

                    <td><%=rs.getString("min_height")%></td>
                    <input type="hidden" name="min_height" value="<%=rs.getString("min_height")%>">

                    <td><%=rs.getString("max_height")%></td>
                    <input type="hidden" name="max_height" value="<%=rs.getString("max_height")%>">

                    <td><%=rs.getString("religion")%></td>
                    <input type="hidden" name="religion" value="<%=rs.getString("religion")%>">

                    <td><%=rs.getString("mother_tongue")%></td>
                    <input type="hidden" name="mother_tongue" value="<%=rs.getString("mother_tongue")%>">

                    <td><%=rs.getString("maritial_status")%></td>
                    <input type="hidden" name="maritial_status" value="<%=rs.getString("maritial_status")%>">

                    <td><%=rs.getString("manglik")%></td>
                    <input type="hidden" name="manglik" value="<%=rs.getString("manglik")%>">

                    <td><%=rs.getString("min_income")%></td>
                    <input type="hidden" name="min_income" value="<%=rs.getString("min_income")%>">

                    <td><%=rs.getString("max_income")%></td>
                    <input type="hidden" name="max_income" value="<%=rs.getString("max_income")%>">

                    <td><%=rs.getString("education")%></td>
                    <input type="hidden" name="education" value="<%=rs.getString("education")%>">

                    <td><%=rs.getString("occupation")%></td>
                    <input type="hidden" name="occupation" value="<%=rs.getString("occupation")%>">


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
