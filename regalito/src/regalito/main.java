package regalito;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class main {
	public static void main(String s[]) {
		JFrame frame = new JFrame("Popero ♥");
		JLabel label = new JLabel();
		frame.setSize(400, 80);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.PINK);
		frame.add(new JLabel("Rata castrosa, consumidora de popper"), BorderLayout.CENTER);
		frame.setVisible(true);
	}
}