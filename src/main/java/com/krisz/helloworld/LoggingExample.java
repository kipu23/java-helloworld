package com.krisz.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.invoke.MethodHandles;

public class LoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());

    public static void main(String[] args) throws IOException {
        String parameter = MethodHandles.lookup().lookupClass().getSimpleName();

        logger.debug("Debug log message from class {}", parameter);
        logger.info("Info log message from class {}", parameter);
        logger.error("Error log message from class {}", parameter);
    }
}
