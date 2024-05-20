package com.hoa.repositories;

import com.hoa.entities.Contact;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
    // You can add custom query methods here if needed
	
	@Query("SELECT c.contactId AS contactId, c.name AS name, c.email AS email, c.phoneNumber AS phoneNumber, " +
	           "c.description AS description, c.termsAccepted AS termsAccepted, c.followUp AS followUp, " +
	           "c.city AS city, c.countryId AS countryId, c.stateId AS stateId, c.planId AS planId, " +
	           "c.createdDate AS createdDate, pr.planRange AS planRange, pt.planType AS planType, " +
	           "pp.planPeriod AS planPeriod " +
	           "FROM Contact c " +
	           "LEFT JOIN c.plan p " +
	           "LEFT JOIN p.planRange pr " +
	           "LEFT JOIN p.planPeriod pp " +
	           "LEFT JOIN p.planType pt " +
	           "WHERE c.contactId = :contactId")
	    List<Map<String, Object>> findContactWithPlanDetails(@Param("contactId") Integer contactId);
}
