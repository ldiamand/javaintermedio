package client;

import pool.Conn;
import pool.Pool;

public class Client {

	public static void main(String[] args) {
		Pool pool = new Pool();
		Conn a = pool.obtener();
		System.out.println(a.getId()); // 1
		Conn b = pool.obtener();
		System.out.println(b.getId()); // 2
		Conn c = pool.obtener();
		if (c == null) {
			System.out.println("Todo ok!");
		} else {
			System.out.println("Todo mal");
		}
		pool.devolver(b);
		b.hacer();
		Conn d = pool.obtener();
		d.hacer();
		System.out.println(d.getId()); // 1
//		Conn e = new Conn(); // NC
//		System.out.println(e.getId());
//		e.hacer();
	}
}

