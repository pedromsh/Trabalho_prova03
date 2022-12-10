package apresentacao;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import negocio.Participant;
import persistencia.SweepstakesDAO;

public class TableWindow extends JFrame{

	//Metodo construtor
	public TableWindow() {
		setSize(1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bolões cadastrados");
		addTabela();
		setVisible(true);
	}
	
	//Metodo para adicionar a tabela ao painel
	private void addTabela() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 1));
		createJtable(panel);
		add(panel);
	}
	
	//Metodo para criar a tabela e nomear as colunas
	private void createJtable(JPanel panel) {
		ArrayList<Object[]> dados = listData();
		String[] columnName = {"Participante", "Placar quartas", "Placar semifinal", "Placar final", "Campeão"};
		JTable table = new JTable(new TableModel(dados, columnName));
		table.setRowHeight(80);
		table.getTableHeader().setReorderingAllowed(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		table.setFillsViewportHeight(true);
		JScrollPane scroll= new JScrollPane(table);
		scroll.setViewportView(table);
		panel.add(scroll);
	}
	
	//Metodo para listar os dados do banco de dados
	public ArrayList<Object[]> listData() {
		ArrayList<Object[]> data = new ArrayList<>();
		SweepstakesDAO s = new SweepstakesDAO();
		
		for (Participant p : s.listar()) {
			data.add(new Object[] {p.getName()});
		}
		
		return data;
	}
}
