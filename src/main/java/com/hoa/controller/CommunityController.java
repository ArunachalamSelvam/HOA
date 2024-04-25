/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:02 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.entities.Community;
import com.hoa.service.CommunityService;


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
 * REST controller for managing {@link Community}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/community")
public class CommunityController {

    private final Logger log = LoggerFactory.getLogger(CommunityController.class);
	
    private final CommunityService entityService;

 	public CommunityController (CommunityService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /community} : Create a new community.
     *
     * @param community the community to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new community.
     */
	@PostMapping("/add")
	public ResponseEntity<Community> createCommunity(@RequestBody @Valid Community community) {
         log.debug("REST request to save Community : {}", community);
         return new ResponseEntity<>(entityService.create(community), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /community} : Updates an existing community.
     *
     * @param community the community to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated community,
     * or with status {@code 400 (Bad Request)} if the community is not valid,
     * or with status {@code 500 (Internal Server Error)} if the community couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<Community> updateCommunity(@Valid @RequestBody Community community) {
        log.debug("REST request to update Community : {}", community);
        Community result = entityService.update(community);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /community} : get all the communitys.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of community in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<Community>> getAllCommunity() {
	    log.debug("REST request to get all communitys");
        List<Community> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /community/:id} : get the "id" community.
     *
     * @param id the id of the community to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the community, or with status {@code 404 (Not Found)}.
     */
    @GetMapping( "/getOne/{id}")
    public ResponseEntity<Community> getOneCommunity(@PathVariable(value ="id") Integer id) {
        log.debug("REST request to get Community : {}", id);
        Community e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /community/:id} : delete the "id" community.
     *
     * @param id the id of the community to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCommunity(@PathVariable(value ="id") Integer id) {
        log.debug("REST request to delete Community : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}