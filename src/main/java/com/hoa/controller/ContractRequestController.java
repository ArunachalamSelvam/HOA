package com.hoa.controller;

//ContractRequestController.java
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

import com.hoa.responseEntities.ContractListResponse;
import com.hoa.requestService.*;

@RestController
@RequestMapping("/api/public/contractRequest")
public class ContractRequestController {

 private final ContractRequestService contractRequestService;

 public ContractRequestController(ContractRequestService contractRequestService) {
     this.contractRequestService = contractRequestService;
 }

// @GetMapping("/findContractsBySalesPersonId/{salesPersonId}")
// public ResponseEntity<?> getContractsBySalesPersonId(@PathVariable Integer salesPersonId) {
//	 List<ContractListResponse> contracts = contractRequestService.findEmployeeContractsBySalesPersonId(salesPersonId);
//     if (contracts.isEmpty()) {
//         return new ResponseEntity<>("No contracts found for sales person ID: " + salesPersonId, HttpStatus.NOT_FOUND);
//     } else {
//         return new ResponseEntity<>(contracts, HttpStatus.OK);
//     }
// }
}
