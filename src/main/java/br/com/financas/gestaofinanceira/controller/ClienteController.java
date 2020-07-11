package br.com.financas.gestaofinanceira.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.financas.gestaofinanceira.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setCodCliente(1L);
		cliente1.setNome("Lucas pontes");
		cliente1.setEmail("lucaspontes@gmail.com");
		cliente1.setTelefone("111111-11111");
		
		Cliente cliente2 = new Cliente();
		cliente2.setCodCliente(2L);
		cliente2.setNome("Thais");
		cliente2.setEmail("rodriguesdossantosthais@gmail.com");
		cliente2.setTelefone("5555-55555");
		
		Cliente cliente3 = new Cliente();
		cliente3.setCodCliente(3L);
		cliente3.setNome("marinita da silva");
		cliente3.setEmail("marinita.gonorreia123@gmail.com");
		cliente3.setTelefone("8855-5555");
		
		return Arrays.asList(cliente1, cliente2, cliente3);
	}
}
