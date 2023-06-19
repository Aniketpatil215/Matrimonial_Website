<%-- 
    Document   : Address
    Created on : 14 Feb, 2023, 11:44:36 AM
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
        <title>Address Details</title>
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
                margin-top: 10px;
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

        <%
            Connection cn = null;
            Statement st = null;
            String id = "1";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select id from address";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    id = String.valueOf(Integer.parseInt(rs.getString("id")) + 1);
                }

            } catch (Exception ex) {
                out.println(ex);
            }
        %>
        <form action="Address" method="post">
            <script src="validation.js"></script>


            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <div class="container">


                        <div class="address-detail" class="form-group"><br>

                            <div class="row">
                                <div class="col-sm-4"></div>
                                <div class="col-sm-5">
                                    <h2> Address Details</h2>

                                </div>
                                <div class="col-sm-3"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>User Id :</label> 
                                    <input type="text" name="uid" value="<%=session.getAttribute("uid")%>" class="form-control" id="name" placeholder="Enter ID" onkeypress="javascript:return isNumber(event)"readonly="" >

                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br>




                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>Country :</label> 
                                    <select name="country" class="form-control" required="">
                                        <option>Select</option>
                                        <option>India</option>
                                        <option>Other</option>
                                    </select>

                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br>


                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>State :</label> 
                                    <select name="state" class="form-control" required="">
                                        <option>Select</option>
                                        <option>Maharashtra</option>
                                        <option>other</option>
                                    </select>

                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br>


                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>City :</label> 
                                    <select name="city" class="form-control" required="">
                                        <option>Select</option>
                                        <option>Ahamadnagar</option>
                                        <option>Akola</option>
                                        <option>Amravti</option>
                                        <option>Aurangabad</option>
                                        <option>Beed</option>
                                        <option>Bhandara</option>
                                        <option>Buldhana</option>
                                        <option>Chandrapur</option>
                                        <option>Dhule</option>
                                        <option>Gadchiroli</option>
                                        <option>Gondiya</option>
                                        <option>Hingoli</option>
                                        <option>Jalgaon</option>
                                        <option>Jalna</option>
                                        <option>Kolhapur</option>
                                        <option>Latur</option>
                                        <option>Mumbai</option>
                                        <option>Nagpur</option>
                                        <option>Nanded</option>
                                        <option>Nandurbar</option>
                                        <option>Nashik</option>
                                        <option>Osmanabad</option>
                                        <option>Palghar</option>
                                        <option>Parbhani</option>
                                        <option>Pune</option>
                                        <option>Raygad</option>
                                        <option>Ratnagiri</option>
                                        <option>Sangali</option>
                                        <option>Satara</option>
                                        <option>Saidhudurg</option>
                                        <option>Solapur</option>
                                        <option>Thane</option>
                                        <option>Wardha</option>
                                        <option>Washim</option>
                                        <option>Yavatmal</option>
                                    </select>

                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br><br>

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
