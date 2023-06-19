<%-- 
        Document   : Partner_preferance_Update
    Created on : 21 Mar, 2023, 6:17:56 PM
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
        <title>Partner Preferance Details Update</title>
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
                height: 950px;
                background-image: linear-gradient(to right top, #051937, #003852, #00575b, #327457, #7a8c53);
                margin-top: 50px;
                background: transparent;
                background-color: rgba(255, 255, 255, 0.3);
                border-radius: 10px;
                border: 1px solid rgba(255,255,255,0.3); 
                background: rgba(0,0,0,0.5);
                position: relative;

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



        <form action="Partner_Preferance" method="post">
            <script src="validation.js"></script>

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <div class="container"><br>



                        <div class="partner-pref-detail" class="form-group">

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">
                                    <h2> Partner Preferance  Details</h2><br>

                                </div>
                                <div class="col-sm-2"></div>
                            </div><br>

                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">

                                    <label>User Id :</label> 
                                    <input type="text" name="uid" value="<%=request.getParameter("uid")%>" class="form-control" id="name" placeholder="Enter id" onkeypress="javascript:return isNumber(event)" >

                                </div>
                                <div class="col-sm-5">
                                    <label>Residential Status :</label>
                                    <input type="text" name="residental_status" value="<%=request.getParameter("residental_status")%>" class="form-control" id="name" placeholder=" Enter your residential status" onkeypress="javascript:return isString(event)">
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>



                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label>Min-age :</label> 
                                    <input type="text" name="min_age" value="<%=request.getParameter("min_age")%>" class="form-control" id="name" placeholder="Enter your age" onkeypress="javascript:return isNumber(event)" maxlength="2">
                                </div>
                                <div class="col-sm-5">
                                    <label>Max-age :</label> 
                                    <input type="text" name="max_age" value="<%=request.getParameter("max_age")%>" class="form-control" id="name" placeholder="Enter your age" onkeypress="javascript:return isNumber(event)" maxlength="2" >
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>

                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label>Min-Height :</label> 
                                    <input type="text" name="min_height" value="<%=request.getParameter("min_height")%>" class="form-control" id="name" placeholder="Enter your height " onkeypress="javascript:return isFloat(event)" maxlength="5">
                                </div>
                                <div class="col-sm-5">
                                    <label>Max-Height :</label> 
                                    <input type="text" name="max_height" value="<%=request.getParameter("max_height")%>" class="form-control" id="name" placeholder="Enter your height" onkeypress="javascript:return isFloat(event)" maxlength="5">
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>




                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">

                                    <label>Religion :</label> 
                                    <select name="religion" class="form-control">
                                        <option>Select</option>
                                        <option selected=""><%=request.getParameter("religion")%></option>
                                        <option>Hindu</option>
                                        <option>Other</option>
                                    </select>

                                </div>
                                <div class="col-sm-5">
                                    <label>Mother tongue :</label>
                                    <select name="mother_tongue" class="form-control">
                                        <option>Select</option>
                                        <option selected=""><%=request.getParameter("mother_tongue")%></option>
                                        <option>Marathi</option>
                                        <option>Other</option>
                                    </select>
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>






                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label>Maritial Status:</label> 
                                    <select name="maritial_status" class="form-control">
                                        <option>Select</option>
                                        <option selected=""><%=request.getParameter("maritial_status")%></option>
                                        <option>Married</option>
                                        <option>Unmarried</option>
                                    </select>

                                </div>
                                <div class="col-sm-5">
                                    <label>Manglik:</label>
                                    <select name="manglik" class="form-control">
                                        <option>Select</option>
                                        <option selected=""><%=request.getParameter("manglik")%></option>
                                        <option>Yes</option>
                                        <option>No</option>
                                    </select>
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label> Min-Income :</label> 
                                    <input type="text" name="min_income" value="<%=request.getParameter("min_income")%>" class="form-control" id="name" placeholder="Enter income" onkeypress="javascript:return isFloat(event)" >
                                </div>
                                <div class="col-sm-5">
                                    <label>Max-Income :</label> 
                                    <input type="text" name="max_income" value="<%=request.getParameter("max_income")%>" class="form-control" id="name" placeholder="Enter income" onkeypress="javascript:return isFloat(event)" >
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">

                                    <label>Education:</label> 
                                    <select name="education" class="form-control">
                                        <option>Select</option>
                                        <option selected=""><%=request.getParameter("education")%></option>

                                        <option>Bsc</option>
                                        <option>Select</option>
                                        <option>B.E/B.Tech</option>
                                        <option>B.Pharma</option>
                                        <option>B.Arch</option>
                                        <option>BCS</option>
                                        <option>MCA</option>
                                        <option>B.Com</option>
                                        <option>CA</option>
                                        <option>MBA</option>
                                        <option>BBA</option>
                                        <option>MBBS</option>
                                        <option>M.D.</option>
                                        <option>BHMS</option>
                                        <option>BL/LLB</option>
                                        <option>ML/LLM</option>
                                        <option>Ph.D</option>
                                        <option>M.Phil</option>
                                        <option>Other</option>
                                    </select>

                                </div>
                                <div class="col-sm-5">
                                    <label>Occupation:</label>
                                    <select name="occupation" class="form-control">
                                        <option>Select</option>
                                        <option selected=""><%=request.getParameter("occupation")%></option>
                                        <option>Bussinessman</option>
                                        <option>Office Worker</option>
                                        <option>Civil Services</option>
                                        <option>Army/Armed Forces</option> 
                                        <option>Other</option>
                                    </select>
                                </div>
                                <div class="col-sm-1"></div>
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

