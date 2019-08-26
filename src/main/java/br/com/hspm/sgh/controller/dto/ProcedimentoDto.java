package br.com.hspm.sgh.controller.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.hspm.sgh.model.Procedimento;

public class ProcedimentoDto {
	public static List<Procedimento> Procedimentos(String nm_especialidade) {
		
		
		List<Procedimento> procedimentos = new ArrayList<Procedimento>();
		Procedimento procedimento = new Procedimento();
		
		
		String sqlString = "SELECT * FROM agh.v_especialidade_procedimento  WHERE nm_especialidade = '" + nm_especialidade + "' limit 5";
		
		try(Connection conn = DriverManager.getConnection("jdbc:postgresql://10.10.73.14:6433/hm0615_hspm", "hm0615_hspm", "pwd_hm0615_hspm");
				
        PreparedStatement preparedStatement = conn.prepareStatement(sqlString))
		{
			
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next())
			{ 	
					
				procedimento.setCd_procedimento(resultSet.getLong("cd_procedimento_sus"));
				procedimento.setDc_procedimento(resultSet.getString("dc_procedimento_sus"));
				procedimentos.add(procedimento);
			
			 }
		}
		catch (SQLException e){
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		return procedimentos;
	}

}
