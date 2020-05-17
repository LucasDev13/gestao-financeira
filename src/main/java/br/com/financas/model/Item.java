package br.com.financas.model;

public class Item {

	private Long codItem;
	private String nomeItem;
	private Empresa nomeEmpresa;

	public Long getCodItem() {
		return codItem;
	}

	public void setCodItem(Long codItem) {
		this.codItem = codItem;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public Empresa getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(Empresa nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codItem == null) ? 0 : codItem.hashCode());
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
		Item other = (Item) obj;
		if (codItem == null) {
			if (other.codItem != null)
				return false;
		} else if (!codItem.equals(other.codItem))
			return false;
		return true;
	}

}
