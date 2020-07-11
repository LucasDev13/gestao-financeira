package br.com.financas.gestaofinanceira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.financas.gestaofinanceira.model.Receita;
import br.com.financas.gestaofinanceira.repository.ReceitaRepository;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {
	
	@Autowired
	private ReceitaRepository receitaRepository;
	
	@GetMapping
	public List<Receita> listar() {
		return receitaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Receita salvar(@RequestBody Receita receita) {
		return receitaRepository.save(receita);
	}
	
	@PutMapping("/{receitaId}")
	public ResponseEntity<Receita> update(@PathVariable Long receitaId,
			@RequestBody Receita receita){
				if(!receitaRepository.existsById(receitaId)) {
					return ResponseEntity.notFound().build();
				}
				receita.setCodReceita(receitaId);
				receita = receitaRepository.save(receita);
				return ResponseEntity.ok(receita);
			}
	
	@DeleteMapping("/{receitaId}")
	public ResponseEntity<Void> delete(@PathVariable Long receitaId){
		if(!receitaRepository.existsById(receitaId)) {
			return ResponseEntity.notFound().build();
		}
		receitaRepository.deleteById(receitaId);
		return ResponseEntity.noContent().build();
	}
	
}	
