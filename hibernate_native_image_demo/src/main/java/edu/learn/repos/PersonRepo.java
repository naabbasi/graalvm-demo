package edu.learn.repos;

import edu.learn.entities.Person;

import java.util.List;

public class PersonRepo {
    public List<Person> list() {
        return List.of(new Person("Noman Ali", "Abbasi"), new Person("Noman Ali", "Abbasi"), new Person("Noman Ali", "Abbasi"));
    }
}
