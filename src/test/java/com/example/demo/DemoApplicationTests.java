package com.example.demo;

import jakarta.validation.constraints.AssertTrue;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {
    public static Logger logger= LoggerFactory.getLogger(DemoApplication.class);
    @Test
    void contextLoads() {
        logger.info("Test case executing");
        logger.info("Test case executing 2nd commit");

    }

}
