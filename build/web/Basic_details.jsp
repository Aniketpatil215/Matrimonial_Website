<%-- 
    Document   : Basic_details
    Created on : 13 Feb, 2023, 7:12:45 PM
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
        <title>Basic Details</title>
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

        <script type="text/javascript">
            function datediff()
            {
//      var date1 = new Date().toISOString().slice(0, 10);
                var date1 = new Date().getFullYear();
                var date2 = new Date(document.getElementById("todate").value).getFullYear();

                var diffDays = parseInt(date1 - date2);
                document.getElementById("days").value = diffDays;
            }
        </script>


    </head>
    <body>
        <%@include file="User_header.jsp"%>

        <%
            Connection cn = null;
            Statement st = null;
            String id = "1";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select id from basic_details";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    id = String.valueOf(Integer.parseInt(rs.getString("id")) + 1);
                }

            } catch (Exception ex) {
                out.println(ex);
            }
        %>
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
                                    <input type="text" name="uid" value="<%=session.getAttribute("uid")%>"  class="form-control" id="name" placeholder="User ID" onkeypress="javascript:return isNumber(event)" readonly >

                                </div>
                                <div class="col-sm-5">
                                    <label>Full Name :</label> 
                                    <input type="text" class="form-control" name="fname" id="name" placeholder="Enter full name" onkeypress="javascript:return isString(event)" required="">
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">

                                    <label>Gender :</label> 
                                    <select name="gender" class="form-control" required=""> 
                                        <option>Select</option>
                                        <option>Male</option>
                                        <option>Female</option>
                                    </select>

                                </div>
                                <div class="col-sm-5"> <label> DOB :</label> 
                                    <input type="date" class="form-control" name="dob" onmouseout="datediff()"  id="todate" placeholder="Date of birth" required="">
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>



                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label>Age :</label> 
                                    <input type="text" class="form-control" name="age" id="days" onmouseout="datediff()" placeholder="Age"  onkeypress="javascript:return isNumber(event)" maxlength="2" required="">
                                </div>
                                <div class="col-sm-5">
                                    <label>Height :</label> 
                                    <input type="text" class="form-control" name="height" id="name" placeholder="Enter your Height in Feet" onkeypress="javascript:return isFloat(event)"  maxlength="5" required="">
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-5">
                                    <label>Weight :</label> 
                                    <input type="text" class="form-control" name="weight" id="name" placeholder="Enter your Weight in Kg" onkeypress="javascript:return isFloat(event)" maxlength="5" required="">
                                </div>
                                <div class="col-sm-5">
                                    <label > Image :</label>
                                    <input type="file"  name="img" class="form-control" onchange="redURL(this)" accept="Image/*" required="">
                                </div>
                                <div class="col-sm-1"></div>
                            </div><br>




                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-4">
                                    <input type="reset" value="Cancel" class="btn btn-danger form-control "  style="font-family: 'Times New Roman';">
                                </div>  <div class="col-sm-4">

                                    <input type="Submit" name="btn" value="Save & Next" class="btn btn-success form-control "  style="font-family: 'Times New Roman';">
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

