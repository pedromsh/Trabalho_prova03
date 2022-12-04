package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ShowButton extends JButton implements ActionListener{

	public ShowButton() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("oi");
		
	}
}
