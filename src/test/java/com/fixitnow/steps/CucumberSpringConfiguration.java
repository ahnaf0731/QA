package com.fixitnow.steps;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import com.fixitnow.FixitnowApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = FixitnowApplication.class)
public class CucumberSpringConfiguration {
    // This class can remain empty
    // Its purpose is to connect Cucumber with Spring Boot context
}
