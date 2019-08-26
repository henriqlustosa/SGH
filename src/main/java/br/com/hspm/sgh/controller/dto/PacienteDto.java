package br.com.hspm.sgh.controller.dto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.hspm.sgh.model.Paciente;
import br.com.hspm.sgh.persistence.Conexao;

public class PacienteDto {
	
	public static Paciente paciente(Long prontuario) {
		
		
		Paciente paciente = new Paciente();
		PreparedStatement preparedStatement  ;
		String sqlString = "SELECT * FROM agh.v_paciente WHERE cd_prontuario = " + prontuario;
		Connection conn = new Conexao().getConnection();
		
             
			try {
				preparedStatement = conn.prepareStatement(sqlString);
				ResultSet resultSet = preparedStatement.executeQuery();
				preparedStatement = conn.prepareStatement(sqlString);
				if (resultSet.next()) { 	
					
	            	paciente.setProntuatrio(resultSet.getLong("cd_prontuario"));
	            	paciente.setNome(resultSet.getString("nm_nome"));
	            	paciente.setMatricula(resultSet.getInt("cd_rf_matricula"));
	            	paciente.setResponsavel(resultSet.getString("nm_pai"));
	            	paciente.setVinculo(resultSet.getString("nm_vinculo"));
	            }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 

			 
			
             
	
		return paciente;
	}
	
}
