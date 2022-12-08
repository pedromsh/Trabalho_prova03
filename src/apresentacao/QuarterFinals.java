package apresentacao;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import negocio.Participant;

public class QuarterFinals extends JFrame{

	//Atributos
		private Participant participant;
		private JButton button;
		
		//Metodo construtor
		public QuarterFinals(Participant participant) {
			this.participant = participant;
			
			setSize(800, 600);
			setTitle("Quartas de Final");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			organizeLayout();
			setVisible(true);
		}
		
		//Metodo para deixar os elementos dessa janela da forma desejada 
		public void organizeLayout() {
			setLayout(new BorderLayout());
			QuarterPanel quarter = new QuarterPanel(participant);
			add(quarter, BorderLayout.CENTER);
			
			button = new JButton("Enviar");
			QuarterButton quarterButton = new QuarterButton(participant, this, quarter.getField());
			this.button.addActionListener(quarterButton);
			add(button, BorderLayout.SOUTH);
		}
}
