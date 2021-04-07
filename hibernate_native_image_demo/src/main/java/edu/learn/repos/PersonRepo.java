package edu.learn.repos;

import edu.learn.entities.Person;
import edu.learn.factory.HibernateSessionFactory;
import org.hibernate.Session;

import javax.persistence.PersistenceException;
import javax.persistence.Query;
import java.util.List;

public class PersonRepo {
    public List<Person> list() {
        Session session = HibernateSessionFactory.getCurrentSessionFromConfig();
        final var transaction = session.getTransaction();
        transaction.begin();
        Query personQuery = session.createQuery("select p from Person as p", Person.class);
        final var personList = personQuery.getResultList();
        transaction.commit();
        session.close();
        return personList;
    }

    public void save(Person person) {
        Session session = HibernateSessionFactory.getCurrentSessionFromConfig();
        final var transaction = session.getTransaction();
        try{
            transaction.begin();
            session.saveOrUpdate(person);
            transaction.commit();
        }catch (PersistenceException pe) {
            pe.printStackTrace();
        } finally {
            session.close();
        }
    }
}
