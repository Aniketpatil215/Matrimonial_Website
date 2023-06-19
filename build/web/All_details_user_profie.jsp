<%-- 
    Document   : All_details_user_profie
    Created on : 29 Mar, 2023, 7:38:25 AM
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
        <title>All_details_user_profie</title>
        <link rel="stylesheet" href="bootstrap.min.css"> 

        <style>

            .profile-icon {
                height: 250px;
                width: 250px;
                object-fit: cover;
                border-radius: 50%;
            }

            .btn:hover{  
                background-color: #102770;
                color: #ffeba7;
                box-shadow: 0 8px 24px 0 rgba(16,39,112,.2);
            }




        </style>




    </head>
    <body>

        <%
            Connection cn = null;
            Statement st = null;

            /*<-----user_signin----> */
            String email = "";
            String contact = "";

            /*<-----basic_details---> */
            String fname = "";
            String age = "";
            String gender = "";
            String dob = "";
            String height = "";
            String weight = "";
            String img = "";
            String uid = "";

            /*<-----Ethinicity---> */
            String religion = "";
            String mother_tongue = "";

            /*<-----Social----> */
            String marital_status = "";
            String religion_cast = "";
            String horoscope = "";

            /*<-----Lifestyle----> */
            String hobbies = "";
            String intrest = "";

            /*<-----Working----> */
            String employed_in = "";
            String bussiness_in = "";
            String annual_income = "";
            String working_address = "";


            /*<-----Career----> */
            String high_qualification = "";
            String graduation_degree = "";
            String future_plan = "";

            /*<-----Family---> */
            String family_type = "";
            String family_income = "";
            String father_occupation = "";
            String mother_occupation = "";
            String brother = "";
            String sister = "";
            String gothra = "";
            String family_status = "";
            String about_family = "";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from user_signin where id='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    email = rs.getString("email");
                    contact = rs.getString("contact");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from basic_details where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    fname = rs.getString("fname");
                    age = rs.getString("age");
                    gender = rs.getString("gender");
                    dob = rs.getString("dob");
                    height = rs.getString("height");
                    weight = rs.getString("weight");
                    img = rs.getString("img");
                    uid = rs.getString("uid");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Ethinicity where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    religion = rs.getString("religion");
                    mother_tongue = rs.getString("mother_tongue");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Social where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    marital_status = rs.getString("marital_status");
                    religion_cast = rs.getString("religion_cast");
                    horoscope = rs.getString("horoscope");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Lifestyle where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    hobbies = rs.getString("hobbies");
                    intrest = rs.getString("intrest");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Career where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    high_qualification = rs.getString("high_qualification");
                    graduation_degree = rs.getString("graduation_degree");
                    future_plan = rs.getString("future_plan");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Working where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    employed_in = rs.getString("employed_in");
                    bussiness_in = rs.getString("bussiness_in");
                    annual_income = rs.getString("annual_income");
                    working_address = rs.getString("working_address");

                }

            } catch (Exception ex) {
                out.println(ex);
            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                st = cn.createStatement();
                String sql = "select * from Family where uid='" + session.getAttribute("uid") + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    family_type = rs.getString("family_type");
                    family_income = rs.getString("family_income");
                    father_occupation = rs.getString("father_occupation");
                    mother_occupation = rs.getString("mother_occupation");
                    brother = rs.getString("brother");
                    sister = rs.getString("sister");
                    gothra = rs.getString("gothra");
                    family_status = rs.getString("family_status");
                    about_family = rs.getString("about_family");

                }

            } catch (Exception ex) {
                out.println(ex);
            }


        %>


        <section style="background-color: #eee;">
            <div class="container">


                <div class="row">
                    <div class="col">
                        <nav aria-label="breadcrumb" class="bg-light rounded-3 p-3 mb-4">

                            <h5 style=" font-style: oblique; font-weight: bold;text-align: center;">User Profile</h5>

                        </nav>
                    </div>
                </div>


                <div class="row">
                    <div class="col-lg-4">
                        <div class="card mb-4">
                            <div class="card-body text-center">
                                <img src="<%=img%>" alt="avatar" class="profile-icon"  >
                                <h3 class="my-3"><%=fname%> </h3>

                              

                                <div >


                                    <a href="https://wa.me/+91<%=contact%>" class="btn btn-primary">WhatsApp</a>

                                    <a href="mailto:<%=email%>"   class="btn btn-danger ms-1">Send Email</a>
                                </div>
                            </div>
                        </div>

                        <div class="card mb-4 mb-lg-0">

                            <div class="card mb-4" >
                                <div class="card-body"   >
                                    <div class="row" >
                                        <div class="col-sm-1">  </div>
                                        <div class="col-sm-11">

                                            <div >
                                                <h5> Ethnicity , Social & Lifestyle  Details </h5>
                                            </div>

                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <p class="mb-0">Marital Status</p>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="text-muted mb-0"><%=marital_status%></p>
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <p class="mb-0">Religion-Cast </p>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="text-muted mb-0"><%=religion_cast%></p>
                                        </div>

                                    </div>
                                    <hr>

                                    <div class="row">
                                        <div class="col-sm-6">
                                            <p class="mb-0">Mother tongue</p>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="text-muted mb-0"><%=mother_tongue%></p>
                                        </div>
                                    </div>
                                    <hr>


                                    <div class="row">
                                        <div class="col-sm-6">
                                            <p class="mb-0">Horoscope</p>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="text-muted mb-0"><%=horoscope%></p>
                                        </div>
                                    </div>
                                    <hr>

                                    <div class="row">
                                        <div class="col-sm-6">
                                            <p class="mb-0">Hobbies </p>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="text-muted mb-0"><%=hobbies%></p>
                                        </div>
                                    </div>
                                    <hr>

                                    <div class="row">
                                        <div class="col-sm-6">
                                            <p class="mb-0">Intrest </p>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="text-muted mb-0"><%=intrest%></p>
                                        </div>
                                    </div>


                                </div>
                            </div>
                        </div>
                    </div>


                    <div class="col-lg-8">

                        <div class="card mb-4">
                            <div class="card-body">
                                <div class="row" >
                                    <div class="col-sm-4">  </div>
                                    <div class="col-sm-5">
                                        <h5> Personal Details </h5>
                                    </div>
                                    <div class="col-sm-3"> </div>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <p class="mb-0">Full Name</p>
                                    </div>
                                    <div class="col-sm-9">
                                        <p class="text-muted mb-0"><%=fname%></p>
                                    </div>

                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <p class="mb-0">Age :</p>
                                    </div>
                                    <div class="col-sm-9">
                                        <p class="text-muted mb-0"><%=age%></p>
                                    </div>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <p class="mb-0">Date Of Birth :</p>
                                    </div>
                                    <div class="col-sm-9">
                                        <p class="text-muted mb-0"><%=dob%></p>
                                    </div>
                                </div>
                                <hr>

                                <div class="row">
                                    <div class="col-sm-3">
                                        <p class="mb-0">Height</p>
                                    </div>
                                    <div class="col-sm-9">
                                        <p class="text-muted mb-0"><%=height%> feet</p>
                                    </div>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <p class="mb-0">Weight</p>
                                    </div>
                                    <div class="col-sm-9">
                                        <p class="text-muted mb-0"><%=weight%> kg</p>
                                    </div>
                                </div>

                            </div>
                        </div>



                        <div class="row">
                            <div class="col-md-6">
                                <div class="card mb-4 mb-md-0">


                                    <div class="card mb-4">
                                        <div class="card-body">

                                            <div class="row">
                                                <div class="col-sm-2">  </div>
                                                <div class="col-sm-9">
                                                    <h5> Career & Working Details </h5>
                                                </div>
                                                <div class="col-sm-1"> </div>
                                            </div>
                                            <hr>

                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <p class="mb-0">High Qualification</p>
                                                </div>
                                                <div class="col-sm-6">
                                                    <p class="text-muted mb-0"><%=high_qualification%></p>
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <p class="mb-0">Graduation Degree </p>
                                                </div>
                                                <div class="col-sm-6">
                                                    <p class="text-muted mb-0"><%=graduation_degree%></p>
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <p class="mb-0">Annual Income :</p>
                                                </div>
                                                <div class="col-sm-6">
                                                    <p class="text-muted mb-0"><%=annual_income%> RS</p>
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <p class="mb-0">Employed In  </p>
                                                </div>
                                                <div class="col-sm-6">
                                                    <p class="text-muted mb-0"><%=employed_in%></p>
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <p class="mb-0">Business In </p>
                                                </div>
                                                <div class="col-sm-6">
                                                    <p class="text-muted mb-0"><%=bussiness_in%></p>
                                                </div>
                                            </div>
                                            <hr>

                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <p class="mb-0">Working Address</p>
                                                </div>
                                                <div class="col-sm-6">
                                                    <p class="text-muted mb-0"><%=working_address%></p>
                                                </div>
                                            </div>
                                            <hr>

                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <p class="mb-0">Future Plan  </p>
                                                </div>
                                                <div class="col-sm-6">
                                                    <p class="text-muted mb-0"><%=future_plan%></p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>


                            <div class="col-md-6">


                                <div class="card mb-4">
                                    <div class="card-body">

                                        <div class="row">
                                            <div class="col-sm-4">  </div>
                                            <div class="col-sm-7">
                                                <h5> Family Details </h5>
                                            </div>
                                            <div class="col-sm-1"> </div>
                                        </div>
                                        <hr>

                                        <div class="row">
                                            <div class="col-sm-6">
                                                <p class="mb-0">Family Type </p>
                                            </div>
                                            <div class="col-sm-6">
                                                <p class="text-muted mb-0"><%=family_type%> </p>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <p class="mb-0">Family Income</p>
                                            </div>
                                            <div class="col-sm-6">
                                                <p class="text-muted mb-0"><%=family_income%> Rs</p>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <p class="mb-0">Father Occupation</p>
                                            </div>
                                            <div class="col-sm-6">
                                                <p class="text-muted mb-0"><%=father_occupation%></p>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <p class="mb-0">Mother Occupation </p>
                                            </div>
                                            <div class="col-sm-6">
                                                <p class="text-muted mb-0"><%=mother_occupation%></p>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="row">
                                            <div class="col-sm-3">
                                                <p class="mb-0">Brother</p>
                                            </div>
                                            <div class="col-sm-3">
                                                <p class="text-muted mb-0"><%=brother%></p>
                                            </div>
                                            <div class="col-sm-3">
                                                <p class="mb-0">Sister</p>
                                            </div>
                                            <div class="col-sm-3">
                                                <p class="text-muted mb-0"><%=sister%></p>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <p class="mb-0"> Family Status  </p>
                                            </div>
                                            <div class="col-sm-6">
                                                <p class="text-muted mb-0"><%=family_status%></p>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <p class="mb-0"> Gothra </p>
                                            </div>
                                            <div class="col-sm-6">
                                                <p class="text-muted mb-0"><%=gothra%></p>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <p class="mb-0">About Family </p>
                                            </div>
                                            <div class="col-sm-6">
                                                <p class="text-muted mb-0"><%=about_family%></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>


                            </div>
                        </div>
                    </div>
                </div>


            </div>
        </section>    
    </body>
</html>
