package clase10_ldiamand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionDemo {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("db.properties"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			Class.forName(prop.getProperty("db.class"));
			String url = prop.getProperty("db.url");
			String user = "app";
			String pass = "app";
			Connection con = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
