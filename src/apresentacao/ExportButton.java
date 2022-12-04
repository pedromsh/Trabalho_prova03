package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExportButton extends JButton implements ActionListener{

	public ExportButton() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Clicado");
		
	}
}
