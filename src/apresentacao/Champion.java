package apresentacao;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import negocio.Guess;

public class Champion extends JFrame{

	//Atributos
	private FinalsPanel finals;
	private JLabel label;
	private Guess champion;
	
	//Metodo construtor
	public Champion(FinalsPanel finals, Guess champion) {
		this.finals = finals;
		this.champion = champion;
		
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Seleção campeã segundo o palpite do participante");
		
		label = new JLabel();
		add(label);
		
		championBackground();
		setVisible(true);
	}
	
	//Metodo que exibe a bandeira do campeao na tela
	public void championBackground() {
		switch(champion.result()) {
		case "bra":
			label.setIcon(new ImageIcon(new ImageIcon("img/Brasil.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
			break;
		case "hol":
			label.setIcon(new ImageIcon(new ImageIcon("img/Holanda.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
			break;
		case "arg":
			label.setIcon(new ImageIcon(new ImageIcon("img/Argentina.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
			break;
		case "cro":
			label.setIcon(new ImageIcon(new ImageIcon("img/Croacia.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
			break;
		case "fra":
			label.setIcon(new ImageIcon(new ImageIcon("img/Franca.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
			break;
		case "ing":
			label.setIcon(new ImageIcon(new ImageIcon("img/Inglaterra.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
			break;
		case "mar":
			label.setIcon(new ImageIcon(new ImageIcon("img/Marrocos.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
			break;
		case "por":
			label.setIcon(new ImageIcon(new ImageIcon("img/Portugal.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
			break;
		
		}
	}
}
