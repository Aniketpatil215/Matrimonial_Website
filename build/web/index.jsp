
<%-- 
    Document   : index
    Created on : 26 Apr, 2023, 5:04:27 PM
    Author     : Aniket
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <title>Online Matrimonial  Website</title>
        <!-- for-mobile-apps -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Elite Match Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- //for-mobile-apps -->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" /><!-- Bootstrap -->
        <link href="css/font-awesome.css" rel="stylesheet"> <!-- Font awesome -->
        <link href="css/owl.carousel.css" rel="stylesheet"><!-- Clients -->
        <link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" /><!-- Pop-up -->
        <link href="css/lsb.css" rel="stylesheet" type="text/css"><!-- gallery -->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <!--fonts-->
        <link href="//fonts.googleapis.com/css?family=Raleway:400,500,600,700,800,900" rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Dancing+Script:400,700" rel="stylesheet">
        <!--//fonts-->

    </head>

    <body>
        <!--banner start here-->
        <div class="banner-w3ls" id="home">
            <div class="container">
                <!-- header -->
                <div class="header-inner">
                    <h1 class="logo">
                        <a href="index.html">Matrimonial<span>Website</span></a>
                    </h1>
                    <nav class="navbar navbar-default">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse"
                                    data-target="#bs-example-navbar-collapse-1">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                        </div>
                        <!-- navbar-header -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="index.jsp" class="active">Home</a></li>
                                <li><a href="about.html">About</a></li>
                                <li><a href="contact.html">Contact</a></li>
                            </ul>
                        </div>
                        <div class="clearfix"> </div>
                    </nav>
                    <div class="header-right-w3ls">
                        <a href="login.html">Log In</a>
                        <a href="register.html">Register</a>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <!-- //header -->
                <!-- banner-slider -->
                <div class="w3l_banner_info">
                    <div class="slider">
                        <div class="callbacks_container">
                            <ul class="rslides" id="slider3">
                                <li>
                                    <div class="w3ls-info">
                                        <h4>Be fabulous. Be empowered. Be Blown Away!</h4>
                                        <p>?A successful marriage requires falling in love many times, always with the same person.?</p>
                                    </div>

                                </li>
                                <li>
                                    <div class="w3ls-info">
                                        <h4>Dream it. Believe it. make it happen! </h4>
                                        <p>Checkout our list of best services and plan to best Finding.</p>
                                    </div>

                                </li>
                                <li>
                                    <div class="w3ls-info">
                                        <h4>Love Is Looking for You...! Be Found...!</h4>
                                        <p>Welcome to our Matrimonial website - keep in touch with us...</p>
                                    </div>

                                </li>

                            </ul>
                        </div>
                    </div>
                </div>
                <div class="clearfix"></div>
                <!-- //banner-slider -->
                <div class="sim-button button12"><a href="about.html">More About Us</a></div>
                <div class="agileits-social">
                    <ul>
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-rss"></i></a></li>
                        <li><a href="#"><i class="fa fa-vk"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
        <!--//home-->
        <!--banner end here-->

        <!-- about -->
        <div class="about-w3layouts" id="about">
            <div class="tittle-agileinfo">
                <h3>About Us</h3>
            </div>

            <div class="about-right">
                <h3 class="subheading-agileits-w3layouts"><span></span>Find Success Stories</h3>
                <p class="para-agileits-w3layouts">

                    Marriage is all about love, trust, commitment, loyalty, communication, and understanding. However, a successful marriage requires individual efforts from both partners. Reading thoughtful wedding quotes can help you understand the true meaning of marriage and what needs to be done to make it a long and successful union. In this post, we bring you some marriage quotes that will give you an insight into your marriage and explain the essence of the lifelong bond.
                </p>
                <div class="sim-button button12"><a href="#">View Success Story</a></div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <!-- //about-bottom -->
        <!--search-section -->
        <div class="search-wthree">
            <div class="container">
                <h3 class="subheading-agileits-w3layouts">Start your journey with confidence.</h3>
                <div class="sim-button button12"><a href="register.html">Join Now</a></div>
                <div class="clearfix"> </div>
            </div>
        </div>
        <!--//search-section -->
        <!--middle-section -->
        <div class="middle-section-agileits-w3layouts">
            <div class="container">
                <h3 class="subheading-agileits-w3layouts"><span>Matrimonial </span>Website</h3>
                <p class="para-w3layouts">Exclusive Matchmaking Service for the Matrimonial Website</p>
                <div class="sim-button button12"><a href="contact.html">Contact Us</a></div>
            </div>
        </div>
        <!--//middle-section -->
        <!-- testimonials -->
        <div class="test" id="clients">
            <div class="container">
                <div class="tittle-agileinfo">
                    <h3 class="white-w3ls">Happy Couples</h3>
                </div>
                <div class="test-gri1">


                    <div id="owl-demo2" class="owl-carousel">
                        <%

                            Connection cn = null;
                            Statement st = null;
                            int counter = 1;
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                                st = cn.createStatement();
                                String sql = "select * from admin_success_story";
                                ResultSet rs = st.executeQuery(sql);
                                while (rs.next()) {


                        %>

                        <div class="agile">
                            <div class="test-grid1">
                                <img src="<%=rs.getString("img")%>" alt="" class="img-r">
                                <h4><%=rs.getString("fname")%> & <%=rs.getString("sname")%></h4>
                                <span>Couple <%=counter++%></span>
                                <p><%=rs.getString("descr")%></p>
                            </div>
                        </div>
                        <%  }

                            } catch (Exception ex) {
                                out.println(ex);
                            }
                        %>
                    </div>

                </div>

            </div>
        </div>
        <!-- //testimonials -->
        <!--/gallery-->
        <div class="gallery" id="gallery">
            <div class="tittle-agileinfo">
                <h3>Together by Success Story</h3>
            </div>
            <ul id="flexiselDemo1">


                <%
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                        st = cn.createStatement();
                        String sql = "select * from admin_success_story";
                        ResultSet rs = st.executeQuery(sql);
                        while (rs.next()) {


                %>

                <li>
                    <div class="wthree_gallery_grid">
                        <a href="<%=rs.getString("img")%>" class="lsb-preview" data-lsb-group="header">
                            <div class="view second-effect">
                                <img src="<%=rs.getString("img")%>" alt="" class="img-responsive" height="200" />
                                <div class="mask">
                                    <p><%=rs.getString("fname")%> <i class="fa fa-heart-o" aria-hidden="true"></i> <%=rs.getString("sname")%></p>
                                </div>
                            </div>
                        </a>
                    </div>
                </li>
                <%  }

                    } catch (Exception ex) {
                        out.println(ex);
                    }
                %>



            </ul>


        </div>

        <!--//gallery-->
        <!-- footer -->
        <div class="w3l_footer">
            <div class="container">
                <div class="w3ls_footer_grid">
                    <div class="col-md-4 w3ls_footer_grid_left">
                        <h4>Location:</h4>
                        <p>Matrimonial  Website<br>Near Shivraj College ,Gadhinglaj</p>
                    </div>
                    <div class="col-md-4 w3ls_footer_grid_left">
                        <h4>Contact us:</h4>
                        <p><span>Phone : </span> 7744992350 , 9373885128</p>
                        <p><span>Email : </span><a href="mailto:info@example.com">  aniketrpatil215@gmail.com vaishnavpatil246@gmail.com  </a></p>
                    </div>
                    <div class="col-md-4 w3ls_footer_grid_left">
                        <h4>Opening hours:</h4>
                        <p>Working days (8am-9pm)</p>
                        <p>Sundays (9am-1pm)</p>
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <!-- footer-button-info -->
                <div class="footer-middle-agileinfo">
                    <div class="footer-button">
                        <div class="button-top-w3layouts">
                            <div class="logo-icons-w3ls">
                                <i class="fa fa-heart heart1" aria-hidden="true"></i>
                                <i class="fa fa-heart-o heart2" aria-hidden="true"></i>
                            </div>
                        </div>
                        <div class="sim-button button12"><a href="contact.html">Contact Us</a></div>
                        <h2>We?re Committed to Service Excellence.</h2>
                    </div>
                </div>
                <!-- footer-button-info -->
            </div>
        </div>

        <div class="botttom-nav-agileits">
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="about.html">About</a></li>
                <li><a href="contact.html">Contact</a></li>
            </ul>
        </div>
        <div class="footer-w3layouts">
            <div class="container">
                <div class="agile-copy">
                    <p>© 2023 Matrimonial Website. All rights reserved | Design by  <a href="#">AV</a></p>
                </div>
                <div class="agileits-social">
                    <ul>
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-rss"></i></a></li>
                        <li><a href="#"><i class="fa fa-vk"></i></a></li>
                    </ul>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        <!--/footer -->

        <!-- js -->
        <script type='text/javascript' src='js/jquery-2.2.3.min.js'></script>
        <!-- flexisel -->
        <script type="text/javascript">
            $(window).load(function () {
                $("#flexiselDemo1").flexisel({
                    visibleItems: 4,
                    animationSpeed: 1000,
                    autoPlay: true,
                    autoPlaySpeed: 3000,
                    pauseOnHover: true,
                    enableResponsiveBreakpoints: true,
                    responsiveBreakpoints: {
                        portrait: {
                            changePoint: 480,
                            visibleItems: 1
                        },
                        landscape: {
                            changePoint: 640,
                            visibleItems: 2
                        },
                        tablet: {
                            changePoint: 768,
                            visibleItems: 2
                        }
                    }
                });

            });
        </script>
        <script type="text/javascript" src="js/jquery.flexisel.js"></script>
        <!-- //flexisel -->
        <!-- gallery-pop-up -->
        <script src="js/lsb.min.js"></script>
        <script>
            $(window).load(function () {
                $.fn.lightspeedBox();
            });
        </script>
        <!-- //gallery-pop-up -->
        <script src="js/SmoothScroll.min.js"></script>
        <!--responsive slider -->
        <script src="js/responsiveslides.min.js"></script>
        <script>
