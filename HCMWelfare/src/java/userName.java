
import static java.awt.SystemColor.window;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 926030140v
 */
public class userName {

    boolean checkUsername(String username) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.   
        try
        {
            Connection conn = dbConnect.initializeDatabase();
    System.out.println("A");        
            PreparedStatement ps = conn.prepareStatement("SELECT Username FROM [User] WHERE Username = ?");               
    System.out.println("B");        
            ps.setString(1, username);
    System.out.println("C");        
            ResultSet rs=ps.executeQuery(); 
    System.out.println("D");        
            if (rs.next()) {
    System.out.println("E");            
                //messageBox(" "+username+" is already saved in database"); 
                //out.print(" "+username+", is already saved in database");
                return true;
                //return;              
                //Email.focus(); 
                //return false; 
                
            }
    System.out.println("F");        
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        return false;
    }

}
