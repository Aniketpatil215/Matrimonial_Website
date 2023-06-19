<%-- 
    Document   : Working_Update1
    Created on : 27 Apr, 2023, 11:23:49 PM
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
        <title>Ethnicity Details Update</title>
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
                font-size: 20px;
                font-weight: bold;
                color: #fff;
            }

        </style>
    </head>
    <body>
        <%@include file="User_header.jsp"%>




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
                                    <input type="text" name="uid" value="<%=request.getParameter("uid")%>"  class="form-control" id="name" placeholder="Enter id" onkeypress="javascript:return isNumber(event)" >
                                </div>
                                <div class="col-sm-4">
                                    <label>Employed In :</label> 
                                    <input type="text"  name="employed_in" value="<%=request.getParameter("employed_in")%>"  class="form-control" id="name" placeholder="Enter information" onkeypress="javascript:return isString(event)">
                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>





                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Business In :</label> 
                                    <input type="text"  name="bussiness_in" value="<%=request.getParameter("bussiness_in")%>" class="form-control" id="name" placeholder="Enter information" onkeypress="javascript:return isString(event)">
                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>


                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Annual Income :</label> 
                                    <input type="text" name="annual_income" value="<%=request.getParameter("annual_income")%>" class="form-control" id="name" placeholder="Enter your annual income"onkeypress="javascript:return isFloat(event)">


                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Working Address :</label> 
                                    <textarea type="textarea" name="working_address" class="form-control" id="name" placeholder="Enter your address" onkeypress="javascript:return isString(event)"> <%=request.getParameter("working_address")%> </textarea>


                                </div>
                                <div class="col-sm-2">  </div>

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
