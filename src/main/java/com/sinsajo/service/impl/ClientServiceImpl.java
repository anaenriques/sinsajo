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

	@Override
	public List<Client> listAllClients() {
		return clientRepository.findAll();
	}

	@Override
	public Client insertClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void deleteClient(int id) {
		clientRepository.deleteById(id);
	}

	@Override
	public Client updateClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client findById(int id) {
		return clientRepository.findById(id).orElse(null);
	}
	
	
	
	
}
