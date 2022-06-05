/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Durgesh
 */
import java.sql.*;
public class Sqlite3 {
    
    
   public static void main( String args[] ) {
      Connection c = null;
      Statement stmt = null;
      
      try {
         Class.forName("org.sqlite.JDBC");
          System.out.println("Connected 1");
           boolean i=Boolean.parseBoolean("jdbc.sqlite:E:\\java program\\SqlLite Data Base\\test2.db");
           System.out.println(i);
           c = DriverManager.getConnection("jdbc:sqlite:E:\\java program\\SqlLite Data Base\\test2.db");
       //  c = DriverManager.getConnection("jdbc:sqlite:E:\\\\java program\\\\SqlLite Data Base\\\\test2.db");
          System.out.println("Connected 2");
         c.setAutoCommit(false);
      //   System.out.println("Opened database successfully");

         stmt = c.createStatement();
          System.out.println("Connected 3");
         String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
                        "VALUES (1, 'Paul', 32, 'California', 20000.00 );"; 
         stmt.executeUpdate(sql);

         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
                  "VALUES (2, 'Allen', 25, 'Texas', 15000.00 );"; 
         stmt.executeUpdate(sql);

         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
                  "VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );"; 
         stmt.executeUpdate(sql);

         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
                  "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );"; 
         stmt.executeUpdate(sql);

         stmt.close();
         c.commit();
         c.close();
      } catch ( Exception e ) {
           System.out.println("Connected 4");
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Records created successfully");
   }
    
}
