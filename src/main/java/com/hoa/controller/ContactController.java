package com.hoa.controller;

import com.hoa.dto.ContactDTO;
import com.hoa.entities.Contact;
import com.hoa.service.ContactService;
import com.hoa.utils.EntityDTOMapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/public/contacts")
public class ContactController {

    private final ContactService contactService;
    private final EntityDTOMapper entityDtoMapper;

    @Autowired
    public ContactController(ContactService contactService, EntityDTOMapper entityDtoMapper) {
        this.contactService = contactService;
        this.entityDtoMapper = entityDtoMapper;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ContactDTO>> getAllContacts() {
        List<Contact> contacts = contactService.getAllContacts();
        
        List<ContactDTO> contactDTOs = contacts.stream()
                .map(entityDtoMapper::toDTO)
                .collect(Collectors.toList());
        
        return new ResponseEntity<>(contactDTOs, HttpStatus.OK);
        
    }

    @GetMapping("/getOne/{contactId}")
    public ResponseEntity<ContactDTO> getContactById(@PathVariable Integer contactId) {
        Contact contact = contactService.getContactById(contactId);
        ContactDTO contactDto = entityDtoMapper.toDTO(contact);
        if (contact != null) {
            return new ResponseEntity<>(contactDto, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/add")
    public ResponseEntity<ContactDTO> createContact(@RequestBody ContactDTO contactDTO) {
        Contact contact = entityDtoMapper.toEntity(contactDTO);
        ContactDTO createdContact = entityDtoMapper.toDTO(contactService.createContact(contact));
        return new ResponseEntity<>(createdContact, HttpStatus.CREATED);
    }

    @PutMapping("/update/{contactId}")
    public ResponseEntity<ContactDTO> updateContact(@PathVariable Integer contactId, @RequestBody ContactDTO contactDTO) {
        Contact contact = entityDtoMapper.toEntity(contactDTO);
        ContactDTO updatedContact = entityDtoMapper.toDTO(contactService.updateContact(contactId, contact));
        if (updatedContact != null) {
            return new ResponseEntity<>(updatedContact, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<Void> deleteContact(@PathVariable Integer contactId) {
        contactService.deleteContact(contactId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

   
}
