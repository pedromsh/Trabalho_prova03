package apresentacao;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Guess;
import negocio.Participant;

public class SemiPanel extends JPanel{

	//Atributos
		private JTextField field[];//array de JTextField do SemiPanel que vai receber os placares
		private JLabel team;
		private JLabel scoreBoard;
		private JLabel x;
		private Participant participant;
		private JTextField arrayField[];//array de JTextField do QuarterPanel;
		
		//Metodo construtor
		public SemiPanel(Participant participant, JTextField arrayField[]) {
			this.participant = participant;
			this.arrayField = arrayField;
			this.field = new JTextField[4];
			organizePanel();
		}
		
		//Metodo para instanciar as variaveis do tipo guess
				public void getResult() {
					Guess g1 = new Guess(arrayField[0].getText(), Integer.parseInt(arrayField[1].getText()), arrayField[2].getText(), 
							Integer.parseInt(arrayField[3].getText()));
					Guess g2 = new Guess(arrayField[4].getText(), Integer.parseInt(arrayField[5].getText()), arrayField[6].getText(), 
							Integer.parseInt(arrayField[7].getText()));
					Guess g3 = new Guess(arrayField[8].getText(), Integer.parseInt(arrayField[9].getText()), arrayField[10].getText(), 
							Integer.parseInt(arrayField[11].getText()));
					Guess g4 = new Guess(arrayField[12].getText(), Integer.parseInt(arrayField[13].getText()), arrayField[14].getText(), 
							Integer.parseInt(arrayField[15].getText()));
				}
		
		//Metodo para deixar os elementos do painel posicionados da forma escolhida
			public void organizePanel() {
				setLayout(new GridLayout(2, 9, 5, 5));
				
				team = new JLabel("Seleção:");
				add(team);
				
				Guess g1 = new Guess(arrayField[0].getText(), Integer.parseInt(arrayField[1].getText()), arrayField[2].getText(), 
						Integer.parseInt(arrayField[3].getText()));
				JLabel label1 = new JLabel(g1.Result());
				add(label1);
				
				scoreBoard = new JLabel("Placar:");
				add(scoreBoard);
				
				field[0] = new JTextField(5);
				add(field[0]);
				
				x = new JLabel("X");
				add(x);
				
				team = new JLabel("Seleção:");
				add(team);
				
				Guess g2 = new Guess(arrayField[4].getText(), Integer.parseInt(arrayField[5].getText()), arrayField[6].getText(), 
						Integer.parseInt(arrayField[7].getText()));
				JLabel label2 = new JLabel(g2.Result());
				add(label2);
				
				scoreBoard = new JLabel("Placar:");
				add(scoreBoard);
				
				field[1] = new JTextField(5);
				add(field[1]);
				
				team = new JLabel("Seleção:");
				add(team);
				
				Guess g3 = new Guess(arrayField[8].getText(), Integer.parseInt(arrayField[9].getText()), arrayField[10].getText(), 
						Integer.parseInt(arrayField[11].getText()));
				JLabel label3 = new JLabel(g3.Result());
				add(label3);
				
				scoreBoard = new JLabel("Placar:");
				add(scoreBoard);
				
				field[2] = new JTextField(5);
				add(field[2]);
				
				x = new JLabel("X");
				add(x);
				
				team = new JLabel("Seleção:");
				add(team);
				Guess g4 = new Guess(arrayField[12].getText(), Integer.parseInt(arrayField[13].getText()), arrayField[14].getText(), 
						Integer.parseInt(arrayField[15].getText()));
				JLabel label4 = new JLabel(g4.Result());
				add(label4);
				
				scoreBoard = new JLabel("Placar:");
				add(scoreBoard);
				
				field[3] = new JTextField(5);
				add(field[3]);
			}
			
}
