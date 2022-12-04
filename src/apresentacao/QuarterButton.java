package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import negocio.Guess;
import negocio.Participant;

public class QuarterButton extends JButton implements ActionListener{

	//Atributos
		private Participant participant;
		private QuarterFinals window;
		private JTextField field[];
		
		//Metodo construtor
		public QuarterButton(Participant participant, QuarterFinals window, JTextField field[]) {
			this.participant = participant;
			this.window = window;
			this.field = field;
		}
		
		//Metodo para pegar o evento do clique e abrir a janela das semifinais
		public void actionPerformed(ActionEvent e) {
			SemiFinals semiFinals = new SemiFinals(participant, field);
			window.setVisible(false);
			
			for (int i = 0; i < field.length; i++) {
				if(i % 2 == 0)
					participant.getSoccerTeams().add(field[i].getText());
				else {
					participant.getScoreBoards().add(Integer.parseInt(field[i].getText()));
				}
					
			}
			
		}
}
