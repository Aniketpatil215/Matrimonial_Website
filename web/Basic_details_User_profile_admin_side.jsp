<%-- 
    Document   : Basic_details_User_profile_admin_side
    Created on : 2 Apr, 2023, 4:50:38 PM
    Author     : Aniket
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic_details_User_profile_admin_side</title>
        <link rel="stylesheet" href="bootstrap.min.css">



        <style>

            h1{
                font-family: Times New Roman;
                font-style: oblique;
                color: #fff;
                font-weight: bold;text-align: center;
            }

            .jumbotron{
                background: #23074d; 
                background: -webkit-linear-gradient(to left, #cc5333, #23074d); 
                background: linear-gradient(to left, #cc5333, #23074d);
                border-bottom: 2px solid whitesmoke;

            }

            body {
                background: #F0F2F0;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to right, #000C40, #F0F2F0);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to right, #000C40, #F0F2F0); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
                font-family: 'PT Sans', sans-serif;
            }


            .profile-container {
                display: flex;
                align-items: center;
                justify-content: center;
                height: 100vh;
                margin: 0 30px;
                border: 2px solid black;
            }

            .profile-card {
                display: inline-block;
                flex: 1 1 30%;
                max-width: 400px;
                background: #fff;
                padding: 30px;

                margin: 10px;

                border-radius: 4px;

                transition: .3s;
            }

            .profile-card:hover {
                transform: scale(1.1);
                box-shadow: 0 0 25px -5px #ccc;
            }

            .profile-icon {
                height: 250px;
                width: 250px;
                object-fit: cover;
                border-radius: 50%;
            }

            .profile-name {
                font-size: 28px;
                font-weight: bold;
                margin: 25px 0 10px 0;
            }

            .profile-position {
                font-size: 16px;
                color: #777;
                font-weight: bold;
            }



            @media screen and (max-width: 1000px) {
                .profile-name {
                    font-size: 18px;
                }
            }

            @media screen and (max-width: 800px) {
                .profile-card {
                    padding: 20px 15px;
                }

                .profile-name {
                    font-size: 16px;
                }
                .jumbotron{
                    display: inline-block;

                }


            }

        </style>
    </head>
    <body>
        <%@include file="Admin_header.jsp"%>


        <div class="jumbotron">
            <h1 > User Profile's</h1>
        </div>

        <div class="container">

            <%

                Connection cn = null;
                Statement st = null;
                int counter = 1;

                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                    st = cn.createStatement();
                    String sql = "select * from basic_details";

                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
            %>




            <div class="profile-card">
                <form action="All_details_user_profie_admin_side.jsp" method="post">
                    <input type="hidden" name="uid" value="<%=rs.getString("uid")%>">
                    <img src=<%=rs.getString("img")%> alt="image1" class="profile-icon" />
                    <div class="profile-name"><%=rs.getString("fname")%><hr></div>


                    <div class="profile-position">AGE: <%=rs.getString("age")%> years</div>
                    <div class="profile-position">Gender :<%=rs.getString("gender")%></div>


                    <input type="submit" name="btn" value="View Profile" class="btn btn-danger" class="button">
                </form>
            </div>



            <%
                    }
                } catch (Exception ex) {

                }

            %>

        </div>
    </body>
</html>
