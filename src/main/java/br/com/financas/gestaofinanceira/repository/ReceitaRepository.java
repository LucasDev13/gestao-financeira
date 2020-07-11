package br.com.financas.gestaofinanceira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.financas.gestaofinanceira.model.Receita;
@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long>{

}
