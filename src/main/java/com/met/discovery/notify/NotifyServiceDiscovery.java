package com.met.discovery.notify;


import info.faljse.SDNotify.SDNotify;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NotifyServiceDiscovery implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(NotifyServiceDiscovery.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("Executing notify...");
        SDNotify.sendNotify();
        logger.info("Notify executed!");
    }
}
