package apresentacao;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import negocio.Participant;

public class Finals extends JFrame{

	    //Atributos 
		private Participant participant;
		private JButton button;
		private SemiPanel semi;
			
		//Metodo cosntrutor
		public Finals(Participant participant, SemiPanel semi) {
			this.participant = participant;
			this.semi = semi;
			
			setSize(600, 300);
			setTitle("Final");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			organizeLayout();
			setVisible(true);
		}
		
		//Metodo para organizar os componentes da forma desejada
		public void organizeLayout() {
			setLayout(new BorderLayout());
			
			FinalsPanel finals = new FinalsPanel(participant, semi);
			add(finals, BorderLayout.CENTER);
			
			button = new JButton("Enviar");
			FinalsButton finalButton = new FinalsButton(participant, this, finals);
			button.addActionListener(finalButton);
			add(button, BorderLayout.SOUTH);
			
		}
}
