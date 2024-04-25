/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:02 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.dto.CountryDTO;
import com.hoa.entities.Country;
import com.hoa.service.CountryService;
import com.hoa.utils.EntityDTOMapper;

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
 * REST controller for managing {@link Country}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/country")
public class CountryController {

    private final Logger log = LoggerFactory.getLogger(CountryController.class);
	
    private final CountryService entityService;
    
    private final EntityDTOMapper entityDtoMapper;


 	public CountryController (CountryService entityService, EntityDTOMapper entityDtoMapper) {
		this.entityService = entityService;
		this.entityDtoMapper= entityDtoMapper;
	}

    /**
     * {@code POST  /country} : Create a new country.
     *
     * @param country the country to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new country.
     */
	@PostMapping("/add")
	public ResponseEntity<Country> createCountry(@RequestBody @Valid CountryDTO countryDto) {
		
		Country country = entityDtoMapper.toEntity(countryDto);
         log.debug("REST request to save Country : {}", country);
         return new ResponseEntity<>(entityService.create(country), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /country} : Updates an existing country.
     *
     * @param country the country to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated country,
     * or with status {@code 400 (Bad Request)} if the country is not valid,
     * or with status {@code 500 (Internal Server Error)} if the country couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<Country> updateCountry(@Valid @RequestBody CountryDTO countryDto) {
    	
    	Country country = entityDtoMapper.toEntity(countryDto);
        log.debug("REST request to update Country : {}", country);
        Country result = entityService.update(country);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /country} : get all the countrys.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of country in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<Country>> getAllCountry() {
	    log.debug("REST request to get all countrys");
        List<Country> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /country/:id} : get the "id" country.
     *
     * @param id the id of the country to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the country, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Country> getOneCountry(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to get Country : {}", id);
        Country e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /country/:id} : delete the "id" country.
     *
     * @param id the id of the country to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCountry(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to delete Country : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
