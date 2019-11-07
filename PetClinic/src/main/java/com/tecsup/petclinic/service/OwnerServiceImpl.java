package com.tecsup.petclinic.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.petclinic.domain.Owner;
import com.tecsup.petclinic.domain.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService{

	private static final Logger logger = LoggerFactory.getLogger(PetServiceImpl.class);
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	@Override
	public Owner crear(Owner owner) {
		return ownerRepository.save(owner);
	}

	@Override
	public Owner buscarNombre(String nombre) {
		
		Owner o = null;
		Iterable<Owner> owner = ownerRepository.findAll(); 
		
		for(Owner owner2: owner) {
			if	(owner2.getFirst_name().equalsIgnoreCase(nombre)) {
				o = owner2;
			}
		}
		return o;
	}

	@Override
	public void delete(long id) {
		Optional<Owner> owner = ownerRepository.findById(id);
		logger.info("Dueño eliminado");
		ownerRepository.delete(owner.get());	
	}

	@Override
	public Owner update(Owner owner) {
		return ownerRepository.save(owner);
	}

}
