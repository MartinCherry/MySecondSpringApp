package io.codelex.mysecondspringapp.server;

import io.codelex.mysecondspringapp.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonServer {

    List<Person> personList = new ArrayList<>();

    public void savePerson(Person input) {
        this.personList.add(input);
    }

    public List<Person> getPersons() {
        return this.personList;
    }
}
