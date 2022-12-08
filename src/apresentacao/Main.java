package apresentacao;

import persistencia.Conexao;

public class Main {

	public static void main(String[] args) {
		Window window = new Window();
		Conexao c = new Conexao();
		c.getConexao();
	}

}
