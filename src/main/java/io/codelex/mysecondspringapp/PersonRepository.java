package io.codelex.mysecondspringapp;

import io.codelex.mysecondspringapp.domain.Person;
import io.codelex.mysecondspringapp.server.PersonServer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {


    PersonServer server = new PersonServer();


    public void savePerson(Person input) {
        server.savePerson(input);
    }


    public List<Person> getPersons() {
        return server.getPersons();
    }
}
