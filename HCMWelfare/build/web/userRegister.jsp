<%-- 
    Document   : userRegister
    Created on : Aug 26, 2019, 11:51:07 AM
    Author     : 926030140v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ page import = "java.io.*,java.util.*,java.sql.*"%>--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Information</title>
        
        <script>
            function Validation()
            {
                var Email = document.forms["RegForm"]["email"];  
                var Contact = document.forms["RegForm"]["contact"];
                
    
                if (Email.value.indexOf("@", 0) < 0)                 
                { 
                    window.alert("Please enter a valid e-mail address."); 
                    Email.focus(); 
                    return false; 
                } 
                if (Email.value.indexOf(".", 0) < 0)                 
                { 
                    window.alert("Please enter a valid e-mail address."); 
                    Email.focus(); 
                    return false; 
                }
                if (Contact.value.length != 10)                           
                { 
                    window.alert("Please enter 10 digit for the contact number");                   
                    Contact.focus(); 
                    return false; 
                }
                            
            }
            
        </script>
        
        <style>                
                ::placeholder {color: gray;} 
        </style>
        
    </head>
    
    <body>        
        <form name="RegForm" method="POST" action="servlet/userInsert" onsubmit="return Validation()"> 
            <pre>
            <input type="text" name="id" placeholder="Enter user ID "/><br>
            <input type="text" name="fname" placeholder="Enter first name " required/><br>
            <input type="text" name="lname" placeholder="Enter last name " required/><br>
            <input type="text"  name="email" placeholder="Enter email " required/><br>
            
            <select name="userType" required>
                <option value="null" disabled selected> Enter user type </option>               
                <option value="boc_staff"> BOC Staff </option>
                <option value="home_owner"> Home Owner </option>
            </select><br>
                
            <select name="userRole" required>
                <option value="" disabled selected> Enter user role </option>
                <option value="AGM"> AGM </option>
                <option value="DGM"> DGM </option>
                <option value="Manager"> Manager </option>
                <option value="Other"> Other </option> 
            </select><br>
                      
            <input type="text" name="contact" placeholder="Enter contact number " required/><br>                
            <select name="status" required>
                <option value="" disabled selected> Enter user status </option>
                <option value="active"> ACTIVE </option>
                <option value="resigned"> RESIGNED </option>
            </select>
            
            <input type="text" name="username" placeholder="Enter username " required/><br>
            <input type="password" name="password" placeholder="Enter Password " required/><br><br>
 
            <input type="submit" value="SAVE"/>
            </pre>           
        </form>     
    </body>
</html>
