package clase03_ldiamand;

public class WhileDemo {

	public static void main(String[] args) {
//		while (cond_boolean) {
			// true
//		}
		
		int i = 0;
		while (i < 10) {
			System.out.println(i++);
		}
		
//		i = 0;
//		while (i < 10) 
//			System.out.println(i);
//			i++;
		
		i = 0;
		while (i < 10) {
			System.out.println(i++);
			if (i == 5) {
				break;
			}
		}
		
		i = 0;
		while (i < 10) {
			i++;
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}		
			
	}
}
