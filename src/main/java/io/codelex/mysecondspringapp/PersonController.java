package io.codelex.mysecondspringapp;

import io.codelex.mysecondspringapp.domain.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping("/savePerson")
    @CrossOrigin()
    public void savePerson(@RequestBody Person input) {
        this.service.savePerson(input);
    }

    @GetMapping("/getPersons")
    @CrossOrigin()
    public List<Person> getPersons() {
        return this.service.getPersons();
    }
}
