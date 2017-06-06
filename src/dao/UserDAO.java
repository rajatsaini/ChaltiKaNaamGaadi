package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBUtil;

public class UserDAO {
	
public static boolean login(String username, String password) throws SQLException{
		
		String uname = null;
		String upass = null;
		
		Connection con = DBUtil.getConnection();
		
		Statement st = con.createStatement();
		
		String sql = "select name, pass from userbase " + "where name='"+username+"' and pass='"+password+"'";
		
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()){
			uname = rs.getString("name");
			upass = rs.getString("pass");
		}
		
		if(uname!=null && upass!=null && uname.equals(username) && upass.equals(password)){
			return true;
		}else{
			return false;
		}
		
	}

public static int register(String username, String password, String email){
	
	int status = 0;

	Connection con = DBUtil.getConnection();

	PreparedStatement ps;

	try {
		ps =  con.prepareStatement("insert into userbase values(?,?,?)");


		ps.setString(1, username);

		ps.setString(2, email);

		ps.setString(3, password);

		status = ps.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	}
	return status;
}
	

}
