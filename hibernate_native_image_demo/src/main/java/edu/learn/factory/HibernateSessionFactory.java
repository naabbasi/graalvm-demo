package edu.learn.factory;

import edu.learn.entities.Person;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Slf4j
public class HibernateSessionFactory {
    private static SessionFactory sessionFactory;

    public static Session getCurrentSessionFromConfig() {
        // SessionFactory in Hibernate 5 example
        Configuration config = new Configuration();
        config.configure();
        config.addAnnotatedClass(Person.class);

        // local SessionFactory bean created
        if(sessionFactory == null) {
            sessionFactory = config.buildSessionFactory();
        }

        Session session = sessionFactory.getCurrentSession();
        return session;
    }
}
