import java.sql.*;
class SampleDb10
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = null;
System.out.println("Statment 1");
conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
System.out.println("Statment 2");
System.out.print("Database is connected !");
conn.close();
}
catch(Exception e)
{
System.out.print("Do not connect to DB - Error:"+e);
}
}
}