package com.bevDB;

/**
 * Created by pberman on 1/30/17.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeverageConfig {

    Logger logger = LoggerFactory.getLogger(BeverageConfig.class);

    // Loads the database on startup
    @Bean
    CommandLineRunner loadDatabase(BeverageRepository br) {
        return commandLineRunner -> {
            logger.debug("loading database..");
            br.save(new Beverage("Chardonnay"));
            br.save(new Beverage("Viognier"));
            br.save(new Beverage("Beer"));
            logger.debug("record count: {}", br.count());
            br.findAll().forEach(x -> logger.debug(x.toString()));
        };
    }
}

