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

public class InsertDemo {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("db.properties"));
			Class.forName(prop.getProperty("db.class"));
			String url = prop.getProperty("db.url");
			Connection con = DriverManager.getConnection(url);
			
			String sql = "INSERT INTO login (name, pass, fecha) "
					+ " VALUES ('sopa', 'sopa1', '2015-10-10 00:00:00.000')";
			
			Statement st = con.createStatement();
			int cant = st.executeUpdate(sql);
			System.out.println("Cant de filas " + cant);
		} catch (ClassNotFoundException | SQLException 
				| IOException e) {
			e.printStackTrace();
		}
	}
}
