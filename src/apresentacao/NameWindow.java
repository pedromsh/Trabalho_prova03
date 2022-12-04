package apresentacao;

import javax.swing.JFrame;

public class NameWindow extends JFrame{

	//Metodo construtor
		public NameWindow() {
			setSize(800, 200);
			setTitle("Informação do participante");
			addPanel();
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
		}
		
		//Metodo para adicionar painel a janela
		public void addPanel() {
			NamePanel panel = new NamePanel(this);
			add(panel);
		}
}
