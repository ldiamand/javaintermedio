package clase10_ldiamand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class DeletePSDemo {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("db.properties"));
			Class.forName(prop.getProperty("db.class"));
			String url = prop.getProperty("db.url");
			Connection con = DriverManager.getConnection(url);
			
			Scanner s = new Scanner(System.in);
			System.out.println("Ingrese el usuario a borrar:");
			String linea = s.nextLine();
			
			String sql = "DELETE FROM login WHERE name = ?";
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, linea);

			int cant = st.executeUpdate();
			System.out.println("Cant de filas " + cant);
		} catch (ClassNotFoundException | SQLException 
				| IOException e) {
			e.printStackTrace();
		}
	}
}
