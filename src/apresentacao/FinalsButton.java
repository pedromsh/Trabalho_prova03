package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import negocio.Guess;
import negocio.Participant;
import persistencia.SweepstakesDAO;

public class FinalsButton extends JButton implements ActionListener{

	//Atributos
		private Participant participant;
		private Finals window;
		private FinalsPanel finals;
		private Guess championGuess;
			
		//Metodo para criar um botao e adicionar o action listener
		public FinalsButton(Participant participant, Finals window, FinalsPanel finals) {
			this.participant = participant;
			this.window = window;
			this.finals = finals;
			
			
		}
		
		//Metodo para adicionar as selecoes que avancaram de fase ao arraylist de selecoes da classe participante
		public void addStringsToArrayList() {
			participant.getSoccerTeams().add(finals.getG1().result());
			participant.getSoccerTeams().add(finals.getG2().result());
		}
		
		//Metodo para adicionar os placares das selecoes que avancaram de fase ao arraylist de selecoes da classe 
		//participante
		public void addScoreToArrayList() {
			participant.getScoreBoards().add(Integer.parseInt(finals.getScoreField()[0].getText()));
			participant.getScoreBoards().add(Integer.parseInt(finals.getScoreField()[1].getText()));
		}
		
		//Metodo para exibir a bandeira do campeao
			public void actionPerformed(ActionEvent e) {
				championGuess = new Guess(finals.getG1().result(), Integer.parseInt(finals.getScoreField()[0].getText()), 
						finals.getG2().result(), Integer.parseInt(finals.getScoreField()[1].getText()));
				
				Champion champion = new Champion(finals, championGuess);
				
				window.setVisible(false);
				
				addStringsToArrayList();
				
				addScoreToArrayList();
				
				participant.getSoccerTeams().add(championGuess.result());
				
				SweepstakesDAO s = new SweepstakesDAO();
				s.inserir(participant);
			}
}
