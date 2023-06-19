<%-- 
    Document   : Contact_Update
    Created on : 21 Mar, 2023, 3:30:28 PM
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
        <title> Contact Details Update</title>
        <link rel="stylesheet" href="bootstrap.min.css"> 

        <style>

            body
            {
                background:url(Imagess/banner.jpg);
                background-position:center;
                background-size: cover;
                position: relative;
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

        <form action="Contact" method="post">

            <script src="validation.js"></script>

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <div class="container">



                        <div class="contact-detail" class="form-group">

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">
                                    <h2> Contact Details</h2>

                                </div>
                                <div class="col-sm-2"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>User Id :</label> 
                                    <input type="text" name="uid" value="<%=request.getParameter("uid")%>" class="form-control" id="name" placeholder="Enter id" onkeypress="javascript:return isNumber(event)" >

                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br>





                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>Email Id :</label> 
                                    <input type="email" name="email" value="<%=request.getParameter("email")%>" class="form-control" id="name" placeholder="Enter email id">


                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br>


                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>Mobile No :</label> 
                                    <input type="text" name="contact" value="<%=request.getParameter("contact")%>" class="form-control" id="name" placeholder="Enter mobile number" onkeypress="javascript:return isContactno(event)" maxlength="10">
                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br>


                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>Suitable Time To Call :</label> 
                                    <input type="time" name="dtime" value="<%=request.getParameter("dtime")%>" class="form-control" id="name" placeholder="Enter time">


                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br><br>



                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-4">
                                    <input type="Submit" name="btn" value="Update" class="btn btn-primary form-control "  style="font-family: 'Times New Roman';"></a>
                                </div>  <div class="col-sm-4">

                                    <input type="Submit" name="btn" value="Delete" class="btn btn-danger form-control "  style="font-family: 'Times New Roman';">
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
