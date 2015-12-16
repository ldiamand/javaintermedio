package clase10_ldiamand;

import java.util.Set;

public class App {

	public static void main(String[] args) {
		Login l1 = new Login();
		l1.setName("claudio");
		l1.setPass("secreto");
		System.out.println(l1.getId());
		
		LoginDao dao = new LoginDao();
		dao.insert(l1);
		System.out.println(l1.getId());
		
		Set<Login> logins = dao.findAll();
		for (Login login : logins) {
			System.out.println(login);
		}
	}
}
