package apresentacao;

import javax.swing.JFrame;

public class Window extends JFrame{

	//Metodo construtor
	public Window() {
		setSize(600, 600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Menu Inicial");
		organizeLayout();
		setVisible(true);
	}
	
	//Metodo para instanciar o menu e adicionar ao frame
	public void organizeLayout() {
		Menu menu = new Menu(this);
		add(menu);
	}
}
