package com.qa.bootcamp.setup;

import com.qa.bootcamp.actions.Banner;
import com.qa.bootcamp.actions.Registration;
import com.qa.bootcamp.factory.BrowserType;
import com.qa.bootcamp.factory.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.Duration;

@Configuration
@ExtendWith(SpringExtension.class)
@ComponentScan(basePackages = "com.qa.bootcamp")
@ContextConfiguration(classes = { BaseTest.class })
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class BaseTest {

    @Autowired
    WebDriver driver;


    @Bean
    public WebDriver setup(){
        return new DriverFactory().getDriverManager(BrowserType.CHROME);
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
