<%-- 
    Document   : Admin_success_story_view
    Created on : 9 Mar, 2023, 10:44:01 AM
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
        <title>Admin_success_story_view</title>
        <link rel="stylesheet" href="bootstrap.min.css">

        <style>

            body
            {               
                background:url(Imagess/homeImg2.jpg);
                background-position:center;
                background-size: cover;
                position: relative;
            }

            /*           .jumbotron
                        {
                            display: inline-block;
                            margin-top: 20px;
                            padding-bottom: 20px;
                            background-color: whitesmoke;
                            
                        }
            */


            h1
            {
                text-align: center;
                color: black; font-family: 'Times New Roman'; font-weight: bold;

            }  
            h4
            {
                color: brown; font-family: 'Times New Roman'; font-weight: bold;
            }
            h5
            {
                color: black; font-family: 'Times New Roman'; font-weight: bold;

            }

        </style>
    </head>
    <body>
        <%@include file="User_header.jsp"%>

        <div class="container">


            <table class="table">
                <thead>
                <h1> Success Stories</h1><hr>
                </thead>

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
                            String sql = "select * from admin_success_story";

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    %>


                <div class="jumbotron" class="form-group">
                    <div class="row">
                        <div class="col-sm-5">
                            <h5>User ID :<%=rs.getString("uid")%></h5>
                            <img src=<%=rs.getString("img")%> width="300" height="300"/>

                        </div>
                        <div class="col-sm-1 " class="border-top"></div>
                        <div class="col-sm-6 "><br>
                            <h4> First User :</h4>
                            <h5><%=rs.getString("fname")%></h5><br>
                            <h4>Second User :</h4>
                            <h5><%=rs.getString("sname")%></h5><br>
                            <h4> Description :</h4>
                            <h5><%=rs.getString("descr")%></h5><br>
                            <a href="Homepage.jsp" > <input type="Submit" name="btn"  value="Click here to know more"class="btn btn-dark form-control"   style="font-family: 'Times New Roman';"></a>

                        </div>

                    </div>
                </div>

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
