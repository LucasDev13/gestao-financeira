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

import br.com.financas.gestaofinanceira.model.Conta;
import br.com.financas.gestaofinanceira.repository.ContaRepository;

@RestController
@RequestMapping("/contas")
public class ContaController {
	
	@Autowired
	private ContaRepository contaRepository;
	
	@GetMapping
	public List<Conta> listar() {
		return contaRepository.findAll();//vai listar todas as contas
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Conta salvar(@RequestBody Conta conta) {
		return contaRepository.save(conta);
	}
		
	@PutMapping("/{contaId}")
	public ResponseEntity<Conta> update(@PathVariable Long contaId, 
			@RequestBody Conta conta){
		if(!contaRepository.existsById(contaId)) {
			return ResponseEntity.notFound().build();
		}
		conta.setCodConta(contaId);
		conta = contaRepository.save(conta);
		return ResponseEntity.ok(conta);
	}
	
	@DeleteMapping("/{contaId}")
	public ResponseEntity<Void> delete(@PathVariable Long contaId){
		if(!contaRepository.existsById(contaId)) {
			return ResponseEntity.notFound().build();
		}
		contaRepository.deleteById(contaId);
		return ResponseEntity.noContent().build();
	}
}
