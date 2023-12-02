<%-- 
    Document   : login2
    Created on : Jul 3, 2023, 5:27:10 PM
    Author     : Twna21
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- link css -->
        <link rel="stylesheet" href="./css/login2.css">

        <!-- link icons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
              integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />

        <title>Form Animate</title>
    </head>

    <body>
        <div class="container">
            <div class="box login">
                <div class="content">
                    <h3 class="title">
                        Login
                    </h3>


                    <form action="login" method="POST" id="form">


                        <div class="form_input">
                            <input type="text" name="username" id="name" required>
                            <label for="name">Username</label>
                        </div>
                        <div class="form_input">
                            <input type="password" name="password" id="password" required>
                            <label for="password">Password</label>
                        </div>
                        <button class="btn submit">
                            Login
                        </button>

                        <a href="foget.jsp" style="color: white; text-decoration: none;">Forgot Password?</a>
                    </form>

                </div>
            </div>

            <div class="box navigation">
                <div class="content">
                    <div class="nav navigation_signIn">
                        <p>
                            If you don't have an account yet, join us and start your journey
                        </p>

                        <button class="btn layer log">

                            Register
                        </button>
                    </div>

                    <div class="nav navigation_signUp">
                        <p>
                            If you already have an account login here and have fun

                        </p>
                        <div class="Login">
                            <button class="btn layer out">
                                Login
                            </button>

                            <button class="btn layer out">
                                <a href="https://accounts.google.com/o/oauth2/auth?scope=email%20profile%20openid&redirect_uri=http://localhost:8080/MilkTeaProjectPRJ301/LoginGoogleController&response_type=code
                                   &client_id=552963219492-6a880it69r6hmnahrj8c69f328id25m6.apps.googleusercontent.com&approval_prompt=force"
                                   class="btn btn-danger text-white"><i class="bi bi-google"></i> Google</a>
                            </button>

                            <div>
                            </div>
                        </div>
                    </div>


                </div>

                <!-- link javascript -->
                <script src="./js/loginJS_1.js"></script>
                </body>

                </html>
