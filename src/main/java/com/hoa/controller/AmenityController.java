/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:02 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.entities.Amenity;
import com.hoa.service.AmenityService;


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
 * REST controller for managing {@link Amenity}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/amenity")
public class AmenityController {

    private final Logger log = LoggerFactory.getLogger(AmenityController.class);
	
    private final AmenityService entityService;

 	public AmenityController (AmenityService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /amenity} : Create a new amenity.
     *
     * @param amenity the amenity to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new amenity.
     */
	@PostMapping("/add")
	public ResponseEntity<Amenity> createAmenity(@RequestBody @Valid Amenity amenity) {
         log.debug("REST request to save Amenity : {}", amenity);
         return new ResponseEntity<>(entityService.create(amenity), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /amenity} : Updates an existing amenity.
     *
     * @param amenity the amenity to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated amenity,
     * or with status {@code 400 (Bad Request)} if the amenity is not valid,
     * or with status {@code 500 (Internal Server Error)} if the amenity couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<Amenity> updateAmenity(@Valid @RequestBody Amenity amenity) {
        log.debug("REST request to update Amenity : {}", amenity);
        Amenity result = entityService.update(amenity);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /amenity} : get all the amenitys.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of amenity in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<Amenity>> getAllAmenity() {
	    log.debug("REST request to get all amenitys");
        List<Amenity> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /amenity/:id} : get the "id" amenity.
     *
     * @param id the id of the amenity to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the amenity, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Amenity> getOneAmenity(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to get Amenity : {}", id);
        Amenity e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /amenity/:id} : delete the "id" amenity.
     *
     * @param id the id of the amenity to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAmenity(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to delete Amenity : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
