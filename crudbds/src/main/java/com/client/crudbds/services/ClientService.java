package com.client.crudbds.services;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.client.crudbds.dto.ClientDTO;
import com.client.crudbds.entities.Client;
import com.client.crudbds.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		 List<Client> list = repository.findAll();
		 return list.stream()
				    .map(c -> new ClientDTO(c))
				    .collect(Collectors.toList());
		
	}
	
	
}
