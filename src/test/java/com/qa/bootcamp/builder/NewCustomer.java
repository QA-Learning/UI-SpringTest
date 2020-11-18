package com.qa.bootcamp.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class NewCustomer {
    public String email;
    public String password;
    public String repeatPassword;
}
