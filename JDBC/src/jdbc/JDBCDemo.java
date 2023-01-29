package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		//readRecords();
		updateRecord();
	}
	public static void readRecords() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password ="mohan@12345";
		String query = "select * from employee";
	Connection con = DriverManager.getConnection(url, username, password);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
	while( rs.next()) {
	
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getFloat(3));
	}
	}
	public static void updateRecord() throws SQLException {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password ="mohan@12345";
		int num =sc.nextInt() ;
		String name =sc.next();
		int salary = sc.nextInt();
		String query = "insert into employee values("+num+",'"+name+"',"+salary+")";
	Connection con = DriverManager.getConnection(url, username, password);
	Statement st = con.createStatement();
	int rows =st.executeUpdate(query);
	System.out.println(query);
	System.out.println("number of rows affected :" +rows);
	}
}
