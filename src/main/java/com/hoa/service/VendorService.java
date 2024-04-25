/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:04 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;
import com.hoa.entities.Vendor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * Service Interface for managing {@link Vendor}.
*  @author aek
 */
public interface VendorService  {
   
    /**
     * create new item for domain
     *
     * @param entity entity to save.
     * @return persisted entity Vendor
     */
    Vendor create(Vendor d);

    /**
     * Update entity. Check before if existing data. If data is empty throw Exception
     *
     * @param entity domain
     * @param id of entity
     * @return Vendor
     */
    Vendor update(Vendor d);

    /**
     * get Vendor by id. Can be return empty
     *
     * @param id the id of the entity.
     * @return Vendor
     */
    Vendor getOne(Integer id) ;

    /**
     * Get all entities
     *
     * @return list of entities List<Vendor>
     */
    List<Vendor> getAll();

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
     * @return Page<Vendor>  
     */
    Page<Vendor> findAllPaginate(Pageable pageable);

    /**
     * Find all with pagination  by criteria 
     *
     * @return Page<Vendor>  
     */
	Page<Vendor> findAllSpecification(Specification<Vendor> specs, Pageable pageable);

}