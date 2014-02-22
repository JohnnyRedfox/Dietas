import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class JTextFields extends JFrame {
	private JTextField campo1;
	private JTextField campo2;
	private JTextField campo3;
	private JTextField campo4;

	private JButton gerar;
	private JButton mudaTela;

	public JTextFields(){


		super("Dietas");
		
		campo1 = new JTextField("campo1",10);
		campo1.setEditable(false);
		campo1.setSize(50, 30);
		add(campo1);

		campo2 = new JTextField("campo2",10);
		campo2.setEditable(false);
		campo2.setSize(50, 30);
		add(campo2);

		campo3 = new JTextField("campo3",10);
		campo3.setEditable(false);

		add(campo3);

		campo4 = new JTextField("campo4",10);
		campo4.setEditable(false);
		add(campo4);

		gerar = new JButton("Gerar");
		gerar.setBounds(50,50,100,100);
		add(gerar);
		JTextFieldsHandler handler = new JTextFieldsHandler();
		gerar.addActionListener(handler);
		
		mudaTela = new JButton("Teste mudança de tela");
		add(mudaTela);
		mudaTela.addActionListener(handler);
		
		
		
	



	}//fim do construtor
	private class JTextFieldsHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			//instanciando o objeto aleatorio
			GeradorDeComida gerador = new GeradorDeComida();
		

			if(event.getSource()==gerar)
			{
				campo1.setText(gerador.aleatorio1); 
				campo2.setText(gerador.aleatorio2);
				campo3.setText(gerador.aleatorio3);
				campo4.setText(gerador.aleatorio4);

			}
			else if(event.getSource()==mudaTela)
			{
			
			}
		}

	}

}

