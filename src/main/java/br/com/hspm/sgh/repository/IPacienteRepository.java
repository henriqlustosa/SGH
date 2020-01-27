package br.com.hspm.sgh.repository;

import java.util.List;


import br.com.hspm.sgh.model.Cartao;

public interface IPacienteRepository{

	List<Cartao> findPacienteProntuario(String prontuario);

}
