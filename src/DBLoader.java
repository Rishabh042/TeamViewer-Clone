


import java.sql.*;

public class DBLoader 
{
    static ResultSet executeSQL(String sql) throws Exception
    {
         Class.forName("com.mysql.cj.jdbc.Driver");
         System.out.println("Driver loading done");
            
         Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1", "root", "system");
         System.out.println("Connection done");
          
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        System.out.println("Statement done");
            
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println("ResultSet Created");    
        
        return rs;
    }
}
