<%-- 
    Document   : userView
    Created on : Sep 17, 2019, 12:14:43 PM
    Author     : 926030140v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
//String id = request.getParameter("id");
/*String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
String connectionUrl = "jdbc:sqlserver://172.20.8.14:1433/";
String database = "CeyBank";
String userid = "testceybank";
String password = "testceybank";*/

try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <table border="1">
        <tr>
            <td> User ID </td>
            <td> First Name </td>
            <td> Last Name </td>
            <td> Email </td>
            <td> User Type </td>
            <td> User Role </td>
            <td> Contact Number </td>
            <td> Status </td>           
            <td> Username </td>
            <td> Create By </td>
            <td> Create Date </td>           
            
        </tr>
      
<%
try
{
/*connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="Select User_ID,First_name,Last_name,Email,User_type,User_role,Contact_no,Status,Username,CreatedBy,CreatedDate,lastModifiedBy,lastModifiedate From [User]";
resultSet = statement.executeQuery(sql);*/

Connection conn = DriverManager.getConnection(
                "jdbc:sqlserver://172.20.8.14:1433;databaseName=CeyBank", "testceybank", "testceybank");
        //dbConnect dbConnect = new dbConnect();
        //tc.testMethod();
        //Connection con = null;   //Database Connection
        //try{ 
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

while(resultSet.next()){
%>

        <tr>
            <!--<td><%=resultSet.getString("User_ID") %></td>
            <td><%=resultSet.getString("First_name") %></td>
            <td><%=resultSet.getString("Last_name") %></td>
            <td><%=resultSet.getString("Email") %></td>           
            <td><%=resultSet.getString("User_type") %></td>
            <td><%=resultSet.getString("User_role") %></td>
            <td><%=resultSet.getString("Contact_no") %></td>
            <td><%=resultSet.getString("Status") %></td>
            <td><%=resultSet.getString("Username") %></td>
            <td><%=resultSet.getString("CreatedBy") %></td>
            <td><%=resultSet.getString("CreatedDate") %></td>
            <td><%=resultSet.getString("lastModifiedBy") %></td>
            <td><%=resultSet.getString("lastModifiedate") %></td>-->
            
            <td><%=resultSet.getString(1) %></td>
            <td><%=resultSet.getString(2) %></td>
            <td><%=resultSet.getString(3) %></td>
            <td><%=resultSet.getString(4) %></td>           
            <td><%=resultSet.getString(5) %></td>
            <td><%=resultSet.getString(6) %></td>
            <td><%=resultSet.getString(7) %></td>
            <td><%=resultSet.getString(8) %></td>
            <td><%=resultSet.getString(9) %></td>
            <td><%=resultSet.getString(10) %></td>
            <td><%=resultSet.getString(11) %></td>
            
            <td><a href="update.jsp?id=<%=resultSet.getString("id")%>">update</a></td>
        </tr>-->
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
        </table>
    </body>
</html>
