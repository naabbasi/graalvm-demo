package edu.learn;

import edu.learn.repos.PersonRepo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StartApp {
    /*private static Logger logger;
    static {
        LoggerContext loggerContext = Configurator.initialize(null, ConfigurationSource.fromResource("/log4j2.xml", null));
        System.out.printf("Is Logger initialized: %b\n", loggerContext.isStarted());

        logger = LoggerFactory.getLogger(StartApp.class);
    }*/

    public static void main(String[] args) {
        var personRepo = new PersonRepo();
        System.out.println("Hey... GraalVM");
        log.info("All Person(s): {}", personRepo.list());
    }
}
