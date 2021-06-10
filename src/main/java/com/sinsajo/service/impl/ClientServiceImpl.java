/*
 * @author sinsajoTeam
 * @version 1.0
 */
package com.sinsajo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sinsajo.model.Client;
import com.sinsajo.repository.ClientRepository;
import com.sinsajo.service.ClientServiceI;

@Service
@Qualifier("ClientServiceImpl")
public class ClientServiceImpl implements ClientServiceI {

	@Autowired
	@Qualifier("ClientRepository")
	private ClientRepository clientRepository;

	/**
	 * List all clients.
	 *
	 * @return List of clients
	 */
	@Override
	public List<Client> listAllClients() {
		return clientRepository.findAll();
	}

	/**
	 * Insert client.
	 *
	 * @param client: new client
	 * @return inserted Client
	 */
	@Override
	public Client insertClient(Client client) {
		return clientRepository.save(client);
	}

	/**
	 * Delete client.
	 *
	 * @param id: Client Id
	 */
	@Override
	public void deleteClient(int id) {
		clientRepository.deleteById(id);
	}

	/**
	 * Update client.
	 *
	 * @param client the client
	 * @return updated client
	 */
	@Override
	public Client updateClient(Client client) {
		return clientRepository.save(client);
	}

	/**
	 * Find by id.
	 *
	 * @param id: client id
	 * @return found client by id
	 */
	@Override
	public Client findById(int id) {
		return clientRepository.findById(id).orElse(null);
	}
	
	
	
	
}
