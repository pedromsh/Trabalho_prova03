package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class RegistrationButton extends JButton implements ActionListener{

private Window window;
	
    //Metodo construtor
	public RegistrationButton(Window window) {
		this.window = window;
		
	}
	
	//Metodo para capturar o evento de clique
	public void actionPerformed(ActionEvent e) {
		NameWindow nameWindow = new NameWindow();
		window.setVisible(false);
	}
}
