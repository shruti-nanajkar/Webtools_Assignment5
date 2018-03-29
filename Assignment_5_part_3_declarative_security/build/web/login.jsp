<%-- 
    Document   : login
    Created on : Mar 27, 2018, 1:00:07 AM
    Author     : nanaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <title>JSP Page</title>

        <style>
            body { 
                background: url('../../Web Pages/movies.jpg') no-repeat center center fixed; 
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
            }

            .panel-default {
                opacity: 0.9;
                margin-top:30px;
            }
            .form-group.last {
                margin-bottom:0px;
            }
        </style>
    </head>
    <body>
        <!--        <header align="center">
                    <h1>Enter your credentials</h1>
                </header>
                <br>
                <form action="j_security_check" method="post">
                    <TABLE align="center">
                        <TR><TD>User name: <INPUT TYPE="TEXT" NAME="j_username">
                        <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
                    </TABLE>
                    <br>
                    <div align="center">
                    <INPUT TYPE="SUBMIT" VALUE="Log In">
                    </div>
                </form>-->

        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <strong>Login</strong>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form" action="j_security_check" method="post">
                                <div class="form-group">
                                    <label for="inputEmail3" class="col-sm-3 control-label">
                                        Username</label>
                                    <div class="col-sm-9">
                                        <input type="text" class="form-control" id="inputEmail3" placeholder="Username" required="" name="j_username">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputPassword3" class="col-sm-3 control-label">
                                        Password</label>
                                    <div class="col-sm-9">
                                        <input type="password" class="form-control" id="inputPassword3" placeholder="Password" required="" name="j_password">
                                    </div>
                                </div>
<!--                                <div class="form-group">
                                    <div class="col-sm-offset-3 col-sm-9">
                                        <div class="checkbox">
                                            <label>
                                                <input type="checkbox">
                                                Remember me
                                            </label>
                                        </div>
                                    </div>
                                </div>-->
                                <div class="form-group last">
                                    <div class="col-sm-offset-3 col-sm-9">
                                        <input type="submit" class="btn btn-success btn-sm" value="Log In">
<!--                                        <button type="reset" class="btn btn-default btn-sm">
                                            Reset</button>-->
                                    </div>
                                </div>
                            </form>
                        </div>
<!--                        <div class="panel-footer">
                            Not Registered? <a href="#">Register here</a></div>-->
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
