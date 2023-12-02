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

                    <span class="details">
                        We will send to mail a you Account! Please input it.


                    </span>

                    <form action="ForgotPass" method="post"id="form">


                        <div class="form_input">
                            <input type="email" name="email" id="name" required>
                            <label for="name">email</label>
                        </div>

                        <button class="btn submit"  onclick="showAlert()">
                            Send
                        </button>
                        <a href="login2.jsp" style="color: white">Back</a>

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

                        <button class="btn layer out">
                            Login
                        </button>
                    </div>
                </div>
            </div>

            <div class="box register">
                <div class="content">
                    <h3 class="title">
                        Register
                    </h3>

                    <span class="details">
                        Lorem ipsum is sipmly dummy text of the printing and typesetting industry.
                    </span>

                    <form action="signup" method="post" id="form">
                        <div class="form_input">
                            <input type="text" name="su_username" id="name" required>
                            <label for="name">Username</label>
                        </div>
                        <div class="form_input">
                            <input type="email" name="su_email" id="email" required>
                            <label for="email">Email</label>
                        </div>
                        <div class="form_input">
                            <input type="password" name="su_password" id="password" required>
                            <label for="password">Password</label>
                        </div>
                        <div class="form_input">
                            <input type="password" name="repass" id="password" required>
                            <label for="password">Repeat Password</label>
                        </div>


                        <button class="btn submit">
                            Register
                        </button>
                    </form>
                </div>
            </div>


            <div class="marks">
            </div>
        </div>

        <!-- link javascript -->
        <script src="./js/loginJS_1.js"></script>
        <script>
                            function showAlert() {
                                alert("Password reset link has been sent to your email.");
                            }
        </script>
    </body>

</html>
