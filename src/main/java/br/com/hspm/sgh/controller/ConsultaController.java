package br.com.hspm.sgh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hspm.sgh.controller.dto.ConsultaDto;
import br.com.hspm.sgh.model.Consulta;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
	@GetMapping("/{_consulta}")
	public Consulta lista(@PathVariable Long _consulta){
	
		//List<Paciente> pacientes = pacienteRepository.findPacienteProntuario(_prontuario);		
		Consulta consulta = ConsultaDto.consulta(_consulta);
		
		return consulta;
	}
	

}
