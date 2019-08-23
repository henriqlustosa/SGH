package br.com.hspm.sgh.controller.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.hspm.sgh.model.Paciente;

public class PacienteDto {
	
	public static Paciente paciente(Long prontuario) {
		
		
		
		
		
		Paciente paciente = new Paciente();
		
		String sqlString = "SELECT * FROM agh.v_paciente WHERE cd_prontuario = " + prontuario;
		
		try(Connection conn = DriverManager.getConnection("jdbc:postgresql://10.10.68.39:6432/hm0615_hspm", "hspm_acesso", "pwd_hspm_acesso");
             PreparedStatement preparedStatement = conn.prepareStatement(sqlString)){
			
			 ResultSet resultSet = preparedStatement.executeQuery();

			 if (resultSet.next()) { 	
					
	            	paciente.setProntuatrio(resultSet.getLong("cd_prontuario"));
	            	paciente.setNome(resultSet.getString("nm_nome"));
	            	paciente.setMatricula(resultSet.getInt("cd_rf_matricula"));
	            	paciente.setResponsavel(resultSet.getString("nm_pai"));
	            	paciente.setVinculo(resultSet.getString("nm_vinculo"));
	            }
			
		}catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return paciente;
	}
	
}
