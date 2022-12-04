package apresentacao;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Participant;

public class QuarterPanel extends JPanel{

	//Atributos
		private JTextField field[];
		private JLabel team;
		private JLabel scoreBoard;
		private JLabel x;
		private Participant participant;
		private String assistant;
		
		//Metodo construtor
		public QuarterPanel(Participant participant) {
			this.participant = participant;
			this.field = new JTextField[16];
			organizePanel();
		}
		
		//Metrodos getters and setters
		public JTextField[] getField() {
			return field;
		}

		public void setField(JTextField[] field) {
			this.field = field;
		}

		//Metodo para deixar os elementos do painel posicionados da forma escolhida
		public void organizePanel() {
			
			setLayout(new GridLayout(4, 9, 5, 5));
			
			team = new JLabel("Seleção:");
			add(team);
			
			field[0] = new JTextField(10);
			add(field[0]);
//			participant.getSoccerTeams().add(field[0].getText());
			
			scoreBoard = new JLabel("Placar:");
			add(scoreBoard);
			
			field[1] = new JTextField(5);
			add(field[1]);
			
			x = new JLabel("X");
			add(x);
			
			team = new JLabel("Seleção:");
			add(team);
			
			field[2] = new JTextField(10);
			add(field[2]);
			
			scoreBoard = new JLabel("Placar:");
			add(scoreBoard);
			
			field[3] = new JTextField(5);
			add(field[3]);
			
			team = new JLabel("Seleção:");
			add(team);
			
			field[4] = new JTextField(10);
			add(field[4]);
			
			scoreBoard = new JLabel("Placar:");
			add(scoreBoard);
			
			field[5] = new JTextField(5);
			add(field[5]);
			
			x = new JLabel("X");
			add(x);
			
			team = new JLabel("Seleção:");
			add(team);
			
			field[6] = new JTextField(10);
			add(field[6]);
			
			scoreBoard = new JLabel("Placar:");
			add(scoreBoard);
			
			field[7] = new JTextField(5);
			add(field[7]);
			
			team = new JLabel("Seleção:");
			add(team);
			
			field[8] = new JTextField(10);
			add(field[8]);
			
			scoreBoard = new JLabel("Placar:");
			add(scoreBoard);
			
			field[9] = new JTextField(5);
			add(field[9]);
			
			x = new JLabel("X");
			add(x);
			
			team = new JLabel("Seleção:");
			add(team);
			
			field[10] = new JTextField(10);
			add(field[10]);
			
			scoreBoard = new JLabel("Placar:");
			add(scoreBoard);
			
			field[11] = new JTextField(5);
			add(field[11]);
			
			team = new JLabel("Seleção:");
			add(team);
			
			field[12] = new JTextField(10);
			add(field[12]);
			
			scoreBoard = new JLabel("Placar:");
			add(scoreBoard);
			
			field[13] = new JTextField(5);
			add(field[13]);
			
			x = new JLabel("X");
			add(x);
			
			team = new JLabel("Seleção:");
			add(team);
			
			field[14] = new JTextField(10);
			add(field[14]);
			
			scoreBoard = new JLabel("Placar:");
			add(scoreBoard);
			
			field[15] = new JTextField(5);
			add(field[15]);
			
		}
}
