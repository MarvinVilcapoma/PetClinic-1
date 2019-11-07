package com.tecsup.petclinic.service;

import org.springframework.stereotype.Service;

import com.tecsup.petclinic.domain.Owner;

@Service
public interface OwnerService {

	Owner crear(Owner owner);
	
	Owner buscarNombre(String nombre);
	
	void delete(long id);
	
	Owner update(Owner owner);
	
}
