package io.codelex.mysecondspringapp.person;

import io.codelex.mysecondspringapp.person.domain.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersons() {
        return this.repository.getPersons();
    }

    public void savePerson(Person input) {
        this.repository.savePerson(input);
    }
}
