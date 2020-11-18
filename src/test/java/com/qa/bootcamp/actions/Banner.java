package com.qa.bootcamp.actions;

import com.qa.bootcamp.elements.IBannerElements;
import com.qa.bootcamp.wait.FindElement;
import org.springframework.stereotype.Component;

@Component
public class Banner extends FindElement implements IBannerElements{

    public void skipBanner() {
        findElement(skipBanner).click();
    }
}
