/* JDBC sqlite Connection */
import java.sql.*;
import javax.swing.JOptionPane;
class Sqlite4
{
	public static void main(String args[])
	{
		
		try
		{
			
		//DriverManager.registerDriver("org.sqlite.JDBC");
			Class.forName("org.sqlite.JDBC");
			String connection="jdbc:sqlite:F:\computer software\Java compiler\jar_files\sqlite-jdbc-3.8.11.2.jar";
			Connection con=DriverManager.getConnection(connection);
			JOptionPane.showMessageDialog(null,"Data Base Connected");
		    System.out.println("Connected");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
	}
}
