package br.com.financas.gestaofinanceira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LancamentoGastoController {
	
	@GetMapping("/lancamento")
	public String teste4() {
		return"teste4";
	}
}
