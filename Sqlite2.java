import java.sql.*;
//import java.swing.JOptionPane;
public class Sqlite2 extends javafx.appliaction.Application;
 {
    static Connection conn=null;
    public static Connection ConnecrDb()
	{
		
		try
		{
		
                    Class.forName("org.sqlite.JDBC");
                    Connection conn=DriverManager.getConnection("jdbc.sqlite:E:\\java program\\Libraray Management System\\LibraryNew.sqlite");
                    return conn;
		
		}
		catch(Exception e)
		{
			System.out.println(e);
                        return conn;
                  
		}
		
	/*	finally
		{
			try
			{
				conn.close();
			}
			catch(Exception e)
			{}
		}
    */}
 }
    

