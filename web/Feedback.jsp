<%-- 
    Document   : Feedback
    Created on : 14 Feb, 2023, 1:40:47 PM
    Author     : Aniket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Feedback Details</title>
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

        <form action="Feedback" method="post">

            <script src="validation.js"></script>

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <div class="container"><br>



                        <div class="feedback-detail" class="form-group">

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">
                                    <h2> Feedback</h2><br>

                                </div>
                                <div class="col-sm-2"></div>
                            </div>





                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>Full Name :</label> 
                                    <input type="text" name="fname" class="form-control" id="name" placeholder="Enter full name" onkeypress="javascript:return isString(event)" required="">


                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br>


                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>Mobile No :</label> 
                                    <input type="text" name="contact" class="form-control" id="name" placeholder="Enter mobile no" onkeypress="javascript:return isContact(event)" minlength="10" maxlength="10" required="">
                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br>


                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>Email :</label> 
                                    <input type="email" name="email" class="form-control" id="name" placeholder="Enter your email id " required="">


                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br>

                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>Feedback message :</label> 
                                    <textarea type="textarea" name="msg" class="form-control" id="name" placeholder="Enter your feedback" onkeypress="javascript:return isString(event)" required=""></textarea>


                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br>

                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-3">
                                    <input type="Submit" name="btn"  value="Save" class="btn btn-primary form-control "  style="font-family: 'Times New Roman';">
                                </div>
                                <div class="col-sm-3">
                                    <input type="Submit" name="btn" value="Cancel"class="btn btn-danger form-control"   style="font-family: 'Times New Roman';">
                                </div>
                                <div class="col-sm-3"></div>
                            </div><br>


                        </div>
                    </div>
                    <div class="col-sm-3"></div>
                </div>
            </div>
        </form>
    </body>
</html>

