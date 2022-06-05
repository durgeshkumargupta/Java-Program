import java.util.Scanner;
import java.sql.*;
class SampleDbInsertDataFetchData4
{
	public static void main(String args[])
	{
		Connection conn=null;
		PreparedStatement pst=null;
		Statement st=null;
		ResultSet rs=null;
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
			
			System.out.println("______________Show Data__________________________");
			
			st=conn.createStatement();
			rs=st.executeQuery("select * from employee");
			while(rs.next())
			{
				Integer id2=rs.getInt(1);
				String name2=rs.getString(2);
				String email2=rs.getString(3);
				Long mobile2=rs.getLong(4);
				Integer dep_id2=rs.getInt(5);
				Integer city_id2=rs.getInt(6);
				Integer pin2=rs.getInt(7);
				String address2=rs.getString(8);
				System.out.println("Id:"+id2+" Name:"+name2+" Email:"+email2+" Mobile:"+mobile2+" Department ID:"+dep_id2+" City Id:"+city_id2+" Pin:"+pin2+" Address:"+address2);
				
			}
			
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
				st.close();
				rs.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}