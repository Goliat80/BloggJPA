package com.example.FormValidation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLogin(LoginForm loginForm) {
        return "loginForm";
    }

    @PostMapping("/login")
    public String postLogin(@Valid LoginForm loginForm, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            System.out.println("We have an error");
        }



        /* LoginValidator loginValidator = new LoginValidator();

        if(loginValidator.supports(loginForm.getClass())) {
            loginValidator.validate(loginForm, bindingResult);
            if(bindingResult.hasErrors()) {
                return "loginForm";
            }
        }*/


        return "loginForm";
    }

    @GetMapping ("/")
    public String First(JobApplicationForm jobApplicationForm){
        return "jobapplicationForm";
    }

    @GetMapping ("/jobapplication")
    public String getJobApplicationForm(JobApplicationForm jobApplicationForm){

        return "jobapplicationForm";
    }

    @PostMapping ("/jobapplication")
    public String postJobApplicationForm(@Valid JobApplicationForm jobApplicationForm, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return "jobapplicationForm";
        }

        return "redirect:/login";
    }
    @GetMapping ("/update")
    public String getJobApplicationForm(Model model) {



        return "login";
    }

}
