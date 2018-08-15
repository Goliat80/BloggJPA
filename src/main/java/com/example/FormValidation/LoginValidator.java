package com.example.FormValidation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoginForm.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {

        LoginForm loginForm = (LoginForm) o;

        if(loginForm.getUsername() == null || loginForm.getUsername() == "") {
            errors.rejectValue("username", "field_empty", "Fältet är tomt, vänligen fyll i detta");
        }
    }
}