// You can also use "$(window).load(function() {"
            $(function () {
                // Slideshow 3
                $("#slider3").responsiveSlides({
                    auto: true,
                    pager: true,
                    nav: true,
                    speed: 500,
                    namespace: "callbacks",
                    before: function () {
                        $('.events').append("<li>before event fired.</li>");
                    },
                    after: function () {
                        $('.events').append("<li>after event fired.</li>");
                    }
                });

            });
        </script>
        <!--//responsive slider -->
        <!--pop-up-box -->
        <script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
        <script>
            $(document).ready(function () {
                $('.popup-with-zoom-anim').magnificPopup({
                    type: 'inline',
                    fixedContentPos: false,
                    fixedBgPos: true,
                    overflowY: 'auto',
                    closeBtnInside: true,
                    preloader: false,
                    midClick: true,
                    removalDelay: 300,
                    mainClass: 'my-mfp-zoom-in'
                });

            });
        </script>
        <!-- //pop-up-box -->

        <!-- smooth scrolling -->
        <script type="text/javascript">
            $(document).ready(function () {
                /*
                 var defaults = {
                 containerID: 'toTop', // fading element id
                 containerHoverID: 'toTopHover', // fading element hover id
                 scrollSpeed: 1200,
                 easingType: 'linear' 
                 };
                 */
                $().UItoTop({easingType: 'easeOutQuart'});
            });
        </script>


        <a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;">
            </span></a>
        <!-- //smooth scrolling -->
        <!-- for-Clients -->
        <script src="js/owl.carousel.js"></script>
        <!-- requried-jsfiles-for owl -->
        <script>
            $(document).ready(function () {
                $("#owl-demo2").owlCarousel({
                    items: 1,
                    lazyLoad: false,
                    autoPlay: true,
                    navigation: false,
                    navigationText: false,
                    pagination: true,
                });
            });
        </script>
        <!-- //requried-jsfiles-for owl -->
        <!-- //for-Clients -->
        <!-- start-smoth-scrolling -->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!-- start-smoth-scrolling -->
        <script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>


    </body>

</html>