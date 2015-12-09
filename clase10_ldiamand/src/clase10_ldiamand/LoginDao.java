package clase10_ldiamand;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Properties;
import java.util.Set;

public class LoginDao {

	private static String url;

	static {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("db.properties"));
			url = prop.getProperty("db.url");
			Class.forName(prop.getProperty("db.class"));
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

	public void insert(Login l1) {
		try {
			Connection con = DriverManager.getConnection(url);
			String sql = "INSERT INTO login (name, pass, fecha) "
					+ "VALUES (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql,
					PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, l1.getName());
			ps.setString(2, l1.getPass());
			ps.setTimestamp(3, new Timestamp(l1.getFecha().getTime()));
			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();
			while (rs.next()) {
				Integer clave = rs.getInt(1);
				l1.setId(clave);
			}
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Set<Login> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
