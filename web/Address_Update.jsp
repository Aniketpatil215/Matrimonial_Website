<%-- 
    Document   : Address_Update
    Created on : 20 Mar, 2023, 4:13:18 PM
    Author     : Aniket
--%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Address Details Update</title>
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
                margin-top: 10px;
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
                                    <h2> Adresss Details</h2>

                                </div>
                                <div class="col-sm-3"></div>
                            </div><br>


                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>User Id :</label> 
                                    <input type="text" name="uid" value="<%=request.getParameter("uid")%>" class="form-control" id="name" placeholder="Enter ID" onkeypress="javascript:return isNumber(event)" >

                                </div>
                                <div class="col-sm-3">  </div>

                            </div><br>




                            <div class="row">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-6">

                                    <label>Country :</label> 
                                    <select name="country" class="form-control">
                                        <option>Select</option>
                                        <option selected="" ><%=request.getParameter("country")%></option>
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
                                    <select name="state" class="form-control">
                                        <option>Select</option>
                                        <option selected="" ><%=request.getParameter("state")%></option>

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
                                    <select name="city" class="form-control">
                                        <option>Select</option>
                                        <option selected="" ><%=request.getParameter("city")%></option>
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
