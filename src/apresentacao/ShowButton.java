package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ShowButton extends JButton implements ActionListener{

	//Atributos
	private Window window;
	
	//Metodo construtor
	public ShowButton(Window window) {
		this.window = window;
	}

	//Metodo que captura o clique
	public void actionPerformed(ActionEvent e) {
		ShowWindow ShowWindow = new ShowWindow();
		window.setVisible(false);
	}
}
