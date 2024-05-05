/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:04 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoa.repositories.RoleRepository;
import com.hoa.repositories.UserRepository;
import com.hoa.entities.Role;
import com.hoa.entities.User;
import com.hoa.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;


import java.util.Collections;
import java.util.List;

/**
 * Service Implementation for managing {@link User}.
 * @author aek
 */
@Service
public class UserServiceImpl implements UserService {


    private final UserRepository repository;

    private final RoleRepository roleRepository;
    public UserServiceImpl(UserRepository repo, RoleRepository roleRepository) {
         this.repository = repo;
         this.roleRepository = roleRepository;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public User create(User d) {
        try {
            return repository.save(d);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User update(User d) {
        try {
            return repository.saveAndFlush(d);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User getOne(Integer id) {
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
    public List<User> getAll() {
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
	public Page<User> findAllPaginate(Pageable pageable) {

		return repository.findAll(pageable);
	}

    /**
     * {@inheritDoc}
     */
    @Override
	public Page<User> findAllSpecification(Specification<User> specs, Pageable pageable) {
		return repository.findAll(specs, pageable);
	}
    
    @Override
    @Transactional
    public User createUserWithRole(User user) {
    	
    	Role role = user.getRole();
        
        if (role == null) {
            throw new IllegalArgumentException("Role cannot be null");
        }

        // Save the role first if it doesn't exist
        if (role.getRoleid() == null) {
            role = roleRepository.save(role);
        }

        // Assign the role to the user
        user.setRole(role);

        return repository.save(user);
    }


	@Override
	public User login(String emailId, String password) {
		User user = repository.findUserByEmailId(emailId);
		if(user!=null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}


}
