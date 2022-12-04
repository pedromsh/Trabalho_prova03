package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import negocio.Participant;

public class FinalsButton extends JButton implements ActionListener{

	//Atributos
		private Participant participant;
		private Finals window;
			
		//Metodo para criar um botao e adicionar o action listener
		public FinalsButton(Participant participant, Finals window) {
			this.participant = participant;
			this.window = window;
		}
		
		//Metodo para exibir a bandeira do campeao
			public void actionPerformed(ActionEvent e) {
				window.setVisible(false);
				
			}
}
