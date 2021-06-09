package com.sinsajo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sinsajo.model.Client;
import com.sinsajo.service.ClientServiceI;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class ClientControllerTest {
	
	@Autowired
	@Qualifier("ClientServiceImpl")
	private ClientServiceI clientService;

	@Test
	@Order(1)
	void listAllClients() {
		assertEquals(3, clientService.listAllClients().size());
	}
	
	@Test
	@Order(2)
	void listClientById() {
		assertEquals(1, clientService.findById(1).getId());
	}
	
	@Test
	@Order(3)
	void addClient() {
		Client client = new Client(4, "", "", 22, "");
		assertEquals(4, clientService.insertClient(client).getId());
	}
	
	@Test
	@Order(4)
	void updateClient() {
		Client client = new Client(4, "", "", 33, "");
		assertEquals(33, clientService.updateClient(client).getAge());
	}
	
	@Test
	@Order(5)
	void deleteClient() {
		clientService.deleteClient(4);
		assertEquals(3, clientService.listAllClients().size());
	}

}
