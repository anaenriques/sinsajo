/*
 * Client's Controller
 * @author: sinsajoTeam
 * @version: v1.0
 */
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

/**
 * The Class ClientController.
 */
@RestController
public class ClientController {

	/** The client service. */
	@Autowired
	@Qualifier("ClientServiceImpl")
	private ClientServiceI clientService;

	/**
	 * List all clients.
	 *
	 * @return List of clients
	 */
	@GetMapping("/listAllClients")
	public List<Client> listAllClients() {
		return clientService.listAllClients();
	}

	/**
	 * List client by id. ID is retrieved by URL
	 *
	 * @param id: client ID
	 * @return found client by ID
	 */
	@GetMapping("/listClient/{id}")
	public Client listClientById(@PathVariable int id) {
		return clientService.findById(id);
	}

	/**
	 * List client by id 2. ID is retrieved as a param
	 *
	 * @param id: client ID
	 * @return found client by ID
	 */
	@GetMapping("/listClient2")
	public Client listClientById2(@RequestParam int id) {
		return clientService.findById(id);
	}
	
	/**
	 * Adds the client.
	 *
	 * @param client: new client
	 * @return inserted client
	 */
	@PostMapping("/addClient")
	public Client addClient(@RequestBody Client client) {
		return clientService.insertClient(client);
	}
	
	/**
	 * Update client.
	 *
	 * @param client: client
	 * @param id: client ID
	 * @return updated client
	 */
	@PostMapping("/updateClient/{id}")
	public Client updateClient(@RequestBody Client client, @PathVariable int id) {
		client.setId(id);
		return clientService.updateClient(client);
	}
	
	/**
	 * Delete client.
	 *
	 * @param id: client ID
	 * @return message OK
	 */
	@GetMapping("/deleteClient/{id}")
	public String deleteClient(@PathVariable int id) {
		clientService.deleteClient(id);
		return "Se ha borrado correctamente";
	}

}
