package com.client.crudbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.crudbds.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
