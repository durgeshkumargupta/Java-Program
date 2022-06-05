package com.javatpoint.feereport;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountantDao {
	public static Connection getCon(){
		Connection con=null;
		try{
			//Class.forName("com.mysql.jdbc.Driver");
                     //   Class.forName("oracle.jdbc.driver.OracleDriver");
		    //	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
                        System.out.println("connection created");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static boolean validate(String name,String password){
            
		boolean status=false;
                try{
			Connection con=getCon();
                        System.out.println("Succes 1");
			PreparedStatement ps=con.prepareStatement("select * from employee ");
                        
			//ps.setString(1,name);
			//ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
                        System.out.println("Succes 2"+rs.getString(0));
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}
	public static int save(Accountant a){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("insert into employee(id,name,password,email,contactno) values(?,?,?,?,?)");
			ps.setString(1,a.getName());
			ps.setString(2,a.getPassword());
			ps.setString(3,a.getEmail());
			ps.setString(4,a.getContactno());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static List<Accountant> view(){
		List<Accountant> list=new ArrayList<>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Accountant a=new Accountant();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPassword(rs.getString(3));
				a.setEmail(rs.getString(4));
				a.setContactno(rs.getString(5));
				list.add(a);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
}
