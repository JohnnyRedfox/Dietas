import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.SwingConstants;


public class Aplicativo {
	public static void main(String[] args) {
		
		JTextFields janela = new JTextFields();
		janela.setLayout(new FlowLayout(SwingConstants.CENTER));
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(550, 250);
		janela.setVisible(true);
		
	}
}
