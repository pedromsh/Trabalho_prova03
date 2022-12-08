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
		
		//Metodo construtor
		public SemiButton(Participant participant, SemiFinals window, SemiPanel semi) {
			this.participant = participant;
			this.window = window;
			this.semi = semi;
		}
		
		//Metodo para adicionar as selecoes que avancaram de fase ao arraylist de selecoes da classe participante
		public void addStringsToArrayList() {
			participant.getSoccerTeams().add(semi.getG1().result());
			participant.getSoccerTeams().add(semi.getG2().result());
			participant.getSoccerTeams().add(semi.getG3().result());
			participant.getSoccerTeams().add(semi.getG4().result());
		}
		
		public void actionPerformed(ActionEvent e) {
			Finals finals = new Finals(participant, semi);
			
			window.setVisible(false);
			
			for (int i = 0; i < semi.getScoreField().length; i++) {
				participant.getScoreBoards().add(Integer.valueOf(semi.getScoreField()[i].getText()));
			}
			
			addStringsToArrayList();
			
		}

}
