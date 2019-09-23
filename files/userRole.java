
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 926030140v
 */
public class userRole {
    String checkRole(String role) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.   
        String  roleID = null;
        try
        {
            Connection conn = dbConnect.initializeDatabase();
    //System.out.println("A");        
            PreparedStatement ps = conn.prepareStatement("SELECT Role_id FROM [Roles] WHERE User_role = ?");               
            
    //System.out.println("B");        
            ps.setString(1, role);
    //System.out.println("C");        
            ResultSet rs=ps.executeQuery(); 
              //roleID = rs.getString("Role_id");
    //System.out.println("D");        
            if (rs.next()) {
    //System.out.println("E");            
                //messageBox(" "+username+" is already saved in database"); 
                //out.print(" "+username+", is already saved in database");
                roleID = rs.getString("Role_id");
                return roleID;
                //return;              
                //Email.focus(); 
                //return false; 
                
            }
    //System.out.println("F");        
        }
        catch(Exception e)
        {
            System.out.print("ppppppppppp");
        }
        //return false;
    //System.out.println("B23"); 
        return roleID;
    }
    
    
    
    int roleFunctionCount(String id) {
        
        int  fcount = 0;
        
        try
        {
            Connection conn = dbConnect.initializeDatabase();
    //System.out.println("A");        
            PreparedStatement ps = conn.prepareStatement("SELECT COUNT (Role_ID) AS NUMBER FROM [Function_role] WHERE Role_ID = ?");               
            
    //System.out.println("B");        
            ps.setString(1, id);
    //System.out.println("C");        
            ResultSet rs=ps.executeQuery(); 
              //roleID = rs.getString("Role_id");
    //System.out.println("D");        
            if (rs.next()) {
    
                fcount = rs.getInt("NUMBER");
                return fcount;
                
            }
    //System.out.println("F");        
        }
        catch(Exception e)
        {
            System.out.print("ppppppppppp");
            System.out.print(e);
        }
        return fcount;
    }
    
    
    
    int checkParentID(String id,int count) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.   
        int  pID = 0;
                //int pID[] = null;  
                //pID = new int[count]; 
        //int  fID = 0;
        try
        {
            Connection conn = dbConnect.initializeDatabase();
    //System.out.println("A");        
            PreparedStatement ps = conn.prepareStatement("SELECT Parent_ID,Function_ID FROM [Function_role] WHERE Role_ID = ?");               
    //PreparedStatement ps = conn.prepareStatement("SELECT b.Parent_ID,b.Function_ID FROM [Roles] u INNER JOIN [Function_role] b ON u.Role_id = b.Role_id"); 
            //System.out.println("B");
            
            ps.setString(1, id);
            //ps.setString(2, id);
    //System.out.println("C");        
            ResultSet rs=ps.executeQuery(); 
              //roleID = rs.getString("Role_id");
    //System.out.println("D");   
    
            if (rs.next()) {
            //while (rs.next()){
    //System.out.println("E");            
                //messageBox(" "+username+" is already saved in database"); 
                //out.print(" "+username+", is already saved in database");
                //for (int i = 1; i <= count; i++){              
                pID = rs.getInt("Parent_ID");
                
                //new int[20];
                
                        //pID = new int[rs.getInt("Parent_ID")]; 
                
    //System.out.println("F");              
                //fID = rs.getInt("Function_ID");
                //pID = rs.getInt("Parent_ID");
                        //return pID;
                return pID;
                //return Arrays.asList(rs.getInt("Parent_ID"))
                //return;              
                //Email.focus(); 
                //return false; 
                 
            }
    
    /*
            while (rs.next()) {
                for (int i = 1; i <= count; i++) {
                if (i > 0) System.out.print(",  ");
                pID = rs.getInt("Parent_ID");
                System.out.print(" " + rs.getInt(pID)); 
            }
            System.out.println("");*/
            //System.out.println("F");        
        }
        catch(Exception e)
        {
            System.out.print("ppppppppppp");
        }
        
        //return false;
    //System.out.println("B23"); 
        return pID;
    }

    
    
    
    int checkFunctionID(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.   
        //int intfunction[] = null;
        int fID = 0;
        try
        {
            Connection conn = dbConnect.initializeDatabase();
    //System.out.println("A"); 
        List la=new LinkedList();
            PreparedStatement ps = conn.prepareStatement("SELECT Function_ID FROM [Function_role] WHERE Role_ID = ?");               
    //System.out.println("B");        
            ps.setString(1, id);
            //ps.setString(2, id);
    //System.out.println("C");        
            ResultSet rs=ps.executeQuery(); 
              //roleID = rs.getString("Role_id");
    //System.out.println("D");  
            //ab = new userRole(id,rs.getString("Function_ID"));
            // if(rs.next()) {
            while (rs.next()){
    //System.out.println("E");            
                //messageBox(" "+username+" is already saved in database"); 
                //out.print(" "+username+", is already saved in database");
                //fID = rs.getInt("Parent_ID");
                //intfunction = new int[20];
                //intfunction = new int[rs.getInt("Function_ID")]; 
                //fID = rs.getInt("Function_ID");
                //pID = rs.getInt("Parent_ID");
           //return fID;
        
                int i=rs.getInt("Function_id");
                user user1=new user(i);
                la.add(user1);

                System.out.println("ppp");
                return i;
        
                //return;              
                //Email.focus(); 
             
                //return false; 
            }
            }
    //System.out.println("F");        
        
        catch(Exception e)
        {
            System.out.print("ppppppppppp");
            //System.out.print(e);
        }
        //return false;
    //System.out.println("B23"); 
        //return intfunction;
        return fID;
    }
    
    
    
    String checkFunctionName(int pId,int fId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.   
        String fname = null;
        try
        {
            Connection conn = dbConnect.initializeDatabase();
    //System.out.println("A");       
            List lp=new LinkedList();
            PreparedStatement ps = conn.prepareStatement("SELECT Function_name FROM [Function] WHERE Parent_ID = ? and Function_ID  in (select Function_ID from Function_role where Role_ID = ?)");               
    //System.out.println("B");        
            ps.setInt(1, pId);
            ps.setInt(2, fId);
            //ps.setString(2, id);
    //System.out.println("C"); 
          // while(rs!=3){
            ResultSet rs=ps.executeQuery(); 
              //roleID = rs.getString("Role_id");
    //System.out.println("D");
           
            if (rs.next()) {
            //while (rs.next()){
    //System.out.println("E");            
                //messageBox(" "+username+" is already saved in database"); 
                //out.print(" "+username+", is already saved in database");
                //fID = rs.getInt("Parent_ID");
                //intfunction = new int[20];
                //intfunction = new String[rs.getInt("Function_ID")]; 
       
                //fname = rs.getString("Function_name");
                 String a=rs.getString("Function_name");
              //user user2=new user(a);
              //lp.add(user2);
             
                System.out.println("ppp");
           return a;
                //pID = rs.getInt("Parent_ID");
           //return fname;
           //System.out.println(functionid);
                //return;              
                //Email.focus(); 
                //return false; 
                
            }
    //System.out.println("F");        
           }
       // }
        catch(Exception e)
        {
            System.out.print("ppppppppppp");
            //System.out.print(e);
        }
        //return false;
    //System.out.println("B23"); 
        return fname;
    }

    List<Object[]> getFucntions(int userId)throws Exception{
        
        Connection conn = dbConnect.initializeDatabase();
        PreparedStatement ps = conn.prepareStatement("SELECT fu.Function_ID, fu.Parent_ID,fu.Parent_Name,fu.Function_Name  FROM [Function] fu,[Roles] ro,"
                + "[Function_Role] fr, [User] usr WHERE usr.User_ID = ? AND ro.User_role = usr.User_role AND "
                + " fr.Role_ID = ro.Role_ID AND fu.Function_Id = fr.Function_ID ORDER BY fu.seq");               
        
        ps.setInt(1, userId);
        ResultSet rs = ps.executeQuery();
        
        List<Object[]> mainList = new ArrayList<Object[]>();
        
        while (rs.next()) {
            Object[] listItem = new Object[4];
            listItem[0] = rs.getInt(1);
            listItem[1] = rs.getInt(2);
            listItem[2] = rs.getString(3);
            listItem[3] = rs.getString(4);
            
            mainList.add(listItem);
        }
    
        return mainList;
    }
}
