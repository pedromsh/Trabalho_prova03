package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import files.ImportSweepstakes;

public class ImportButton extends JButton implements ActionListener{

	//Metodo para capturar o evento de clique e chamar o metodo search da classe ImportSweepstakes para realizar o importar
	public void actionPerformed(ActionEvent e) {
		ImportSweepstakes i = new ImportSweepstakes();
		i.search();
		
	}
}
