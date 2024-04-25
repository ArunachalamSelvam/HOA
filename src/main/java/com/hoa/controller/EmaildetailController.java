/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:03 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.entities.EmailDetail;
import com.hoa.service.EmaildetailService;


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
 * REST controller for managing {@link EmailDetail}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/emaildetail")
public class EmaildetailController {

    private final Logger log = LoggerFactory.getLogger(EmaildetailController.class);
	
    private final EmaildetailService entityService;

 	public EmaildetailController (EmaildetailService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /emaildetail} : Create a new emaildetail.
     *
     * @param emaildetail the emaildetail to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new emaildetail.
     */
	@PostMapping("/add")
	public ResponseEntity<EmailDetail> createEmaildetail(@RequestBody @Valid EmailDetail emaildetail) {
         log.debug("REST request to save Emaildetail : {}", emaildetail);
         return new ResponseEntity<>(entityService.create(emaildetail), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /emaildetail} : Updates an existing emaildetail.
     *
     * @param emaildetail the emaildetail to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated emaildetail,
     * or with status {@code 400 (Bad Request)} if the emaildetail is not valid,
     * or with status {@code 500 (Internal Server Error)} if the emaildetail couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<EmailDetail> updateEmaildetail(@Valid @RequestBody EmailDetail emaildetail) {
        log.debug("REST request to update Emaildetail : {}", emaildetail);
        EmailDetail result = entityService.update(emaildetail);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /emaildetail} : get all the emaildetails.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of emaildetail in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<EmailDetail>> getAllEmaildetail() {
	    log.debug("REST request to get all emaildetails");
        List<EmailDetail> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /emaildetail/:id} : get the "id" emaildetail.
     *
     * @param id the id of the emaildetail to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the emaildetail, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/getOne/{id}")
    public ResponseEntity<EmailDetail> getOneEmaildetail(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to get Emaildetail : {}", id);
        EmailDetail e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /emaildetail/:id} : delete the "id" emaildetail.
     *
     * @param id the id of the emaildetail to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmaildetail(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to delete Emaildetail : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
