package apresentacao;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Participant;

public class SemiPanel extends JPanel{

	//Atributos
		private JTextField field;
		private JLabel team;
		private JLabel scoreBoard;
		private JLabel x;
		private Participant participant;
		
		//Metodo construtor
		public SemiPanel(Participant participant) {
			this.participant = participant;
			organizePanel();
		}
		
		//Metodo para deixar os elementos do painel posicionados da forma escolhida
			public void organizePanel() {
				setLayout(new GridLayout(2, 9, 5, 5));
				
				team = new JLabel("Seleção:");
				add(team);
				
				field = new JTextField(10);
				add(field);
				participant.getSoccerTeams().add(field.getText());
				
				scoreBoard = new JLabel("Placar:");
				add(scoreBoard);
				
				field = new JTextField(5);
				add(field);
				
				x = new JLabel("X");
				add(x);
				
				team = new JLabel("Seleção:");
				add(team);
				
				field = new JTextField(10);
				add(field);
				participant.getSoccerTeams().add(field.getText());
				
				scoreBoard = new JLabel("Placar:");
				add(scoreBoard);
				
				field = new JTextField(5);
				add(field);
				
				team = new JLabel("Seleção:");
				add(team);
				
				field = new JTextField(10);
				add(field);
				participant.getSoccerTeams().add(field.getText());
				
				scoreBoard = new JLabel("Placar:");
				add(scoreBoard);
				
				field = new JTextField(5);
				add(field);
				
				x = new JLabel("X");
				add(x);
				
				team = new JLabel("Seleção:");
				add(team);
				
				field = new JTextField(10);
				add(field);
				participant.getSoccerTeams().add(field.getText());
				
				scoreBoard = new JLabel("Placar:");
				add(scoreBoard);
				
				field = new JTextField(5);
				add(field);
			}
			
}
