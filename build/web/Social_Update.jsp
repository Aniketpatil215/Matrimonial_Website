<%-- 
    Document   : Social_Update
    Created on : 23 Mar, 2023, 1:01:45 PM
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
        <title>Social Details</title>
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
                height: 630px;
                background-image: linear-gradient(to right top, #051937, #003852, #00575b, #327457, #7a8c53);
                margin-top: 50px;
                background: transparent;
                background-color: rgba(255, 255, 255, 0.3);
                border-radius: 10px;
                border: 1px solid rgba(255,255,255,0.3); 
                background: rgba(0,0,0,0.5);
                position: relative;
                 margin-top: 80px;
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


        <form action="Social" method="post">

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <div class="container"><br>




                        <div class="Social-detail" class="form-group">

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">
                                    <h2> Social Details</h2><br>

                                </div>
                                <div class="col-sm-2"></div>
                            </div>



                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-4">

                                    <label>User Id :</label> 
                                    <input type="text" name="uid" value="<%=request.getParameter("uid")%>" class="form-control" id="name" placeholder="Enter ID" onkeypress="javascript:return isNumber(event)" >

                                </div>
                                <div class="col-sm-4">

                                    <label>Marital Status</label> 
                                    <select name="marital_status" class="form-control">
                                        <option selected=""><%=request.getParameter("marital_status")%></option>

                                        <option>Select</option>
                                        <option>Married</option>
                                        <option>Unmarried</option>
                                        <option>Other</option>
                                    </select>
                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>



                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Mother tongue :</label> 
                                    <select name="mother_tongue" class="form-control">
                                        <option selected=""><%=request.getParameter("mother_tongue")%></option>

                                        <option>Select</option>
                                        <option>Marathi</option>
                                        <option>other</option>
                                    </select>

                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>


                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Religion-Cast :</label> 
                                    <select name="religion_cast" class="form-control">
                                        <option selected=""><%=request.getParameter("religion_cast")%></option>

                                        <option>Select</option>
                                        <option>Hindu-Maratha</option>
                                        <option>Other</option>
                                    </select>

                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Horoscope :</label> 
                                    <select name="horoscope" class="form-control">
                                        <option selected=""><%=request.getParameter("horoscope")%></option>

                                        <option>Select</option>
                                        <option>Aries</option>
                                        <option>Taurus</option
                                        <option>Gemini</option>
                                        <option>Cancer</option>
                                        <option>Luo</option>
                                        <option>Virgo</option>
                                        <option>Libra</option>
                                        <option>Scorpio</option>
                                        <option>Sagittarius</option>
                                        <option>Capricorn</option>
                                        <option>Gemini</option>
                                        <option>Aquarius</option>
                                        <option>Pisces</option>
                                    </select>

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
