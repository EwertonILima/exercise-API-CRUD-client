package com.ewertonilima.apicrudclients.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ewertonilima.apicrudclients.dto.ClientDTO;
import com.ewertonilima.apicrudclients.entities.Client;
import com.ewertonilima.apicrudclients.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository clientRepository;

	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
		Page<Client> list = clientRepository.findAll(pageRequest);
		return list.map(x -> new ClientDTO(x));
	}

	public ClientDTO findByid(Long id) {
		Optional<Client> obj = clientRepository.findById(id);
		Client entity = obj.get();
		return new ClientDTO(entity);
	}
}
