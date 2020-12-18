package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.model.Cliente;

import reactor.core.publisher.Mono;

@Service	
public class WebClientService {
	
	@Autowired
	private WebClient webclient;
	
	public Cliente catClient() {
		
		Mono<Cliente> monoCat = this.webclient
		.method(HttpMethod.GET)
		.uri("/images/search")
		.retrieve()
		.bodyToMono(Cliente.class);
		
		monoCat.subscribe(p -> {
			System.out.println("Teste");
		});
		
		Cliente  s = monoCat.block();
		
		return s ;
		
	}
	
}
