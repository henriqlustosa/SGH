package br.com.hspm.sgh.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hspm.sgh.controller.dto.InternacaoDto;
import br.com.hspm.sgh.model.Internacao;

@RestController
@RequestMapping("/hspmsgh-api/internacoes")
public class InternacaoController {

	@GetMapping("/")
	public ResponseEntity<List<Internacao>> getInternacoes(){
		
		List<Internacao> internacoes = InternacaoDto.Internacoes();
		
		
		if(internacoes == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(internacoes);
	}
	
}
