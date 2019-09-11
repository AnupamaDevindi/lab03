/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Component;
import java.io.*;
import static java.lang.System.out;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 926030140v
 */


//@WebServlet(urlPatterns = {"userInsert"})
public class userInsert extends HttpServlet {
    
      
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    //System.out.print("111");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try
        {          
            //getting all the values of user entered from userRegister.jsp
            int id = Integer.parseInt(request.getParameter("id"));
          
            
    //System.out.print("2221");
            String fname=request.getParameter("fname");
    //System.out.print("212");                
            String lname=request.getParameter("lname");
    //System.out.print("23");         
            String email=request.getParameter("email");
    //System.out.print("24"); 
            String userType=request.getParameter("userType");
    //System.out.print("25");         
            String userRole=request.getParameter("userRole");
    //System.out.print("26");         
            int contact = Integer.parseInt(request.getParameter("contact"));
    //System.out.print("27");         
            String status=request.getParameter("status");
    //System.out.println("28");
            String username=request.getParameter("username");
    //System.out.println("29");        
            String password=request.getParameter("password");
            //int cid = Integer.parseInt(request.getParameter("cid"));
            int cid = id;
            //String date=request.getParameter("date");
          
    //System.out.println("29a");
     
            //Getting the userPassword method here from passwordEncrypt class to password encryption 
            passwordEncrypt pass = new passwordEncrypt();
            //Getting encrypted user password from passwordEncrypt class
            String epassword = pass.userPassword(password);
            //String username = null;
    //System.out.println("29b");
            /*
            //setting up the received values from userRegister.jsp to setters and getters
            user u = new user();
            u.setid(id);
            u.setfname(fname);		
            u.setlname(lname);
            u.setemail(email);
            u.setuserType(userType);
            u.setuserRole(userRole);
            u.setcontact(contact);
            u.setstatus(status);
            u.setusername(username);
            u.setpassword(password);
            u.setcid(cid);*/
           
            
    //System.out.println("29c");        
            //String b = udata.insertData(username);
    //System.out.println("30"); 
          
            //Access userName class to check username from database
            userName uname = new userName();   
            boolean a = uname.checkUsername(username);    
    //System.out.print("33333");
           
            //If the entered username is new one then data can be save database.             
            if(a == false)
            {
                Connection conn = dbConnect.initializeDatabase();     //Getting the connection method here from dbConnect class
                
                HttpSession session=request.getSession();  
                session.setAttribute("username",username); 
                
    //System.out.println("31");                
                //PreparedStatement ps = conn.prepareStatement("INSERT INTO User(User_ID,First_name,Last_name,Email,User_type,User_role,Contact_no,Status,Username,Password,CreatedBy,CreatedDate)VALUES('"+id+"','"+fname+"','"+lname+"','"+email+"','"+userType+"','"+userRole+"','"+contact+"','"+status+"','"+username+"','"+password+"','"+cid+"','"+date+"')");  
                PreparedStatement ps = conn.prepareStatement("INSERT INTO [User](User_ID,First_name,Last_name,Email,User_type,User_role,Contact_no,Status,Username,Password,CreatedBy,CreatedDate)VALUES(?,?,?,?,?,?,?,?,?,?,?,CURRENT_TIMESTAMP)");  
    //System.out.print("666666");
                
                //sending up the values received from user to the database table
                ps.setInt(1,id); 
                ps.setString(2,fname); 
                ps.setString(3,lname); 
                ps.setString(4,email); 
                ps.setString(5,userType); 
                ps.setString(6,userRole); 
                ps.setInt(7,contact); 
                ps.setString(8,status); 
                ps.setString(9,username); 
                ps.setString(10,epassword); 
                ps.setInt(11,cid); 
                
            
    //System.out.print("77777");
                int i=ps.executeUpdate();  
            
    //System.out.print("888888");
                out.print("<h2 align='center'>You are successfully registered...</h2>");
                //out.print("You are successfully registered..."); 
                }        
                //If username is existing one then can't save record
                else
                {
    //System.out.print("9999");                  
                    out.print("Username = "+" "+username+",  is already saved in database");                   
                }
        }
        catch(Exception e)
        {
            //System.out.print(e);  
            out.print("<h2 align='center'>Something went wrong !! Please try again</h2>");
            //out.println("Something went wrong !! Please try again");
           
        }
    } 
}
