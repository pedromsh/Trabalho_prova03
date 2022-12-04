package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import negocio.Participant;

public class NameButton implements ActionListener{

	//Atributos
		private JTextField field;
		private Participant participant;
		private NameWindow window;
		
		//Metodo construtor
		public NameButton(JTextField field, Participant participant, NameWindow window) {
			this.field = field;
			this.participant = participant;
			this.window = window;
		}
		
		//Metodo do evento de clicar no botao
		public void actionPerformed(ActionEvent e) {
			QuarterFinals quarterFinals = new QuarterFinals(participant);
			participant.setName(field.getText());
			window.setVisible(false);
		}

}
