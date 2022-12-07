package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import negocio.Aluno;

public class SweepstakesDAO {

	public void inserir(Aluno a) {
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir = conexao.prepareStatement("insert into boloes (nome, id, s1_qf, p1_qf, s2_qf, p2_qf, "
					+ "s3_qf, p3_qf, s4_qf, p4_qf, s5_qf, p5_qf, s6_qf, p6_qf, s7_qf, p7_qf, s8_qf, p8_qf, s1_sf, p1_sf, "
					+ "s2_sf, p2_sf, s3_sf, p3_sf, s4_sf, p4_sf, s1_f, p1_f, s2_f, p2_f, campeao) values (?, ?, ?, ?, ?, ?,"
					+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			inserir.setString(1, a.getNome());
			inserir.setString(2, a.getCPF());
			inserir.executeUpdate();

			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
