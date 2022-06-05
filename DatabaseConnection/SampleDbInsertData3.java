import java.sql.*;
import java.util.Scanner;
class SampleDbInsertData3
{
	public static void main(String args[])
	{
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		Statement st=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Load");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			pst=conn.prepareStatement("insert into student(roll,name,address) values(?,?,?)");
			
			System.out.println("____________________________Insert Value____________________________");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Roll=");
			int insert_id=sc.nextInt();
			pst.setInt(1,insert_id);
			
			System.out.println("Enter name=");
			sc.nextLine();
			String insert_name=sc.nextLine();
			pst.setString(2,insert_name);
			
			
			System.out.println("Enter Address=");
			String insert_address=sc.nextLine();
			pst.setString(3,insert_address);
			
			pst.executeUpdate();
			
			System.out.println("____________________________Fetch Value____________________________");
			
			st=conn.createStatement();
			rs=st.executeQuery("Select * from student");
			
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
		