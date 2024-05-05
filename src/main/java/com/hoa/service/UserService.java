/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:04 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;
import com.hoa.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * Service Interface for managing {@link User}.
*  @author aek
 */
public interface UserService  {
   
    /**
     * create new item for domain
     *
     * @param entity entity to save.
     * @return persisted entity User
     */
    User create(User d);

    /**
     * Update entity. Check before if existing data. If data is empty throw Exception
     *
     * @param entity domain
     * @param id of entity
     * @return User
     */
    User update(User d);

    /**
     * get User by id. Can be return empty
     *
     * @param id the id of the entity.
     * @return User
     */
    User getOne(Integer id) ;

    /**
     * Get all entities
     *
     * @return list of entities List<User>
     */
    List<User> getAll();

    /**
     * Count item in entity
     *
     * @return long 
     */
    long getTotal();

    /**
     * Delete record by id
     *  
     */
    void delete(Integer id);

    /**
     * Find all with pagination
     *
     * @return Page<User>  
     */
    Page<User> findAllPaginate(Pageable pageable);

    /**
     * Find all with pagination  by criteria 
     *
     * @return Page<User>  
     */
	Page<User> findAllSpecification(Specification<User> specs, Pageable pageable);
	
	User createUserWithRole(User user);
	
	User login(String emailId, String password);

}
