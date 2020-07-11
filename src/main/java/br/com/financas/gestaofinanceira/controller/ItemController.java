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

import br.com.financas.gestaofinanceira.model.Item;
import br.com.financas.gestaofinanceira.repository.ItemRepository;
import br.com.financas.gestaofinanceira.repository.ReceitaRepository;

@RestController
@RequestMapping("/itens")
public class ItemController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping
	public List<Item> listar() {
		return itemRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Item salvar(@RequestBody Item item) {
		return itemRepository.save(item);
	}
	
	@PutMapping("/{itemId}")
	public ResponseEntity<Item> update(@PathVariable Long itemId,
			@RequestBody Item item){
		if(!itemRepository.existsById(itemId)) {
			return ResponseEntity.notFound().build();
		}
		item.setCodItem(itemId);
		item = itemRepository.save(item);
		return ResponseEntity.ok(item);
	}
	
	@DeleteMapping("/{itemId}")
	public ResponseEntity<Void> delete(@PathVariable Long itemId){
		if(!itemRepository.existsById(itemId)) {
			return ResponseEntity.notFound().build();
		}
		itemRepository.deleteById(itemId);
		return ResponseEntity.noContent().build();
	}
}
