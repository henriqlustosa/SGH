package br.com.hspm.sgh.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hspm.sgh.controller.dto.PacienteDto;
import br.com.hspm.sgh.model.Paciente;

@RestController
@RequestMapping("/hspmsgh-api/pacientes/paciente")
public class PacienteController {

	@GetMapping("/{prontuarioId}")
	public ResponseEntity<Paciente> getPacientePorProntuario(@PathVariable Long prontuarioId){
		
		Paciente paciente = PacienteDto.paciente(prontuarioId);	
		
		if(paciente.getCd_prontuario() == null) {
			return ResponseEntity.notFound().build();			
		}
		return ResponseEntity.ok(paciente); 
	}
}
