package clase12_ldiamand;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {
		try (Socket s = new Socket("localhost", 4444)) {
			InputStream is = s.getInputStream();
			OutputStream out = s.getOutputStream();
			OutputStreamWriter osr = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osr);
			Scanner ss = new Scanner(System.in);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			while (ss.hasNext()) {
				String linea = ss.nextLine();
				bw.write(linea);
				bw.newLine();
				bw.flush();
				linea = br.readLine();
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
