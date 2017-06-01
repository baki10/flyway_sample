package com.bakigoal.flyway_sample;

import org.flywaydb.core.Flyway;

public class App {

    /**
     * You can migrate programmatically
     * or
     * using maven flyway plugin
     */
    public static void main(String[] args) {

        // Create the Flyway instance
        Flyway flyway = new Flyway();
        // Point it to the database
        flyway.setDataSource("jdbc:h2:file:./target/foobar", "sa", null);
        // Start the migration
        flyway.migrate();

    }
}
