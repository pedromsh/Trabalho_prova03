package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ImportButton extends JButton implements ActionListener{

	public ImportButton() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("funcionando");
		
	}
}
