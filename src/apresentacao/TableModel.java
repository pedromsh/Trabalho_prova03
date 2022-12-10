package apresentacao;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel{

	private ArrayList lines;
	private String[] columns;

	public TableModel(ArrayList linhas, String[] colunas) {
		setLines(linhas);
		setColumns(colunas);
	}

	public void setLines(ArrayList dados) {
		lines = dados;
	}

	public ArrayList getLines() {
		return lines;
	}

	public String[] getColumns() {
		return columns;
	}

	public void setColumns(String[] nomes) {
		columns = nomes;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return lines.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columns.length;
	}

	public String getColumnName(int num) {
		return columns[num];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object[] object = (Object[]) getLines().get(rowIndex);
		return object[columnIndex];
	}
}
