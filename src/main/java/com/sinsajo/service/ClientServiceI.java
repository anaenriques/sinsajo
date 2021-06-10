/*
 * Client's Service Interface
 * @author: sinsajoTeam
 * @version: v1.0
 */
package com.sinsajo.service;

import java.util.List;

import com.sinsajo.model.Client;

/**
 * The Interface ClientServiceI.
 */
public interface ClientServiceI {

	List<Client> listAllClients();
	Client insertClient(final Client client);
	void deleteClient(final int id);
	Client updateClient(final Client client);
	Client findById(final int id);

}
