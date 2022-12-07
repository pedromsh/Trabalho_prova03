package apresentacao;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel{

	private JButton registration;
	private JButton show;
	private JButton button;
	private JButton export;
	private JLabel label;
	private Window window;
	
	public Menu(Window window) {
		this.window = window;
		createButtons();
	}
	
	public void createButtons() {
		setLayout(new GridLayout(5, 1, 10, 10));
		
		label = new JLabel();
		label.setText("Funcionalidades do Bolão");
		add(label);
		
		registration = new JButton("Cadastrar novo Bolão");
		RegistrationButton registrationButton = new RegistrationButton(window);
		registration.addActionListener(registrationButton);
		add(registration);
		
		show = new JButton("Mostrar Botões Cadastrados");
		ShowButton showButton = new ShowButton(window);
		show.addActionListener(showButton);
		add(show);
		
		button = new JButton("Importar Bolões");
		ImportButton importButton= new ImportButton();
		button.addActionListener(importButton);
		add(button);
		
		export = new JButton("Exportar Bolões");
		ExportButton exportButton = new ExportButton();
		export.addActionListener(exportButton);
		add(export);
	}
}
