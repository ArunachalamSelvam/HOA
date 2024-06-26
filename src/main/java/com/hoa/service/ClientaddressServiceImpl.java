/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:02 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hoa.repositories.ClientaddressRepository;
import com.hoa.entities.ClientAddress;
import com.hoa.exception.ClientAddressNotFoundException;
import com.hoa.exception.ClientIdNotFoundException;
import com.hoa.service.ClientaddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;


import java.util.Collections;
import java.util.List;

/**
 * Service Implementation for managing {@link ClientAddress}.
 * @author aek
 */
@Service
@Transactional
public class ClientaddressServiceImpl implements ClientaddressService {


    private final ClientaddressRepository repository;

    public ClientaddressServiceImpl(ClientaddressRepository repo) {
         this.repository = repo;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public ClientAddress create(ClientAddress d) {
        try {
            return repository.save(d);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     * @throws ClientIdNotFoundException 
     */
    @Override
    public ClientAddress update(Integer id, ClientAddress updatedClientAddress) throws ClientIdNotFoundException {
        try {
        	if(repository.existsById(id)) {
            // Set the ID of the updated client address
            updatedClientAddress.setClientaddressid(id);
            
            // Save and return the updated client address
            return repository.saveAndFlush(updatedClientAddress);
        	}else {
        		throw new ClientAddressNotFoundException("ClientAddress with id " + id + " not found.");
        	}
        } catch (Exception ex) {
            throw new ClientIdNotFoundException("ClientAddress with id " + id + " not found.");
        }
    }
    

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientAddress getOne(Integer id) {
        try {
            return repository.findById(id).orElse(null);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ClientAddress> getAll() {
        try {
            return repository.findAll();

        } catch (Exception ex) {
            return Collections.emptyList();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getTotal() {
        try {
            return repository.count();
        } catch (Exception ex) {
            return 0;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    /**
     * {@inheritDoc}
     */
   	@Override
	public Page<ClientAddress> findAllPaginate(Pageable pageable) {

		return repository.findAll(pageable);
	}

    /**
     * {@inheritDoc}
     */
    @Override
	public Page<ClientAddress> findAllSpecification(Specification<ClientAddress> specs, Pageable pageable) {
		return repository.findAll(specs, pageable);
	}
    
    @Override
    public ClientAddress getClientAddressByClientId(Integer clientId) {
        return repository.findByClientClientId(clientId);
    }




}
