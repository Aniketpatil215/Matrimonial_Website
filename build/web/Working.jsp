<%-- 
    Document   : Working
    Created on : 14 Feb, 2023, 12:05:14 PM
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
        <title> Working Details</title>
        <link rel="stylesheet" href="bootstrap.min.css"> 

        <style>

            body
            {
                background-image:url(Imagess/banner.jpg);
                background-position:center;
                background-size: cover;

            }

            .container
            {
                height: 630px;
                background-image: linear-gradient(to right top, #051937, #003852, #00575b, #327457, #7a8c53);
                margin-top: 50px;
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
                String sql = "select uid from Working";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    id = String.valueOf(Integer.parseInt(rs.getString("uid")) + 1);
                }

            } catch (Exception ex) {
                out.println(ex);
            }
        %>
        <form action="Working" method="post">

            <script src="validation.js"></script>

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <div class="container"><br>


                        <div class="working-detail" class="form-group">

                            <div class="row">
                                <div class="col-sm-4"></div>
                                <div class="col-sm-5">
                                    <h2> Working Details</h2><br>

                                </div>
                                <div class="col-sm-3"></div>
                            </div>


                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-4">

                                    <label>User Id :</label> 
                                    <input type="text" name="uid" value="<%=session.getAttribute("uid")%>" class="form-control" id="name" placeholder="Enter id" onkeypress="javascript:return isNumber(event)" readonly="" >
                                </div>
                                <div class="col-sm-4">
                                    <label>Employed In :</label> 
                                    <input type="text"  name="employed_in"  class="form-control" id="name" placeholder="Enter information" onkeypress="javascript:return isString(event)" required="">
                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>





                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Business In :</label> 
                                    <input type="text"  name="bussiness_in" class="form-control" id="name" placeholder="Enter information" onkeypress="javascript:return isString(event)" required="">
                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>


                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Annual Income :</label> 
                                    <input type="text" name="annual_income" class="form-control" id="name" placeholder="Enter your annual income"onkeypress="javascript:return isAlphanumric(event)" required="">


                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Working Address :</label> 
                                    <textarea type="textarea" name="working_address" class="form-control" id="name" placeholder="Enter your address" onkeypress="javascript:return isString(event)" ></textarea>


                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br><br>



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
                    </div>
                    <div class="col-sm-3"></div>
                </div>
            </div>

        </form>
    </body>
</html>
