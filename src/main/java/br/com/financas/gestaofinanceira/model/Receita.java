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
@Table(name = "tb_receita")
public class Receita implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codReceita;
	private double valor;
	private String descricao;
	//@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	//@Column(name = "data_cadastro", nullable = false, columnDefinition = "DATE")
	//private LocalDate dataEntrada;
	//private LocalTime horaCadastro;

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

//	public LocalDate getDataEntrada() {
//		return dataEntrada;
//	}
//
//	public void setDataEntrada(LocalDate dataEntrada) {
//		this.dataEntrada = dataEntrada;
//	}
//	
//	public LocalTime getHoraCadastro() {
//		return horaCadastro;
//	}
//	
//	public void setHoraCadastro(LocalTime horaCadastro) {
//		this.horaCadastro = horaCadastro;
//	}

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
