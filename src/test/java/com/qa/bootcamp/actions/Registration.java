package com.qa.bootcamp.actions;

import com.qa.bootcamp.builder.NewCustomer;
import com.qa.bootcamp.elements.RegistrationElements;
import com.qa.bootcamp.wait.FindElement;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Component
public class Registration extends FindElement implements RegistrationElements {

    public void register(NewCustomer newCustomer) {
        findElement(emailControl).sendKeys(newCustomer.getEmail());
        findElement(passwordControl).sendKeys(newCustomer.getPassword());
        findElement(repeatPasswordControl).sendKeys(newCustomer.getRepeatPassword());
        findElement(securityQuestion).click();
        findElement(option).click();
        findElement(securityAnswerControl).sendKeys("Test");
        findElement(registerButton).click();
    }

    public boolean isRegistered() {
        return findElement(toastMessage).isDisplayed();
    }
}
