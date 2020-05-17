package br.com.financas.model;

import java.time.LocalDate;
import java.time.LocalTime;

import br.com.financas.model.Item;

public class LancamentoGasto {

	private Long codLancamentoGasto;
	private double valorGasto;
	private LocalDate dataGasto;
	private LocalTime horaGasto;
	private int qtdGasto;// quantidade de itens
	private int parcelas;
	private double juros;
	private Item nomeItem;

	public Long getCodLancamentoGasto() {
		return codLancamentoGasto;
	}

	public void setCodLancamentoGasto(Long codLancamentoGasto) {
		this.codLancamentoGasto = codLancamentoGasto;
	}

	public double getValorGasto() {
		return valorGasto;
	}

	public void setValorGasto(double valorGasto) {
		this.valorGasto = valorGasto;
	}

	public LocalDate getDataGasto() {
		return dataGasto;
	}

	public void setDataGasto(LocalDate dataGasto) {
		this.dataGasto = dataGasto;
	}

	public LocalTime getHoraGasto() {
		return horaGasto;
	}

	public void setHoraGasto(LocalTime horaGasto) {
		this.horaGasto = horaGasto;
	}

	public int getQtdGasto() {
		return qtdGasto;
	}

	public void setQtdGasto(int qtdGasto) {
		this.qtdGasto = qtdGasto;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public Item getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(Item nomeItem) {
		this.nomeItem = nomeItem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codLancamentoGasto == null) ? 0 : codLancamentoGasto.hashCode());
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
		LancamentoGasto other = (LancamentoGasto) obj;
		if (codLancamentoGasto == null) {
			if (other.codLancamentoGasto != null)
				return false;
		} else if (!codLancamentoGasto.equals(other.codLancamentoGasto))
			return false;
		return true;
	}

}
