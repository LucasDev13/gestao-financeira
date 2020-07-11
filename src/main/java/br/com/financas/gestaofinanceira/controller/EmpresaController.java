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

import br.com.financas.gestaofinanceira.model.Empresa;
import br.com.financas.gestaofinanceira.repository.EmpresaRepository;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
	//injeção de dependencia
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@GetMapping
	public List<Empresa> listar() {
		return empresaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Empresa salvar(@RequestBody Empresa empresa) {
		return empresaRepository.save(empresa);
	}
	
	@PutMapping("/{empresaId}")
	public ResponseEntity<Empresa> update(@PathVariable Long empresaId,
			@RequestBody Empresa empresa){
		if(!empresaRepository.existsById(empresaId)) {
			return ResponseEntity.notFound().build();
		}
		empresa.setCodEmpresa(empresaId);
		empresa = empresaRepository.save(empresa);
		return ResponseEntity.ok(empresa);
	}
	
	@DeleteMapping("/{empresaId}")
	public ResponseEntity<Void> delete(@PathVariable Long empresaId){
		if(!empresaRepository.existsById(empresaId)) {
			return ResponseEntity.notFound().build();
		}
		empresaRepository.deleteById(empresaId);
		return ResponseEntity.noContent().build();
	}
}
