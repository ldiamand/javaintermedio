package clase06_ldiamand;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

public class Ejemplo2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo2 window = new Ejemplo2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String palabra = "Hola";
		
		String tmp = "o";
		
		int cont = palabra.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cont; i++) {
			if (palabra.charAt(i) == tmp.charAt(0)) {
				sb.append(tmp + " ");
			} else {
				sb.append("_ ");
			}
		}
		
		JLabel label = new JLabel(sb.toString());
		label.setFont(new Font("Dialog", Font.BOLD, 18));
		frame.getContentPane().add(label, BorderLayout.CENTER);
	}

}
