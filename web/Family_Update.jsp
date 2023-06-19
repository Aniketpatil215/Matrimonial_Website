<%-- 
    Document   : Family_Update
    Created on : 21 Mar, 2023, 4:16:38 PM
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
        <title>Family Details</title>
        <link rel="stylesheet" href="bootstrap.min.css"> 

        <style>


            body
            {
                background:url(Imagess/banner.jpg);
                background-position:center;
                background-size: cover;
                position: relative;
                background-repeat: no-repeat;
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
                font-size: 22px;
                font-weight: bold;
                color: #fff;
            }
        </style>


    </head>
    <body>
        <%@include file="User_header.jsp"%>



        <form action="Family" method="post">

            <script src="validation.js"></script>

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <div class="container"><br>


                        <div class="family-detail" class="form-group">

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">
                                    <h2> Family Details</h2><br>

                                </div>
                                <div class="col-sm-2"></div>
                            </div>




                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label>User Id :</label> 
                                    <input type="text" name="uid"   value="<%=request.getParameter("uid")%>" class="form-control" id="name" placeholder="User ID" onkeypress="javascript:return isNumber(event)" >


                                </div>
                                <div class="col-sm-5">
                                    <label>Family Type :</label> 
                                    <select name="family_type" class="form-control">
                                        <option>Select</option>
                                        <option selected=""><%=request.getParameter("family_type")%></option>
                                        <option>Nuclear Family</option>
                                        <option>Joint Family</option>
                                        <option>Other</option>
                                    </select>
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">

                                    <label>Family Value :</label> 
                                    <select name="family_value" class="form-control">
                                        <option>Select</option>
                                        <option selected=""><%=request.getParameter("family_value")%></option>
                                        <option>1-5</option>
                                        <option>5-10</option>
                                        <option>Other</option>
                                    </select>

                                </div>
                                <div class="col-sm-5">
                                    <label>Family Income :</label> 
                                    <input type="text" name="family_income" value="<%=request.getParameter("family_income")%>" class="form-control" id="name" placeholder="family income" onkeypress="javascript:return isFloat(event)">
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>



                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label> Father Occupation :</label> 
                                    <select name="father_occupation" class="form-control">
                                        <option>Select</option>
                                        <option selected=""><%=request.getParameter("father_occupation")%></option>
                                        <option>Businessman</option>
                                        <option>Office Worker</option>
                                        <option>Civil Services</option>
                                        <option>Army/Armed Forces</option>
                                        <option>Expired</option>
                                        <option>Other</option>
                                    </select>
                                </div>
                                <div class="col-sm-5">
                                    <label>Mother Occupation :</label> 
                                    <select name="mother_occupation" class="form-control">
                                        <option>Select</option>
                                        <option selected=""><%=request.getParameter("mother_occupation")%></option>
                                        <option>Teacher</option>
                                        <option>Housewife</option>
                                        <option>Civil Services</option>
                                        <option>Business</option>
                                        <option>Army/Armed Forces</option>
                                        <option>Other</option>
                                    </select>
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label>Brother :</label> 
                                    <select name="brother" class="form-control">
                                        <option>Select</option>
                                        <option selected=""><%=request.getParameter("brother")%></option>
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                    </select>                    </div>
                                <div class="col-sm-5">
                                    <label > Sister :</label>
                                    <select name="sister" class="form-control">
                                        <option selected=""><%=request.getParameter("sister")%></option>
                                        <option>Select</option>
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                    </select>
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label>Family Based Out Of :</label> 
                                    <input type="text" name="family_based_on" value="<%=request.getParameter("family_based_on")%>" class="form-control" id="name" placeholder="family based on" onkeypress="javascript:return isString(event)">

                                </div>
                                <div class="col-sm-5">
                                    <label> Gothra :</label> 
                                    <input type="text" name="gothra"  value="<%=request.getParameter("gothra")%>" class="form-control" id="name" placeholder="Enter gothra" onkeypress="javascript:return isString(event)">
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label> Family Status :</label> 
                                    <select name="family_status" class="form-control">
                                        <option>Select</option>
                                        <option selected=""><%=request.getParameter("family_status")%></option>
                                        <option>Good</option>
                                        <option>Other</option>
                                    </select>

                                </div>
                                <div class="col-sm-5">
                                    <label> About Family :</label> 
                                    <textarea type="text" name="about_family"  value="<%=request.getParameter("about_family")%>" class="form-control" id="name" placeholder="Enter family about" onkeypress="javascript:return isString(event)"> <%=request.getParameter("about_family")%></textarea>
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>



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
