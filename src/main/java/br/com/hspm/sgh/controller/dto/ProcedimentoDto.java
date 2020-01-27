package br.com.hspm.sgh.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.hspm.sgh.model.Procedimento;
import br.com.hspm.sgh.persistence.Conexao;

public class ProcedimentoDto {
	
	public static List<Procedimento> Procedimentos(String nm_especialidade) {

		List<Procedimento> procedimentos = new ArrayList<Procedimento>();
		

		
		PreparedStatement preparedStatement;

		String sqlString = "SELECT * FROM agh.v_especialidade_procedimento  WHERE nm_especialidade = '"
				+ nm_especialidade + "' limit 5";

		try {

			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);

			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				Procedimento procedimento = new Procedimento();
				procedimento.setCd_procedimento(resultSet.getLong("cd_procedimento_sus"));
				procedimento.setDc_procedimento(resultSet.getString("dc_procedimento_sus"));
				procedimentos.add(procedimento);

			}
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return procedimentos;
	}

}
