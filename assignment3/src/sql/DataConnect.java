package sql;


import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

public class DataConnect {

	private static Statement stat;

	private static void init() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/song";
		String name = "root";
		String pw = "123";
		Connection con = DriverManager.getConnection(url, name, pw);
		stat = con.createStatement( );
	}
	
	public static Statement getStat() throws ClassNotFoundException, SQLException{
		if (stat == null)
			init();
		return stat;
	}
//	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

