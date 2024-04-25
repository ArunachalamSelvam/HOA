/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:02 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.entities.Client;
import com.hoa.service.ClientService;


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
 * REST controller for managing {@link Client}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final Logger log = LoggerFactory.getLogger(ClientController.class);
	
    private final ClientService entityService;

 	public ClientController (ClientService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /client} : Create a new client.
     *
     * @param client the client to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new client.
     */
	@PostMapping("/add")
	public ResponseEntity<Client> createClient(@RequestBody @Valid Client client) {
         log.debug("REST request to save Client : {}", client);
         return new ResponseEntity<>(entityService.create(client), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /client} : Updates an existing client.
     *
     * @param client the client to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated client,
     * or with status {@code 400 (Bad Request)} if the client is not valid,
     * or with status {@code 500 (Internal Server Error)} if the client couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<Client> updateClient(@Valid @RequestBody Client client) {
        log.debug("REST request to update Client : {}", client);
        Client result = entityService.update(client);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /client} : get all the clients.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of client in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<Client>> getAllClient() {
	    log.debug("REST request to get all clients");
        List<Client> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /client/:id} : get the "id" client.
     *
     * @param id the id of the client to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the client, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Client> getOneClient(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to get Client : {}", id);
        Client e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /client/:id} : delete the "id" client.
     *
     * @param id the id of the client to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to delete Client : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
