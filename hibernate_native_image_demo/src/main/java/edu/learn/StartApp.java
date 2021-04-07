package edu.learn;

import edu.learn.entities.Person;
import edu.learn.repos.PersonRepo;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
public class StartApp {
    public static void main(String[] args) {
        System.out.println("Hey... Hibernate with GraalVM");
        var personRepo = new PersonRepo();

        personRepo.save(new Person("Noman Ali", "Abbasi"));
        log.info("All Person(s): {}", personRepo.list());
    }
}
