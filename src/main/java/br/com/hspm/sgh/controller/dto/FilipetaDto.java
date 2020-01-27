package br.com.hspm.sgh.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import br.com.hspm.sgh.model.Filipeta;
import br.com.hspm.sgh.persistence.Conexao;

public class FilipetaDto {
	
	public static Filipeta filipeta(Long _consulta) {
		
		Filipeta filipeta = new Filipeta();
		
		PreparedStatement preparedStatement;
		try {

			String sqlString = "SELECT * FROM agh.v_consulta_paciente WHERE cd_consulta = " + _consulta;

			Connection conn = new Conexao().getConnection();

			preparedStatement = conn.prepareStatement(sqlString);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {

				filipeta.setCd_prontuario(resultSet.getLong("cd_prontuario"));
				filipeta.setNm_paciente(resultSet.getString("nm_paciente"));
				filipeta.setSg_sexo(resultSet.getString("sg_sexo"));
				filipeta.setCd_consulta(resultSet.getLong("cd_consulta"));
				
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
				String dt_consulta = dateFormat.format(resultSet.getTimestamp("dt_consulta"));
				
				filipeta.setDt_consulta(dt_consulta);
				
				filipeta.setNm_especialidade(resultSet.getString("nm_especialidade"));
				filipeta.setNm_equipe(resultSet.getString("nm_equipe"));
				filipeta.setNm_profissional(resultSet.getString("nm_profissional"));
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return filipeta;
	}
}
