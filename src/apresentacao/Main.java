package apresentacao;

import negocio.Participant;
import persistencia.Conexao;
import persistencia.SweepstakesDAO;

public class Main {

	public static void main(String[] args) {
		Window window = new Window();
		Conexao c = new Conexao();
		c.getConexao();
	}

}
