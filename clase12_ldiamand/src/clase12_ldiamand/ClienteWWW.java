package clase12_ldiamand;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClienteWWW {

	public static void main(String[] args) {
		try (Socket s = new Socket("www.yahoo.com", 80)) {
			InputStream is = s.getInputStream();
			OutputStream out = s.getOutputStream();
			OutputStreamWriter osr = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osr);
			String mensaje = "GET / HTTP/1.1";
			bw.write("Content-Type: text/html");
			bw.write("User-Agent: Firefox");
			bw.write("Content-Length: " + mensaje.length());
			bw.newLine();
			bw.write(mensaje);
			bw.newLine();
			bw.newLine();
			bw.flush();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
