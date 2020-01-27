package br.com.hspm.sgh.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.hspm.sgh.model.Cartao;
import br.com.hspm.sgh.persistence.Conexao;

public class CartaoDto {

	public static Cartao paciente(Long prontuario) {

		Connection conn = new Conexao().getConnection();
		PreparedStatement preparedStatement;

		Cartao paciente = new Cartao();

		String sqlString = "SELECT * FROM agh.v_paciente WHERE cd_prontuario = " + prontuario;

		try {

			preparedStatement = conn.prepareStatement(sqlString);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				paciente.setProntuario(resultSet.getLong("cd_prontuario"));
				paciente.setNome(resultSet.getString("nm_nome"));
				paciente.setMatricula(resultSet.getInt("cd_rf_matricula"));
				paciente.setPai(resultSet.getString("nm_pai"));
				paciente.setVinculo(resultSet.getString("nm_vinculo"));
				paciente.setDataNascimento(resultSet.getDate("dt_data_nascimento"));
			}

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return paciente;
	}

}
