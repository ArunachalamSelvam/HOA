/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:03 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.entities.Plan;
import com.hoa.service.PlanService;


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
 * REST controller for managing {@link Plan}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/public/plan")
public class PlanController {

    private final Logger log = LoggerFactory.getLogger(PlanController.class);
	
    private final PlanService entityService;

 	public PlanController (PlanService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /plan} : Create a new plan.
     *
     * @param plan the plan to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new plan.
     */
	@PostMapping("/add")
	public ResponseEntity<Plan> createPlan(@RequestBody @Valid Plan plan) {
         log.debug("REST request to save Plan : {}", plan);
         return new ResponseEntity<>(entityService.create(plan), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /plan} : Updates an existing plan.
     *
     * @param plan the plan to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated plan,
     * or with status {@code 400 (Bad Request)} if the plan is not valid,
     * or with status {@code 500 (Internal Server Error)} if the plan couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<Plan> updatePlan(@Valid @RequestBody Plan plan) {
        log.debug("REST request to update Plan : {}", plan);
        Plan result = entityService.update(plan);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /plan} : get all the plans.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of plan in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<Plan>> getAllPlan() {
	    log.debug("REST request to get all plans");
        List<Plan> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /plan/:id} : get the "id" plan.
     *
     * @param id the id of the plan to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the plan, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Plan> getOnePlan(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to get Plan : {}", id);
        Plan e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /plan/:id} : delete the "id" plan.
     *
     * @param id the id of the plan to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePlan(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to delete Plan : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
