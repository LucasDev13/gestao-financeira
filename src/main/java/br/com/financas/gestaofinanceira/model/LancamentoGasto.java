package br.com.financas.gestaofinanceira.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_lancamento_gasto")
public class LancamentoGasto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codLancamentoGasto;
	private double valorGasto;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name = "data_cadastro", nullable = false, columnDefinition = "DATE")
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
