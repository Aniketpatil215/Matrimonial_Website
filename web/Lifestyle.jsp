<%-- 
    Document   : Lifetyle
    Created on : 14 Feb, 2023, 12:48:14 PM
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
        <title> lifestyle Details</title>
        <link rel="stylesheet" href="bootstrap.min.css"> 

        <style>

            body
            {
                background-image:url(Imagess/banner.jpg);
                background-position:center;

            }

            .container
            {
                background-image: linear-gradient(to right top, #051937, #003852, #00575b, #327457, #7a8c53);
                margin-top: 20px;
                background: transparent;
                background-color: rgba(255, 255, 255, 0.3);
                border-radius: 10px;
                border: 1px solid rgba(255,255,255,0.3); 
                background: rgba(0,0,0,0.5);
                position: relative;
                margin-top: 90px;


            }

            input
            {
                color: black;
                font-size: 20px;
                font-family: 'Times New Roman';
                font-weight: bold;

            }

            h2
            {
                text-align: center;
                color: #fff; font-family: 'Times New Roman'; font-weight: bold;

            }
            label
            {
                font-family: 'Times New Roman';
                font-size: 22px;
                font-weight: bold;
                color: #fff;
            }

        </style>
    </head>
    <body>
        <%@include file="User_header.jsp"%>

        <%
            Connection cn = null;
            Statement st = null;
            String id = "1";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select uid from User_Success_Story";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    id = String.valueOf(Integer.parseInt(rs.getString("uid")) + 1);
                }

            } catch (Exception ex) {
                out.println(ex);
            }
        %>

        <form action="Lifestyle" method="post">

            <script src="validation.js"></script>

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <div class="container"><br>


                        <div class="lifestyle-detail" class="form-group">

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">
                                    <h2> Lifestyle Details</h2><br>

                                </div>
                                <div class="col-sm-2"></div>
                            </div>



                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-4">

                                    <label>User Id :</label> 
                                    <input type="text" name="uid" value="<%=session.getAttribute("uid")%>"  class="form-control" id="name" placeholder="Enter id" onkeypress="javascript:return isNumber(event)" readonly="" >

                                </div>
                                <div class="col-sm-4">

                                    <label>Habit :</label> 
                                    <input type="text" name="habit" class="form-control" id="name" placeholder="Enter your habits" onkeypress="javascript:return isString(event)" required="">

                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>



                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-4">

                                    <label>Skill :</label> 
                                    <input type="text" name="skill" class="form-control" id="name" placeholder="Enter your skill" onkeypress="javascript:return isString(event)" required="">

                                </div>
                                <div class="col-sm-4">

                                    <label>Hobbies :</label> 
                                    <input type="text" name="hobbies" class="form-control" id="name" placeholder="Enter your hobiies" onkeypress="javascript:return isString(event)" required="">

                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>



                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-4">

                                    <label>Intrest :</label> 
                                    <input type="text" name="intrest" class="form-control" id="name" placeholder="Enter your intrest" onkeypress="javascript:return isString(event)" required="">

                                </div>
                                <div class="col-sm-4">
                                    <label>Favourite :</label> 
                                    <input type="text" name="favourite" class="form-control" id="name" placeholder="Enter your favourite" onkeypress="javascript:return isString(event)" required="">

                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>



                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-4">
                                    <input type="reset" value="Cancel" class="btn btn-danger form-control "  style="font-family: 'Times New Roman';">
                                </div>  <div class="col-sm-4">

                                    <input type="Submit" name="btn" value="Save & Next" class="btn btn-success form-control "  style="font-family: 'Times New Roman';">
                                </div>

                                <div class="col-sm-2"></div>
                            </div><br><br>

                        </div>
                        <div class="col-sm-3"></div>
                    </div>
                </div>

        </form>
    </body>
</html>
