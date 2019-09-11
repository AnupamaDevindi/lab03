/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 926030140v
 */
// set up all the fields received from userRegister.jsp to setters and getters.
public class user {
    
    int id;
    String fname;
    String lname;         
    String email; 
    String userType;         
    String userRole;         
    int contact;         
    String status;
    String username;        
    String password;
    int cid;
    /*
    public user(Integer id,String fname,String lname,String email,String userType,String userRole,int contact,String status,String username,String password,int cid)
    {
         this.id = id;
         this.fname = fname;
         this.lname = lname;
         this.email = email;
         this.userType = userType;
         this.userRole = userRole;
         this.contact = contact;
         this.status = status;
         this.username = username;
         this.password = password;
         this.cid = cid;
    }*/
     
     public int getid()
     {
         return id;
     }
     public void setid(int id)
     {
         this.id = id;
     }
     
     public String getfname()
     {
         return fname;
     }
     public void setfname(String fname)
     {
         this.fname = fname;
     }
     
     public String getlname()
     {
         return lname;
     }
     public void setlname(String lname)
     {
         this.lname = lname;
     }
     
     public String getemail()
     {
         return email;
     }
     public void setemail(String email)
     {
         this.email = email;
     }
     
     public String getuserType()
     {
         return userType;
     }
     public void setuserType(String useerType)
     {
         this.userType = userType;
     }
     
     public String getuserRole()
     {
         return userRole;
     }
     public void setuserRole(String userRole)
     {
         this.userRole = userRole;
     }
     
     public int getcontact()
     {
         return contact;
     }
     public void setcontact(int contact)
     {
         this.contact = contact;
     }
     
     public String getstatus()
     {
         return status;
     }
     public void setstatus(String status)
     {
         this.status = status;
     }
     
     public String getusername()
     {
         return username;
     }
     public void setusername(String username)
     {
         this.username = username;
     }
     
     public String getpassword()
     {
         return password;
     }
     public void setpassword(String password)
     {
         this.password = password;
     }
     
     public int getcid()
     {
         return cid;
     }
     public void setcid(int cid)
     {
         this.cid = cid;
     }
     
    
}
