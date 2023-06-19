<%-- 
    Document   : Basic_details_Update
    Created on : 20 Mar, 2023, 2:41:20 PM
    Author     : Aniket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>  Basic Details Update</title>
        <link rel="stylesheet" href="bootstrap.min.css"> 

        <style>

            body
            {               
                background-image:url(Imagess/banner.jpg);
                background-position:center;
                background-size: cover;
                position: relative;
            }

            .container
            {

                background: rgba(0,0,0,0.5);
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

        <form action="Basic_Details" method="post">

            <script src="validation.js"></script>

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <div class="container">

                        <div class="basic-detail" class="form-group">
                            <br>
                            <div class="row">
                                <div class="col-sm-4"></div>
                                <div class="col-sm-4">
                                    <h2> Basic Details</h2><br>

                                </div>
                                <div class="col-sm-4"></div>
                            </div>




                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label>User Id :</label> 
                                    <input type="text" name="uid" value="<%=request.getParameter("uid")%>"  class="form-control" id="name" placeholder="User ID" onkeypress="javascript:return isNumber(event)" >

                                </div>
                                <div class="col-sm-5">
                                    <label>Full Name :</label> 
                                    <input type="text" class="form-control" value="<%=request.getParameter("fname")%>" name="fname" id="name" placeholder="Enter full name" onkeypress="javascript:return isString(event)">
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">

                                    <label>Gender :</label> 
                                    <select name="gender" class="form-control">
                                        <option>Select</option>
                                        <option selected="" ><%=request.getParameter("gender")%></option>
                                        <option>Male</option>
                                        <option>Female</option>
                                    </select>

                                </div>
                                <div class="col-sm-5">
                                    <label>Age :</label> 
                                    <input type="text" class="form-control" value="<%=request.getParameter("age")%>" name="age" id="name" placeholder="Age"  onkeypress="javascript:return isNumber(event)" maxlength="2">
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>



                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label> DOB :</label> 
                                    <input type="date" class="form-control" value="<%=request.getParameter("dob")%>" name="dob" id="name" placeholder="Date of birth">
                                </div>
                                <div class="col-sm-5">
                                    <label>Height :</label> 
                                    <input type="text" class="form-control" value="<%=request.getParameter("height")%>" name="height" id="name" placeholder="Enter your height" onkeypress="javascript:return isFloat(event)"  maxlength="5">
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label>Weight :</label> 
                                    <input type="text" class="form-control" value="<%=request.getParameter("weight")%>" name="weight"  placeholder="Enter your Weight" maxlength="5">
                                </div>
                                <div class="col-sm-5">
                                    <label > Image :</label>
                                    <input type="file"  name="img" class="form-control" value="<%=request.getParameter("img")%>" onchange="redURL(this)" accept="Image/*">
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

