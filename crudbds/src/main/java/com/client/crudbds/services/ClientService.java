package com.client.crudbds.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest){
		 Page<Client> list = repository.findAll(pageRequest);
		 return list.map(c -> new ClientDTO(c));
				    
		
	}
	
	
}
