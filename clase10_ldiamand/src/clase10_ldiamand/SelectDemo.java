package clase10_ldiamand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class SelectDemo {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("db.properties"));
			Class.forName(prop.getProperty("db.class"));
			String url = prop.getProperty("db.url");
			Connection con = DriverManager.getConnection(url);
			
			String sql = "SELECT * FROM login";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				// En cada fila
				System.out.println(rs.getInt(1) + ", " + 
						rs.getString(2) + ", " +
						rs.getString(3) + ", " + 
						rs.getTimestamp(4));
			}
			
		} catch (ClassNotFoundException | SQLException 
				| IOException e) {
			e.printStackTrace();
		}
	}
}
