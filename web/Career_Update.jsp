<%-- 
    Document   : Career_Update
    Created on : 21 Mar, 2023, 2:56:53 PM
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
        <title>Career Details Update</title>
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
                font-size: 20px;
                font-weight: bold;
                color: #fff;
            }

        </style>
    </head>
    <body>
        <%@include file="User_header.jsp"%>


        <form action="Career" method="post">

            <script src="validation.js"></script>


            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <div class="container"><br>


                        <div class="career-detail" class="form-group">

                            <div class="row">
                                <div class="col-sm-4"></div>
                                <div class="col-sm-5">
                                    <h2> Career Details</h2><br>

                                </div>
                                <div class="col-sm-3"></div>
                            </div>


                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-4">

                                    <label>User Id :</label> 
                                    <input type="text" name="uid" value="<%=request.getParameter("uid")%>" class="form-control" id="name" placeholder="User ID" onkeypress="javascript:return isNumber(event)" >


                                </div>
                                <div class="col-sm-4">

                                    <label>High Qualification :</label> 
                                    <select name="high_qualification" class="form-control">
                                        <option selected="" ><%=request.getParameter("high_qualification")%></option>

                                        <option>Select</option>
                                        <option>Computer</option>
                                        <option>Finance/Commerce</option>
                                        <option>Management</option>
                                        <option>Engineering/Design</option>
                                        <option>Medicine</option>
                                        <option>Law</option>
                                        <option>Doctorate</option>
                                        <option>Other</option>
                                    </select>

                                </div>
                                <div class="col-sm-2">  </div>
                            </div><br>



                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Graduation Degree :</label> 
                                    <select name="graduation_degree" class="form-control">
                                        <option>Select</option>
                                        <option selected="" ><%=request.getParameter("graduation_degree")%></option>
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
                                        <option>other</option>
                                    </select>

                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>


                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Graduation College :</label> 
                                    <input type="text"  name="graduation_college" value="<%=request.getParameter("graduation_college")%>" class="form-control" id="name" placeholder="Enter your college name" onkeypress="javascript:return isString(event)">


                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Future Plan :</label> 
                                    <textarea type="text" name="future_plan" class="form-control" id="name" placeholder="Enter your future plan" onkeypress="javascript:return isString(event)"><%=request.getParameter("future_plan")%> </textarea>


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
