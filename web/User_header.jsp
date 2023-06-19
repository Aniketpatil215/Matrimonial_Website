<%-- 
    Document   : User_header
    Created on : 2 Apr, 2023, 6:08:13 PM
    Author     : Aniket
--%>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User Header</title>
        <link rel="stylesheet" href="style.css">
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    </head>
    <body>
        <nav>
            <div class="wrapper">
                <div class="logo"><a href="#">Matrimonial website</a></div>
                <input type="radio" name="slider" id="menu-btn">
                <input type="radio" name="slider" id="close-btn">
                <ul class="nav-links">
                    <label for="close-btn" class="btn close-btn"><i class="fas fa-times"></i></label>
                    <li><a href="Feedback.jsp">Feedback</a></li>
                    <li><a href="Basic_details_User_profile.jsp">View User's Profile</a></li>

                    <li>
                        <a href="#" class="desktop-item">Create Your Profile</a>
                        <input type="checkbox" id="showMega">
                        <label for="showMega" class="mobile-item">Create Your Profile</label>
                        <div class="mega-box">
                            <div class="content">
                                <div class="row">
                                    <img src="Imagess/homeImg.jpg" alt="">
                                </div>
                                <div class="row">
                                    <header>Personal Details</header>
                                    <ul class="mega-links">
                                        <li><a href="Basic_details.jsp">Add Basic Details</a></li>
                                        <li><a href="Ethinicity.jsp">Add Ethnicity Details</a></li>
                                        <li><a href="Social.jsp">Add Social Details</a></li>


                                    </ul>
                                </div>
                                <div class="row">
                                    <header> Address Details </header>
                                    <ul class="mega-links">
                                        <li><a href="Address.jsp">Add Address Details</a></li>
                                        <li><a href="Working.jsp">Add Working Details</a></li>
                                        <li><a href="Career.jsp">Add Career Details</a></li>
                                        <li><a href="Contact.jsp">Add Contact Details</a></li>



                                    </ul>
                                </div>
                                <div class="row">
                                    <header>Other Details</header>
                                    <ul class="mega-links">
                                        <li><a href="Partner_preferance.jsp">Partner Preference Details</a></li>
                                        <li><a href="Family.jsp">Add Family Details</a></li>
                                        <li><a href="Lifestyle.jsp">Add Lifestyle Details</a></li>
                                        <li><a href="User_Success_Story.jsp">ADD SUCCESS STORY</a></li>

                                    </ul>
                                </div>

                            </div>
                        </div>
                    </li>
                    <li>

                        
                        <a href="#" class="desktop-item">View/Update your Profile</a>
                        <input type="checkbox" id="showMega">
                        <label for="showMega" class="mobile-item">View/Update your Profile</label>
                        <div class="mega-box">
                            <div class="content">
                                <div class="row">
                                    <img src="Imagess/homeImg.jpg" alt="">
                                </div>
                                <div class="row">
                                    <header> View Personal Details</header>
                                    <ul class="mega-links">
                                        <li><a href="Basic_details_view.jsp">View Basic Details</a></li>
                                        <li><a href="Ethinicity_view.jsp">View Ethnicity Details</a></li>
                                        <li><a href="Social_view.jsp">View Social Details</a></li>


                                    </ul>
                                </div>
                                <div class="row">
                                    <header> View Address Details </header>
                                    <ul class="mega-links">
                                        <li><a href="Address_view.jsp">View Address Details</a></li>
                                        <li><a href="Working_view.jsp">View Working Details</a></li>
                                        <li><a href="Career_view.jsp">View Career Details</a></li>
                                        <li><a href="Contact_view.jsp">View Contact Details</a></li>



                                    </ul>
                                </div>
                                <div class="row">
                                    <header>View Other Details</header>
                                    <ul class="mega-links">
                                        <li><a href="Partner_preferance_view.jsp">View Partner Preference </a></li>
                                        <li><a href="Family_view.jsp">View Family Details</a></li>
                                        <li><a href="Lifetyle_view.jsp">View Lifestyle Details</a></li>
                                        <li><a href="User_Success_Story_View.jsp">VIEW SUCCESS STORY</a></li>

                                    </ul>
                                </div>

                            </div>
                        </div>
                    </li>
                    <li><a href="index.jsp">Logout</a></li>
                </ul>
                <label for="menu-btn" class="btn menu-btn"><i class="fas fa-bars"></i></label>
            </div>
        </nav>


    </body>
</html>
