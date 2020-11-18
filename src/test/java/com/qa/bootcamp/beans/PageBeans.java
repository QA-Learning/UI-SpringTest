package com.qa.bootcamp.beans;

import com.qa.bootcamp.actions.Banner;
import com.qa.bootcamp.actions.Registration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageBeans {

    @Bean
    public Registration customer() {
        return new Registration();
    }

    @Bean
    public Banner banner() {
        return new Banner();
    }
}
