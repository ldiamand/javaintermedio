package clase11_ldiamand;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

public class ClaseFile {

	public static void main(String[] args) {
		try {
			File f1 = new File("archivo");
			if (f1.exists()) {
				System.out.println("Existe");
			} else {
				System.out.println("No existe");

				f1.createNewFile();
			}
			FileWriter fw = new FileWriter(f1);
			
			if (f1.isDirectory()) {
				System.out.println("Es un directorio");
			} else {
//				f1.isFile()
				System.out.println("Es un archivo");
			}
			System.out.println(f1.getAbsoluteFile());
			File f2 = new File("/home/dev", "delete.txt");
			System.out.println(f2.getParent());
			
			File f3 = new File("..");
			System.out.println(f3.getAbsolutePath());
			System.out.println(f3.getCanonicalPath());
			System.out.println(f3.isAbsolute());
			
			File f4 = new File("/usr/bin");
			String [] archivos = f4.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith(".sh");
				}
			});
			for (String string : archivos) {
				System.out.println(string);
			}
			
			File [] roots = File.listRoots();
			for (File file : roots) {
				System.out.println(file);
			}
 		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
