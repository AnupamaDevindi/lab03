

import java.sql.*;

/**
 *
 * @author 926030140v
 */

public class dbConnect { 
    protected static Connection initializeDatabase() 
    throws SQLException, ClassNotFoundException 
    {    
        /*
        String url= "jdbc:sqlserver://172.20.8.14:1433";
        String dbName = "CeyBank";
        String driver = "";
        String userName = "testceybank";
        String password = "testceybank";
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url+dbName,userName,password);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        */
        
        Connection con = null;   //Database Connection
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    //loading ms sql server driver 
            //attempting to connect to ms sql server database
            con = DriverManager.getConnection("jdbc:sqlserver://172.20.8.14:1433;databaseName=CeyBank", "testceybank", "testceybank");
        }
        catch(Exception ex)
        {
            System.out.println("unable to connect to the database");    //throws an error if at all its unable to create an connection
            //System.out.println(ex.getMessage());
        }
        return con;    // we return the connection and we can get the connection wherever needed.
        
    } 
} 


