package sample;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc1 {
	public static void main(String[] args) throws ClassNotFoundException {
		String dbURL="jdbc:mysql://localhost:3306/advsel";
		//path of database
		Class.forName("com.mysql.cj.jdbc.Driver");//in maven dependencies file
		//connector file path to database
		try {
			DriverManager.getConnection(dbURL,"root","root");
			System.out.println("connection established");
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("connection failed");
		}
	}
}
