package br.com.financas.model;

public class Empresa {

	private Long codEmpresa;
	private String nomeEmpresa;

	public Long getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(Long codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codEmpresa == null) ? 0 : codEmpresa.hashCode());
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
		Empresa other = (Empresa) obj;
		if (codEmpresa == null) {
			if (other.codEmpresa != null)
				return false;
		} else if (!codEmpresa.equals(other.codEmpresa))
			return false;
		return true;
	}

}
