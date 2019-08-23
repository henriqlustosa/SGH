package br.com.hspm.sgh.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hspm.sgh.controller.dto.PacienteDto;
import br.com.hspm.sgh.model.Paciente;


@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@GetMapping("/{prontuario}")
	public Paciente lista(@PathVariable Long prontuario){
	
		//List<Paciente> pacientes = pacienteRepository.findPacienteProntuario(_prontuario);		
		Paciente paciente = PacienteDto.paciente(prontuario);
		
		return paciente;
	}
	
	
	/*
	public Paciente paciente(@PathVariable String prontuario) {
					
		Paciente paciente = new Paciente();
		
		//System.out.printf("Porntuario: " + prontuario);
		
		List<Paciente> result = new ArrayList<>();
		
		String sqlString = "SELECT * FROM agh.v_paciente WHERE cd_prontuario = " + prontuario;
		
		try(Connection conn = DriverManager.getConnection("jdbc:postgresql://10.10.73.14:6433/hm0615_hspm", "hm0615_hspm", "pwd_hm0615_hspm");
             PreparedStatement preparedStatement = conn.prepareStatement(sqlString)){
			
			 ResultSet resultSet = preparedStatement.executeQuery();

	            //while (resultSet.next()) {
			 if (resultSet.next()) { 	
					
					//BigDecimal salary = resultSet.getBigDecimal("SALARY");
	                //Timestamp createdDate = resultSet.getTimestamp("CREATED_DATE");
					
	            	paciente.setProntuatrio(resultSet.getInt("cd_prontuario"));
	            	paciente.setNome(resultSet.getString("nm_nome"));
	            	paciente.setMatricula(resultSet.getInt("cd_rf_matricula"));
	            	paciente.setResponsavel(resultSet.getString("nm_pai"));
	            	paciente.setVinculo(resultSet.getString("nm_vinculo"));
	            	
	            	
	            	result.add(paciente);
	            }
			
		}catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return paciente;
		//return Arrays.asList(paciente);
	}
	*/
}
