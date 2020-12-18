package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Cliente;
import com.example.demo.service.WebClientService;

public class ClienteController {
	
	@Autowired
	private WebClientService s;
	
	@GetMapping("/cat")
	public ResponseEntity<Cliente> obterProdutoComPreco() {
		
		Cliente cliente = this.s.catClient();

		return ResponseEntity.ok(cliente);
	}

}
