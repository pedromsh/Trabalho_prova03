package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import negocio.Participant;

public class SweepstakesDAO {

	//Metodo para inserir os dados no banco de dados
	public void inserir(Participant p) {
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir = conexao.prepareStatement("insert into boloes (nome, s1_qf, p1_qf, s2_qf, p2_qf, s3_qf, p3_qf, s4_qf, p4_qf, s5_qf, p5_qf, s6_qf, p6_qf, s7_qf, p7_qf, s8_qf, p8_qf, s1_sf, p1_sf, s2_sf, p2_sf, s3_sf, p3_sf, s4_sf, p4_sf, s1_f, p1_f, s2_f, p2_f, campeao) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			inserir.setString(1, p.getName());
			inserir.setString(2, p.getSoccerTeams().get(0));
			inserir.setInt(3, p.getScoreBoards().get(0));
			inserir.setString(4, p.getSoccerTeams().get(1));
			inserir.setInt(5, p.getScoreBoards().get(1));
			inserir.setString(6, p.getSoccerTeams().get(2));
			inserir.setInt(7, p.getScoreBoards().get(2));
			inserir.setString(8, p.getSoccerTeams().get(3));
			inserir.setInt(9, p.getScoreBoards().get(3));
			inserir.setString(10, p.getSoccerTeams().get(4));
			inserir.setInt(11, p.getScoreBoards().get(4));
			inserir.setString(12, p.getSoccerTeams().get(5));
			inserir.setInt(13, p.getScoreBoards().get(5));
			inserir.setString(14, p.getSoccerTeams().get(6));
			inserir.setInt(15, p.getScoreBoards().get(6));
			inserir.setString(16, p.getSoccerTeams().get(7));
			inserir.setInt(17, p.getScoreBoards().get(7));
			inserir.setString(18, p.getSoccerTeams().get(8));
			inserir.setInt(19, p.getScoreBoards().get(8));
			inserir.setString(20, p.getSoccerTeams().get(9));
			inserir.setInt(21, p.getScoreBoards().get(9));
			inserir.setString(22, p.getSoccerTeams().get(10));
			inserir.setInt(23, p.getScoreBoards().get(10));
			inserir.setString(24, p.getSoccerTeams().get(11));
			inserir.setInt(25, p.getScoreBoards().get(11));
			inserir.setString(26, p.getSoccerTeams().get(12));
			inserir.setInt(27, p.getScoreBoards().get(12));
			inserir.setString(28, p.getSoccerTeams().get(13));
			inserir.setInt(29, p.getScoreBoards().get(13));
			inserir.setString(30, p.getSoccerTeams().get(14));
			
			inserir.executeUpdate();

			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Metodo para puxar os dados do banco de dados
	public ArrayList<Participant> listar() {
		ArrayList<Participant> aux = new ArrayList<Participant>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet resultado = 
					conexao.prepareStatement("select * from boloes")
					.executeQuery();
			
			while(resultado.next()) {
				Participant p = new Participant();
				p.setScoreBoards(new ArrayList<Integer>());
				p.setSoccerTeams(new ArrayList<String>());
				
				p.setName(resultado.getString("nome"));
				p.getSoccerTeams().add(resultado.getString("s1_qf"));
				p.getScoreBoards().add(resultado.getInt("p1_qf"));
				p.getSoccerTeams().add(resultado.getString("s2_qf"));
				p.getScoreBoards().add(resultado.getInt("p2_qf"));
				p.getSoccerTeams().add(resultado.getString("s3_qf"));
				p.getScoreBoards().add(resultado.getInt("p3_qf"));
				p.getSoccerTeams().add(resultado.getString("s4_qf"));
				p.getScoreBoards().add(resultado.getInt("p4_qf"));
				p.getSoccerTeams().add(resultado.getString("s5_qf"));
				p.getScoreBoards().add(resultado.getInt("p5_qf"));
				p.getSoccerTeams().add(resultado.getString("s6_qf"));
				p.getScoreBoards().add(resultado.getInt("p6_qf"));
				p.getSoccerTeams().add(resultado.getString("s7_qf"));
				p.getScoreBoards().add(resultado.getInt("p7_qf"));
				p.getSoccerTeams().add(resultado.getString("s8_qf"));
				p.getScoreBoards().add(resultado.getInt("p8_qf"));
				p.getSoccerTeams().add(resultado.getString("s1_sf"));
				p.getScoreBoards().add(resultado.getInt("p1_sf"));
				p.getSoccerTeams().add(resultado.getString("s2_sf"));
				p.getScoreBoards().add(resultado.getInt("p2_sf"));
				p.getSoccerTeams().add(resultado.getString("s3_sf"));
				p.getScoreBoards().add(resultado.getInt("p3_sf"));
				p.getSoccerTeams().add(resultado.getString("s4_sf"));
				p.getScoreBoards().add(resultado.getInt("p4_sf"));
				p.getSoccerTeams().add(resultado.getString("s1_f"));
				p.getScoreBoards().add(resultado.getInt("p1_f"));
				p.getSoccerTeams().add(resultado.getString("s2_f"));
				p.getScoreBoards().add(resultado.getInt("p2_f"));
				p.getSoccerTeams().add(resultado.getString("campeao"));
				
				aux.add(p);
			}
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return aux;
	}
}
