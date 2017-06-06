package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private static String DB_URL 	  = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String USERNAME    = "hr";
	private static String PASSWORD    = "hr";
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("Couldn't find class!!");
		}
		
		try{
			conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);		
		}
		catch(SQLException e){
			System.out.println("Connection couldn't be established !! phew!!");
		}
		
		return conn;
	}
	
	public static void closeConnection(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				System.err.println("Connection Couldn't be closed.");
			}
		}
	}
	
}
