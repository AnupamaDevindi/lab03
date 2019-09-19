<%-- 
    Document   : userProfile
    Created on : Sep 16, 2019, 3:51:29 PM
    Author     : 926030140v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*" %>
<%--<% Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); %>--%>

<!DOCTYPE html>
<HTML>
    <HEAD>
        <TITLE>Fetching Data From a Database</TITLE>
    </HEAD>

    <BODY>
    <%
        
        Connection conn = DriverManager.getConnection(
                "jdbc:sqlserver://172.20.8.14:1433;databaseName=CeyBank", "testceybank", "testceybank");
        //dbConnect dbConnect = new dbConnect();
        //tc.testMethod();
        //Connection con = null;   //Database Connection
        try{ 
        System.out.print("111");
            //Connection conn = dbConnect.initializeDatabase();
        System.out.print("112");
        PreparedStatement ps = conn.prepareStatement("Select User_ID,First_name,Last_name,Email,User_type,User_role,Contact_no,Status,Username,CreatedBy,CreatedDate From [User]");               
        ResultSet rs=ps.executeQuery();    
            //Statement  statement = conn.createStatement();
            //String sql = "Select First_name,Last_name From [User]";
        System.out.print("113");
            //ResultSet resultSet = statement.executeQuery(sql);
        System.out.print("114");
            if(!rs.next()) 
            {
                out.println("Sorry, could not find that user details.");
            } else {
            //while(resultSet.next()){
    %>

    <TABLE BORDER="1">
        <TR>
            <TH> User ID </TH> <TD> <%=rs.getString(1)%> </TD>
        </TR>
        <TR>
            <TH> First name </TH> <TD> <%=rs.getString(2)%> </TD>
        </TR>
        <TR>
            <TH> Last name </TH> <TD> <%=rs.getString(3)%> </TD>
        </TR>
        <TR>
            <TH> Email </TH> <TD> <%=rs.getString(4)%> </TD>
        </TR>
        <TR>
            <TH> User Type </TH> <TD> <%=rs.getString(5)%> </TD>
        </TR>
        <TR>
            <TH> User Role </TH> <TD> <%=rs.getString(6)%> </TD>
        </TR>
        <TR>
            <TH> Contact number </TH> <TD> <%=rs.getString(7)%> </TD>
        </TR>
        <TR>
            <TH> Status </TH> <TD> <%=rs.getString(8)%> </TD>
        </TR>
        <TR>
            <TH> Username </TH> <TD> <%=rs.getString(9)%> </TD>
        </TR>
        <TR>
            <TH> Create By </TH> <TD> <%=rs.getString(10)%> </TD>
        </TR>
        <TR>
            <TH> Create Date </TH> <TD> <%=rs.getString(11)%> </TD>
        </TR>      
    </TABLE>
    <BR>
    <% 
        } 
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    %>
    </BODY>
</HTML>


