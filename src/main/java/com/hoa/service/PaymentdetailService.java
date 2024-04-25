/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:03 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;
import com.hoa.entities.PaymentDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * Service Interface for managing {@link PaymentDetail}.
*  @author aek
 */
public interface PaymentdetailService  {
   
    /**
     * create new item for domain
     *
     * @param entity entity to save.
     * @return persisted entity Paymentdetail
     */
    PaymentDetail create(PaymentDetail d);

    /**
     * Update entity. Check before if existing data. If data is empty throw Exception
     *
     * @param entity domain
     * @param id of entity
     * @return Paymentdetail
     */
    PaymentDetail update(PaymentDetail d);

    /**
     * get Paymentdetail by id. Can be return empty
     *
     * @param id the id of the entity.
     * @return Paymentdetail
     */
    PaymentDetail getOne(Integer id) ;

    /**
     * Get all entities
     *
     * @return list of entities List<Paymentdetail>
     */
    List<PaymentDetail> getAll();

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
     * @return Page<Paymentdetail>  
     */
    Page<PaymentDetail> findAllPaginate(Pageable pageable);

    /**
     * Find all with pagination  by criteria 
     *
     * @return Page<Paymentdetail>  
     */
	Page<PaymentDetail> findAllSpecification(Specification<PaymentDetail> specs, Pageable pageable);

}
