package com.hoa.service;

import com.hoa.entities.Contact;
import com.hoa.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
}
