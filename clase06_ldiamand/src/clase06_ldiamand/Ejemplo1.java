package clase06_ldiamand;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Ejemplo1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo1 window = new Ejemplo1();
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
	public Ejemplo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(Ejemplo1.class.getResource("/clase06_ldiamand/image.png")));
		frame.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(4, 8, 1, 1));
		
		for (int i = 0; i < 26; i++) {
			JButton b = new JButton(String.valueOf((char)('A' + i)));
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton boton = (JButton) e.getSource();
					boton.setEnabled(false);
				}
			});
			panel_1.add(b);
		}
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblPalabra = new JLabel("Palabra");
		lblPalabra.setBounds(33, 30, 70, 15);
		panel_2.add(lblPalabra);
		
		JLabel label = new JLabel("_ _ _ _ _ _");
		label.setBounds(65, 78, 70, 15);
		panel_2.add(label);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmItem = new JMenuItem("Item1");
		mnFile.add(mntmItem);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmItem_1 = new JMenuItem("Item2");
		mnEdit.add(mntmItem_1);
	}
}
