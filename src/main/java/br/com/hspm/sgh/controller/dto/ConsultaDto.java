package br.com.hspm.sgh.controller.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.hspm.sgh.model.Consulta;


public class ConsultaDto {

	public static Consulta consulta(Long _consulta) {
	Consulta consulta = new Consulta();
		
		String sqlString = "SELECT * FROM agh.v_consulta_paciente WHERE cd_consulta = " + _consulta;
		
		try(Connection conn = DriverManager.getConnection("jdbc:postgresql://10.10.73.14:6433/hm0615_hspm", "hm0615_hspm", "pwd_hm0615_hspm");
             PreparedStatement preparedStatement = conn.prepareStatement(sqlString)){
			
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
	            }
			
		}catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return consulta;
	}
	

}
