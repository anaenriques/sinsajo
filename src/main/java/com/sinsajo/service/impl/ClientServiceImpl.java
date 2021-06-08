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
	public int deleteClient(int id) {
		clientRepository.deleteById(id);
		return 0;
	}

	@Override
	public int updateClient(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Client findById(int id) {
		return clientRepository.findById(id).orElse(null);
	}
	
	
	
	
}
