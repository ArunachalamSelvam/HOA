/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:03 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.entities.PaymentDetail;
import com.hoa.service.PaymentdetailService;


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
 * REST controller for managing {@link PaymentDetail}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/public/paymentdetail")
public class PaymentdetailController {

    private final Logger log = LoggerFactory.getLogger(PaymentdetailController.class);
	
    private final PaymentdetailService entityService;

 	public PaymentdetailController (PaymentdetailService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /paymentdetail} : Create a new paymentdetail.
     *
     * @param paymentdetail the paymentdetail to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new paymentdetail.
     */
	@PostMapping("/add")
	public ResponseEntity<PaymentDetail> createPaymentdetail(@RequestBody @Valid PaymentDetail paymentdetail) {
         log.debug("REST request to save Paymentdetail : {}", paymentdetail);
         return new ResponseEntity<>(entityService.create(paymentdetail), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /paymentdetail} : Updates an existing paymentdetail.
     *
     * @param paymentdetail the paymentdetail to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated paymentdetail,
     * or with status {@code 400 (Bad Request)} if the paymentdetail is not valid,
     * or with status {@code 500 (Internal Server Error)} if the paymentdetail couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<PaymentDetail> updatePaymentdetail(@Valid @RequestBody PaymentDetail paymentdetail) {
        log.debug("REST request to update Paymentdetail : {}", paymentdetail);
        PaymentDetail result = entityService.update(paymentdetail);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /paymentdetail} : get all the paymentdetails.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of paymentdetail in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<PaymentDetail>> getAllPaymentdetail() {
	    log.debug("REST request to get all paymentdetails");
        List<PaymentDetail> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /paymentdetail/:id} : get the "id" paymentdetail.
     *
     * @param id the id of the paymentdetail to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the paymentdetail, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/getOne/{id}")
    public ResponseEntity<PaymentDetail> getOnePaymentdetail(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to get Paymentdetail : {}", id);
        PaymentDetail e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /paymentdetail/:id} : delete the "id" paymentdetail.
     *
     * @param id the id of the paymentdetail to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePaymentdetail(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to delete Paymentdetail : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
