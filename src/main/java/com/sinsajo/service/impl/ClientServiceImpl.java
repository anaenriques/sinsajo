package com.sinsajo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sinsajo.repository.ClientRepository;
import com.sinsajo.service.ClientServiceI;

@Service("ClientServiceImpl")
public class ClientServiceImpl implements ClientServiceI {

	@Autowired
	@Qualifier("ClientRepository")
	private ClientRepository clientRepository;
	
	
	
	
}
