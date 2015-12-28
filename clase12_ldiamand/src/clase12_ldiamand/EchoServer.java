package clase12_ldiamand;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		try (ServerSocket ss = new ServerSocket(4444)) {
			Socket s = ss.accept();
			InputStream is = s.getInputStream();
			OutputStream out = s.getOutputStream();
			while (true) {
				int data = is.read();
				System.out.println("> " + (char) data + "(" + data + ")");
				out.write(data);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
