package br.com.financas.model;

import java.time.LocalDate;

public class Receita {

	private Long codReceita;
	private double valor;
	private String descricao;
	private LocalDate dataEntrada;

	public Long getCodReceita() {
		return codReceita;
	}

	public void setCodReceita(Long codReceita) {
		this.codReceita = codReceita;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codReceita == null) ? 0 : codReceita.hashCode());
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
		Receita other = (Receita) obj;
		if (codReceita == null) {
			if (other.codReceita != null)
				return false;
		} else if (!codReceita.equals(other.codReceita))
			return false;
		return true;
	}

}
