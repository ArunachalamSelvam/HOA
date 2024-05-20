package com.hoa.requestService;

//ContractRequestService.java
import org.springframework.stereotype.Service;
import com.hoa.repositories.ContractRepository;
import com.hoa.responseEntities.ContractListResponse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ContractRequestService {

 private final ContractRepository contractRepository;

 public ContractRequestService(ContractRepository contractRepository) {
     this.contractRepository = contractRepository;
 }

 public List<ContractListResponse> findEmployeeContractsBySalesPersonId(Integer salesPersonId) {
     List<Map<String, Object>> results = contractRepository.findEmployeeContractsBySalesPersonId(salesPersonId);
     List<ContractListResponse> contractResponses = new ArrayList<>();
     for (Map<String, Object> row : results) {
         contractResponses.add(mapToEmployeeContractResponse(row));
     }
     return contractResponses;
 }
 
 

 private ContractListResponse mapToEmployeeContractResponse(Map<String, Object> row) {
     ContractListResponse contractResponse = new ContractListResponse();
     contractResponse.setContractId((Integer) row.get("contractId"));
     contractResponse.setClientId((Integer) row.get("clientId"));
     contractResponse.setContractCode((String) row.get("contractCode"));
     contractResponse.setContractActiveStatus((String) row.get("contractActiveStatus"));
     contractResponse.setBusinessName((String) row.get("businessName"));
     contractResponse.setAnnualRenewalFee((Double) row.get("annualRenewalFee"));
     contractResponse.setRenewalCycles((String) row.get("renewalCycles"));
     contractResponse.setIsTermsAccepted((Boolean) row.get("isTermsAccepted"));
     contractResponse.setCommunityId((Integer) row.get("communityId"));
     contractResponse.setCreatedDate((Date) row.get("createdDate"));
     contractResponse.setClientDisplayName((String) row.get("clientDisplayName"));
     contractResponse.setClientActiveStatus((Boolean) row.get("clientActiveStatus"));
     contractResponse.setUserFirstName((String) row.get("userFirstName"));
     contractResponse.setUserLastName((String) row.get("userLastName"));
     contractResponse.setEmailId((String) row.get("emailId"));
     contractResponse.setMobileNumber((String) row.get("mobileNumber"));
     contractResponse.setCity((String) row.get("city"));
     contractResponse.setZipCode((Integer) row.get("zipCode"));
     contractResponse.setCountry((String) row.get("country"));
     contractResponse.setSalesPersonEmail((String) row.get("salesPersonEmailId"));
     contractResponse.setSalesPersonMobileNumber((String) row.get("salesPersonMobileNumber"));
     return contractResponse;
 }
}
