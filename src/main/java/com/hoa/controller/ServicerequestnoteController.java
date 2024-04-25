/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:04 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.entities.ServiceRequestNote;
import com.hoa.service.ServicerequestnoteService;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;
import java.util.List;


/**
 * REST controller for managing {@link ServiceRequestNote}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/servicerequestnote")
public class ServicerequestnoteController {

    private final Logger log = LoggerFactory.getLogger(ServicerequestnoteController.class);
	
    private final ServicerequestnoteService entityService;

 	public ServicerequestnoteController (ServicerequestnoteService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /servicerequestnote} : Create a new servicerequestnote.
     *
     * @param servicerequestnote the servicerequestnote to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new servicerequestnote.
     */
	@PostMapping("/add")
	public ResponseEntity<ServiceRequestNote> createServicerequestnote(@RequestBody @Valid ServiceRequestNote servicerequestnote) {
         log.debug("REST request to save Servicerequestnote : {}", servicerequestnote);
         return new ResponseEntity<>(entityService.create(servicerequestnote), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /servicerequestnote} : Updates an existing servicerequestnote.
     *
     * @param servicerequestnote the servicerequestnote to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated servicerequestnote,
     * or with status {@code 400 (Bad Request)} if the servicerequestnote is not valid,
     * or with status {@code 500 (Internal Server Error)} if the servicerequestnote couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<ServiceRequestNote> updateServicerequestnote(@Valid @RequestBody ServiceRequestNote servicerequestnote) {
        log.debug("REST request to update Servicerequestnote : {}", servicerequestnote);
        ServiceRequestNote result = entityService.update(servicerequestnote);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /servicerequestnote} : get all the servicerequestnotes.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of servicerequestnote in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<ServiceRequestNote>> getAllServicerequestnote() {
	    log.debug("REST request to get all servicerequestnotes");
        List<ServiceRequestNote> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /servicerequestnote/:id} : get the "id" servicerequestnote.
     *
     * @param id the id of the servicerequestnote to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the servicerequestnote, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/getOne/{id}")
    public ResponseEntity<ServiceRequestNote> getOneServicerequestnote(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to get Servicerequestnote : {}", id);
        ServiceRequestNote e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /servicerequestnote/:id} : delete the "id" servicerequestnote.
     *
     * @param id the id of the servicerequestnote to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteServicerequestnote(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to delete Servicerequestnote : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
