package br.com.hspm.sgh.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hspm.sgh.controller.dto.InternacaoDto;
import br.com.hspm.sgh.model.Extrato;

@RestController
@RequestMapping("/hspmsgh-api/internacoes/extrato/paciente/")
public class ExtratoController {

	@GetMapping("/{prontuarioId}")
	public ResponseEntity<List<Extrato>> getExtratoPaciente(@PathVariable Long prontuarioId){
		
		List<Extrato> extrato = InternacaoDto.ExtratoInternacaoPaciente(prontuarioId);
		if(extrato == null) {
			return ResponseEntity.notFound().build();
		}
				
		return ResponseEntity.ok(extrato); 
	}
}
