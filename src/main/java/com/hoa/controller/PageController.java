/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:03 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.entities.Page;
import com.hoa.service.PageService;


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
 * REST controller for managing {@link Page}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/public/page")
public class PageController {

    private final Logger log = LoggerFactory.getLogger(PageController.class);
	
    private final PageService entityService;

 	public PageController (PageService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /page} : Create a new page.
     *
     * @param page the page to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new page.
     */
	@PostMapping("/add")
	public ResponseEntity<Page> createPage(@RequestBody @Valid Page page) {
         log.debug("REST request to save Page : {}", page);
         return new ResponseEntity<>(entityService.create(page), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /page} : Updates an existing page.
     *
     * @param page the page to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated page,
     * or with status {@code 400 (Bad Request)} if the page is not valid,
     * or with status {@code 500 (Internal Server Error)} if the page couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<Page> updatePage(@Valid @RequestBody Page page) {
        log.debug("REST request to update Page : {}", page);
        Page result = entityService.update(page);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /page} : get all the pages.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of page in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<Page>> getAllPage() {
	    log.debug("REST request to get all pages");
        List<Page> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /page/:id} : get the "id" page.
     *
     * @param id the id of the page to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the page, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Page> getOnePage(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to get Page : {}", id);
        Page e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /page/:id} : delete the "id" page.
     *
     * @param id the id of the page to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePage(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to delete Page : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
