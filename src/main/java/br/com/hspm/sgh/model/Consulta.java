package br.com.hspm.sgh.model;

import java.util.Date;
import java.util.List;


public class Consulta {

	private Long prontuatrio;
	private String nome;
	private Date  dataNascimento;
	private String sexo;
	private Long   consulta;
	private Date dataConsulta;
	private String nomeEspecialidade;
	private String  nomeEquipe;
	private String nomeProfissional;
	private String orgao;
	private List<Procedimento> procedimentos;
	
	public List<Procedimento> getProcedimentos() {
		return procedimentos;
	}
	public void setProcedimentos(List<Procedimento> procedimentos) {
		this.procedimentos = procedimentos;
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Long getConsulta() {
		return consulta;
	}
	public void setConsulta(Long consulta) {
		this.consulta = consulta;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}
	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}
	public String getNomeEquipe() {
		return nomeEquipe;
	}
	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}
	public String getNomeProfissional() {
		return nomeProfissional;
	}
	public void setNomeProfissional(String nomeProfissional) {
		this.nomeProfissional = nomeProfissional;
	}
	public String getOrgao() {
		return orgao;
	}
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consulta == null) ? 0 : consulta.hashCode());
		result = prime * result + ((dataConsulta == null) ? 0 : dataConsulta.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeEquipe == null) ? 0 : nomeEquipe.hashCode());
		result = prime * result + ((nomeEspecialidade == null) ? 0 : nomeEspecialidade.hashCode());
		result = prime * result + ((nomeProfissional == null) ? 0 : nomeProfissional.hashCode());
		result = prime * result + ((orgao == null) ? 0 : orgao.hashCode());
		result = prime * result + ((procedimentos == null) ? 0 : procedimentos.hashCode());
		result = prime * result + ((prontuatrio == null) ? 0 : prontuatrio.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		Consulta other = (Consulta) obj;
		if (consulta == null) {
			if (other.consulta != null)
				return false;
		} else if (!consulta.equals(other.consulta))
			return false;
		if (dataConsulta == null) {
			if (other.dataConsulta != null)
				return false;
		} else if (!dataConsulta.equals(other.dataConsulta))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeEquipe == null) {
			if (other.nomeEquipe != null)
				return false;
		} else if (!nomeEquipe.equals(other.nomeEquipe))
			return false;
		if (nomeEspecialidade == null) {
			if (other.nomeEspecialidade != null)
				return false;
		} else if (!nomeEspecialidade.equals(other.nomeEspecialidade))
			return false;
		if (nomeProfissional == null) {
			if (other.nomeProfissional != null)
				return false;
		} else if (!nomeProfissional.equals(other.nomeProfissional))
			return false;
		if (orgao == null) {
			if (other.orgao != null)
				return false;
		} else if (!orgao.equals(other.orgao))
			return false;
		if (procedimentos == null) {
			if (other.procedimentos != null)
				return false;
		} else if (!procedimentos.equals(other.procedimentos))
			return false;
		if (prontuatrio == null) {
			if (other.prontuatrio != null)
				return false;
		} else if (!prontuatrio.equals(other.prontuatrio))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}


}
