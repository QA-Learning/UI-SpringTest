package com.qa.bootcamp.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

import static java.time.Duration.ofSeconds;
import static org.awaitility.Awaitility.await;

@Component
public class FindElement {

    @Autowired
    WebDriver driver;

    Predicate<WebElement> isElementLocated = WebElement::isDisplayed;

    public WebElement findElement(By by) {
        await().atMost(ofSeconds(20))
            .pollInterval(ofSeconds(1))
            .ignoreExceptions()
            .until(() -> isElementLocated.test(driver.findElement(by)));
        return driver.findElement(by);
    }
}
