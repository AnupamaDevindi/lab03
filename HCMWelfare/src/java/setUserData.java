
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 926030140v
 */
public class setUserData {
    
    public void insertData(user u) throws SQLException, ClassNotFoundException
    {
        try
        {
    System.out.println("UD1");
            int id = u.getid();
            String fname = u.getfname();
            String lname = u.getlname();         
            String email = u.getemail(); 
            String userType = u.getuserType();         
            String userRole = u.getuserRole();         
            int contact = u.getcontact();         
            String status = u.getstatus();
            String username = u.getusername();        
            String password = u.getpassword();
            int cid = u.getid();
    System.out.println("UD2");        
            
    
            //Access userName class to check username from database
            userName uname = new userName();
            boolean a = uname.checkUsername(username);
    System.out.print("33333");
    
            //If the entered username is new one then data can be save database.             
            if(a == false)
            {
            
                // Connect to database
                Connection conn = dbConnect.initializeDatabase();
    System.out.println("31");                
                //PreparedStatement ps = conn.prepareStatement("INSERT INTO User(User_ID,First_name,Last_name,Email,User_type,User_role,Contact_no,Status,Username,Password,CreatedBy,CreatedDate)VALUES('"+id+"','"+fname+"','"+lname+"','"+email+"','"+userType+"','"+userRole+"','"+contact+"','"+status+"','"+username+"','"+password+"','"+cid+"','"+date+"')");  
                PreparedStatement ps = conn.prepareStatement("INSERT INTO [User](User_ID,First_name,Last_name,Email,User_type,User_role,Contact_no,Status,Username,Password,CreatedBy,CreatedDate)VALUES(?,?,?,?,?,?,?,?,?,?,?,CURRENT_TIMESTAMP)");  
    System.out.print("666666");
    
                int i=ps.executeUpdate();  
            
    System.out.print("888888");
                out.print("You are successfully registered..."); 
                }
            
                //If username is existing one then can't save record
                else
                {
    System.out.print("9999");
                    out.print("Username = "+" "+username+",  is already saved in database");                   
                }
            //}//}
       
        }
        catch(Exception e)
        {
            System.out.print(e);  
            out.println("Something went wrong !! Please try again");
           
        }
    }
    
}

