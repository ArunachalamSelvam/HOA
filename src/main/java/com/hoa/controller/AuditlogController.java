/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:02 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.entities.AuditLog;
import com.hoa.service.AuditlogService;


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
 * REST controller for managing {@link AuditLog}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/public/auditlog")
public class AuditlogController {

    private final Logger log = LoggerFactory.getLogger(AuditlogController.class);
	
    private final AuditlogService entityService;

 	public AuditlogController (AuditlogService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /auditlog} : Create a new auditlog.
     *
     * @param auditlog the auditlog to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new auditlog.
     */
	@PostMapping("/add")
	public ResponseEntity<AuditLog> createAuditlog(@RequestBody @Valid AuditLog auditlog) {
         log.debug("REST request to save Auditlog : {}", auditlog);
         return new ResponseEntity<>(entityService.create(auditlog), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /auditlog} : Updates an existing auditlog.
     *
     * @param auditlog the auditlog to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated auditlog,
     * or with status {@code 400 (Bad Request)} if the auditlog is not valid,
     * or with status {@code 500 (Internal Server Error)} if the auditlog couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<AuditLog> updateAuditlog(@Valid @RequestBody AuditLog auditlog) {
        log.debug("REST request to update Auditlog : {}", auditlog);
        AuditLog result = entityService.update(auditlog);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /auditlog} : get all the auditlogs.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of auditlog in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<AuditLog>> getAllAuditlog() {
	    log.debug("REST request to get all auditlogs");
        List<AuditLog> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /auditlog/:id} : get the "id" auditlog.
     *
     * @param id the id of the auditlog to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the auditlog, or with status {@code 404 (Not Found)}.
     */
    @GetMapping( "/getOne/{id}")
    public ResponseEntity<AuditLog> getOneAuditlog(@PathVariable(value ="id") Integer id) {
        log.debug("REST request to get Auditlog : {}", id);
        AuditLog e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /auditlog/:id} : delete the "id" auditlog.
     *
     * @param id the id of the auditlog to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAuditlog(@PathVariable(value ="id") Integer id) {
        log.debug("REST request to delete Auditlog : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
