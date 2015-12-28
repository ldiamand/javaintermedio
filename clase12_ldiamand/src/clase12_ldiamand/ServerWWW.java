package clase12_ldiamand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerWWW {

	public static void main(String[] args) {
		try (ServerSocket ss = new ServerSocket(8080)) {
			while (true) {
				Socket s = ss.accept();
				File f = new File("index2.html");
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				PrintWriter out = new PrintWriter(s.getOutputStream(), true);
				out.println("HTTP/1.1 200 OK");
				out.println("Content-Type: text/html");
				out.println("Content-Length: " + f.length());
				out.println();
				String linea;
				while ((linea = br.readLine()) != null) {
					out.println(linea);
				}
				s.close();
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
