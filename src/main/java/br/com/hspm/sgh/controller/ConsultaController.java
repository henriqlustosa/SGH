package br.com.hspm.sgh.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hspm.sgh.controller.dto.ConsultaDto;
import br.com.hspm.sgh.model.Consulta;

@RestController
@RequestMapping("/hspmsgh-api/pacientes/paciente/consulta")
public class ConsultaController {
	
	@GetMapping("/{consultaId}")
	public ResponseEntity<Consulta> getPacienteConsulta(@PathVariable Long consultaId){
		
		Consulta consulta = ConsultaDto.consulta(consultaId);
		if(consulta.getConsulta() == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(consulta);
	}
	

}
