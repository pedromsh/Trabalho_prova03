package apresentacao;

import javax.swing.JFrame;
import javax.swing.JTable;

public class TableWindow extends JFrame{

	public TableWindow() {
		setSize(1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bolões cadastrados");
		createJtable();
		setVisible(true);
	}
	
	public void createJtable() {
		String[] columnName = {"Participante", "Placar quartas", "Placar semifinal", "Placar final", "Campeão"};
		
		JTable table = new JTable();
		add(table);
	}
}
