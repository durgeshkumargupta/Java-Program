import java.util.Scanner;
import java.sql.*;
class SampleDbInsertData4
{
	public static void main(String args[])
	{
		Connection conn=null;
		PreparedStatement pst=null;
		Statement st=null;
		ResultSet re=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			pst=conn.prepareStatement("insert into employee(id,name,email,mobile,dep_id,city_id,pin,address) values(?,?,?,?,?,?,?,?)");
			Scanner sc=new Scanner(System.in);
			
			System.out.println("__________________insert data___________________");
			System.out.println("Enter id=");
			int id=sc.nextInt();
			pst.setInt(1,id);
			
			System.out.println("Enter Name=");
			sc.nextLine();
			String name=sc.nextLine();
			pst.setString(2,name);
			
			System.out.println("Enter Email=");
			String email=sc.nextLine();
			pst.setString(3,email);
			
			System.out.println("Enter Mobile=");
			Long mobile=sc.nextLong();
            pst.setLong(4,mobile);
			
			System.out.println("Enter Department ID=");
			int dep_id=sc.nextInt();
			pst.setInt(5,dep_id);
			
			System.out.println("Enter city_id=");
			int city_id=sc.nextInt();
			pst.setInt(6,city_id);
			
			System.out.println("Enter pin=");
			int pin=sc.nextInt();
			pst.setInt(7,pin);
			
			System.out.println("Enter Address=");
			sc.nextLine();
			String address=sc.nextLine();
			pst.setString(8,address);
			
			
			
			
			pst.execute();
			System.out.println("Data insert");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{
				if(conn==null)
					return;
				conn.close();
				pst.close();
				//st.close();
			//	re.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}