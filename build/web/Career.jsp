<%-- 
    Document   : Career
    Created on : 14 Feb, 2023, 12:05:14 PM
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
        <title>Career Details</title>
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

        <%
            Connection cn = null;
            Statement st = null;
            String id = "1";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select id from Career";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    id = String.valueOf(Integer.parseInt(rs.getString("id")) + 1);
                }

            } catch (Exception ex) {
                out.println(ex);
            }
        %>
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
                                    <input type="text" name="uid" value="<%=session.getAttribute("uid")%>" class="form-control" id="name" placeholder="User ID" onkeypress="javascript:return isNumber(event)" readonly="">


                                </div>
                                <div class="col-sm-4">

                                    <label>High Qualification:</label> 
                                    <select name="high_qualification" class="form-control" required="">
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
                                    <select name="graduation_degree" class="form-control" required="">
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
                                        <option>other</option>
                                    </select>

                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>


                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Graduation College :</label> 
                                    <input type="text"  name="graduation_college" class="form-control" id="name" placeholder="Enter your college name" onkeypress="javascript:return isString(event)" required="">


                                </div>
                                <div class="col-sm-2">  </div>

                            </div><br>

                            <div class="row">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-8">

                                    <label>Future Plan :</label> 
                                    <textarea type="text" name="future_plan" class="form-control" id="name" placeholder="Enter your future plan" onkeypress="javascript:return isString(event)"> </textarea>


                                </div>
                                <div class="col-sm-2">  </div>

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
