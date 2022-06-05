import java.sql.*;
import java.util.Scanner;
class SampleDbFetchData2
{
	public static void main(String args[])
	{
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Load");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			pst=conn.prepareStatement("select * from student where name=?");
			
			System.out.println("Enter name=");
			Scanner sc=new Scanner(System.in);
			String name_fetch=sc.nextLine();
			pst.setString(1,name_fetch);
			rs=pst.executeQuery();
			
			while(rs.next())
			{
				Integer roll=rs.getInt(1);
				String name=rs.getString(2);
				String address=rs.getString(3);
				System.out.println(" Name:"+name +" Roll:"+roll +" Address:"+address);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try{
				if(conn==null)
					return;
				conn.close();
				rs.close();
				pst.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
	}
}
		