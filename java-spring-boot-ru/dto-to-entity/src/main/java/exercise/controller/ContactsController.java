package exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import exercise.model.Contact;
import exercise.repository.ContactRepository;
import exercise.dto.ContactDTO;
import exercise.dto.ContactCreateDTO;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

    @Autowired
    private ContactRepository contactRepository;

    // BEGIN
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public ContactDTO create(@RequestBody ContactCreateDTO contactData) {

        var contact = toEntity(contactData);
        contactRepository.save(contact);
        var contactDTO = toDto(contact);
        return contactDTO;

    }
    public Contact toEntity(ContactCreateDTO contactDto) {
        var contact = new Contact();
        contact.setFirstName(contactDto.getFirstName());
        contact.setLastName(contactDto.getLastName());
        contact.setPhone(contact.getPhone());
        return contact;
    }

    public ContactDTO toDto(Contact contact) {
        var contractDto = new ContactDTO();
        contractDto.setFirstName(contact.getFirstName());
        contractDto.setLastName(contact.getLastName());
        contractDto.setPhone(contact.getPhone());
        contractDto.setId(contact.getId());
        contractDto.setUpdatedAt(contact.getUpdatedAt());
        contractDto.setCreatedAt(contact.getUpdatedAt());
        return contractDto;
    }
    // END
}
