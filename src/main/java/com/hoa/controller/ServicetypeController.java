/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:04 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.entities.ServiceType;
import com.hoa.service.ServicetypeService;


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
 * REST controller for managing {@link ServiceType}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/public/servicetype")
public class ServicetypeController {

    private final Logger log = LoggerFactory.getLogger(ServicetypeController.class);
	
    private final ServicetypeService entityService;

 	public ServicetypeController (ServicetypeService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /servicetype} : Create a new servicetype.
     *
     * @param servicetype the servicetype to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new servicetype.
     */
	@PostMapping("/add")
	public ResponseEntity<ServiceType> createServicetype(@RequestBody @Valid ServiceType servicetype) {
         log.debug("REST request to save Servicetype : {}", servicetype);
         return new ResponseEntity<>(entityService.create(servicetype), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /servicetype} : Updates an existing servicetype.
     *
     * @param servicetype the servicetype to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated servicetype,
     * or with status {@code 400 (Bad Request)} if the servicetype is not valid,
     * or with status {@code 500 (Internal Server Error)} if the servicetype couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<ServiceType> updateServicetype(@Valid @RequestBody ServiceType servicetype) {
        log.debug("REST request to update Servicetype : {}", servicetype);
        ServiceType result = entityService.update(servicetype);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /servicetype} : get all the servicetypes.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of servicetype in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<ServiceType>> getAllServicetype() {
	    log.debug("REST request to get all servicetypes");
        List<ServiceType> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /servicetype/:id} : get the "id" servicetype.
     *
     * @param id the id of the servicetype to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the servicetype, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/getOne/{id}")
    public ResponseEntity<ServiceType> getOneServicetype(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to get Servicetype : {}", id);
        ServiceType e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /servicetype/:id} : delete the "id" servicetype.
     *
     * @param id the id of the servicetype to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteServicetype(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to delete Servicetype : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
