package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import negocio.Participant;

public class SemiButton extends JButton implements ActionListener{

	//Atributos
		private Participant participant;
		private SemiFinals window;
		private SemiPanel semi;
		
		//Metodo para criar o botao e adicionar o action listener
		public SemiButton(Participant participant, SemiFinals window, SemiPanel semi) {
			this.participant = participant;
			this.window = window;
			this.semi = semi;
		}
			
		public void actionPerformed(ActionEvent e) {
			Finals finals = new Finals(participant, semi);
			window.setVisible(false);
			
		}

}
