<%-- 
    Document   : loginCheck
    Created on : Aug 26, 2019, 4:29:46 PM
    Author     : 926030140v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String userid=request.getParameter("userid"); 
            session.putValue("userid",userid); 
            String password=request.getParameter("password"); 
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
            java.sql.Connection con = DriverManager.getConnection("jdbc:sqlserver://172.20.8.14:1433;databaseName=CeyBank", "testceybank", "testceybank");
            Statement st= con.createStatement(); 
            ResultSet rs=st.executeQuery("SELECT * FROM User WHERE Username ='"+userid+"' and Password ='"+password+"'"); 
            try{
                rs.next();
                if(rs.getString("password").equals(password)&&rs.getString("userid").equals(userid)) 
                { 
                    out.println("successfull"); 
                } 
                else{
                    out.println("Invalid password or username.");
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </body>
</html>
