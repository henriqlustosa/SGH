package br.com.hspm.sgh.model;

public class Procedimento {
	private Long cd_procedimento;
	private String dc_procedimento;
	
	public String getDc_procedimento() {
		return dc_procedimento;
	}
	public void setDc_procedimento(String dc_procedimento) {
		this.dc_procedimento = dc_procedimento;
	}
	public Long getCd_procedimento() {
		return cd_procedimento;
	}
	public void setCd_procedimento(Long cd_procedimento) {
		this.cd_procedimento = cd_procedimento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cd_procedimento == null) ? 0 : cd_procedimento.hashCode());
		result = prime * result + ((dc_procedimento == null) ? 0 : dc_procedimento.hashCode());
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
		Procedimento other = (Procedimento) obj;
		if (cd_procedimento == null) {
			if (other.cd_procedimento != null)
				return false;
		} else if (!cd_procedimento.equals(other.cd_procedimento))
			return false;
		if (dc_procedimento == null) {
			if (other.dc_procedimento != null)
				return false;
		} else if (!dc_procedimento.equals(other.dc_procedimento))
			return false;
		return true;
	}


}
