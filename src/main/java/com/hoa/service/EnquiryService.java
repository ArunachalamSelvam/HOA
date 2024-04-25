/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:03 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;
import com.hoa.entities.Enquiry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * Service Interface for managing {@link Enquiry}.
*  @author aek
 */
public interface EnquiryService  {
   
    /**
     * create new item for domain
     *
     * @param entity entity to save.
     * @return persisted entity Enquiry
     */
    Enquiry create(Enquiry d);

    /**
     * Update entity. Check before if existing data. If data is empty throw Exception
     *
     * @param entity domain
     * @param id of entity
     * @return Enquiry
     */
    Enquiry update(Enquiry d);

    /**
     * get Enquiry by id. Can be return empty
     *
     * @param id the id of the entity.
     * @return Enquiry
     */
    Enquiry getOne(Integer id) ;

    /**
     * Get all entities
     *
     * @return list of entities List<Enquiry>
     */
    List<Enquiry> getAll();

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
     * @return Page<Enquiry>  
     */
    Page<Enquiry> findAllPaginate(Pageable pageable);

    /**
     * Find all with pagination  by criteria 
     *
     * @return Page<Enquiry>  
     */
	Page<Enquiry> findAllSpecification(Specification<Enquiry> specs, Pageable pageable);

}
