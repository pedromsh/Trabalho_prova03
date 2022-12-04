package apresentacao;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import negocio.Participant;

public class SemiFinals extends JFrame{

	//Atributos 
		private Participant participant;
		private JButton button;
		
		//Metodo construtor
		public SemiFinals(Participant participant) {
			this.participant = participant;
			
			setSize(800, 800);
			setTitle("Semifinal");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			organizeLayout();
			setVisible(true);
		}
		
		//Metodo para deixar os elementos dessa janela da forma desejada 
		public void organizeLayout() {
			setLayout(new BorderLayout());
			
			SemiPanel semi = new SemiPanel(participant);
			add(semi, BorderLayout.CENTER);
			
			button = new JButton("Enviar");
			SemiButton semiButton = new SemiButton(participant, this);
			this.button.addActionListener(semiButton);
			add(button, BorderLayout.SOUTH);
			
		}
}
