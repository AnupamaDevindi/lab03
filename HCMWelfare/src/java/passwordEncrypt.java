
import java.security.MessageDigest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 926030140v
 */
public class passwordEncrypt {
    
    //Create an encrypted string for password
    public String userPassword(String p)
    {       
        String password = p;
        String algorithm = "SHA";

        byte[] plainText = password.getBytes();
        StringBuilder sb = new StringBuilder();
        
        try 
        {
            MessageDigest md = MessageDigest.getInstance(algorithm);

            md.reset();
            md.update(plainText);
            byte[] encodedPassword = md.digest();

            
            for (int i = 0; i < encodedPassword.length; i++) 
            {
                if ((encodedPassword[i] & 0xff) < 0x10) 
                {
                    sb.append("0");
                }

                sb.append(Long.toString(encodedPassword[i] & 0xff, 16));
               
            }
 
            //System.out.println("Plain    : " + password);
            System.out.println("Encrypted: " + sb.toString());
        } 
        catch (Exception e) 
        {
            
            e.printStackTrace();
        }
       return sb.toString();
    }   
}
