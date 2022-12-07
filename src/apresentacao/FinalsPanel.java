package apresentacao;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Guess;
import negocio.Participant;

public class FinalsPanel extends JPanel{

	//Atributos
		private JTextField scoreField[];
		private JLabel team;
		private JLabel scoreBoard;
		private JLabel x;
		private Participant participant;
		private SemiPanel semi;
		private Guess g1;
		private Guess g2;
		
		//Metodo construtor
		public FinalsPanel(Participant participant, SemiPanel semi) {
			this.participant = participant;
			this.semi = semi;
			this.scoreField = new JTextField[2];
			organizePanel();
		}
		
		//Metodo para deixar os elementos do painel posicionados da forma escolhida
		public void organizePanel() {
			setLayout(new FlowLayout());
			
			team = new JLabel("Seleção:");
			add(team);
			
			g1 = new Guess(semi.getG1().result(), Integer.parseInt(semi.getScoreField()[0].getText()), semi.getG2().result(), 
					Integer.parseInt(semi.getScoreField()[1].getText()));
			JLabel label1 = new JLabel(g1.result());
			add(label1);
			
			scoreBoard = new JLabel("Placar:");
			add(scoreBoard);
			
			scoreField[0] = new JTextField(5);
			add(scoreField[0]);
			
			x = new JLabel("X");
			add(x);
			
			team = new JLabel("Seleção:");
			add(team);
			
			g2 = new Guess(semi.getG3().result(), Integer.parseInt(semi.getScoreField()[2].getText()), semi.getG4().result(), 
					Integer.parseInt(semi.getScoreField()[3].getText()));
			JLabel label2 = new JLabel(g2.result());
			add(label2);
			
			scoreField[1] = new JTextField(5);
			add(scoreField[1]);
		}

		//Metodos getters and setters
		public Guess getG1() {
			return g1;
		}

		public void setG1(Guess g1) {
			this.g1 = g1;
		}

		public Guess getG2() {
			return g2;
		}

		public void setG2(Guess g2) {
			this.g2 = g2;
		}

		public JTextField[] getScoreField() {
			return scoreField;
		}

		public void setScoreField(JTextField[] scoreField) {
			this.scoreField = scoreField;
		}
		
}
