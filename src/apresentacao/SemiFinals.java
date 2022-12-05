package apresentacao;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import negocio.Participant;

public class SemiFinals extends JFrame{

	//Atributos 
		private Participant participant;
		private JButton button;
		private JTextField field[];
		
		//Metodo construtor
		public SemiFinals(Participant participant, JTextField field[]) {
			this.participant = participant;
			this.field = field;
			
			setSize(800, 800);
			setTitle("Semifinal");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			organizeLayout();
			setVisible(true);
		}
		
		//Metodo para deixar os elementos dessa janela da forma desejada 
		public void organizeLayout() {
			setLayout(new BorderLayout());
			
			SemiPanel semi = new SemiPanel(participant, field);
			add(semi, BorderLayout.CENTER);
			
			button = new JButton("Enviar");
			SemiButton semiButton = new SemiButton(participant, this, semi);
			this.button.addActionListener(semiButton);
			add(button, BorderLayout.SOUTH);
			
		}
}
