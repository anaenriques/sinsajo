package com.sinsajo.service;

import java.util.List;

import com.sinsajo.model.Client;

public interface ClientServiceI {

	List<Client> listAllClients();
	Client insertClient(final Client client);
	void deleteClient(final int id);
	Client updateClient(final Client client, int id);
	Client findById(final int id);

}
