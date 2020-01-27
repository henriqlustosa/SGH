package br.com.hspm.sgh.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.hspm.sgh.controller.dto.FilipetaDto;
import br.com.hspm.sgh.model.Filipeta;

@RestController
@RequestMapping("/hspmsgh-api/pacientes/paciente/filipeta")
public class FilipetaController {

	@GetMapping("/{consultaId}")
	public ResponseEntity<Filipeta> getConsultaDoPacient(@PathVariable Long consultaId){
		
		Filipeta filipeta = FilipetaDto.filipeta(consultaId);
		
		if(filipeta.getCd_consulta() == null) {
			return ResponseEntity.notFound().build();			
		}
		return ResponseEntity.ok(filipeta); 
	}
}
