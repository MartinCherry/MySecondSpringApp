package io.codelex.mysecondspringapp.person;

import io.codelex.mysecondspringapp.person.domain.Person;
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
