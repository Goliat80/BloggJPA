package com.example.FormValidation;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@ControllerAdvice
public class LoginControllerAdvice implements ErrorViewResolver {

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "Meddelande från Modelattribute");
    }

    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        ModelAndView errorPage = new ModelAndView("error");
        String errorMsg = "";

        switch(status.value()) {
            case 404: {
                errorMsg = "HTTP status code 404: Page not found";
                break;
            }
            case 500: {
                errorMsg = "HTTP status code 500: Server error";
                break;
            }
        }
        errorPage.addObject("errorMsg", errorMsg);
        return errorPage;
    }
}
