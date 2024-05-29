package com.hoa.service;

import com.hoa.entities.Contact;
import com.hoa.entities.User;
import com.hoa.exception.ContactNotFoundException;
import com.hoa.exception.UserNotFoundException;
import com.hoa.repositories.ContactRepository;
import com.hoa.responseEntities.ContactResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.mail.MessagingException;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact getContactById(Integer contactId) {
        Optional<Contact> contactOptional = contactRepository.findById(contactId);
        return contactOptional.orElse(null);
    }

    @Override
    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact updateContact(Integer contactId, Contact contact) {
        if (contactRepository.existsById(contactId)) {
            contact.setContactId(contactId);
            return contactRepository.save(contact);
        }
        return null;
    }

    @Override
    public void deleteContact(Integer contactId) {
        contactRepository.deleteById(contactId);
    }
    
    @Override
    public ContactResponse findContactWithPlanDetails(Integer contactId) {
        List<Map<String, Object>> result = contactRepository.findContactWithPlanDetails(contactId);
        if (result != null && !result.isEmpty()) {
            return mapToContactResponse(result.get(0));
        } else {
            return null;
        }
    }
    
    @Override
    public void setActiveStatus(Integer contactId, boolean activeStatus) throws ContactNotFoundException {
        Contact contact = contactRepository.findById(contactId)
                .orElseThrow(() -> new ContactNotFoundException("User not found with id: " + contactId));

        contact.setActiveStatus(activeStatus);
       
        contactRepository.save(contact);
    }
    
    private ContactResponse mapToContactResponse(Map<String, Object> row) {
        ContactResponse contactResponse = new ContactResponse();
        contactResponse.setContactId((Integer) row.get("contactId"));
        contactResponse.setName((String) row.get("name"));
        contactResponse.setEmail((String) row.get("email"));
        contactResponse.setPhoneNumber((String) row.get("phoneNumber"));
        contactResponse.setDescription((String) row.get("description"));
        contactResponse.setTermsAccepted((Boolean) row.get("termsAccepted"));
        contactResponse.setFollowUp((Boolean) row.get("followUp"));
        contactResponse.setCity((String) row.get("city"));
        contactResponse.setCountryId((Integer) row.get("countryId"));
        contactResponse.setStateId((Integer) row.get("stateId"));
        contactResponse.setPlanId((Integer) row.get("planId")); // Set planId
        contactResponse.setCreatedDate((Date) row.get("createdDate"));
        contactResponse.setPlanRange((String) row.get("planRange")); // Set planRange
        contactResponse.setPlanType((String) row.get("planType")); // Set planType
        contactResponse.setPlanPeriod((String) row.get("planPeriod")); // Set planPeriod
        return contactResponse;
    }
    
    
}
