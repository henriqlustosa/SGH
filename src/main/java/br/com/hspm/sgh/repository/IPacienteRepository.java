package br.com.hspm.sgh.repository;

import java.util.List;


import br.com.hspm.sgh.model.Paciente;

public interface IPacienteRepository{

	List<Paciente> findPacienteProntuario(String prontuario);

}
