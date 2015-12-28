package clase11_ldiamand;

import java.io.File;

public class Buscador {

	public static void main(String[] args) {
		System.out.println("Buscando java");
		File[] roots = File.listRoots();
		for (File file : roots) {
			buscarEn(file, "java");
		}
	}

	public static void buscarEn(File dir, String nombre) {
		File[] archivos = dir.listFiles();
		if (archivos != null) {
			for (File file : archivos) {
				if (file.isDirectory()) {
					buscarEn(file, nombre);
				} else {
					if (file.getName().equals(nombre)) {
						System.out.println(file.getAbsolutePath());
					}
				}
			}
		}
	}
}
