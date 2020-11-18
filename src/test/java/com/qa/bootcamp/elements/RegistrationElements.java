package com.qa.bootcamp.elements;

import org.openqa.selenium.By;

public interface RegistrationElements {
    By emailControl = By.id("emailControl");
    By passwordControl = By.id("passwordControl");
    By repeatPasswordControl = By.id("repeatPasswordControl");
    By securityQuestion = By.name("securityQuestion");
    By option = By.xpath("//span[@class='mat-option-text']");
    By securityAnswerControl = By.id("securityAnswerControl");
    By registerButton = By.id("registerButton");
    By toastMessage = By.xpath("//span[contains(text(),'Registration completed')]");
}
