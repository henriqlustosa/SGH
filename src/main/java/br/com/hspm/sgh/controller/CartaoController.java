package br.com.hspm.sgh.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hspm.sgh.controller.dto.CartaoDto;
import br.com.hspm.sgh.model.Cartao;


@RestController
@RequestMapping("/hspmsgh-api/pacientes/paciente/cartao")
public class CartaoController {
	
	@GetMapping("/{prontuarioId}")
	public ResponseEntity<Cartao> getPacienteCartaoPorProntuario(@PathVariable Long prontuarioId){
		
		Cartao paciente = CartaoDto.paciente(prontuarioId);	
		
		if(paciente.getProntuario() == null) {
			return ResponseEntity.notFound().build();			
		}
		return ResponseEntity.ok(paciente); 
	}
}
