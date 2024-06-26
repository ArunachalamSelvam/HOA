package com.hoa.service;

import com.hoa.entities.Contact;
import com.hoa.exception.ContactNotFoundException;
import com.hoa.responseEntities.ContactResponse;

import java.util.List;

public interface ContactService {
    List<Contact> getAllContacts();

    Contact getContactById(Integer contactId);

    Contact createContact(Contact contact);

    Contact updateContact(Integer contactId, Contact contact);

    void deleteContact(Integer contactId);

	ContactResponse findContactWithPlanDetails(Integer contactId);

	void setActiveStatus(Integer contactId, boolean activeStatus) throws  ContactNotFoundException;
}
