package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class ImportSweepstakes {

	public void splitLine(String linha) {

		String[] aux = linha.split(";");
		
	}
	
	//Metodo para buscar o arquivo para importar os boloes
	public void search() {
		
		//Instanciando o selecionador de arquivos
		JFileChooser fc = new JFileChooser();
		
		//Nome da tela localizadora de arquivos
		fc.setDialogTitle("Escolhendo arquivo");
		
		//Recebe uma resposta da janela caso algum evento do localizador de arquivos seja acessado
		int answer = fc.showOpenDialog(null);
		
		//Verifica se a resposta recebida é igual a ok
		if(answer == JFileChooser.APPROVE_OPTION) {
			File file = new File(fc.getSelectedFile().getAbsolutePath());
			FileReader fis;
			
			try {
				fis = new FileReader(file);
				BufferedReader bis = new BufferedReader(fis);
				while (bis.ready()) {
					splitLine(bis.readLine());
				}
				bis.close();
				fis.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
