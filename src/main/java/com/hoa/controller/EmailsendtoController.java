/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:03 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.entities.EmailSendTo;
import com.hoa.service.EmailsendtoService;


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
 * REST controller for managing {@link EmailSendTo}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/public/emailsendto")
public class EmailsendtoController {

    private final Logger log = LoggerFactory.getLogger(EmailsendtoController.class);
	
    private final EmailsendtoService entityService;

 	public EmailsendtoController (EmailsendtoService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /emailsendto} : Create a new emailsendto.
     *
     * @param emailsendto the emailsendto to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new emailsendto.
     */
	@PostMapping("/add")
	public ResponseEntity<EmailSendTo> createEmailsendto(@RequestBody @Valid EmailSendTo emailsendto) {
         log.debug("REST request to save Emailsendto : {}", emailsendto);
         return new ResponseEntity<>(entityService.create(emailsendto), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /emailsendto} : Updates an existing emailsendto.
     *
     * @param emailsendto the emailsendto to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated emailsendto,
     * or with status {@code 400 (Bad Request)} if the emailsendto is not valid,
     * or with status {@code 500 (Internal Server Error)} if the emailsendto couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<EmailSendTo> updateEmailsendto(@Valid @RequestBody EmailSendTo emailsendto) {
        log.debug("REST request to update Emailsendto : {}", emailsendto);
        EmailSendTo result = entityService.update(emailsendto);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /emailsendto} : get all the emailsendtos.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of emailsendto in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<EmailSendTo>> getAllEmailsendto() {
	    log.debug("REST request to get all emailsendtos");
        List<EmailSendTo> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /emailsendto/:id} : get the "id" emailsendto.
     *
     * @param id the id of the emailsendto to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the emailsendto, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/getOne/{id}")
    public ResponseEntity<EmailSendTo> getOneEmailsendto(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to get Emailsendto : {}", id);
        EmailSendTo e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /emailsendto/:id} : delete the "id" emailsendto.
     *
     * @param id the id of the emailsendto to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmailsendto(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to delete Emailsendto : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
