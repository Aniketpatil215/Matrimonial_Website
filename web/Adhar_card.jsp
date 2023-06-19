<%-- 
    Document   : Adhar_card
    Created on : 18 Apr, 2023, 10:16:43 AM
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
        <title>Adhar_card </title>
        <link rel="stylesheet" href="bootstrap.min.css"> 

        <style>

            body
            {
                background-image:url(Imagess/couple5.jpg);
                background-position:center;
                background-size: cover;

            }

            .container
            {
                background-image: linear-gradient(to right top, #051937, #003852, #00575b, #327457, #7a8c53);
                background: transparent;
                background-color: rgba(255, 255, 255, 0.3);
                border-radius: 10px;
                border: 1px solid rgba(255,255,255,0.3); 
                background: rgba(0,0,0,0.5);
                position: relative;
                margin-top: 50px;

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
                font-size: 20px;
                font-weight: bold;
                color: #fff;
            }

        </style>
    </head>
    <body>
        <%@include file="Admin_header.jsp"%>




        <form action="Adhar_card" method="post">

            <script src="validation.js"></script>

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <div class="container"><br>


                        <div class="ethinicity-detail" class="form-group">

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">
                                    <h2> Aadharcard Number </h2><br>

                                </div>
                                <div class="col-sm-2"></div>
                            </div>




                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">


                                    <label> Name :</label>              
                                    <input type="text" class="form-control" name="name" id="name" placeholder="Enter name" onkeypress="javascript:return isString(event)" required >


                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>






                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">
                                    <label>Email Id :</label> 
                                    <input type="email" class="form-control"  name="email" id="name" placeholder="Enter your email id " required>


                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>


                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Aadhar Number :</label> 
                                    <input type="number" class="form-control"  name="Adharcard_no" id="name" placeholder="Enter your Aadhar Number " minlength="12" maxlength="12"  required>

                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>





                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-4">
                                    <input type="reset" value="Cancel" class="btn btn-danger form-control "  style="font-family: 'Times New Roman';">
                                </div>  <div class="col-sm-4">

                                    <input type="Submit" name="btn" value="Submit" class="btn btn-success form-control "  style="font-family: 'Times New Roman';">
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
