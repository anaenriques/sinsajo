package com.sinsajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinsajo.model.Client;

@Repository("ClientRepository")
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
