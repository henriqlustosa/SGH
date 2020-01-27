package br.com.hspm.sgh.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.hspm.sgh.model.Consulta;
import br.com.hspm.sgh.model.Procedimento;
import br.com.hspm.sgh.persistence.Conexao;

public class ConsultaDto {

	public static Consulta consulta(Long _consulta) {
		
		Consulta consulta = new Consulta();
		
		List<Procedimento> procedimentos = new ArrayList<Procedimento>();

		PreparedStatement preparedStatement;
		try {

			String sqlString = "SELECT * FROM agh.v_consulta_paciente WHERE cd_consulta = " + _consulta;

			Connection conn = new Conexao().getConnection();

			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {

				consulta.setProntuatrio(resultSet.getLong("cd_prontuario"));
				consulta.setNome(resultSet.getString("nm_paciente"));
				consulta.setDataNascimento(resultSet.getDate("dt_nascimento"));
				consulta.setSexo(resultSet.getString("sg_sexo"));
				consulta.setConsulta(resultSet.getLong("cd_consulta"));
				consulta.setDataConsulta(resultSet.getDate("dt_consulta"));
				consulta.setNomeEspecialidade(resultSet.getString("nm_especialidade"));
				consulta.setNomeEquipe(resultSet.getString("nm_equipe"));
				consulta.setNomeProfissional(resultSet.getString("nm_profissional"));
				consulta.setOrgao(resultSet.getString("orgao"));
				
				procedimentos = ProcedimentoDto.Procedimentos(consulta.getNomeEspecialidade());

				consulta.setProcedimentos(procedimentos);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return consulta;
	}

}
