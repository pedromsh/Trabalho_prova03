package apresentacao;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Guess;
import negocio.Participant;

public class SemiPanel extends JPanel{

	    //Atributos
		private JTextField scoreField[];//array de JTextField do SemiPanel que vai receber os placares
		private JLabel team;
		private JLabel scoreBoard;
		private JLabel x;
		private Participant participant;
		private JTextField field[];//array de JTextField do QuarterPanel;
		private Guess g1;
		private Guess g2;
		private Guess g3;
		private Guess g4;
		
		//Metodo construtor
		public SemiPanel(Participant participant, JTextField field[]) {
			this.participant = participant;
			this.field = field;
			this.scoreField = new JTextField[4];
			organizePanel();
		}
		
		//Metodo para deixar os elementos do painel posicionados da forma escolhida
			public void organizePanel() {
				setLayout(new GridLayout(2, 9, 5, 5));
				
				team = new JLabel("Seleção:");
				add(team);
				
				g1 = new Guess(field[0].getText(), Integer.parseInt(field[1].getText()), field[2].getText(), 
						Integer.parseInt(field[3].getText()));
				
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
				
				g2 = new Guess(field[4].getText(), Integer.parseInt(field[5].getText()), field[6].getText(), 
						Integer.parseInt(field[7].getText()));
				
				JLabel label2 = new JLabel(g2.result());
				add(label2);
				
				scoreBoard = new JLabel("Placar:");
				add(scoreBoard);
				
				scoreField[1] = new JTextField(5);
				add(scoreField[1]);
				
				team = new JLabel("Seleção:");
				add(team);
				
				g3 = new Guess(field[8].getText(), Integer.parseInt(field[9].getText()), field[10].getText(), 
						Integer.parseInt(field[11].getText()));
				
				JLabel label3 = new JLabel(g3.result());
				add(label3);
				
				scoreBoard = new JLabel("Placar:");
				add(scoreBoard);
				
				scoreField[2] = new JTextField(5);
				add(scoreField[2]);
				
				x = new JLabel("X");
				add(x);
				
				team = new JLabel("Seleção:");
				add(team);
				g4 = new Guess(field[12].getText(), Integer.parseInt(field[13].getText()), field[14].getText(), 
						Integer.parseInt(field[15].getText()));

				JLabel label4 = new JLabel(g4.result());
				add(label4);
				
				scoreBoard = new JLabel("Placar:");
				add(scoreBoard);
				
				scoreField[3] = new JTextField(5);
				add(scoreField[3]);
			}

			//Metodos getters and setters
			public JTextField[] getScoreField() {
				return scoreField;
			}

			public void setScoreField(JTextField[] scoreField) {
				this.scoreField = scoreField;
			}

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

			public Guess getG3() {
				return g3;
			}

			public void setG3(Guess g3) {
				this.g3 = g3;
			}

			public Guess getG4() {
				return g4;
			}

			public void setG4(Guess g4) {
				this.g4 = g4;
			}
			
			
}
