package apresentacao;

import javax.swing.JFrame;

public class Champion extends JFrame{

	public Champion() {
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Seleção campeã segundo o palpite do participante");
		
		ChampionPanel panel = new ChampionPanel();
		add(panel);
		
		setVisible(true);
	}
}
