<%-- 
    Document   : Family_view
    Created on : 10 Mar, 2023, 10:52:34 AM
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
        <title>Family_view</title>
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
            <h1 style=" margin-top: 80px;">Family Details View list</h1>
            <br>

      

            <table class="table table-bordered ">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">User ID</th>
                        <th scope="col">Family Type</th>
                        <th scope="col">Family Value</th>
                        <th scope="col">Family Income</th>
                        <th scope="col">Father Occupation</th>
                        <th scope="col">Mother Occupation</th>
                        <th scope="col">Brother</th>
                        <th scope="col">Sister</th>
                        <th scope="col">Family Based On</th>
                        <th scope="col">Gothra</th>
                        <th scope="col">Family Status</th>
                        <th scope="col">About Family </th>
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
                            sql = "select * from family where id='" + id + "' ";
                        } else {
                            sql = "select * from family where uid='" + session.getAttribute("uid") + "' ";
                        }

                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                            st = cn.createStatement();

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    %>
                    <tr>
                <form action="Family_Update.jsp" method="post">

                    <th scope="row"><%=counter++%></th>
                    <td><%=rs.getString("uid")%></td>
                    <input type="hidden" name="uid" value="<%=rs.getString("uid")%>">

                    <td><%=rs.getString("family_type")%></td>
                    <input type="hidden" name="family_type" value="<%=rs.getString("family_type")%>">

                    <td><%=rs.getString("family_value")%></td>
                    <input type="hidden" name="family_value" value="<%=rs.getString("family_value")%>">

                    <td><%=rs.getString("family_income")%></td>
                    <input type="hidden" name="family_income" value="<%=rs.getString("family_income")%>">

                    <td><%=rs.getString("father_occupation")%></td>
                    <input type="hidden" name="father_occupation" value="<%=rs.getString("father_occupation")%>">

                    <td><%=rs.getString("mother_occupation")%></td>
                    <input type="hidden" name="mother_occupation" value="<%=rs.getString("mother_occupation")%>">

                    <td><%=rs.getString("brother")%></td>
                    <input type="hidden" name="brother" value="<%=rs.getString("brother")%>">

                    <td><%=rs.getString("sister")%></td>
                    <input type="hidden" name="sister" value="<%=rs.getString("sister")%>">

                    <td><%=rs.getString("family_based_on")%></td>
                    <input type="hidden" name="family_based_on" value="<%=rs.getString("family_based_on")%>">

                    <td><%=rs.getString("gothra")%></td>
                    <input type="hidden" name="gothra" value="<%=rs.getString("gothra")%>">

                    <td><%=rs.getString("family_status")%></td>
                    <input type="hidden" name="family_status" value="<%=rs.getString("family_status")%>">

                    <td><%=rs.getString("about_family")%></td>
                    <input type="hidden" name="about_family" value="<%=rs.getString("about_family")%>">

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
