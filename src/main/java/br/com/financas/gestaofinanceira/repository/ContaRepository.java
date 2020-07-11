package br.com.financas.gestaofinanceira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.financas.gestaofinanceira.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

}
