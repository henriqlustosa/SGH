package br.com.hspm.sgh.model;

public class Filipeta {

	private Long cd_prontuario;
	private String nm_paciente;
	private String sg_sexo;
	private Long   cd_consulta;
	private String dt_consulta;
	private String nm_especialidade;
	private String  nm_equipe;
	private String nm_profissional;
	
	public Long getCd_prontuario() {
		return cd_prontuario;
	}
	public void setCd_prontuario(Long cd_prontuario) {
		this.cd_prontuario = cd_prontuario;
	}
	public String getNm_paciente() {
		return nm_paciente;
	}
	public void setNm_paciente(String nm_paciente) {
		this.nm_paciente = nm_paciente;
	}
	
	public String getSg_sexo() {
		return sg_sexo;
	}
	public void setSg_sexo(String sg_sexo) {
		this.sg_sexo = sg_sexo;
	}
	public Long getCd_consulta() {
		return cd_consulta;
	}
	public void setCd_consulta(Long cd_consulta) {
		this.cd_consulta = cd_consulta;
	}
	public String getDt_consulta() {
		return dt_consulta;
	}
	public void setDt_consulta(String dt_consulta) {
		this.dt_consulta = dt_consulta;
	}
	public String getNm_especialidade() {
		return nm_especialidade;
	}
	public void setNm_especialidade(String nm_especialidade) {
		this.nm_especialidade = nm_especialidade;
	}
	public String getNm_equipe() {
		return nm_equipe;
	}
	public void setNm_equipe(String nm_equipe) {
		this.nm_equipe = nm_equipe;
	}
	public String getNm_profissional() {
		return nm_profissional;
	}
	public void setNm_profissional(String nm_profissional) {
		this.nm_profissional = nm_profissional;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cd_consulta == null) ? 0 : cd_consulta.hashCode());
		result = prime * result + ((cd_prontuario == null) ? 0 : cd_prontuario.hashCode());
		result = prime * result + ((dt_consulta == null) ? 0 : dt_consulta.hashCode());
		result = prime * result + ((nm_equipe == null) ? 0 : nm_equipe.hashCode());
		result = prime * result + ((nm_especialidade == null) ? 0 : nm_especialidade.hashCode());
		result = prime * result + ((nm_paciente == null) ? 0 : nm_paciente.hashCode());
		result = prime * result + ((nm_profissional == null) ? 0 : nm_profissional.hashCode());
		result = prime * result + ((sg_sexo == null) ? 0 : sg_sexo.hashCode());
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
		Filipeta other = (Filipeta) obj;
		if (cd_consulta == null) {
			if (other.cd_consulta != null)
				return false;
		} else if (!cd_consulta.equals(other.cd_consulta))
			return false;
		if (cd_prontuario == null) {
			if (other.cd_prontuario != null)
				return false;
		} else if (!cd_prontuario.equals(other.cd_prontuario))
			return false;
		if (dt_consulta == null) {
			if (other.dt_consulta != null)
				return false;
		} else if (!dt_consulta.equals(other.dt_consulta))
			return false;
		if (nm_equipe == null) {
			if (other.nm_equipe != null)
				return false;
		} else if (!nm_equipe.equals(other.nm_equipe))
			return false;
		if (nm_especialidade == null) {
			if (other.nm_especialidade != null)
				return false;
		} else if (!nm_especialidade.equals(other.nm_especialidade))
			return false;
		if (nm_paciente == null) {
			if (other.nm_paciente != null)
				return false;
		} else if (!nm_paciente.equals(other.nm_paciente))
			return false;
		if (nm_profissional == null) {
			if (other.nm_profissional != null)
				return false;
		} else if (!nm_profissional.equals(other.nm_profissional))
			return false;
		if (sg_sexo == null) {
			if (other.sg_sexo != null)
				return false;
		} else if (!sg_sexo.equals(other.sg_sexo))
			return false;
		return true;
	}
	
	
}
