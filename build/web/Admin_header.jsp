<%-- 
    Document   : Admin_header
    Created on : 2 Apr, 2023, 5:26:47 PM
    Author     : Aniket
--%>

<html lang="en" dir="ltr">

    <head>
        <meta charset="UTF-8">
        <title>Admin_header  </title>
        <link rel="stylesheet" href="bootstrap.min.css">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body {
                margin: 0;
                padding: 0;
                font-family: sans-serif;
            }

            /* Sidebar */
            #sidebar {
                position: fixed;
                top: 0;
                left: 0;
                height: 100%;
                width: 250px;
                background-color: #f4f4f4;
                padding: 10px;
                transition: all 0.3s ease;
                box-shadow: 8px 8px 20px #c3c3c3, -8px -8px 20px #ffffff;
                z-index: 9999;
            }

            #sidebar.hide {
                transform: translateX(-250px);
            }

            /* Sidebar Menu */
            .menu {
                list-style: none;
                padding: 0;
                margin: 0;
            }

            .menu li {
                padding: 10px 0;
                border-bottom: 1px solid #ccc;
                cursor: pointer;
            }

            .menu li:hover {
                background-color: #ebebeb;
            }

            /* Content */
            #content {
                margin-left: 250px;
                padding: 10px;
            }

            /* Neumorphic Effect */
            .neumorphic {
                background-color: #f4f4f4;
                box-shadow: 8px 8px 20px #c3c3c3, -8px -8px 20px #ffffff;
            }

            /* Toggle Button */
            #toggle {
                position: fixed;
                top: 10px;
                right: 10px;
                width: 50px;
                height: 50px;
                background-color: #f4f4f4;
                border-radius: 50%;
                box-shadow: 8px 8px 20px #c3c3c3, -8px -8px 20px #ffffff;
                cursor: pointer;
                z-index: 9999;
            }

            #toggle span {
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                display: block;
                width: 20px;
                height: 2px;
                background-color: #333;
                transition: all 0.2s ease;
            }

            #toggle.hide span:first-child {
                transform: translate(-50%, -50%) rotate(45deg);
            }

            #toggle.hide span:last-child {
                transform: translate(-50%, -50%) rotate(-45deg);
            }

            #toggle.hide span:nth-child(2) {
                transform: translate(-50%, -50%) scale(0);
            }

        </style>

    </head>

    <body>
        <div id="sidebar" class="neumorphic">
            <ul class="menu">
                   <li class="nav-item active">
                       <a class="nav-link" href="Admin_index.jsp">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Basic_details_User_profile_admin_side.jsp">User Basic Profile</a>
                    </li>
                    
                     <li class="nav-item">
                         <a class="nav-link" href="Admin_success_story_view_list.jsp"> View Success Story  </a>
                    </li>
                    
                     <li class="nav-item">
                         <a class="nav-link" href="Admin_success_story.jsp"> Add Success story </a>
                    </li>
                    
                     <li class="nav-item">
                         <a class="nav-link" href="Adhar_card.jsp"> Add Aadhar Number  </a>
                    </li>
                     <li class="nav-item">
                         <a class="nav-link" href="Adhar_card_view.jsp"> View Aadhar Number </a>
                    </li>
                    
                    
                     <li class="nav-item">
                         <a class="nav-link" href="Feedback_view.jsp"> Feedback </a>
                    </li>
                
            </ul>
        </div>
     
        
        
        
        <div id="toggle" class="neumorphic">
            <span></span>
            <span></span>
            <span></span>
        </div>
        <script>
            const toggleButton = document.getElementById('toggle');
            const sidebar = document.getElementById('sidebar');

            toggleButton.addEventListener('click', function () {
                sidebar.classList.toggle('hide');
                toggleButton.classList.toggle('hide');
            });

        </script> 

    </body>

</html>