package com.sinsajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinsajo.model.Client;
import com.sinsajo.service.ClientServiceI;

@RestController
public class ClientController {

	@Autowired
	@Qualifier("ClientServiceImpl")
	private ClientServiceI clientService;

	@GetMapping("/listAllClients")
	public List<Client> listAllClients() {
		return clientService.listAllClients();
	}

	@GetMapping("/listClient/{id}")
	public Client listClientById(@PathVariable int id) {
		return clientService.findById(id);
	}

	@GetMapping("/listClient2")
	public Client listClientById2(@RequestParam int id) {
		return clientService.findById(id);
	}
	
	@PostMapping("/addClient")
	public Client addClient(@RequestBody Client client) {
		return clientService.insertClient(client);
	}
	
	@PostMapping("/updateClient/{id}")
	public Client updateClient(@RequestBody Client client, @PathVariable int id) {
		client.setId(id);
		return clientService.updateClient(client);
	}
	
	@GetMapping("/deleteClient/{id}")
	public String deleteClient(@PathVariable int id) {
		clientService.deleteClient(id);
		return "Se ha borrado correctamente";
	}

}
