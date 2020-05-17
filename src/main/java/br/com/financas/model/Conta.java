package br.com.financas.model;

import java.time.LocalDate;

public class Conta {

	private Long codConta;
	private double limiteSaldo;
	private double saldo;
	private Pessoa titular;
	private LocalDate dataEntradaValor;
	private Receita receita;

	public Long getCodConta() {
		return codConta;
	}

	public void setCodConta(Long codConta) {
		this.codConta = codConta;
	}

	public double getLimiteSaldo() {
		return limiteSaldo;
	}

	public void setLimiteSaldo(double limiteSaldo) {
		this.limiteSaldo = limiteSaldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public LocalDate getDataEntradaValor() {
		return dataEntradaValor;
	}

	public void setDataEntradaValor(LocalDate dataEntradaValor) {
		this.dataEntradaValor = dataEntradaValor;
	}

	public Receita getReceita() {
		return receita;
	}

	public void setReceita(Receita receita) {
		this.receita = receita;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codConta == null) ? 0 : codConta.hashCode());
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
		Conta other = (Conta) obj;
		if (codConta == null) {
			if (other.codConta != null)
				return false;
		} else if (!codConta.equals(other.codConta))
			return false;
		return true;
	}
	
}
