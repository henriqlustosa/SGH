package br.com.hspm.sgh.model;



public class Paciente {

	private Long prontuatrio;
	private String nome;
	private Integer matricula;
	private String responsavel;
	private String vinculo;
	
	
	
	public String getVinculo() {
		return vinculo;
	}
	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}
	public Long getProntuatrio() {
		return prontuatrio;
	}
	public void setProntuatrio(Long prontuatrio) {
		this.prontuatrio = prontuatrio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((prontuatrio == null) ? 0 : prontuatrio.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
		result = prime * result + ((vinculo == null) ? 0 : vinculo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (prontuatrio == null) {
			if (other.prontuatrio != null)
				return false;
		} else if (!prontuatrio.equals(other.prontuatrio))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		if (vinculo == null) {
			if (other.vinculo != null)
				return false;
		} else if (!vinculo.equals(other.vinculo))
			return false;
		return true;
	}
	
	
	
}
