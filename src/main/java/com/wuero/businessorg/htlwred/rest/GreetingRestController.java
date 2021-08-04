package com.wuero.businessorg.htlwred.rest;

import com.wuero.businessorg.htlwred.domain.Person;
import com.wuero.businessorg.htlwred.persistence.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingRestController {

    private final PersonRepository;

    public PersonRestController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("persons")
    public List<Person> getPersons() {
        var persons = new ArrayList<Person>();

        for(Person person: personRepository.findAll()) {
            persons.add(person);
        }

        return persons;
    }

}