package com.sinsajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinsajo.model.Client;
import com.sinsajo.service.ClientServiceI;
import com.sinsajo.service.impl.ClientServiceImpl;

@RestController
public class ClientController {
	
	@Autowired
	@Qualifier("ClientServiceImpl")
	private ClientServiceI clientService;
	
	@GetMapping("/listAllClients")
	@ResponseBody
	public List<Client> listAllClients() {
		return clientService.listAllClients();
	}

}
