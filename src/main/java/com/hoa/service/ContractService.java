/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:02 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;
import com.hoa.entities.Contract;
import com.hoa.exception.AddressNotFoundException;
import com.hoa.exception.ClientIdNotFoundException;
import com.hoa.exception.CommunityNotFoundException;
import com.hoa.exception.ContractNotFoundException;
import com.hoa.exception.UserNotFoundException;
import com.hoa.requestEntities.Contractrequest3;
import com.hoa.responseEntities.ContractListResponse;
import com.hoa.responseEntities.ContractUpdateResponse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

import javax.mail.MessagingException;

/**
 * Service Interface for managing {@link Contract}.
*  @author aek
 */
public interface ContractService  {
   
    /**
     * create new item for domain
     *
     * @param entity entity to save.
     * @return persisted entity Contract
     */
    Contract create(Contract d);

    /**
     * Update entity. Check before if existing data. If data is empty throw Exception
     *
     * @param entity domain
     * @param id of entity
     * @return Contract
     * @throws ContractNotFoundException 
     */
    Contract update(Integer id,Contract d) throws ContractNotFoundException;

    /**
     * get Contract by id. Can be return empty
     *
     * @param id the id of the entity.
     * @return Contract
     * @throws ContractNotFoundException 
     */
    Contract getOne(Integer id) throws ContractNotFoundException ;

    /**
     * Get all entities
     *
     * @return list of entities List<Contract>
     */
    List<Contract> getAll();

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
     * @return Page<Contract>  
     */
    Page<Contract> findAllPaginate(Pageable pageable);

    /**
     * Find all with pagination  by criteria 
     *
     * @return Page<Contract>  
     */
	Page<Contract> findAllSpecification(Specification<Contract> specs, Pageable pageable);

	Integer getContractIdByContractCode(String contractCode);

	boolean existsByContractCode(String contractCode);

	String generateUniqueContractCode();

	Contract createContract(Contractrequest3 contractRequest) throws ClientIdNotFoundException;

	boolean updateActiveStatus(Integer clientId, Boolean activeStatus)
			throws CommunityNotFoundException, ContractNotFoundException, UserNotFoundException, MessagingException;

	List<ContractListResponse> findEmployeeContractsBySalesPersonId(Integer salesManagerId, Integer salesPersonId);

	Contract updateContract(Integer contractId,Contractrequest3 contractRequest) throws ClientIdNotFoundException,
			CommunityNotFoundException, UserNotFoundException, AddressNotFoundException;

	ContractUpdateResponse getContractUpdateResponse(Integer contractId);


}
