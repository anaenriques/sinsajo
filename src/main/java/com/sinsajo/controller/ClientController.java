package com.sinsajo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import com.sinsajo.service.ClientServiceI;

@RestController
public class ClientController {
	
	@Autowired
	@Qualifier("ClientServiceImpl")
	private ClientServiceI clientService;
	
	

}
