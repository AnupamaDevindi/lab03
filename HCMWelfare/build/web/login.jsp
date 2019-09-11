<%-- 
    Document   : login
    Created on : Aug 26, 2019, 4:24:38 PM
    Author     : 926030140v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="servlet/loginCheck" method="POST">
            
            <input type="text" name="username" placeholder="Enter Username " required></br></br>
            <input type="password" name="password" placeholder="Enter Password " required></br></br></br>          
            <input type="submit" value="Sign In">
            <input type="button" onclick="location.href='http://localhost:8080/HCMWelfare/userRegister.jsp'" value="Sign Up" />
            
        </form>
    </body>
</html>


