<%-- 
    Document   : forgot_password_admin
    Created on : 31 Mar, 2023, 9:08:02 PM
    Author     : Aniket
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> forgot_password_admin </title>
        <link rel="stylesheet" href="bootstrap.min.css"> 

        <style>



            body
            {
                background:url(Imagess/homeImg6.jpg);
                background-position: center;

            }

            .container
            {
                margin-top:  70px;
                background: transparent;
                background-color: rgba(255, 255, 255, 0.3);
                border-radius: 10px;
                border: 1px solid rgba(255,255,255,0.3); 
                background: rgba(0,0,0,0.5);
                position: relative;

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
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btnSubmit").click(function () {
                var password = $("#pass1").val();
                var confirmPassword = $("#pass2").val();
                if (password != confirmPassword) {
                    alert("Passwords do not match.");
                    return false;
                }
                return true;
            });
        });
    </script>
    <body>
        <form  action="Admin_SignIn" method="POST">
            <script src="validation.js"></script>

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <div class="container"><br>



                        <div class="feedback-detail" class="form-group">

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">
                                    <h2> Forgot Password Admin</h2><br>

                                </div>
                                <div class="col-sm-2"></div>
                            </div>

                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">
                                    <label>Email ID :</label> 
                                    <input type="email" class="form-control"  name="email" id="name" placeholder="Enter your email id " required>
                                </div>
                                <div class="col-sm-3">  </div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">
                                    <label>New Password :</label> 
                                    <input type="password" class="form-control" name="pass" id="pass1" placeholder="Password" onkeypress="javascript:return isAlphanumric(event)"  minlength="8" maxlength="12" required>
                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br>
                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">
                                    <label>Confirm Password :</label> 
                                    <input type="password" class="form-control" name="pass" id="pass2" placeholder="Password" onkeypress="javascript:return isAlphanumric(event)"  minlength="8" maxlength="12" required>
                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br><br>

                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-3">
                                    <input type="Submit" name="btn"  value="Save" id="btnSubmit" class="btn btn-primary form-control "  style="font-family: 'Times New Roman';">
                                </div>
                                <div class="col-sm-3">
                                    <input type="reset" name="btn" value="Cancel"class="btn btn-danger form-control"   style="font-family: 'Times New Roman';">
                                </div>
                                <div class="col-sm-3"></div>
                            </div><br><br><br>


                        </div>
                    </div>
                    <div class="col-sm-3"></div>
                </div>
            </div>
        </form>
    </body>
</html>

