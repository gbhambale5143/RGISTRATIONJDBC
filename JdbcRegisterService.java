package in.cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcRegiterService {

	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/test";
	private static String username ="root"; // root
	private static String password =""; // ""

	public static void registerUser(UserPojo user) throws Exception {

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, username, password);

			String sql = "INSERT INTO jdbcuser (USERNAME,PASSWORD,EMAIL,MOBILE) VALUES(?,?,?, ?)";
			PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getEmail());
            ps.setString(4, user.getMobile());
            
            ps.executeUpdate();
            return;
		} catch (Exception e) {
			throw e;
		}

	}
}