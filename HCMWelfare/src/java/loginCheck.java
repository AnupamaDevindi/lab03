
import java.io.*;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author 926030140v
 */
    
public class loginCheck extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //System.out.print("11111111");        
        response.setContentType("text/html");
        try{   
            PrintWriter out = response.getWriter();
            
    //System.out.print("22222222");
            //Here username and password are which is given in the login.jsp page retrieving the values entered by the user and keeping in instance variables for further use.
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            //Getting the userPassword method here from passwordEncrypt class to password encryption 
            passwordEncrypt pass = new passwordEncrypt();
            //Getting encrypted user password from passwordEncrypt class
            String epassword = pass.userPassword(password);
    //System.out.print("333333333");
            
            Connection conn = dbConnect.initializeDatabase();    //Getting the connection method here from dbConnect class
    //System.out.print("3"); 
            PreparedStatement ps = conn.prepareStatement("SELECT Username,Password FROM [User] WHERE Username = ? AND Password = ? AND Status = 'ACTIVE'");               
            
            //sending up the values received from user to the database table
            ps.setString(1, username);
            ps.setString(2, epassword);
            
           
            
            //Executing The SQL query
            ResultSet rs=ps.executeQuery();
            
            //If username,password and user status correct can be login
            if (rs.next()) {
    //System.out.print("4");
                //out.println("Correct login credentials");
                HttpSession session=request.getSession();  
                session.setAttribute("username",username); 
                
                response.sendRedirect("http://localhost:8080/HCMWelfare/home.jsp");
                
                
            }                     
            else{
    //System.out.print("5");                
                //Check user status is active or not
                PreparedStatement ps1 = conn.prepareStatement("SELECT User_ID,First_name,Status FROM [User] WHERE Username = ? AND Password = ? AND Status != 'ACTIVE'");               
    //System.out.print("6");
                ps1.setString(1, username);
                ps1.setString(2, epassword);
    
                ResultSet rs1=ps1.executeQuery();
    //System.out.print("7");
    
                
                if(rs1.next())
                {
                    out.print("<h2 align='center'>You are not a active user</h2>");                   
                    //out.println("You are not a active user");
    //System.out.print("8");            
                }
                else
                {
                    //If username or password incorrect
                    out.print("<h2 align='center'>Invalid username or password</h2>");
                    //out.println("Invalid username or password");
    //System.out.print("9");            
                }
                
            }
    
        }
        catch(Exception e)
        {
            // will throw an exception if at all user typed any language constraints.
            out.print("<p align='center'>Please enter Valid Username and Password</p>");
            //System.out.print(e);
           
        }
    }
}
