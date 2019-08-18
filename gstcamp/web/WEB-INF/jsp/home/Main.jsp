<%-- 
    Document   : Main
    Created on : Jul 31, 2019, 9:39:51 PM
    Author     : aziz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

        <script src="js/gstcamp.js"></script>

    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">GST Camp</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active">
                        <a href="#">
                            <span class="glyphicon glyphicon-home"></span>
                            Home
                        </a>
                    </li>
                    <li>
                        <a href="#" onclick="ClientLoader()">
                            <span class="glyphicon glyphicon-user"></span>
                            Client Management
                        </a>
                    </li>
                    <li>
                        <a href="#" onclick="ProductLoader()">
                            <span class="glyphicon glyphicon-shopping-cart"></span>
                            Product Management
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="glyphicon glyphicon-file"></span>
                            Invoice Management
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="glyphicon glyphicon-cloud-download"></span>
                            Reports
                        </a>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="#">
                            <span class="glyphicon glyphicon-log-out"></span> 
                            Logout
                        </a>
                    </li>
                </ul>
            </div>
        </nav>
        <div id="load" class="container">

        </div>
        <div id="viewbox" class="container">

        </div>
    </body>
</html>
